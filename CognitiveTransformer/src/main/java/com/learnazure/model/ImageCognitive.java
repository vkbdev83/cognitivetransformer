package com.learnazure.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ImageCognitive implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4289200448317796578L;


	List<String> imageTags = new ArrayList<>();
	
	
	List<String>  imageCategories = new ArrayList<>();


	public List<String> getImageTags() {
		return imageTags;
	}


	public void setImageTags(List<String> imageTags) {
		this.imageTags = imageTags;
	}


	public List<String> getImageCategories() {
		return imageCategories;
	}


	public void setImageCategories(List<String> imageCategories) {
		this.imageCategories = imageCategories;
	}
	
	

}
