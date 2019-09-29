/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Swapnil
 */
public class Passenger extends User {

    public Passenger(String username, String phoneNumber, String city, String password, String email) {
        super(username, phoneNumber, city, password, email);
        setServiceType(PASSENGER);
    }

    public Passenger() {

    }

}
