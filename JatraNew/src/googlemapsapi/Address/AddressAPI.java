/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.Address;

import googlemapsapi.Others.GlobalVariables;
import googlemapsapi.Others.Parser;
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
    private int sessiontoken;

    //<editor-fold defaultstate="collapsed" desc="API-KEY">
    private final String PLACES_API_KEY = "AIzaSyDfAKN5tfaNv6CfPgwkcoSW9vmmgwYdM1A";
    //</editor-fold>

    private ArrayList<String> list;

    public AddressAPI(int sessiontoken) {
        list = new ArrayList<>();
        this.sessiontoken = sessiontoken;
        System.out.println("session token for autocomplete: " + sessiontoken);
    }

    /*
    Autocomplete place api
    the http url takes parameteres: location, radius, keyword, and type of addresses to return.
    location is set to an arbitary center point in the map of dhaka city.
    radius is set to 12000m which covers dhaka city (estimated)
    type of address is set to return exact locations of geolocations.
    returns: an array list of string containing the predictions (auto complete)
     */
    public ArrayList<String> findAddressFromQuery(String keyword) {

        try {

            String address = "https://maps.googleapis.com/maps/api/place/autocomplete/json?"
                    + "input=" + keyword
                    + "&types=address&"
                    + "location=23.809861,90.415615&"
                    + "radius=12000&"
                    + "strictbounds&"
                    + "key=" + PLACES_API_KEY
                    + "&sessiontoken=" + sessiontoken;

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

    }

    /*
    iterates through the AutoComplete obj declared in GlobalVariables class and checks where the @address is located and
    then the place_id is found from that list
    returns: the place_id of the address
     */
    public static String searchPlaceIDFromSelectedAddress(String address) {

        AutoCompleteAddress obj = GlobalVariables.getAutoCompleteAddress();
        for (int i = 0; i < obj.predictions.size(); i++) {

            if (obj.predictions.get(i).getStructured_formatting().getMain_text().equals(address)) {

                //System.out.println("PLACE_ID: " + obj.predictions.get(i).getPlace_id() + "  name: " + obj.predictions.get(i).getStructured_formatting().getMain_text());
                return obj.predictions.get(i).getPlace_id();

            }

        }

        return null;

    }

}
