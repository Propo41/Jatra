/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Swapnil
 */
public class NearbyBusStopsAPI {

    private String jsonString;
    private static Location currCoordinates;
    private static Location destCoordinates;
    private final String PLACES_API_KEY = "AIzaSyAUbjkrtG9C7Zvjmk3SKd6gqXtdznTL5aY";

    public NearbyBusStopsAPI() {

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
    public void searchBusStopsNearby() {

        System.out.println("curr: " + currCoordinates.getLat());
        searchForCurrentLocation();
        searchForDestLocation();

    }

    /*
    the http url is parsed and deserialized with the help of Parser class.
    An instance of BusStop class is obtained in the process which is then sent to
    the method outputToFile() to write the list of busStops in a temporary text file
    for later use.
     */
    private void searchForCurrentLocation() {
        String urlString = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
                + "location=" + currCoordinates.getLat()
                + ","
                + currCoordinates.getLng()
                + "&radius=1500&"
                + "type=busstop&"
                + "keyword=busstop&"
                + "key=" + PLACES_API_KEY;
        try {
            jsonString = Parser.convertURLtoString(urlString);
            //  System.out.println(jsonString);
            BusStops busStop = Parser.deSerialize_BusStops(jsonString);
            Parser.outputToFile(busStop, "current");
            //  System.out.println("success: " + busStop.results.get(0).getName());

        } catch (IOException ex) {
            Logger.getLogger(NearbyBusStopsAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

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
                + "&radius=1500&"
                + "type=busstop&"
                + "keyword=busstop&"
                + "key=" + PLACES_API_KEY;
        try {
            jsonString = Parser.convertURLtoString(urlString);
            // System.out.println(jsonString);
            BusStops busStop = Parser.deSerialize_BusStops(jsonString);
            Parser.outputToFile(busStop, "destination");

        } catch (IOException ex) {
            Logger.getLogger(NearbyBusStopsAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
