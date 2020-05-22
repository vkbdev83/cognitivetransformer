
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Brand {

    @SerializedName("referenceId")
    @Expose
    private String referenceId;
    @SerializedName("referenceUrl")
    @Expose
    private Object referenceUrl;
    @SerializedName("confidence")
    @Expose
    private Double confidence;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("seenDuration")
    @Expose
    private Integer seenDuration;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("appearances")
    @Expose
    private List<Appearance> appearances = null;
    @SerializedName("iptcName")
    @Expose
    private String iptcName;
    @SerializedName("iabName")
    @Expose
    private String iabName;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Object getReferenceUrl() {
        return referenceUrl;
    }

    public void setReferenceUrl(Object referenceUrl) {
        this.referenceUrl = referenceUrl;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSeenDuration() {
        return seenDuration;
    }

    public void setSeenDuration(Integer seenDuration) {
        this.seenDuration = seenDuration;
    }

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

    public List<Appearance> getAppearances() {
        return appearances;
    }

    public void setAppearances(List<Appearance> appearances) {
        this.appearances = appearances;
    }

    public String getIptcName() {
        return iptcName;
    }

    public void setIptcName(String iptcName) {
        this.iptcName = iptcName;
    }

    public String getIabName() {
        return iabName;
    }

    public void setIabName(String iabName) {
        this.iabName = iabName;
    }

}
