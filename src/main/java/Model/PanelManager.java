/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JPanel;

/**
 *
 * @author Michelle Arias
 */
public class PanelManager {
    private Container container;

    public PanelManager(Container container) {
        this.container = container;
    }

    public void mostrarPanel(JPanel panel) {
        panel.setSize(400, 600);
        panel.setLocation(0, 0);
        container.removeAll();
        container.add(panel, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }
}
