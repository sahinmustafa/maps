package com.my.google.maps.routing;

public class Credentials {

    private final String appId;
    private final String appCode;

    public Credentials(String appId, String appCode) {
        this.appId = appId;
        this.appCode = appCode;
    }

    public String createQueryParams(){
        return new StringBuilder()
                .append("app_id=").append(appId)
                .append("&app_code=").append(appCode)
                .toString();
    }
}
