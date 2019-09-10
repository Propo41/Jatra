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
    private ArrayList<String> list;

    public AddressAPI() {
        list = new ArrayList<>();
    }

    /*
    the http url takes parameteres: location, radius, keyword, and type of addresses to return.
    location is set to an arbitary center point in the map of dhaka city.
    radius is set to 8020km which covers dhaka city (estimated)
    type of address is set to return exact locations of geolocations.
    returns: an array list of string containing the predictions (auto complete)
     */
    public ArrayList<String> findAddressFromQuery(String keyword) {

        try {

            String address = "https://maps.googleapis.com/maps/api/place/autocomplete/json?"
                    + "input=" + keyword
                    + "&types=address&"
                    + "location=23.790922,90.415615&"
                    + "radius=8020&"
                    + "strictbounds&"
                    + "key=" + PLACES_API_KEY;

            jsonString = Parser.convertURLtoString(address);
            AutoCompleteAddress obj = Parser.deSerialize_Address(jsonString);
            GlobalVariables.setAutoCompleteAddress(obj);
            outputAddressesToArray(obj);

        } catch (IOException ex) {
            Logger.getLogger(AddressAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    /*
    iterates through the list <Predictions> defined in AutoCompleteAddresses and returns
    the string correspondingly.
    called implicitly from findAddressFromQuery() method
     */
    private void outputAddressesToArray(AutoCompleteAddress obj) {

        ListIterator<Prediction> itr = obj.predictions.listIterator();

        int i = 0;
        while (itr.hasNext()) {

            list.add(itr.next().getStructured_formatting().getMain_text());

        }

        System.out.println("length in homepage: " + list.size());

        // System.out.println("i: " + i);
    }

    /*
    iterates through the AutoComplete obj and checks where the @address is located and
    then the place_id is found from that list
    returns: the place_id of the address
     */
    public static String searchPlaceIDFromSelectedAddress(String address) {

        AutoCompleteAddress obj = GlobalVariables.getAutoCompleteAddress();
        for (int i = 0; i < obj.predictions.size(); i++) {

            if (obj.predictions.get(i).getStructured_formatting().getMain_text().equals(address)) {

                System.out.println("PLACE_ID: " + obj.predictions.get(i).getPlace_id() + "  name: " + obj.predictions.get(i).getStructured_formatting().getMain_text());
                return obj.predictions.get(i).getPlace_id();

            }

        }

        return null;

    }

}
