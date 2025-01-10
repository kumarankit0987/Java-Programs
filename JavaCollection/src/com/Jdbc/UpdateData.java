package com.Jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.Jdbc.Connection.*;

public class UpdateData {
    public static void main(String[] args) {
        try {
            java.sql.Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String Query = "UPDATE productDao set Id=?, Name=?, Price=?, Brand=? WHERE Id =? ";

            Scanner sc = new Scanner(System.in);
            System.out.println(" Id:");
            int id = sc.nextInt();

            System.out.println("Name:");
            String name = sc.next();

            System.out.println("Price:");
            int price = sc.nextInt();

            System.out.println("Brand:");
            String brand = sc.next();

            PreparedStatement  stmt = conn.prepareStatement(Query);

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
