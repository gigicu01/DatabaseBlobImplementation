package com.company;

import java.sql.*;
public class MySQL {
    public static void connectMySQL() {
        String MySQLURL = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String databseUserName = "root";
        String databasePassword = "";
        Connection con = null;
        try {
            con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
            if (con != null) {
                System.out.println("Database connection is successful !!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
