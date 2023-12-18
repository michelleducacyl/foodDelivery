/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Michelle Arias García
 */
public class DBConnection {
    public static Connection connection;
    
    public static void startConnection(){
        connection = null;
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            String url = "jdbc:mysql://localhost:3306/food_delivery";
            String user = "root";
            String password = "";
            
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
            
            //connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
       
    }
}
