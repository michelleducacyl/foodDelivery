/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import View.MainLogin;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.awt.SplashScreen;

/**
 * Esta clase se encarga de iniciar la aplicación con el splash screen.
 * @author Michelle Arias
 */
public class InitApp {
     public static void main(String[] args) {
        FlatCyanLightIJTheme.setup();
        
       
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash == null) {
            System.out.println("SplashScreen.getSplashScreen() returned null");
            return;
        }
        try {
            Thread.sleep(1000); // Mantener la imagen por un segundo, cambia el tiempo según necesites
        } catch (InterruptedException e) {
            // Manejar la excepción
        }
        splash.close(); 
        
        MainLogin m = new MainLogin();
        m.setVisible(true);
    }
}
