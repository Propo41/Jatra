/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passenger;

import googlemapsapi.Places.BusStops;
import googlemapsapi.Places.Results;

/**
 *
 * @author Swapnil
 */
public class AvailableBusList {

    private googlemapsapi.Places.Results stopsNearCurrLocation;
    private googlemapsapi.Places.Results stopsNearDestLocation;
    private googlemapsapi.Places.BusStops allBusStops;

    private int busID;

    public AvailableBusList(Results stopsNearCurrLocation, Results stopsNearDestLocation, int busID) {
        this.stopsNearCurrLocation = stopsNearCurrLocation;
        this.stopsNearDestLocation = stopsNearDestLocation;
        this.busID = busID;
    }

    public BusStops getAllBusStops() {
        return allBusStops;
    }

    public void setAllBusStops(BusStops allBusStops) {
        this.allBusStops = allBusStops;
    }

    public AvailableBusList() {
    }

    public Results getStopsNearCurrLocation() {
        return stopsNearCurrLocation;
    }

    public void setStopsNearCurrLocation(Results stopsNearCurrLocation) {
        this.stopsNearCurrLocation = stopsNearCurrLocation;
    }

    public Results getStopsNearDestLocation() {
        return stopsNearDestLocation;
    }

    public void setStopsNearDestLocation(Results stopsNearDestLocation) {
        this.stopsNearDestLocation = stopsNearDestLocation;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

}
