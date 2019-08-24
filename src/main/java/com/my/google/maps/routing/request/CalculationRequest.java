package com.my.google.maps.routing.request;

import com.my.google.maps.routing.Credentials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculationRequest {

    private String wayPoint0;
    private String wayPoint1;
    private String mode[];
    private RouteAttributes[] routeAttributes;

    public CalculationRequest setWayPoint0(double latitude, double longitude) {
        this.wayPoint0 = latitude + "," + longitude;
        return this;
    }

    public CalculationRequest setWayPoint1(double latitude, double longitude) {
        this.wayPoint1 = latitude + "," + longitude;
        return this;
    }

    public CalculationRequest setMode(String... mode) {
        this.mode = mode;
        return this;
    }

    public CalculationRequest setRouteAttributes(RouteAttributes... routeAttributes) {
        this.routeAttributes = routeAttributes;
        return this;
    }

    public String createQueryParams(){
        return new StringBuilder()
                .append("waypoint0=geo!").append(wayPoint0)
                .append("&waypoint1=geo!").append(wayPoint1)
                .append("&routeattributes=").append(getRouteAttributesString())
                .append("&mode=").append(getModeString())
                .toString();
    }

    private String getRouteAttributesString(){
        List<String> routeStringList = Arrays.asList(routeAttributes)
                .stream()
                .map(e -> e.getValue())
                .collect(Collectors.toList());
        return String.join(",", routeStringList);
    }

    private String getModeString(){
        if (mode == null) throw new RuntimeException("Mode is required");
        return String.join(";", mode);
    }
}
