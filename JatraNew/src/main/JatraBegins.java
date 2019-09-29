package main;

import googlemapsapi.Places.BusStops;
import java.util.ArrayList;
import java.util.List;
import owner.OwnerDashboard;
import passenger.AvailableBusList;
import util.start.Login;
import passenger.PassengerDashBoard;

/*
Collapse (hide) a block                     Ctrl + Minus
Collapse (hide) a block                     Ctrl + NumPad Minus

Collapse (hide) all code blocks             Ctrl + Shift + NumPad Minus
Expand all code blocks (expand-all-folds)   Ctrl + Shift + NumPad Plus

Expand a Collapsed Block (expand-fold)      Ctrl + Plus
Expand a Collapsed Block (expand-fold)      Ctrl + NumPad Plus
Expand a Collapsed Block (expand-fold)      Ctrl + Equals
Expand all code blocks (expand-all-folds)   Ctrl + Shift + Plus
Expand all code blocks (expand-all-folds)   Ctrl + Shift + Equals
 */
 /*
  Database details:
-------------------------
hostname: 35.240.151.216
port: 3306
username: root
pass: root
connectionName: jatraServer
 */
public class JatraBegins {

    private static int key;
    private static String user;
    private static passenger.PassengerDashBoard passenger_homepage;
    private static List<BusStops> listAllStops;
    private static List<String> listStops;

    //the list contains all the list of busses that will go to the user's preferred destination.
    // the object of class AvailableBusList is used to store all the required info
    private static List<AvailableBusList> listOfTargets;

    private static owner.OwnerDashboard owner_homepage;
    private static boolean CURRENT_SESSION = false;

    //stores the busStop object when passenger presses the submit button after selecting the current and dest locations
    private static BusStops currBusStops;
    private static BusStops destBusStops;

    public static List<String> getListStops() {
        return listStops;
    }

    public static List<AvailableBusList> getListOfTargets() {
        return listOfTargets;
    }

    public static void setListOfTargets(List<AvailableBusList> listOfTargets) {
        JatraBegins.listOfTargets = listOfTargets;
    }

    public static void setListStops(List<String> listStops) {
        JatraBegins.listStops = listStops;
    }

    public static BusStops getCurrBusStops() {
        return currBusStops;
    }

    public static List<BusStops> getListAllStops() {
        return listAllStops;
    }

    public static void setListAllStops(List<BusStops> listAllStops) {
        JatraBegins.listAllStops = listAllStops;
    }

    public static void setCurrBusStops(BusStops currBusStops) {
        JatraBegins.currBusStops = currBusStops;
    }

    public static BusStops getDestBusStops() {
        return destBusStops;
    }

    public static void setDestBusStops(BusStops destBusStops) {
        JatraBegins.destBusStops = destBusStops;
    }

    public static void main(String[] args) {
        //entry point of program
        new Login().setVisible(true);

        // new AddressAPI().findAddressFromQuery("kala");
    }

    public static passenger.PassengerDashBoard getPassenger_homepage() {
        return passenger_homepage;
    }

    public static void setPassenger_homepage(passenger.PassengerDashBoard passenger_homepage) {
        JatraBegins.passenger_homepage = passenger_homepage;
    }

    public static void setKey(int _key) {
        key = _key;
        System.out.println("current session key set to : " + key);
    }

    public static void setUser(String _user) {
        user = _user;
        System.out.println("type of user session: " + user);
    }

    public static String getUser() {
        return user;
    }

    public static int getKey() {
        return key;
    }

    public static owner.OwnerDashboard getOwner_homepage() {
        return owner_homepage;
    }

    public static void setOwner_homepage(owner.OwnerDashboard owner_homepage) {
        JatraBegins.owner_homepage = owner_homepage;
    }

    public static boolean isCURRENT_SESSION() {
        return CURRENT_SESSION;
    }

    public static void setCURRENT_SESSION(boolean CURRENT_SESSION) {
        JatraBegins.CURRENT_SESSION = CURRENT_SESSION;
    }

}
