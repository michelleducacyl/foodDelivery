/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class LoginController {
   
    
    public static boolean loginRequest(String email, String password){
        
        boolean found =false;
		try {
		int numeros = 0;
		String sql = "SELECT * FROM users WHERE email=? AND password=?";
		PreparedStatement preparedStatement = DBConnection.connection.prepareStatement(sql);
		preparedStatement.setString(1,email);
		preparedStatement.setString(2,password);
		ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				numeros++;
			}
		if(numeros>0) {
			found = true;
			
		}
		result.close();
		preparedStatement.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return found;
   
    }

}

