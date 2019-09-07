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

    public dataBaseSQL(User user) {

        System.out.println("bug: " + user.getServiceType());
        this.serviceType = user.getServiceType();
        this.user = user;
        dbUrl = "jdbc:mysql://localhost:3306/";

    }

    public dataBaseSQL() {

    }

    public void setDbURL(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String searchQuery() {

        return null;
    }

    public void uploadData() {

        try {
            Connection myConn = DriverManager.getConnection(dbUrl + serviceType + "?autoReconnect=true&useSSL=false", username, password);
            Statement statement = myConn.createStatement();

            String valuesToInsert = "'"
                    + user.getUsername() + "', '"
                    + user.getEmail() + "', '"
                    + user.getPassword() + "', '"
                    + user.getPhoneNumber() + "', '"
                    + user.getCity() + "'";

            String sql = "insert into user "
                    + " (username, email, password, phoneNumber, city)"
                    + " values (" + valuesToInsert + ")";

            statement.executeUpdate(sql);

        } catch (Exception e) {
            Logger.getLogger(dataBaseSQL.class.getName()).log(Level.SEVERE, null, e);

        }

    }

}
