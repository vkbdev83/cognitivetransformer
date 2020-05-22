package com.learnazure.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TextCognitive implements Serializable {
	

    List<TextEntity> textEntity = new ArrayList<>();
    
    List<String> keyPhrases = new ArrayList<>();
    
    public List<TextEntity> getTextEntity() {
		return textEntity;
	}

	public void setTextEntity(List<TextEntity> textEntity) {
		this.textEntity = textEntity;
	}

	public List<String> getKeyPhrases() {
		return keyPhrases;
	}

	public void setKeyPhrases(List<String> keyPhrases) {
		this.keyPhrases = keyPhrases;
	}

	
	
}
