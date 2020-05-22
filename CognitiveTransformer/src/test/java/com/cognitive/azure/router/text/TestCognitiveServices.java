package com.cognitive.azure.router.text;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cognitive.azure.router.services.TextCognitiveServices;
import com.cognitive.azure.router.services.VideoCognitiveServices;
import com.cognitive.azure.router.services.VisionCognitiveServices;
import com.cognitive.azure.router.utils.AzureProperties;
import com.google.gson.Gson;
import com.learnazure.model.TransformTarget;

@SpringBootTest
public class TestCognitiveServices {
	
	@Autowired
	VideoCognitiveServices servicesVideo;
	
	
	//@Test
	public void testCognitiveServices() {
		
		
		TextCognitiveServices service = new TextCognitiveServices();
		//service.performTextAnalytics();
		
		
	}

	
	//@Test
	public void testImageCognitiveServices() {
		
		
		VisionCognitiveServices service = new VisionCognitiveServices();
		//service.getImage("");
		
		
	}
	
	@Test
	public void testVideoServices() {
		

		//VideoCognitiveServices servicesVideo = new VideoCognitiveServices(new RestTemplateBuilder(customizers));
		
		String path = "/Users/vishshob/Documents/Learn/DctmDocker/Videos/Video 3.mov";
		
		TransformTarget target = new TransformTarget();
		
		String video = servicesVideo.getVideoInsights(path, "test7.mov");
		
		target.setVideoCognitive(video);
		
		Gson gson = new Gson();

		System.out.println(gson.toJson(target));
		
		String targetFilePath = "/tmp/test7.json";

		Writer writer;
		
		try {
			
			writer = new FileWriter(targetFilePath);
			
			gson.toJson(target, writer);

			writer.flush(); // flush data to file <---

			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		System.out.println(		);
		
		
		
		
	}
}
