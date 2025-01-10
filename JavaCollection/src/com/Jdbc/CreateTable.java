package com.Jdbc;

import java.sql.*;
import java.io.*;

import static com.Jdbc.Connection.*;

public class CreateTable {
    static final String QUERY = "create table ProductDao(Id int(20) primary key auto_increment, Name varchar(200) not null, Price int(20), Brand varchar(200))";
    public static void main(String[] args) {
        try {
            java.sql.Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(QUERY);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
