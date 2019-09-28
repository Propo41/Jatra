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
public class Geometry {

    private LocationParser location;

    public Geometry(LocationParser location) {
        this.location = location;
    }

    public LocationParser getLocation() {
        return location;
    }

    public void setLocation(LocationParser location) {
        this.location = location;
    }

}
