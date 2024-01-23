/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Esta clase se encarga de validar el formato de un email
 * con su método checkEmailFormat()
 * @author Michelle Arias García
 */
public class EmailValidator {
    
    
    /**
     * Función que verifica que un email tenga o no el formato correcto
     * @param email este argumento es un String y sera el email a verificar
     * @return un booleano respondiendo a si cumple con el formato o no
     */
    public static boolean checkEmailFormat(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        //Devuelve un booleano
        return matcher.matches();
    }
}
