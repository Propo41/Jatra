/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;

/**
 *
 * @author Swapnil
 */
public class Owner extends User {

    private List<Bus> busList;

    public Owner() {

    }

    // the busList object will be created from the signup page
    public Owner(String username, String phoneNumber, String city, String password, String email, List<Bus> busList) {
        super(username, phoneNumber, city, password, email);
        setServiceType(OWNER);
        this.busList = busList;
    }

    public Owner(String username, String phoneNumber, String city, String password, String email) {
        super(username, phoneNumber, city, password, email);
        setServiceType(OWNER);

    }

    public List<Bus> getBusList() {
        return busList;
    }

    public void setBusList(List<Bus> busList) {
        this.busList = busList;
    }

}
