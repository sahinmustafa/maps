package com.my.google.maps.routing.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Route implements Serializable {

    private List<WayPoint> waypoint = new ArrayList();
    private Mode mode;
    private List<Leg> leg;
    private Summary summary;

    public List<WayPoint> getWaypoint() {
        return waypoint;
    }

    public void setWaypoint(List<WayPoint> waypoint) {
        this.waypoint = waypoint;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public List<Leg> getLeg() {
        return leg;
    }

    public void setLeg(List<Leg> leg) {
        this.leg = leg;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}
