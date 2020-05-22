package com.cognitive.azure.router.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("azure")
public class AzureProperties {
	
	@Value("storage-container-name")
	private String storageContainerName;

	
	@Value("storage-connection-string")
	private String storageConnectionString;
	
	@Value("index-storage-container-name")
	private String indexStorageContainerName;

	
	@Value("index-storage-connection-string")
	private String indexStorageConnectionString;
	
	@Value("azure.video-indexer-account")
	private String videoIndexerAccount;
	
	
	@Value("azure.video-indexer-api-url")
	private String videoIndexerApiUrl;
	
	@Value("azure.video-indexer-region")
	private String videoIndexerRegion;

	
	
	@Value("azure.video-indexer-subscription-id")
	private String videoIndexerSubscriptionId;
	
	@Value("servicebus.queue-name")
	private String serviceBusQueueName;

	public final String getServiceBusQueueName() {
		return serviceBusQueueName;
	}

	public void setServiceBusQueueName(String serviceBusQueueName) {
		this.serviceBusQueueName = serviceBusQueueName;
	}

	public String getStorageContainerName() {
		return storageContainerName;
	}


	public void setStorageContainerName(String storageContainerName) {
		this.storageContainerName = storageContainerName;
	}


	public String getStorageConnectionString() {
		return storageConnectionString;
	}


	public void setStorageConnectionString(String storageConnectionString) {
		this.storageConnectionString = storageConnectionString;
	}


	public String getIndexStorageContainerName() {
		return indexStorageContainerName;
	}


	public void setIndexStorageContainerName(String indexStorageContainerName) {
		this.indexStorageContainerName = indexStorageContainerName;
	}


	public String getIndexStorageConnectionString() {
		return indexStorageConnectionString;
	}


	public void setIndexStorageConnectionString(String indexStorageConnectionString) {
		this.indexStorageConnectionString = indexStorageConnectionString;
	}


	public String getVideoIndexerAccount() {
		return videoIndexerAccount;
	}


	public void setVideoIndexerAccount(String videoIndexerAccount) {
		this.videoIndexerAccount = videoIndexerAccount;
	}


	public String getVideoIndexerApiUrl() {
		return videoIndexerApiUrl;
	}


	public void setVideoIndexerApiUrl(String videoIndexerApiUrl) {
		this.videoIndexerApiUrl = videoIndexerApiUrl;
	}


	public String getVideoIndexerRegion() {
		return videoIndexerRegion;
	}


	public void setVideoIndexerRegion(String videoIndexerRegion) {
		this.videoIndexerRegion = videoIndexerRegion;
	}


	public String getVideoIndexerSubscriptionId() {
		return videoIndexerSubscriptionId;
	}


	public void setVideoIndexerSubscriptionId(String videoIndexerSubscriptionId) {
		this.videoIndexerSubscriptionId = videoIndexerSubscriptionId;
	}
	


	
}
