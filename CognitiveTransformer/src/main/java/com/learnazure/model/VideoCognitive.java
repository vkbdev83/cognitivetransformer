
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoCognitive {

    @SerializedName("partition")
    @Expose
    private String partition;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("privacyMode")
    @Expose
    private String privacyMode;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("isOwned")
    @Expose
    private Boolean isOwned;
    @SerializedName("isEditable")
    @Expose
    private Boolean isEditable;
    @SerializedName("isBase")
    @Expose
    private Boolean isBase;
    @SerializedName("durationInSeconds")
    @Expose
    private Integer durationInSeconds;
    @SerializedName("summarizedInsights")
    @Expose
    private SummarizedInsights summarizedInsights;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;
    @SerializedName("videosRanges")
    @Expose
    private List<VideosRange> videosRanges = null;

    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getPrivacyMode() {
        return privacyMode;
    }

    public void setPrivacyMode(String privacyMode) {
        this.privacyMode = privacyMode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Boolean getIsOwned() {
        return isOwned;
    }

    public void setIsOwned(Boolean isOwned) {
        this.isOwned = isOwned;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    public Boolean getIsBase() {
        return isBase;
    }

    public void setIsBase(Boolean isBase) {
        this.isBase = isBase;
    }

    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public SummarizedInsights getSummarizedInsights() {
        return summarizedInsights;
    }

    public void setSummarizedInsights(SummarizedInsights summarizedInsights) {
        this.summarizedInsights = summarizedInsights;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<VideosRange> getVideosRanges() {
        return videosRanges;
    }

    public void setVideosRanges(List<VideosRange> videosRanges) {
        this.videosRanges = videosRanges;
    }

}
