/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Michelle Arias García
 */
public class EmailValidator {

    //Metodo para verificar que el email tenga el formato email.
    public static boolean checkEmailFormat(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        //Devuelve un booleano
        return matcher.matches();
    }
}
