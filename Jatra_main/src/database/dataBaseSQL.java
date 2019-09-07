/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.User;

/**
 *
 * @author Swapnil
 */
public class dataBaseSQL {

    private final String username = "root";
    private final String password = "microlab123";
    private String dbUrl;
    private Connection connection;
    private Statement statement;
    private String serviceType;
    private User user;
    private static int index = 0;

    public dataBaseSQL(User user) {

        this.serviceType = user.getServiceType();
        this.user = user;
        dbUrl = "jdbc:mysql://localhost:3306/";
        //  index = 0;

    }

    public dataBaseSQL() {

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

    public void uploadData() {

        System.out.println("index: " + index);
        try {
            Connection myConn = DriverManager.getConnection(dbUrl + serviceType + "?autoReconnect=true&useSSL=false", username, password);
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
            index++;

        } catch (Exception e) {
            Logger.getLogger(dataBaseSQL.class.getName()).log(Level.SEVERE, null, e);

        }

    }

}
