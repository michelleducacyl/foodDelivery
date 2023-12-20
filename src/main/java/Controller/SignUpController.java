/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import Model.PasswordHasher;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Michelle Arias García
 */
public class SignUpController {

    public static void insertUser(String email, String password) {

        try {

            String sql = "INSERT INTO users (email, password) VALUES (?, ?)";
            PreparedStatement statement = DBConnection.connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            int queryResult = statement.executeUpdate();
            System.out.println(queryResult + " fila(s) afectada(s)");

        } catch (SQLException e) {

            if (e.getSQLState().equals("22001")) {
                // Atrapar la excepción específica para Data Truncation (22001)

                System.out.println("One of the inputs is greater than the column");

                // Otros manejos de errores o registros de excepciones según necesites
            } else {

                // Manejo general de otras excepciones SQL
                System.out.println(e.getErrorCode());
                System.out.println(e.getMessage());

            }
        }
    }
}
