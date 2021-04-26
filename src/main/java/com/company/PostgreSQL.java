package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQL {

    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/CompanyCoPayroll",
                            "postgres", "123Password");
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

    }
}
