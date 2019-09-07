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
public class User {

    private String username;
    private String phoneNumber;
    private String city;
    private String password;
    private String email;
    private String serviceType;

    public final String PASSENGER = "passenger";
    public final String OWNER = "owner";

    public User(String username, String phoneNumber, String city, String password, String email) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.password = password;
        this.email = email;

    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}
