package com.cognitive.azure.router.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilder;

import com.cognitive.azure.router.utils.AzureProperties;
import com.google.gson.Gson;
import com.learnazure.model.VideoSubmitResponse;

@Service
public class VideoCognitiveServices {

	@Autowired
	AzureProperties azureProperties;

	RestTemplate template;

	public VideoCognitiveServices(RestTemplateBuilder builder) {

		template = builder.build();

	}

	
	public String getVideoInsights(String filePath,String fileName) {
		
		
		String accessToken = getAccessToken().replaceAll("\"", "");
		
		System.out.println("accessToken"+ accessToken);
		
		String videoId = submitVideo(filePath, fileName, accessToken);
		
		String jsonResponse = getVideoIndex(videoId, accessToken);
			
		return jsonResponse;

		
	}

	private String getAccessToken() {

		String accessToken = "";

		StringBuffer sb = new StringBuffer(azureProperties.getVideoIndexerApiUrl());

		sb.append("Auth/");

		sb.append(azureProperties.getVideoIndexerRegion());

		sb.append("/Accounts/");

		sb.append(azureProperties.getVideoIndexerAccount());

		sb.append("/AccessToken?allowEdit=True");

		HttpHeaders headers = new HttpHeaders();

		headers.add("Ocp-Apim-Subscription-Key", azureProperties.getVideoIndexerSubscriptionId());

		System.out.println(sb.toString());

		// build the request
		HttpEntity request = new HttpEntity(headers);

		// use `exchange` method for HTTP call
		ResponseEntity<String> response = template.exchange(sb.toString(), HttpMethod.GET, request, String.class);

		if (response.getStatusCode() == HttpStatus.OK) {

			accessToken = response.getBody();
		}

		return accessToken;

	}

	private String submitVideo(String videoFilePath, String fileName , String accessToken) {

		String videoId = "";

		StringBuffer sb = new StringBuffer(azureProperties.getVideoIndexerApiUrl());

		sb.append(azureProperties.getVideoIndexerRegion());

		sb.append("/Accounts/");

		sb.append(azureProperties.getVideoIndexerAccount());

		sb.append("/Videos?name=" + fileName);

		sb.append("&accessToken=" + accessToken);

		// sb.append(accessToken);

		HttpHeaders headers = new HttpHeaders();

		FileSystemResource resoure = new FileSystemResource(videoFilePath);

		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();

		body.add("file", resoure);

		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		headers.add("Ocp-Apim-Subscription-Key", azureProperties.getVideoIndexerSubscriptionId());

		System.out.println(sb.toString());

		// build the request
		HttpEntity request = new HttpEntity(body, headers);

		ResponseEntity<VideoSubmitResponse> response = template.postForEntity(sb.toString(), request,
				VideoSubmitResponse.class);

		VideoSubmitResponse videoResponse = response.getBody();

		videoId = videoResponse.getId();

		System.out.println(videoId);

		return videoId;
	}
	

	private String getVideoIndex(String videoId,String accessToken) {


		System.out.println(accessToken);

		StringBuffer sb = new StringBuffer(azureProperties.getVideoIndexerApiUrl());

		sb.append(azureProperties.getVideoIndexerRegion());

		sb.append("/Accounts/");

		sb.append(azureProperties.getVideoIndexerAccount());

		sb.append("/Videos/" + videoId);

		sb.append("/Index?accessToken=" + accessToken);

		HttpHeaders headers = new HttpHeaders();

		headers.add("Ocp-Apim-Subscription-Key", azureProperties.getVideoIndexerSubscriptionId());

		System.out.println(sb.toString());

		// build the request
		HttpEntity request = new HttpEntity(headers);

		// use `exchange` method for HTTP call
		ResponseEntity<String> response = template.exchange(sb.toString(), HttpMethod.GET, request, String.class);

		String responseString = response.getBody();

		System.out.println("responseString"+ responseString);

		Gson gson = new Gson();

		VideoSubmitResponse videoResponse = gson.fromJson(responseString, VideoSubmitResponse.class);
		
		

		while (StringUtils.isEmpty(videoResponse.getErrorType()) && 
				!"Processed".equals(videoResponse.getState())) {

			try {

				Thread.sleep(60000);

				responseString = getVideoIndex(videoId , accessToken);

				videoResponse = gson.fromJson(responseString, VideoSubmitResponse.class);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return responseString;

	}

}
