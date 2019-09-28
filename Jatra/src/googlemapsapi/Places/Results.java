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
/*
contains details for the busStops
 */
public class Results {

    final private String icon;
    final private String id;
    final private String name;
    final private String place_id;
    final private String reference;
    final private String scope;
    final private String vicinity;
    final private double rating;
    final private int user_ratings_total;
    final private Geometry geometry;

    public Results(String icon, String id, String name, String place_id, String reference, String scope, String vicinity, double rating, int user_ratings_total, Geometry geometry) {
        this.icon = icon;
        this.id = id;
        this.name = name;
        this.place_id = place_id;
        this.reference = reference;
        this.scope = scope;
        this.vicinity = vicinity;
        this.rating = rating;
        this.user_ratings_total = user_ratings_total;
        this.geometry = geometry;
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
