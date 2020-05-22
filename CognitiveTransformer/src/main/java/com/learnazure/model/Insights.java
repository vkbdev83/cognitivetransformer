
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Insights {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("duration")
    @Expose
    private String duration;
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
    @SerializedName("transcript")
    @Expose
    private List<Transcript> transcript = null;
    @SerializedName("keywords")
    @Expose
    private List<Keyword> keywords = null;
    @SerializedName("topics")
    @Expose
    private List<Topic> topics = null;
    @SerializedName("labels")
    @Expose
    private List<Label> labels = null;
    @SerializedName("scenes")
    @Expose
    private List<Scene> scenes = null;
    @SerializedName("shots")
    @Expose
    private List<Shot> shots = null;
    @SerializedName("brands")
    @Expose
    private List<Brand> brands = null;
    @SerializedName("sentiments")
    @Expose
    private List<Sentiment> sentiments = null;
    @SerializedName("blocks")
    @Expose
    private List<Block> blocks = null;
    @SerializedName("framePatterns")
    @Expose
    private List<FramePattern> framePatterns = null;
    @SerializedName("speakers")
    @Expose
    private List<Speaker> speakers = null;
    @SerializedName("textualContentModeration")
    @Expose
    private TextualContentModeration textualContentModeration;
    @SerializedName("statistics")
    @Expose
    private Statistics statistics;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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

    public List<Transcript> getTranscript() {
        return transcript;
    }

    public void setTranscript(List<Transcript> transcript) {
        this.transcript = transcript;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

    public List<Shot> getShots() {
        return shots;
    }

    public void setShots(List<Shot> shots) {
        this.shots = shots;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    public List<Sentiment> getSentiments() {
        return sentiments;
    }

    public void setSentiments(List<Sentiment> sentiments) {
        this.sentiments = sentiments;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public List<FramePattern> getFramePatterns() {
        return framePatterns;
    }

    public void setFramePatterns(List<FramePattern> framePatterns) {
        this.framePatterns = framePatterns;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public TextualContentModeration getTextualContentModeration() {
        return textualContentModeration;
    }

    public void setTextualContentModeration(TextualContentModeration textualContentModeration) {
        this.textualContentModeration = textualContentModeration;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

}
