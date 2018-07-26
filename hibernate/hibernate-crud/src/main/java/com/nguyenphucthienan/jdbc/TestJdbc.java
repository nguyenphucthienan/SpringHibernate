package com.nguyenphucthienan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student_tracker?useSSL=false";
        String username = "root";
        String password = "123456";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
