package com.my.google.maps.routing.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Summary implements Serializable {

    private Long distance;
    private Long trafficTime;
    private Long baseTime;
    private String text;
    private Long travelTime;

    @Override
    public String toString() {
        return text;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Long getTrafficTime() {
        return trafficTime;
    }

    public void setTrafficTime(Long trafficTime) {
        this.trafficTime = trafficTime;
    }

    public Long getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(Long baseTime) {
        this.baseTime = baseTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Long travelTime) {
        this.travelTime = travelTime;
    }
}
