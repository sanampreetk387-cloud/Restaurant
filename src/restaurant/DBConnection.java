/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DBConnection {
   


    private static final String URL = "jdbc:sqlite:restaurant.db";

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(URL);
            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {

            System.out.println("Connection Error: " + e.getMessage());

        }

        return con;
    }
}

