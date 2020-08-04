package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String user = "root";
        String pass = "1234";

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?useTimezone=true&serverTimezone=UTC", user, pass );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
