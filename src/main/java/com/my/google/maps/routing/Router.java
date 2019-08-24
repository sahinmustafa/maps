package com.my.google.maps.routing;

import com.my.google.maps.routing.request.CalculationRequest;
import com.my.google.maps.routing.response.CalculationResponse;

public class Router {

    private static final String BASE_URL = "https://route.api.here.com/routing/7.2/calculateroute.json";
    private final Credentials credentials;

    public Router(Credentials credentials) {
        this.credentials = credentials;
    }

    public CalculationResponse calculate(CalculationRequest request) throws Exception {
        String url = BASE_URL + "?" + credentials.createQueryParams() + "&" + request.createQueryParams();

        return ApiCaller.get(url, CalculationResponse.class);
    }

}
