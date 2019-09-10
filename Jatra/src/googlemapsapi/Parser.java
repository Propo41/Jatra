/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 *
 * @author Swapnil
 */
public class Parser {

    /*
    Converts the https url to string object.
    taken from: https://stackoverflow.com/questions/4328711/read-url-to-string-in-few-lines-of-java-code

     */
    public static String convertURLtoString(String urlString) throws IOException {

        URL url = new URL(urlString);

        URLConnection conn = url.openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            String pageText = reader.lines().collect(Collectors.joining("\n"));
            return pageText;
        }

    }

    /*
    parses the json string that's sent as a parameter using the Gson library.
    The results are stored in an object of class AutoCompleteAddress.
     */
    public static AutoCompleteAddress deSerialize_Address(String jsonString) {

        Gson gson = new Gson();
        return gson.fromJson(jsonString, AutoCompleteAddress.class);

    }

    public static BusStops deSerialize_BusStops(String jsonString) {

        Gson gson = new Gson();
        return gson.fromJson(jsonString, BusStops.class);

    }

    public static GeoCode deSerialize_GeoCode(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, GeoCode.class);

    }

}
