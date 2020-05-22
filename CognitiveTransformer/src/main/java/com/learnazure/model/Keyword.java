
package com.learnazure.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Keyword {

    @SerializedName("isTranscript")
    @Expose
    private Boolean isTranscript;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("appearances")
    @Expose
    private List<Appearance> appearances = null;

    public Boolean getIsTranscript() {
        return isTranscript;
    }

    public void setIsTranscript(Boolean isTranscript) {
        this.isTranscript = isTranscript;
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

}
