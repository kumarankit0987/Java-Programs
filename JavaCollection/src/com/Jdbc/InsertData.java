package com.Jdbc;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static com.Jdbc.Connection.*;

public class InsertData {
    static final String Query = "INSERT INTO ProductDao(Id,Name,Price,Brand) VALUES(?,?,?,?)";

    public static void main(String[] args) {
        try {
            java.sql.Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Scanner sc = new Scanner(System.in);
            System.out.println(" Id:");
            int id = sc.nextInt();

            System.out.println("Name:");
            String name = sc.next();

            System.out.println("Price:");
            int price = sc.nextInt();

            System.out.println("Brand:");
            String brand = sc.next();

            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, price);
            stmt.setString(4, brand);
            stmt.setInt(5,id);
            stmt.executeUpdate();
             conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
