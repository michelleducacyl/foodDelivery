/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.password4j.BcryptFunction;
import java.util.Scanner;

/**
 *
 * @author Michelle Arias García
 */
public class PasswordHasher {
    
    public static String generarHash(String password){
       
        String plainTextPassword = password;
        var bcrypt = BcryptFunction.getInstance(12);
        String hashedPassword = bcrypt.hash(plainTextPassword).getResult();
        return hashedPassword;
    }

    public static boolean comprobarHash( String hashedPassword, String password) {
        var bcrypt = BcryptFunction.getInstance(12);
        String inputPassword = password;
        boolean resultado = bcrypt.check(inputPassword, hashedPassword);
        if (resultado) {
            System.out.println("La contraseña coincide con la versión encriptada.");
        } else {
            System.out.println("La contraseña no coincide con la versión encriptada.");
        }
        return resultado;
    }
}
