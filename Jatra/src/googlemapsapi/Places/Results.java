/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.Places;

/**
 *
 * @author Swapnil
 */
public class Results {

    private String icon;
    private String id;
    private String name;
    private String place_id;
    private String reference;
    private String scope;
    private String vicinity;
    private double rating;
    private int user_ratings_total;
    private Geometry geometry;

    public Results(String icon, String id, String name, String place_id, String reference, String scope, String vicinity, double rating, int user_ratings_total) {
        this.icon = icon;
        this.id = id;
        this.name = name;
        this.place_id = place_id;
        this.reference = reference;
        this.scope = scope;
        this.vicinity = vicinity;
        this.rating = rating;
        this.user_ratings_total = user_ratings_total;
    }

    //inner class inside class Results
    class Geometry {

        Location location;

        //inner class inside class Geometry
        class Location {

            double lat;
            double lng;

            public Location(double lat, double lng) {
                this.lat = lat;
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public double getLng() {
                return lng;
            }
        }

        public Geometry(Location location) {
            this.location = location;
        }
    }

    //getter methods
    public String getIcon() {
        return icon;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlace_id() {
        return place_id;
    }

    public String getReference() {
        return reference;
    }

    public String getScope() {
        return scope;
    }

    public String getVicinity() {
        return vicinity;
    }

    public double getRating() {
        return rating;
    }

    public int getUser_ratings_total() {
        return user_ratings_total;
    }

    public Geometry getGeometry() {
        return geometry;
    }
}
