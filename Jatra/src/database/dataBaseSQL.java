/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Bus;
import main.JatraBegins;
import main.User;
import googlemapsapi.Places.BusStops;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Swapnil
 * @
 *
 */
public class dataBaseSQL {

    //TODO in the target_stops table, add more columns: place_id, icon, vicinity
    // add the vicinity and stuff from the method searchBusStops() down below
    //<editor-fold defaultstate="collapsed" desc="CREDENTIALS">
    private final String username = "root";
    private final String password = "microlab123";
    //</editor-fold>

    private String dbUrl;
    private String serviceType;
    private User user;
    private static int index = 0;

    public dataBaseSQL(User user) {

        this.serviceType = user.getServiceType();
        this.user = user;
        setDbURL();

    }

    public dataBaseSQL(String serviceType) {
        this.serviceType = serviceType;
        setDbURL();

    }

    public dataBaseSQL() {

        setDbURL();

    }

    public void setDbURL() {

        //<editor-fold defaultstate="collapsed" desc="CREDENTIALS">
        this.dbUrl = "jdbc:mysql://localhost:3306/";
        //  this.dbUrl = "jdbc:mysql://35.240.151.216:3306/";
        //</editor-fold>

    }


    /*
    after the signup page, all data is uploaded to database from this function
    the parameters required to be added are all set in the User object user
    in the constructor
     */
    public void uploadData() {

        // check the number of entries in the database table. The new entry index to be inserted
        // in the database is the total count + 1;
        index = countSize();
        index++;

        System.out.println("index: " + index);
        try {
            Connection myConn = DriverManager.getConnection(dbUrl + serviceType + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();

            String valuesToInsert = "'"
                    + user.getUsername() + "', '"
                    + user.getEmail() + "', '"
                    + user.getPassword() + "', '"
                    + user.getPhoneNumber() + "', '"
                    + user.getCity() + "', '"
                    + index + "'";

            String sql = "insert into user "
                    + " (username, email, password, phoneNumber, city, indexID)"
                    + " values (" + valuesToInsert + ")";

            statement.executeUpdate(sql);

        } catch (Exception e) {
            Logger.getLogger(dataBaseSQL.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    /*
    uploads data to the databse and finds the total entries of bus

     */
    public void uploadDataOwner(Bus bus) {
        System.out.println("uploading data to databse");

        int busID = findTotalEntriesOfBusses();
        uploadDataForBus(bus, busID);
        uploadDataForBusStops(bus.getBusStops(), busID);

    }

    private void uploadDataForBus(Bus bus, int busID) {

        try {
            //System.out.println("db: " + dbUrl);
            System.out.println("busid: " + busID);
            Connection myConn = DriverManager.getConnection(dbUrl + JatraBegins.getUser() + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();

            String valuesToInsert = "'"
                    + bus.getName() + "', '"
                    + bus.getTotalSeats() + "', '"
                    + bus.getRating() + "', '"
                    + bus.getRegisteredDate() + "', '"
                    + bus.getCondition() + "', '"
                    + bus.getFare() + "', '"
                    + bus.getType() + "', '"
                    + JatraBegins.getKey() + "', '"
                    + busID + "'";

            String sql = "insert into bus_list VALUES ("
                    + valuesToInsert
                    + ")";
            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("successfully uploaded to database.owner.bus_list");

    }

    private void uploadDataForBusStops(List<String> stopList, int busID) {

        try {

            Connection myConn = DriverManager.getConnection(dbUrl + JatraBegins.getUser() + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();

            for (int i = 0; i < stopList.size(); i++) {

                String sql = "insert into target_stops VALUES ('"
                        + stopList.get(i) + "', '"
                        + busID + "')";

                statement.executeUpdate(sql);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println("successfully uploaded to database.owner.target_stops");

    }

    /*
    the method finds the highest value of the column "busID" from bus_list table.
    implicitly called from uploadDataOwner

     */
    private int findTotalEntriesOfBusses() {

        try {

            Connection myConn = DriverManager.getConnection(dbUrl + JatraBegins.getUser() + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();
            String sql = "select max(busID) as 'max' from bus_list;";
            ResultSet result = statement.executeQuery(sql);
            //the cursor points to -1. so this next() neeeds to be called
            result.next();
            int busID;
            String str;
            if ((str = result.getString("max")) != null) {
                busID = Integer.parseInt(str);
                busID++;

            } else {
                busID = 1;
            }
            return busID;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return -1;

    }


    /*
    finds the number of rows in the user table.
     */
    private int countSize() {

        Connection myConn;
        int count = -1;
        try {
            myConn = DriverManager.getConnection(dbUrl + serviceType + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();
            ResultSet rs = statement.executeQuery("select count(*) from user");
            rs.next();
            //Moving the cursor to the last row
            //            System.out.println("Table contains " + rs.getInt("count(*)") + " rows");
            count = rs.getInt("count(*)");

        } catch (SQLException ex) {
            Logger.getLogger(dataBaseSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count;

    }

    /*
    checks against the database if the user's email and password exists or not.
     */
    public boolean checkAvailablity(String email, String password) {

        System.out.println("searching for entered info in databse");
        if (checkPassenger(email, password)) {
            JatraBegins.setUser("passenger");
            return true;

        } else if (checkOwner(email, password)) {

            JatraBegins.setUser("owner");
            return true;

        } else {
            return false;
        }

    }

    /*
    helper method to open a connection to search in the passenger schema
    if the match is found, the user's current session key is assigned.
    the current session key is the indexID of the user which is set by using JatraBegins.setKey(key);
     */
    public boolean checkPassenger(String email, String password) {
        try {

            int key;
            Connection myConn = DriverManager.getConnection(dbUrl + "passenger" + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();
            ResultSet result = statement.executeQuery("select email, password, indexID from user");

            while (result.next()) {
                if (result.getString("email").equals(email) && result.getString("password").equals(password)) {
                    key = result.getInt("indexID");
                    //assigning current session key
                    JatraBegins.setKey(key);
                    return true;
                    //System.out.println("key: " + key);
                }
            }

        } catch (Exception e) {
            Logger.getLogger(dataBaseSQL.class.getName()).log(Level.SEVERE, null, e);

        }
        return false;
    }

    /*
    helper method to open a connection to search in the owner schema
    if the match is found, the user's current session key is assigned.
    the current session key is the indexID of the user which is set by using JatraBegins.setKey(key);
     */
    public boolean checkOwner(String email, String password) {

        try {

            int key;
            Connection myConn = DriverManager.getConnection(dbUrl + "owner" + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();
            ResultSet result = statement.executeQuery("select email, password, indexID from user");

            while (result.next()) {
                if (result.getString("email").equals(email) && result.getString("password").equals(password)) {
                    key = result.getInt("indexID");
                    //assigning current session key
                    JatraBegins.setKey(key);
                    return true;
                }
            }

        } catch (Exception e) {
            Logger.getLogger(dataBaseSQL.class.getName()).log(Level.SEVERE, null, e);

        }
        return false;

    }

    /*
    iterates thru the databse and finds all the busStops that each bus travels through
    stores the result in a map <busstop, busid> object
     */
    public void searchBusStops() {
        BusStops currLoc = JatraBegins.getCurrBusStops();
        BusStops destLoc = JatraBegins.getDestBusStops();
        int currLocIndex = 0;
        int destLocIndex = 0;

        try {
            Connection myConn = DriverManager.getConnection(dbUrl + "owner" + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();

            int busID = 1;
            ResultSet result = statement.executeQuery("SELECT * FROM target_stops where busID=" + busID);
            //ResultSet iterator = result;
            int length = getLength(result);
            // System.out.println("LENGTH OF TARGET STOPS: " + length);
            System.out.println("LENGTH OF CURR STOPS: " + currLoc.results.size());

            //default value false
            boolean[] visited = new boolean[length];

            boolean a = false, b = false;

            result = statement.executeQuery("SELECT * FROM target_stops where busID=" + busID);

            for (int i = 0; i < currLoc.results.size(); i++) {
                int j = 0;

                while (result.next()) {
                    if (result.getString("stopName").equals(currLoc.results.get(i).getName())) {
                        visited[j] = true;
                        a = true;
                        currLocIndex = i;
                        break;
                    }

                    j++;
                }

                if (a == true) {
                    break;
                } else {
                    result = statement.executeQuery("SELECT * FROM target_stops where busID=" + busID);

                }
            }

            if (a == true) {
                for (int i = 0; i < destLoc.results.size(); i++) {
                    int j = 0;

                    while (result.next()) {
                        if (visited[j] == false && result.getString("stopName").equals(destLoc.results.get(i).getName())) {
                            visited[j] = true;
                            b = true;
                            destLocIndex = i;
                            break;
                        }
                        j++;
                    }

                    if (b == true) {
                        break;
                    } else {
                        result = statement.executeQuery("SELECT * FROM target_stops where busID=" + busID);

                    }

                }
            }

            if ((a && b) == true) {
                System.out.println("FOUND!!! YESSSSSS");

                //now send this two Result objects to the class AvailableBusses file where the cells will be displayed
                System.out.println("From: " + currLoc.results.get(currLocIndex).getName());
                System.out.println("To: " + destLoc.results.get(destLocIndex).getName());

            } else {
                System.out.println("not found! NOOOOOOOOOOOOOOOOOOO");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private int getLength(ResultSet rs) throws SQLException {
        int c = 0;
        while (rs.next()) {
            c++;
        }
        return c;
    }

}
