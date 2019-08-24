package com.my.google.maps.routing.request;

public enum  RouteAttributes {

    WAYPOINTS("wp"),
    SUMMARY("sm"),
    SUMMARY_BY_COUNTRY("sc"),
    LEGS("lg");

    private final String value;

   RouteAttributes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
