package main;

import googlemapsapi.AddressAPI;

public class JatraBegins {

    private static int key;
    private static String user;

    public static void main(String[] args) {
        //entry point of program

        new AddressAPI().findAddressFromQuery("kala");

    }

    public static void setKey(int _key) {
        key = _key;
    }

    public static void setUser(String _user) {
        user = _user;
    }

    public static String getUser() {
        return user;
    }

    public static int getKey() {
        return key;
    }
}
