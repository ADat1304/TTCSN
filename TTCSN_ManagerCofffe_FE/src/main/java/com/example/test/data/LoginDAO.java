package com.example.test.data;

import java.sql.*;

public class LoginDAO {
    public static Connection connect() {
        String url = "jdbc:mariadb://localhost:3306/cafe";
        String user = "root";
        String password = ""; // đổi cho đúng

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.toString();
            return null;
        }
    }

}
