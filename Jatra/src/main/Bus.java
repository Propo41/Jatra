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
public class Bus {

    private String name;
    private int totalSeats;
    private String registeredDate;
    private double rating;

    public Bus(String name, int totalSeats, String registeredDate, double rating) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.registeredDate = registeredDate;
        this.rating = rating;
    }

    public Bus() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
