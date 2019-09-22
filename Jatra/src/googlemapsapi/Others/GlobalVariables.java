/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemapsapi.Others;

import googlemapsapi.Address.AutoCompleteAddress;

/**
 *
 * @author Swapnil
 */
/*
Stores the required variables for each user instance at run time temporary. ONE AT A TIME. The values will
get replaced after restarting the program.
 */
public class GlobalVariables {

    private static AutoCompleteAddress autoCompleteAddress;

    public GlobalVariables() {
    }

    public static AutoCompleteAddress getAutoCompleteAddress() {
        return autoCompleteAddress;
    }

    public static void setAutoCompleteAddress(AutoCompleteAddress obj) {
        autoCompleteAddress = obj;
    }

}
