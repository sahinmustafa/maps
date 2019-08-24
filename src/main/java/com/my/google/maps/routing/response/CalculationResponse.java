package com.my.google.maps.routing.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalculationResponse implements Serializable {

    public Response response;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Response {
        private List<Route> route = new ArrayList();
        private String language;

        public List<Route> getRoute() {
            return route;
        }

        public void setRoute(List<Route> route) {
            this.route = route;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }
}
