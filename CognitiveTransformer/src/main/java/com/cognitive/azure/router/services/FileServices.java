package com.cognitive.azure.router.services;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobProperties;
import com.azure.storage.blob.models.CopyStatusType;
import com.cognitive.azure.router.utils.AppProperties;
import com.cognitive.azure.router.utils.AzureProperties;

@Service
public class FileServices {

	@Autowired
	private AzureProperties azureProperties;

	@Autowired
	private AppProperties appProperties;

	public String downloadFile(String blobName) throws IOException {

		System.out.println("Intiating Upload" + azureProperties.getStorageConnectionString()
				+ azureProperties.getStorageContainerName());

		return getBlobClient(blobName);

	}

	private String getBlobClient(String fileName) {

		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
				.connectionString(azureProperties.getStorageConnectionString()).buildClient();

		BlobContainerClient containerClient = blobServiceClient
				.getBlobContainerClient(azureProperties.getStorageContainerName());

		// Get a reference to a blob
		BlobClient blobClient = containerClient.getBlobClient(fileName);

		String targetFilePath = appProperties.getFileCopyDirectory() + fileName;

		BlobProperties properties = blobClient.downloadToFile(targetFilePath, true);
		
		

		return targetFilePath;

	}

	public BlobClient getTargetBlobClient(String fileName) {

		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
				.connectionString(azureProperties.getIndexStorageConnectionString()).buildClient();

		BlobContainerClient containerClient = blobServiceClient
				.getBlobContainerClient(azureProperties.getIndexStorageContainerName());

		// Get a reference to a blob
		BlobClient blobClient = containerClient.getBlobClient(fileName);


		return blobClient;

	}

}
