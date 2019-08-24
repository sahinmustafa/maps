package com.my.google.maps.routing.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Leg implements Serializable {

    private WayPoint start;
    private WayPoint end;
    private Long length;
    private Long travelTime;

    public WayPoint getStart() {
        return start;
    }

    public void setStart(WayPoint start) {
        this.start = start;
    }

    public WayPoint getEnd() {
        return end;
    }

    public void setEnd(WayPoint end) {
        this.end = end;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Long travelTime) {
        this.travelTime = travelTime;
    }
}
