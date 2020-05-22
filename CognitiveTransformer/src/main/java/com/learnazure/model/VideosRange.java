
package com.learnazure.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideosRange {

    @SerializedName("videoId")
    @Expose
    private String videoId;
    @SerializedName("range")
    @Expose
    private Range range;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

}
