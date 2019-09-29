/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi;

import java.util.List;

/**
 *
 * @author Swapnil
 */
public class GeoCode {

    public List<LocationResult> results;

    public GeoCode(List<LocationResult> results) {
        this.results = results;
    }

}

class LocationResult {

    private Geometry geometry;

    public LocationResult(Geometry geometry) {
        this.geometry = geometry;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    //inner class: LocationResult.Geometry
    class Geometry {

        private Location location;

        public Geometry(Location location) {
            this.location = location;
        }

        public Geometry() {
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        //inner class: LocationResult.Geometry.Location
        class Location {

            private double lat;
            private double lng;

            public Location(double lat, double lng) {
                this.lat = lat;
                this.lng = lng;
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

    }

}
