/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JPanel;

/**
 * Esta clase se utiliza para enseñar los paneles dentro de la aplicación.
 * @author Michelle Arias
 */

public class PanelManager {
    private Container container;
    private int witdh;
    private int height;
    
    public PanelManager(Container container, int witdh, int height) {
        this.container = container;
        this.witdh = witdh;
        this.height = height;
        
    }
    
    /**
     * Este método se encarga de enseñar el panel que se le pasa como parámetro
     * @param panel un JPanel a enseñar
     */
    public void mostrarPanel(JPanel panel) {
        panel.setSize(witdh, height);
        panel.setLocation(0, 0);
      
        container.removeAll();
        container.add(panel, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();

       
    }
}
