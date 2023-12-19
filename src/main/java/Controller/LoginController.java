/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import Model.PasswordHasher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class LoginController {
   
    
    public static boolean loginRequest(String email, String password) {
    boolean found = false;
    try {
        
        String sql = "SELECT * FROM users WHERE email=?";
        PreparedStatement preparedStatement = DBConnection.connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        ResultSet result = preparedStatement.executeQuery();

        // Verificar si se encontró el usuario con el correo electrónico proporcionado
        if (result.next()) {
            String hashed = result.getString("password");
            System.out.println("HASHED " + hashed );
            // Comprobar la contraseña utilizando PasswordHasher (se asume que funciona correctamente)
            if (PasswordHasher.comprobarHash(hashed, password)) {
                found = true;
            }
        }

        result.close();
        preparedStatement.close();
    } catch (SQLException e) {
        // Manejar excepciones de SQL adecuadamente (puedes personalizar el manejo de errores aquí)
        e.printStackTrace();
        System.out.println(e.getMessage());
    }
    return found;
}

}

