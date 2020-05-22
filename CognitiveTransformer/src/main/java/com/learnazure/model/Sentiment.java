
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sentiment {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("averageScore")
    @Expose
    private Double averageScore;
    @SerializedName("sentimentType")
    @Expose
    private String sentimentType;
    @SerializedName("instances")
    @Expose
    private List<Instance> instances = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public String getSentimentType() {
        return sentimentType;
    }

    public void setSentimentType(String sentimentType) {
        this.sentimentType = sentimentType;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

}
