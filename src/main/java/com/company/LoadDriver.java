package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class LoadDriver {
    public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver");
            MySQL c1 = new MySQL();
            c1.connectMySQL();
        } catch (Exception ex) {
            // handle the error
        }
    }
}