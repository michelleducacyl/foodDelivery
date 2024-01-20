/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Load;

import View.MainLogin;

/**
 *
 * @author Michelle Arias García
 */
public class Load {
    public void startLoading() {
        loading l = new loading();
        l.setVisible(true);
        MainLogin m = new MainLogin();
        m.setVisible(false);

        try {
            for (int x = 0; x <= 100; x++) {
                Thread.sleep(110);
                l.porcentaje.setText(Integer.toString(x) + "%");
                l.barra.setValue(x);

                if (x == 100) {
                    l.setVisible(false);
                    m.setVisible(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
