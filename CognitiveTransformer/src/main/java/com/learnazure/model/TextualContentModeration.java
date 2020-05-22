
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TextualContentModeration {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("bannedWordsCount")
    @Expose
    private Integer bannedWordsCount;
    @SerializedName("bannedWordsRatio")
    @Expose
    private Integer bannedWordsRatio;
    @SerializedName("instances")
    @Expose
    private List<Object> instances = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBannedWordsCount() {
        return bannedWordsCount;
    }

    public void setBannedWordsCount(Integer bannedWordsCount) {
        this.bannedWordsCount = bannedWordsCount;
    }

    public Integer getBannedWordsRatio() {
        return bannedWordsRatio;
    }

    public void setBannedWordsRatio(Integer bannedWordsRatio) {
        this.bannedWordsRatio = bannedWordsRatio;
    }

    public List<Object> getInstances() {
        return instances;
    }

    public void setInstances(List<Object> instances) {
        this.instances = instances;
    }

}
