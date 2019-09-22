/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.Places;

import googlemapsapi.Others.Location;
import googlemapsapi.Others.Parser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.JatraBegins;

/**
 *
 * @author Swapnil
 */
public class NearbyBusStopsAPI {

    private String jsonString;
    private static Location currCoordinates;
    private static Location destCoordinates;
    private final String PLACES_API_KEY = "AIzaSyAUbjkrtG9C7Zvjmk3SKd6gqXtdznTL5aY";
    // 50 000 meters is the maximum allowed
    private int radius;
    private String next_page_token;

    public NearbyBusStopsAPI() {

    }

    public NearbyBusStopsAPI(int radius) {
        this.radius = radius;
    }

    public static void setCurrCoordinates(Location currCoordinates) {
        NearbyBusStopsAPI.currCoordinates = currCoordinates;
    }

    public static void setDestCoordinates(Location destCoordinates) {
        NearbyBusStopsAPI.destCoordinates = destCoordinates;
    }

    /*
     searches nearby busses around the destination and current location of user and writes them in a temporary file in project directory.
     implicit calls to the methods searchForCurrentLocation() and searchForDestLocation()
     the instance objects destCoordinates and currCoordinates are already initialized from the class PredictionsWindows.
     When user selects an address from the predictions window, these instances are initialized immediately.
     */
    public BusStops searchBusStopsNearby(String next_page_token) {

        // System.out.println("curr: " + currCoordinates.getLat());
        //this line is just made for debugging. It shouldn't be here.
        JatraBegins.setUser("owner");
        if (JatraBegins.getUser().equals("passenger")) {
            searchForCurrentLocation();
            searchForDestLocation();
            return null;
        } else {

            this.next_page_token = next_page_token;
            BusStops busStop = searchForCurrentLocation();
            return busStop;
        }

    }

    /*
    the http url is parsed and deserialized with the help of Parser class.
    An instance of BusStop class is obtained in the process which is then sent to
    the method outputToFile() to write the list of busStops in a temporary text file
    for later use.
     */
    private BusStops searchForCurrentLocation() {
        String urlString = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
                + "location=" + currCoordinates.getLat()
                + ","
                + currCoordinates.getLng()
                + "&radius=" + radius
                + "&"
                + "type=busstop&"
                + "keyword=bus&"
                + "key=" + PLACES_API_KEY;

        if (next_page_token != null) {
            urlString = urlString.concat("&pagetoken=" + next_page_token);
            //  //System.out.println("token: " + next_page_token);
        }

        System.out.println(urlString);
        try {
            jsonString = Parser.convertURLtoString(urlString);
            //   System.out.println(jsonString);
            BusStops busStop = Parser.deSerialize_BusStops(jsonString);
            // Parser.outputToFile(busStop, "current");
            //   System.out.println("token: " + busStop.next_page_token);

            return busStop;

            //  System.out.println("success: " + busStop.results.get(0).getName());
        } catch (IOException ex) {
            Logger.getLogger(NearbyBusStopsAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    /*
   the http url is parsed and deserialized with the help of Parser class.
    An instance of BusStop class is obtained in the process which is then sent to
    the method outputToFile() to write the list of busStops in a temporary text file
    for later use.
     */
    private void searchForDestLocation() {

        String urlString = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
                + "location=" + destCoordinates.getLat()
                + ","
                + destCoordinates.getLng()
                + "&radius=" + radius
                + "&"
                + "type=bus_station&"
                + "keyword=busstop&"
                + "key=" + PLACES_API_KEY;
        try {
            jsonString = Parser.convertURLtoString(urlString);
            BusStops busStop = Parser.deSerialize_BusStops(jsonString);
            Parser.outputToFile(busStop, "destination");

        } catch (IOException ex) {
            Logger.getLogger(NearbyBusStopsAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
