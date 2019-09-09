/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author Swapnil
 */
public class AddressAPI {

    private String jsonString;
    private final String PLACES_API_KEY = "AIzaSyAUbjkrtG9C7Zvjmk3SKd6gqXtdznTL5aY";
    // private String[] addresses;
    private ArrayList<String> list = new ArrayList<>();

    public AddressAPI() {
        // addresses = new String[100];
    }

    /*
    the http url takes parameteres: location, radius, keyword, and type of addresses to return.
    location is set to an arbitary center point in the map of dhaka city.
    radius is set to 8020km which covers dhaka city (estimated)
    type of address is set to return exact locations of geolocations.
     */
    public ArrayList<String> findAddressFromQuery(String keyword) {

        try {

            String address = "https://maps.googleapis.com/maps/api/place/autocomplete/json?"
                    + "input="
                    + keyword
                    + "&types=address&location=23.790922,90.415615&radius=8020&strictbounds&key="
                    + PLACES_API_KEY;
            jsonString = Parser.convertURLtoString(address);
            AutoCompleteAddress obj = Parser.deSerialize(jsonString);
            outputAddressesToArray(obj);
            // System.out.println("length in homepage: " + addresses.length);

        } catch (IOException ex) {
            Logger.getLogger(AddressAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    /*
    iterates through the list <Predictions> defined in AutoCompleteAddresses and returns
    the string correspondingly
     */
    private void outputAddressesToArray(AutoCompleteAddress obj) {

        ListIterator<Prediction> itr = obj.predictions.listIterator();

        int i = 0;
        while (itr.hasNext()) {
            //   list[i] = itr.next().getStructured_formatting().getMain_text();
            //  System.out.println("value: " + addresses[i]);

            //  i++;
            list.add(itr.next().getStructured_formatting().getMain_text());

        }

        System.out.println("length in homepage: " + list.size());

        // System.out.println("i: " + i);
    }

}
