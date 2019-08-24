package com.my.google.maps.routing.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Position implements Serializable {

    public double latitude;
    public double longitude;

}
