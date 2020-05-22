
package com.learnazure.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Appearance {

    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("endTime")
    @Expose
    private String endTime;
    @SerializedName("startSeconds")
    @Expose
    private Integer startSeconds;
    @SerializedName("endSeconds")
    @Expose
    private Double endSeconds;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getStartSeconds() {
        return startSeconds;
    }

    public void setStartSeconds(Integer startSeconds) {
        this.startSeconds = startSeconds;
    }

    public Double getEndSeconds() {
        return endSeconds;
    }

    public void setEndSeconds(Double endSeconds) {
        this.endSeconds = endSeconds;
    }

}
