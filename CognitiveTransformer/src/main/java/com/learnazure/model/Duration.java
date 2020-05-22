
package com.learnazure.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Duration {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("seconds")
    @Expose
    private Double seconds;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getSeconds() {
        return seconds;
    }

    public void setSeconds(Double seconds) {
        this.seconds = seconds;
    }

}
