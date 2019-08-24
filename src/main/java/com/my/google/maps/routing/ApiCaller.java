package com.my.google.maps.routing;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class ApiCaller {

    static <T> T get(String url, Class<T> clazz) throws Exception{
        URL urlObject = new URL(url);
        HttpURLConnection con = (HttpURLConnection) urlObject.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        if (con.getResponseCode() != 200) throw new Exception(response.toString());

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response.toString(), clazz);
    }
}
