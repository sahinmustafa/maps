package com.my.google.maps.routing.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mode implements Serializable {

    private String type;
    private String[] transportModes;
    private String trafficMode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getTransportModes() {
        return transportModes;
    }

    public void setTransportModes(String[] transportModes) {
        this.transportModes = transportModes;
    }

    public String getTrafficMode() {
        return trafficMode;
    }

    public void setTrafficMode(String trafficMode) {
        this.trafficMode = trafficMode;
    }
}
