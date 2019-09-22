/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.GeoCode;

import googlemapsapi.Others.Location;
import googlemapsapi.Others.Parser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Swapnil
 */
public class GeoCodeAPI {

    //<editor-fold defaultstate="collapsed" desc="API-KEY">
    private final String GEOCODE_API_KEY = "AIzaSyAUbjkrtG9C7Zvjmk3SKd6gqXtdznTL5aY";
    //</editor-fold>

    private String jsonString;

    public GeoCodeAPI() {
    }

    public Location findCoordinates(String place_id) {

        double lat, lng;
        String address = "https://maps.googleapis.com/maps/api/geocode/json?"
                + "place_id=" + place_id
                + "&key=" + GEOCODE_API_KEY;

        try {
            jsonString = Parser.convertURLtoString(address);
            GeoCode obj = Parser.deSerialize_GeoCode(jsonString);

            lat = obj.results.get(0).getGeometry().getLocation().getLat();
            lng = obj.results.get(0).getGeometry().getLocation().getLng();

            return new Location(lat, lng);

        } catch (IOException ex) {
            Logger.getLogger(GeoCodeAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

}
