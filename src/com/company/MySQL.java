package com.company;

<<<<<<< Updated upstream:src/com/company/Main.java
public class Main {

    public static void main(String[] args) {
	 //Bobby wuz her
        //Brock was here
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
>>>>>>> Stashed changes:src/com/company/MySQL.java
    }
}
