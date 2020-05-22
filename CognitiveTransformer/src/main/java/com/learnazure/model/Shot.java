
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shot {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("keyFrames")
    @Expose
    private List<KeyFrame> keyFrames = null;
    @SerializedName("instances")
    @Expose
    private List<Instance> instances = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<KeyFrame> getKeyFrames() {
        return keyFrames;
    }

    public void setKeyFrames(List<KeyFrame> keyFrames) {
        this.keyFrames = keyFrames;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

}
