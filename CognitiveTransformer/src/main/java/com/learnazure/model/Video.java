
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("moderationState")
    @Expose
    private String moderationState;
    @SerializedName("reviewState")
    @Expose
    private String reviewState;
    @SerializedName("privacyMode")
    @Expose
    private String privacyMode;
    @SerializedName("processingProgress")
    @Expose
    private String processingProgress;
    @SerializedName("failureCode")
    @Expose
    private String failureCode;
    @SerializedName("failureMessage")
    @Expose
    private String failureMessage;
    @SerializedName("externalId")
    @Expose
    private Object externalId;
    @SerializedName("externalUrl")
    @Expose
    private Object externalUrl;
    @SerializedName("metadata")
    @Expose
    private Object metadata;
    @SerializedName("insights")
    @Expose
    private Insights insights;
    @SerializedName("thumbnailId")
    @Expose
    private String thumbnailId;
    @SerializedName("detectSourceLanguage")
    @Expose
    private Boolean detectSourceLanguage;
    @SerializedName("languageAutoDetectMode")
    @Expose
    private String languageAutoDetectMode;
    @SerializedName("sourceLanguage")
    @Expose
    private String sourceLanguage;
    @SerializedName("sourceLanguages")
    @Expose
    private List<String> sourceLanguages = null;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("indexingPreset")
    @Expose
    private String indexingPreset;
    @SerializedName("linguisticModelId")
    @Expose
    private String linguisticModelId;
    @SerializedName("personModelId")
    @Expose
    private String personModelId;
    @SerializedName("isAdult")
    @Expose
    private Boolean isAdult;
    @SerializedName("publishedUrl")
    @Expose
    private String publishedUrl;
    @SerializedName("publishedProxyUrl")
    @Expose
    private Object publishedProxyUrl;
    @SerializedName("viewToken")
    @Expose
    private String viewToken;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getModerationState() {
        return moderationState;
    }

    public void setModerationState(String moderationState) {
        this.moderationState = moderationState;
    }

    public String getReviewState() {
        return reviewState;
    }

    public void setReviewState(String reviewState) {
        this.reviewState = reviewState;
    }

    public String getPrivacyMode() {
        return privacyMode;
    }

    public void setPrivacyMode(String privacyMode) {
        this.privacyMode = privacyMode;
    }

    public String getProcessingProgress() {
        return processingProgress;
    }

    public void setProcessingProgress(String processingProgress) {
        this.processingProgress = processingProgress;
    }

    public String getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public Object getExternalId() {
        return externalId;
    }

    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    public Object getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Insights getInsights() {
        return insights;
    }

    public void setInsights(Insights insights) {
        this.insights = insights;
    }

    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    public Boolean getDetectSourceLanguage() {
        return detectSourceLanguage;
    }

    public void setDetectSourceLanguage(Boolean detectSourceLanguage) {
        this.detectSourceLanguage = detectSourceLanguage;
    }

    public String getLanguageAutoDetectMode() {
        return languageAutoDetectMode;
    }

    public void setLanguageAutoDetectMode(String languageAutoDetectMode) {
        this.languageAutoDetectMode = languageAutoDetectMode;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public List<String> getSourceLanguages() {
        return sourceLanguages;
    }

    public void setSourceLanguages(List<String> sourceLanguages) {
        this.sourceLanguages = sourceLanguages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getIndexingPreset() {
        return indexingPreset;
    }

    public void setIndexingPreset(String indexingPreset) {
        this.indexingPreset = indexingPreset;
    }

    public String getLinguisticModelId() {
        return linguisticModelId;
    }

    public void setLinguisticModelId(String linguisticModelId) {
        this.linguisticModelId = linguisticModelId;
    }

    public String getPersonModelId() {
        return personModelId;
    }

    public void setPersonModelId(String personModelId) {
        this.personModelId = personModelId;
    }

    public Boolean getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(Boolean isAdult) {
        this.isAdult = isAdult;
    }

    public String getPublishedUrl() {
        return publishedUrl;
    }

    public void setPublishedUrl(String publishedUrl) {
        this.publishedUrl = publishedUrl;
    }

    public Object getPublishedProxyUrl() {
        return publishedProxyUrl;
    }

    public void setPublishedProxyUrl(Object publishedProxyUrl) {
        this.publishedProxyUrl = publishedProxyUrl;
    }

    public String getViewToken() {
        return viewToken;
    }

    public void setViewToken(String viewToken) {
        this.viewToken = viewToken;
    }

}
