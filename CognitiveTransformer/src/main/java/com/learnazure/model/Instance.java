
package com.learnazure.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Instance {

    @SerializedName("adjustedStart")
    @Expose
    private String adjustedStart;
    @SerializedName("adjustedEnd")
    @Expose
    private String adjustedEnd;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private String end;

    public String getAdjustedStart() {
        return adjustedStart;
    }

    public void setAdjustedStart(String adjustedStart) {
        this.adjustedStart = adjustedStart;
    }

    public String getAdjustedEnd() {
        return adjustedEnd;
    }

    public void setAdjustedEnd(String adjustedEnd) {
        this.adjustedEnd = adjustedEnd;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

}
