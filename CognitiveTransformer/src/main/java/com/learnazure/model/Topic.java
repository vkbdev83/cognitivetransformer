
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Topic {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("referenceId")
    @Expose
    private String referenceId;
    @SerializedName("referenceType")
    @Expose
    private String referenceType;
    @SerializedName("iptcName")
    @Expose
    private String iptcName;
    @SerializedName("confidence")
    @Expose
    private Double confidence;
    @SerializedName("iabName")
    @Expose
    private String iabName;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("instances")
    @Expose
    private List<Instance> instances = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getIptcName() {
        return iptcName;
    }

    public void setIptcName(String iptcName) {
        this.iptcName = iptcName;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getIabName() {
        return iabName;
    }

    public void setIabName(String iabName) {
        this.iabName = iabName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

}
