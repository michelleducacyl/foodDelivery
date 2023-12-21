/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.security.SecureRandom;

/**
 *
 * @author Michelle Arias García
 */

public class PasswordGenerator {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static SecureRandom rnd = new SecureRandom();

    public static void main(String[] args) {
        String contraseña = generarContraseña(8);
        System.out.println("Contraseña generada: " + contraseña);
    }

    public static String generarContraseña(int longitud) {
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            sb.append(CARACTERES.charAt(rnd.nextInt(CARACTERES.length())));
        }
        return sb.toString();
    }
}
