package main;

import googlemapsapi.AddressAPI;
import owner.HomePage;
import util.Login;
//import util.Login;

public class JatraBegins {

    private static int key;
    private static String user;
    private static owner.HomePage HOMEPAGE;
    private static boolean CURRENT_SESSION = false;

    public static void main(String[] args) {
        //entry point of program
        new Login().setVisible(true);

        // new AddressAPI().findAddressFromQuery("kala");
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

    public static HomePage getHOMEPAGE() {
        return HOMEPAGE;
    }

    public static void setHOMEPAGE(HomePage HOMEPAGE) {
        JatraBegins.HOMEPAGE = HOMEPAGE;
    }

    public static boolean isCURRENT_SESSION() {
        return CURRENT_SESSION;
    }

    public static void setCURRENT_SESSION(boolean CURRENT_SESSION) {
        JatraBegins.CURRENT_SESSION = CURRENT_SESSION;
    }

}
