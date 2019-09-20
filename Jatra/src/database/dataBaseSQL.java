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

/**
 *
 * @author Swapnil
 */
public class dataBaseSQL {

    private final String username = "root";
    private final String password = "microlab123";
    private String dbUrl;
    private String serviceType;
    private User user;
    private static int index = 0;

    public dataBaseSQL(User user) {

        this.serviceType = user.getServiceType();
        this.user = user;
        dbUrl = "jdbc:mysql://localhost:3306/";

    }

    public dataBaseSQL(String serviceType) {
        this.serviceType = serviceType;
        dbUrl = "jdbc:mysql://localhost:3306/";
    }

    public dataBaseSQL() {

        dbUrl = "jdbc:mysql://localhost:3306/";
    }

    public void setDbURL(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String searchQuery(int index) {

        /*
        to select individual items based on their index use the command :
            SELECT * FROM passenger.user
            WHERE indexID = 0;
        Also, while inserting data into the database, increment index value by 1

         */
        return null;
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

    public void uploadDataOwner(Bus bus) {
        System.out.println("uploading data to databse");
        uploadDataForBus(bus);
        // uploadDataForBusStops(bus.getBusStops());

    }

    private void uploadDataForBus(Bus bus) {

        try {
            System.out.println("db: " + dbUrl);
            Connection myConn = DriverManager.getConnection(dbUrl + JatraBegins.getUser() + "?autoReconnect=true&useSSL=false", this.username, this.password);
            Statement statement = myConn.createStatement();

            String valuesToInsert = "'"
                    + bus.getName() + "', '"
                    + bus.getTotalSeats() + "', '"
                    + bus.getRating() + "', '"
                    + bus.getRegisteredDate() + "', '"
                    + bus.getCondition() + "', '"
                    + bus.getFare() + "', '"
                    + JatraBegins.getKey() + "'";

            String sql = "insert into bus_list "
                    + " (name, seats, rating, date, condition, fare, type, indexID)"
                    + " values (" + valuesToInsert + ")";

            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void uploadDataForBusStops(List<String> stopList) {

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
                    //System.out.println("key: " + key);
                }
            }

        } catch (Exception e) {
            Logger.getLogger(dataBaseSQL.class.getName()).log(Level.SEVERE, null, e);

        }
        return false;

    }

}
