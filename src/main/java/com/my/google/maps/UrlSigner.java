package com.my.google.maps;

import com.my.google.maps.routing.Credentials;
import com.my.google.maps.routing.Router;
import com.my.google.maps.routing.request.CalculationRequest;
import com.my.google.maps.routing.request.RouteAttributes;
import com.my.google.maps.routing.response.CalculationResponse;

public class UrlSigner {

    public static void main(String[] args) throws Exception {
        Router router = new Router(new Credentials("app_id","app_code"));
        CalculationResponse response = router.calculate(new CalculationRequest()
                .setWayPoint0(39.9578023,32.8561231)
                .setWayPoint1(39.9548226,32.8518878)
                .setMode("shortest", "pedestrian", "traffic:disabled")
                .setRouteAttributes(RouteAttributes.SUMMARY, RouteAttributes.WAYPOINTS));


        response
                .response
                .getRoute()
                .stream()
                .forEach(route -> {
                    System.out.println(route.getSummary());
                    System.out.println(route.getSummary().getDistance() + " meters");
                    System.out.println(route.getSummary().getBaseTime() / 60 + " min");
                });
    }

}
