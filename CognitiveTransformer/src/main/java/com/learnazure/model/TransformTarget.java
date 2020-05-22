package com.learnazure.model;

import java.io.Serializable;

public class TransformTarget implements Serializable {
	
	TextCognitive document = new TextCognitive();
    
    
    ImageCognitive image = new ImageCognitive();
    
    private String sourceFileName;
    
    private String sourceName;
    
    private String sourceUrl;

    private String videoCognitive;

	

	public String getSourceFileName() {
		return sourceFileName;
	}

	public void setSourceFileName(String sourceFileName) {
		this.sourceFileName = sourceFileName;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public ImageCognitive getImage() {
		return image;
	}

	public void setImage(ImageCognitive image) {
		this.image = image;
	}

	public TextCognitive getDocument() {
		return document;
	}

	public void setDocument(TextCognitive document) {
		this.document = document;
	}

	public String getVideoCognitive() {
		return videoCognitive;
	}

	public void setVideoCognitive(String videoCognitive) {
		this.videoCognitive = videoCognitive;
	}
    
	
    
	
}
