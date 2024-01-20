/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Load.Load;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;

/**
 *
 * @author Michelle Arias
 */
public class InitApp {
     public static void main(String[] args) {
        FlatCyanLightIJTheme.setup();
        Load load = new Load();
        load.startLoading();
    }
}
