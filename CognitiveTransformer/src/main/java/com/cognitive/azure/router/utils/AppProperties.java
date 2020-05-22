package com.cognitive.azure.router.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppProperties {
	
	@Value("file-copy-directory")
	private String fileCopyDirectory;
	
	@Value("image-file-formats")
	private String imageFileFormats;
	
	
	@Value("doc-file-formats")
	private String docFileFormats;

	
	@Value("video-file-formats")
	private String videoFileFormats;
	
	public String getFileCopyDirectory() {
		return fileCopyDirectory;
	}

	public void setFileCopyDirectory(String fileCopyDirectory) {
		this.fileCopyDirectory = fileCopyDirectory;
	}

	public String getImageFileFormats() {
		return imageFileFormats;
	}

	public void setImageFileFormats(String imageFileFormats) {
		this.imageFileFormats = imageFileFormats;
	}

	public String getDocFileFormats() {
		return docFileFormats;
	}

	public void setDocFileFormats(String docFileFormats) {
		this.docFileFormats = docFileFormats;
	}

	public String getVideoFileFormats() {
		return videoFileFormats;
	}

	public void setVideoFileFormats(String videoFileFormats) {
		this.videoFileFormats = videoFileFormats;
	}
	
	

	
}
