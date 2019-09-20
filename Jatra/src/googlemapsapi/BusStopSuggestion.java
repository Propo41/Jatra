/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi;

/**
 *
 * @author Swapnil
 */
public class BusStopSuggestion {

    public String stopName;

    public BusStopSuggestion() {

    }

    public BusStopSuggestion(String stopName) {
        this.stopName = stopName;
    }

    public static BusStopSuggestion querySearch(String query) {
        return new BusStopSuggestion(query);
    }
}
