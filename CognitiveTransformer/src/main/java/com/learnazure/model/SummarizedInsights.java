
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SummarizedInsights {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("privacyMode")
    @Expose
    private String privacyMode;
    @SerializedName("duration")
    @Expose
    private Duration duration;
    @SerializedName("thumbnailVideoId")
    @Expose
    private String thumbnailVideoId;
    @SerializedName("thumbnailId")
    @Expose
    private String thumbnailId;
    @SerializedName("faces")
    @Expose
    private List<Object> faces = null;
    @SerializedName("keywords")
    @Expose
    private List<Keyword> keywords = null;
    @SerializedName("emotions")
    @Expose
    private List<Object> emotions = null;
    @SerializedName("audioEffects")
    @Expose
    private List<Object> audioEffects = null;
    @SerializedName("labels")
    @Expose
    private List<Label> labels = null;
    @SerializedName("framePatterns")
    @Expose
    private List<FramePattern> framePatterns = null;
    @SerializedName("brands")
    @Expose
    private List<Brand> brands = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrivacyMode() {
        return privacyMode;
    }

    public void setPrivacyMode(String privacyMode) {
        this.privacyMode = privacyMode;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getThumbnailVideoId() {
        return thumbnailVideoId;
    }

    public void setThumbnailVideoId(String thumbnailVideoId) {
        this.thumbnailVideoId = thumbnailVideoId;
    }

    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    public List<Object> getFaces() {
        return faces;
    }

    public void setFaces(List<Object> faces) {
        this.faces = faces;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<Object> getEmotions() {
        return emotions;
    }

    public void setEmotions(List<Object> emotions) {
        this.emotions = emotions;
    }

    public List<Object> getAudioEffects() {
        return audioEffects;
    }

    public void setAudioEffects(List<Object> audioEffects) {
        this.audioEffects = audioEffects;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<FramePattern> getFramePatterns() {
        return framePatterns;
    }

    public void setFramePatterns(List<FramePattern> framePatterns) {
        this.framePatterns = framePatterns;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

}
