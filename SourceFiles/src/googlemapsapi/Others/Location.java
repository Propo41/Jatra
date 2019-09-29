/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.Others;

/**
 *
 * @author Swapnil
 */
/*
NOTE: the lat lng that is returned by google api is not approximate.
 */
public class Location {

    private String stopName;
    private double lat;
    private double lng;
    private String place_id;

    public Location(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;

    }

    public Location(String stopName, double lat, double lng, String place_id) {
        this.stopName = stopName;
        this.lat = lat;
        this.lng = lng;
        this.place_id = place_id;
    }

    public Location(String stopName, double lat, double lng) {
        this.stopName = stopName;
        this.lat = lat;
        this.lng = lng;
    }

    public Location(double lat, double lng, String place_id) {
        this.lat = lat;
        this.lng = lng;
        this.place_id = place_id;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

}
