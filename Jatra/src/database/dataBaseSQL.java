/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author Swapnil
 */
public class dataBaseSQL {

    private String username;
    private String password;
    private String dbUrl;

    public dataBaseSQL(String username, String password, String dbUrl) {
        this.username = username;
        this.password = password;
        this.dbUrl = dbUrl;
    }

    public dataBaseSQL(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setDbURL(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String searchQuery() {

        return null;
    }

}
