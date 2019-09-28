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
/*
https://developers.google.com/places/web-service/faq
By default, the Places API sorts results by prominence within the supplied radius.
A Nearby Search request can return up to 60 results, split across three pages.
If a place ranks 22nd in prominence, it will appear on the second page of results which you can access through paging.
If a place ranks greater than 60th in prominence it will not be included in the search result, even if it is closer to the center of your search.
You can sort your results by distance instead of prominence by setting the rankby parameter in your query to
distance and omitting the radius parameter. Relevance will be ignored and places will be returned in order of distance from location.
 */
public class NearbyBusStopsAPI {

    private String jsonString;
    private static Location currCoordinates;
    private static Location destCoordinates;
    private final String PLACES_API_KEY = "AIzaSyDfAKN5tfaNv6CfPgwkcoSW9vmmgwYdM1A";
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
        //JatraBegins.setUser("owner");
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

        String urlString;

        if (JatraBegins.getUser().equals("passenger")) {

            urlString = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
                    + "location=" + currCoordinates.getLat()
                    + ","
                    + currCoordinates.getLng()
                    + "&radius=" + radius
                    + "&"
                    + "type=busstop&"
                    + "keyword=bus&"
                    + "key=" + PLACES_API_KEY;
        } else {
            urlString = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
                    + "location=" + currCoordinates.getLat()
                    + ","
                    + currCoordinates.getLng()
                    + "&rankby=distance"
                    + "&"
                    + "type=bus_station&"
                    + "keyword=bus&"
                    + "key=" + PLACES_API_KEY;

        }

        if (next_page_token != null) {
            urlString = urlString.concat("&pagetoken=" + next_page_token);
        }

        // System.out.println(urlString);
        try {
            jsonString = Parser.convertURLtoString(urlString);
            //   System.out.println(jsonString);
            BusStops busStop = Parser.deSerialize_BusStops(jsonString);
            if (JatraBegins.getUser().equals("passenger")) {
                System.out.println("STOPS NEAR USER's current location");
            } else {
                System.out.println("STOPS IN DHAKA CITY");
            }

            debugPrint(busStop);

            //if it's a passenger session, then save the busStop name in a global variable inside JatraBegins
            if (JatraBegins.getUser().equals("passenger")) {
                // Parser.outputToFile(busStop, "current");

                JatraBegins.setCurrBusStops(busStop);

            }

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
            System.out.println("STOPS NEAR USER's dest location");

            debugPrint(busStop);
            JatraBegins.setDestBusStops(busStop);
            // Parser.outputToFile(busStop, "destination");

        } catch (IOException ex) {
            Logger.getLogger(NearbyBusStopsAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void debugPrint(BusStops stops) {
        System.out.println();
        for (int i = 0; i < stops.results.size(); i++) {
            System.out.println(stops.results.get(i).getName() + "  cordinates: " + stops.results.get(i).getGeometry().getLocation().getLat()
                    + " " + stops.results.get(i).getGeometry().getLocation().getLat());
        }
        System.out.println("----------------------------------------------");
        System.out.println();

    }

}
