
package com.learnazure.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistics {

    @SerializedName("correspondenceCount")
    @Expose
    private Integer correspondenceCount;
    @SerializedName("speakerTalkToListenRatio")
    @Expose
    private SpeakerTalkToListenRatio speakerTalkToListenRatio;
    @SerializedName("speakerLongestMonolog")
    @Expose
    private SpeakerLongestMonolog speakerLongestMonolog;
    @SerializedName("speakerNumberOfFragments")
    @Expose
    private SpeakerNumberOfFragments speakerNumberOfFragments;
    @SerializedName("speakerWordCount")
    @Expose
    private SpeakerWordCount speakerWordCount;

    public Integer getCorrespondenceCount() {
        return correspondenceCount;
    }

    public void setCorrespondenceCount(Integer correspondenceCount) {
        this.correspondenceCount = correspondenceCount;
    }

    public SpeakerTalkToListenRatio getSpeakerTalkToListenRatio() {
        return speakerTalkToListenRatio;
    }

    public void setSpeakerTalkToListenRatio(SpeakerTalkToListenRatio speakerTalkToListenRatio) {
        this.speakerTalkToListenRatio = speakerTalkToListenRatio;
    }

    public SpeakerLongestMonolog getSpeakerLongestMonolog() {
        return speakerLongestMonolog;
    }

    public void setSpeakerLongestMonolog(SpeakerLongestMonolog speakerLongestMonolog) {
        this.speakerLongestMonolog = speakerLongestMonolog;
    }

    public SpeakerNumberOfFragments getSpeakerNumberOfFragments() {
        return speakerNumberOfFragments;
    }

    public void setSpeakerNumberOfFragments(SpeakerNumberOfFragments speakerNumberOfFragments) {
        this.speakerNumberOfFragments = speakerNumberOfFragments;
    }

    public SpeakerWordCount getSpeakerWordCount() {
        return speakerWordCount;
    }

    public void setSpeakerWordCount(SpeakerWordCount speakerWordCount) {
        this.speakerWordCount = speakerWordCount;
    }

}
