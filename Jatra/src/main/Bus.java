/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Swapnil
 */
public class Bus {

    private String name;
    private int totalSeats;
    private String registeredDate;
    private double rating;
    private double fare;
    private String type;
    private String condition;
    private List<String> busStops;

    public Bus() {

        busStops = new ArrayList<>();
    }

    public Bus(String name, int totalSeats, String registeredDate, double rating, double fare, String type, String condition, List<String> busStops) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.registeredDate = registeredDate;
        this.rating = rating;
        this.fare = fare;
        this.type = type;
        this.condition = condition;
        this.busStops = busStops;

        System.out.println("Bus entry successfully added locally.");
    }

    public List<String> getBusStops() {
        return busStops;
    }

    public void setBusStops(List<String> busStops) {
        this.busStops = busStops;
    }

    public void addBusStop(String name) {

        busStops.add(name);
        System.out.println("bus stop added");

    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
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
