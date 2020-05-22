package com.learnazure.model;

import java.io.Serializable;

import com.azure.ai.textanalytics.models.EntityCategory;

public class TextEntity implements Serializable{
	
	   /*
     * CategorizedEntity text as appears in the request.
     */
    private String text;

    /*
     * CategorizedEntity category, such as Person/Location/Org/SSN etc
     */
    private String category;

    /*
     * CategorizedEntity sub category, such as Age/Year/TimeRange etc
     */
    private String subCategory;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
    
    

}
