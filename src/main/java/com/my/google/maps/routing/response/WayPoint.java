package com.my.google.maps.routing.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WayPoint implements Serializable {

    private String linkId;
    private Position mappedPosition;
    private Position originalPosition;
    private String type;
    private double spot;
    private String sideOfStreet;
    private String mappedRoadName;
    private String label;
    private int shapeIndex;
    private String source;


    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public Position getMappedPosition() {
        return mappedPosition;
    }

    public void setMappedPosition(Position mappedPosition) {
        this.mappedPosition = mappedPosition;
    }

    public Position getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(Position originalPosition) {
        this.originalPosition = originalPosition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpot() {
        return spot;
    }

    public void setSpot(double spot) {
        this.spot = spot;
    }

    public String getSideOfStreet() {
        return sideOfStreet;
    }

    public void setSideOfStreet(String sideOfStreet) {
        this.sideOfStreet = sideOfStreet;
    }

    public String getMappedRoadName() {
        return mappedRoadName;
    }

    public void setMappedRoadName(String mappedRoadName) {
        this.mappedRoadName = mappedRoadName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getShapeIndex() {
        return shapeIndex;
    }

    public void setShapeIndex(int shapeIndex) {
        this.shapeIndex = shapeIndex;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
