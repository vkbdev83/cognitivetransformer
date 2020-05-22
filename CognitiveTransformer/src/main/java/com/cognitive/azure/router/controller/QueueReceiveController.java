package com.cognitive.azure.router.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.azure.storage.blob.BlobClient;
import com.cognitive.azure.router.services.FileServices;
import com.cognitive.azure.router.services.TextCognitiveServices;
import com.cognitive.azure.router.services.VideoCognitiveServices;
import com.cognitive.azure.router.services.VisionCognitiveServices;
import com.cognitive.azure.router.utils.AppProperties;
import com.google.gson.Gson;
import com.learnazure.model.ImageCognitive;
import com.learnazure.model.TransformSource;
import com.learnazure.model.TransformTarget;

@Component
public class QueueReceiveController {

	private static final String QUEUE_NAME = "ingestion";

	@Autowired
	FileServices services;

	@Autowired
	VisionCognitiveServices visionServices;

	@Autowired
	TextCognitiveServices textServices;
	
	@Autowired
	VideoCognitiveServices videoServices;

	@Autowired
	private AppProperties appProperties;

	@JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
	public void receiveMessage(TransformSource source) {

		System.out.println("URL" + source.getContentName());

		try {

			String filePath = services.downloadFile(source.getContentName());

			System.out.println("FilePath" + filePath);

			TransformTarget target = new TransformTarget();

			target.setSourceFileName(source.getContentName());

			target.setSourceUrl(source.getContentUrl());

			target.setSourceName(source.getContentSource());

			List<String> imageFileFormats = Arrays.asList(appProperties.getImageFileFormats().split(","));

			List<String> docFileFormats = Arrays.asList(appProperties.getDocFileFormats().split(","));

			List<String> videoFileFormats = Arrays.asList(appProperties.getVideoFileFormats().split(","));

			System.out.println("imageFileFormats" + imageFileFormats);

			System.out.println("docFileFormats" + docFileFormats);

			System.out.println("videoFileFormats" + videoFileFormats);

			if (isReqdFileType(source.getContentName(), imageFileFormats)) {

				ImageCognitive cognitive = visionServices.getImageInsights(filePath);

				target.setImage(cognitive);

			} else if (isReqdFileType(source.getContentName(), docFileFormats)) {

				String content = new String(Files.readAllBytes(Paths.get(filePath)));

				target.setDocument(textServices.performTextAnalytics(content));

			} else if (isReqdFileType(source.getContentName(), videoFileFormats)) {
				
				target.setVideoCognitive(videoServices.getVideoInsights(filePath, source.getContentName()));
				

			} else {

				// Do Nothing as unsupported formats

			}

			String targetFileName = UUID.randomUUID().toString() + ".json";

			String targetFilePath = appProperties.getFileCopyDirectory() + targetFileName;

			Gson gson = new Gson();

			System.out.println(gson.toJson(target));

			Writer writer = new FileWriter(targetFilePath);

			gson.toJson(target, writer);

			writer.flush(); // flush data to file <---

			writer.close();

			BlobClient client = services.getTargetBlobClient(targetFileName);

			client.uploadFromFile(targetFilePath, true);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean isReqdFileType(String contentName, List<String> fileFormats) {

		boolean isExpectedFileFormat = false;

		for (String format : fileFormats) {

			if (contentName.contains(format)) {

				isExpectedFileFormat = true;

				break;

			}

		}
		return isExpectedFileFormat;
	}

}
