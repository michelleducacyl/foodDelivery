/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.RestaurantsController;
import static View.HomePanel.restaurantId;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import food.model.Dishes;
import food.model.Restaurant;

/**
 * Clase donde se muestra la información de cada restaurante
 * @author Michelle Arias
 */
public class RestaurantPanel extends javax.swing.JPanel {

    public static List<Dishes> cart = new ArrayList<>();
    Dishes dishO1;
    Dishes dishO2;
    Dishes dishO3;

    /**
     * Creates new form HomePanel
     */
    public RestaurantPanel(List<Dishes> dishes) {

        initComponents();
        UIManager.put("panelRestaurant.arc", 9);
        setRest();
        addCartDish1.setVisible(false);
        addCartDish2.setVisible(false);
        addCartDish3.setVisible(false);
        
        //Estos listeners activan/desactivan el boton de agregar al carrito dependiendo del valor del spinner
        spinnerDish1.addChangeListener((ChangeEvent e) -> {
            // Este método se llama cada vez que cambia el valor del JSpinner
            int newValue = (int) spinnerDish1.getValue(); // Obtener el nuevo valor del JSpinner
            if (newValue > 0) {
                addCartDish1.setVisible(true);
            } else {
                addCartDish1.setVisible(false);
            }
        });
        spinnerDish2.addChangeListener((ChangeEvent e) -> {
            // Este método se llama cada vez que cambia el valor del JSpinner
            int newValue = (int) spinnerDish2.getValue(); // Obtener el nuevo valor del JSpinner
            if (newValue > 0) {
                addCartDish2.setVisible(true);
            } else {
                addCartDish2.setVisible(false);
            }
        });
        spinnerDish3.addChangeListener((ChangeEvent e) -> {
            // Este método se llama cada vez que cambia el valor del JSpinner
            int newValue = (int) spinnerDish3.getValue(); // Obtener el nuevo valor del JSpinner
            if (newValue > 0) {
                addCartDish3.setVisible(true);
            } else {
                addCartDish3.setVisible(false);
            }
        });

        if (dishes != null && dishes.size() >= 3) {
            // Asignar y configurar el primer plato
            dishO1 = dishes.get(0);
            setupDish(dishO1, nameDish1, descriptionDish1, priceDish1, photoDish1);

            // Asignar y configurar el segundo plato
            dishO2 = dishes.get(1);
            setupDish(dishO2, nameDish2, descriptionDish2, priceDish2, photoDish2);

            // Asignar y configurar el tercer plato
            dishO3 = dishes.get(2);
            setupDish(dishO3, nameDish3, descriptionDish3, priceDish3, photoDish3);

        }
    }
    /**
     * Método que asigna la información del restaurante
     */
    private void setRest() {
        Restaurant rest = RestaurantsController.getRestaurantById(restaurantId);
        titleRestaurant.setText(rest.getName());
        descriptionTxt.setText(rest.getDescription());
        String imagePath = rest.getImage();
        if (imagePath != null) {
            URL imageUrl = getClass().getResource(imagePath);
            if (imageUrl != null) {
                ImageIcon icon = new ImageIcon(imageUrl);
                iconImageSushi.setIcon(icon);
            } else {
                System.out.println("Imagen no encontrada: " + imagePath);
            }
        }
    }
    /**
     * Método que asigna la información del plato
     * @param dish Un objeto tipo dish que contiene la información
     * @param nameLabel JLabel del nombre del plato
     * @param descriptionLabel JLabel de la descripción del plato
     * @param priceLabel JLabel del precio del plato
     * @param photoLabel JLabel de la imagen del plato
     */
    private void setupDish(Dishes dish, JLabel nameLabel, JLabel descriptionLabel, JLabel priceLabel, JLabel photoLabel) {
        if (dish != null) {
            nameLabel.setText(dish.getName());
            descriptionLabel.setText(dish.getDescription());
            priceLabel.setText("$ " + dish.getPrice().toString());

            String imagePath = dish.getImage();
            if (imagePath != null) {
                URL imageUrl = getClass().getResource(imagePath);
                if (imageUrl != null) {
                    ImageIcon icon = new ImageIcon(imageUrl);
                    photoLabel.setIcon(icon);
                } else {
                    System.out.println("Imagen no encontrada: " + imagePath);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separator = new javax.swing.JSeparator();
        backgroundTitle = new javax.swing.JPanel();
        titleRestaurant = new javax.swing.JLabel();
        backgroundIcon = new View.PanelRound();
        iconImageSushi = new javax.swing.JLabel();
        descriptionTxt = new javax.swing.JLabel();
        priceTimeTxt = new javax.swing.JLabel();
        menuTxt = new javax.swing.JLabel();
        dish1 = new View.PanelRound();
        photoDish1 = new javax.swing.JLabel();
        nameDish1 = new javax.swing.JLabel();
        descriptionDish1 = new javax.swing.JLabel();
        priceDish1 = new javax.swing.JLabel();
        spinnerDish1 = new javax.swing.JSpinner();
        addCartDish1 = new javax.swing.JButton();
        dish2 = new View.PanelRound();
        photoDish2 = new javax.swing.JLabel();
        nameDish2 = new javax.swing.JLabel();
        descriptionDish2 = new javax.swing.JLabel();
        priceDish2 = new javax.swing.JLabel();
        spinnerDish2 = new javax.swing.JSpinner();
        addCartDish2 = new javax.swing.JButton();
        dish3 = new View.PanelRound();
        photoDish3 = new javax.swing.JLabel();
        nameDish3 = new javax.swing.JLabel();
        descriptionDish3 = new javax.swing.JLabel();
        priceDish3 = new javax.swing.JLabel();
        spinnerDish3 = new javax.swing.JSpinner();
        addCartDish3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        separator.setForeground(new java.awt.Color(237, 238, 242));

        titleRestaurant.setFont(new java.awt.Font("Nunito ExtraBold", 0, 22)); // NOI18N
        titleRestaurant.setText("Royal Suhi House");

        backgroundIcon.setBackground(new java.awt.Color(255, 255, 255));
        backgroundIcon.setRoundBottomLeft(20);
        backgroundIcon.setRoundBottomRight(20);
        backgroundIcon.setRoundTopLeft(20);
        backgroundIcon.setRoundTopRight(20);

        iconImageSushi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/royalSushi.png"))); // NOI18N

        javax.swing.GroupLayout backgroundIconLayout = new javax.swing.GroupLayout(backgroundIcon);
        backgroundIcon.setLayout(backgroundIconLayout);
        backgroundIconLayout.setHorizontalGroup(
            backgroundIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundIconLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconImageSushi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundIconLayout.setVerticalGroup(
            backgroundIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundIconLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconImageSushi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        descriptionTxt.setFont(new java.awt.Font("Nunito Medium", 0, 12)); // NOI18N
        descriptionTxt.setForeground(new java.awt.Color(102, 102, 102));
        descriptionTxt.setText("<html>Exquisite sushi delivered to your door!.  Fresh, flavorful, and fast – experience the best with our delivery app service </html>");

        priceTimeTxt.setFont(new java.awt.Font("Nunito Medium", 1, 11)); // NOI18N
        priceTimeTxt.setForeground(new java.awt.Color(153, 153, 153));
        priceTimeTxt.setText("30 - 40 min · $32 min sum.");

        javax.swing.GroupLayout backgroundTitleLayout = new javax.swing.GroupLayout(backgroundTitle);
        backgroundTitle.setLayout(backgroundTitleLayout);
        backgroundTitleLayout.setHorizontalGroup(
            backgroundTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundTitleLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(backgroundIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        backgroundTitleLayout.setVerticalGroup(
            backgroundTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundTitleLayout.createSequentialGroup()
                        .addComponent(titleRestaurant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceTimeTxt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTxt.setFont(new java.awt.Font("Nunito SemiBold", 1, 12)); // NOI18N
        menuTxt.setText("Menu");

        dish1.setBackground(new java.awt.Color(255, 255, 255));
        dish1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        dish1.setRoundBottomLeft(17);
        dish1.setRoundBottomRight(17);
        dish1.setRoundTopLeft(17);
        dish1.setRoundTopRight(17);
        dish1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photoDish1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/classicRoll.png"))); // NOI18N
        dish1.add(photoDish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 101, 94));

        nameDish1.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        nameDish1.setText("Classic Roll");
        dish1.add(nameDish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, -1));

        descriptionDish1.setFont(new java.awt.Font("Nunito Light", 0, 10)); // NOI18N
        descriptionDish1.setForeground(new java.awt.Color(153, 153, 153));
        descriptionDish1.setText("<html> Uramaki tempurizado de salmón,");
        dish1.add(descriptionDish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 230, 20));

        priceDish1.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        priceDish1.setText("12.99 €");
        dish1.add(priceDish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, -1));

        spinnerDish1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spinnerDish1.setBorder(null);
        dish1.add(spinnerDish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        addCartDish1.setBackground(new java.awt.Color(243, 244, 255));
        addCartDish1.setFont(new java.awt.Font("Nunito Black", 0, 12)); // NOI18N
        addCartDish1.setForeground(new java.awt.Color(78, 96, 255));
        addCartDish1.setText("+ Add to cart");
        addCartDish1.setBorderPainted(false);
        addCartDish1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartDish1MouseClicked(evt);
            }
        });
        dish1.add(addCartDish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        dish2.setBackground(new java.awt.Color(255, 255, 255));
        dish2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        dish2.setRoundBottomLeft(17);
        dish2.setRoundBottomRight(17);
        dish2.setRoundTopLeft(17);
        dish2.setRoundTopRight(17);
        dish2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photoDish2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Takoyaki.png"))); // NOI18N
        dish2.add(photoDish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 101, 94));

        nameDish2.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        nameDish2.setText("Takoyaki");
        dish2.add(nameDish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, -1));

        descriptionDish2.setFont(new java.awt.Font("Nunito Light", 0, 10)); // NOI18N
        descriptionDish2.setForeground(new java.awt.Color(153, 153, 153));
        descriptionDish2.setText("Bolitas de pulpo tradicional");
        dish2.add(descriptionDish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 230, 20));

        priceDish2.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        priceDish2.setText("7.99€");
        dish2.add(priceDish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, -1));

        spinnerDish2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spinnerDish2.setBorder(null);
        dish2.add(spinnerDish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        addCartDish2.setBackground(new java.awt.Color(243, 244, 255));
        addCartDish2.setFont(new java.awt.Font("Nunito Black", 0, 12)); // NOI18N
        addCartDish2.setForeground(new java.awt.Color(78, 96, 255));
        addCartDish2.setText("+ Add to cart");
        addCartDish2.setBorderPainted(false);
        addCartDish2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartDish2MouseClicked(evt);
            }
        });
        dish2.add(addCartDish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        dish3.setBackground(new java.awt.Color(255, 255, 255));
        dish3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        dish3.setRoundBottomLeft(17);
        dish3.setRoundBottomRight(17);
        dish3.setRoundTopLeft(17);
        dish3.setRoundTopRight(17);
        dish3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photoDish3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/udon.png"))); // NOI18N
        dish3.add(photoDish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 101, 94));

        nameDish3.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        nameDish3.setText("Kinoku Udon");
        dish3.add(nameDish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, -1));

        descriptionDish3.setFont(new java.awt.Font("Nunito Light", 0, 10)); // NOI18N
        descriptionDish3.setForeground(new java.awt.Color(153, 153, 153));
        descriptionDish3.setText("Fideos udon salteados con mix de setas ");
        dish3.add(descriptionDish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 230, 20));

        priceDish3.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        priceDish3.setText("25€");
        dish3.add(priceDish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, -1));

        spinnerDish3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spinnerDish3.setBorder(null);
        dish3.add(spinnerDish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        addCartDish3.setBackground(new java.awt.Color(243, 244, 255));
        addCartDish3.setFont(new java.awt.Font("Nunito Black", 0, 12)); // NOI18N
        addCartDish3.setForeground(new java.awt.Color(78, 96, 255));
        addCartDish3.setText("+ Add to cart");
        addCartDish3.setBorderPainted(false);
        addCartDish3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartDish3MouseClicked(evt);
            }
        });
        dish3.add(addCartDish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(backgroundTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dish1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dish2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dish3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(backgroundTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dish1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dish2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dish3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que agrega el plato número 1 al carrito
     * @param evt Evento que lo llama
     */
    private void addCartDish1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartDish1MouseClicked

        int cantidad = Integer.parseInt(spinnerDish1.getValue().toString());

        for (int i = 0; i < cantidad; i++) {
            // Verificar si la lista está vacía y agregar el plato directamente si es el caso
            if (cart.isEmpty()) {
                cart.add(dishO1);
            } else {
                // Verificar si el plato a agregar tiene el mismo código de restaurante que los platos en la lista
                if (dishO1.getRestaurant().getId().equals(cart.get(0).getRestaurant().getId())) {
                    cart.add(dishO1);
                } else {
                    // Si los códigos de restaurante no coinciden, mostrar un mensaje de error o manejar la situación según sea necesario
                    JOptionPane.showMessageDialog(null, "Los platos deben ser del mismo restaurante.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método sin agregar el plato a la lista
                }
            }
        }

        MainApp mainApp = new MainApp();
        mainApp.updatePointVisibility();
        System.out.println("Cantidad de platos: " + cart.size());
        
        JOptionPane.showMessageDialog(null, "Platos agregados al carrito.", "Agregado", JOptionPane.INFORMATION_MESSAGE);
        spinnerDish1.setValue(0);

    }//GEN-LAST:event_addCartDish1MouseClicked
    /**
     * Método que agrega el plato número 2 al carrito
     * @param evt Evento que lo llama
     */
    private void addCartDish2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartDish2MouseClicked
        // TODO add your handling code here:
       int cantidad = Integer.parseInt(spinnerDish2.getValue().toString());

        for (int i = 0; i < cantidad; i++) {
            // Verificar si la lista está vacía y agregar el plato directamente si es el caso
            if (cart.isEmpty()) {
                cart.add(dishO2);
            } else {
                // Verificar si el plato a agregar tiene el mismo código de restaurante que los platos en la lista
                System.out.println("RESTAURANTE PLATO: " + dishO2.getRestaurant().getId());
                System.out.println("RESTAURANTE CART: " + cart.get(0).getRestaurant().getId());
                
                if (dishO2.getRestaurant().getId().equals(cart.get(0).getRestaurant().getId())) {
                    cart.add(dishO2);
                } else {
                    // Si los códigos de restaurante no coinciden, mostrar un mensaje de error o manejar la situación según sea necesario
                    JOptionPane.showMessageDialog(null, "Los platos deben ser del mismo restaurante.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método sin agregar el plato a la lista
                }
            }
        }

        MainApp mainApp = new MainApp();
        mainApp.updatePointVisibility();
        System.out.println("Cantidad de platos: " + cart.size());
        JOptionPane.showMessageDialog(null, "Platos agregados al carrito.", "Agregado", JOptionPane.INFORMATION_MESSAGE);
        spinnerDish2.setValue(0);
    }//GEN-LAST:event_addCartDish2MouseClicked
    /**
     * Método que agrega el plato número 3 al carrito
     * @param evt Evento que lo llama
     */
    private void addCartDish3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartDish3MouseClicked
        // TODO add your handling code here:
        int cantidad = Integer.parseInt(spinnerDish3.getValue().toString());

        for (int i = 0; i < cantidad; i++) {
            // Verificar si la lista está vacía y agregar el plato directamente si es el caso
            if (cart.isEmpty()) {
                cart.add(dishO3);
            } else {
                // Verificar si el plato a agregar tiene el mismo código de restaurante que los platos en la lista
                if (dishO3.getRestaurant().getId().equals(cart.get(0).getRestaurant().getId())) {
                    cart.add(dishO3);
                } else {
                    // Si los códigos de restaurante no coinciden, mostrar un mensaje de error o manejar la situación según sea necesario
                    JOptionPane.showMessageDialog(null, "Los platos deben ser del mismo restaurante.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Salir del método sin agregar el plato a la lista
                }
            }
        }

        MainApp mainApp = new MainApp();
        mainApp.updatePointVisibility();
        System.out.println("Cantidad de platos: " + cart.size());
        JOptionPane.showMessageDialog(null, "Platos agregados al carrito.", "Agregado", JOptionPane.INFORMATION_MESSAGE);
        spinnerDish3.setValue(0);
    }//GEN-LAST:event_addCartDish3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartDish1;
    private javax.swing.JButton addCartDish2;
    private javax.swing.JButton addCartDish3;
    private View.PanelRound backgroundIcon;
    private javax.swing.JPanel backgroundTitle;
    private javax.swing.JLabel descriptionDish1;
    private javax.swing.JLabel descriptionDish2;
    private javax.swing.JLabel descriptionDish3;
    private javax.swing.JLabel descriptionTxt;
    private View.PanelRound dish1;
    private View.PanelRound dish2;
    private View.PanelRound dish3;
    private javax.swing.JLabel iconImageSushi;
    private javax.swing.JLabel menuTxt;
    private javax.swing.JLabel nameDish1;
    private javax.swing.JLabel nameDish2;
    private javax.swing.JLabel nameDish3;
    private javax.swing.JLabel photoDish1;
    private javax.swing.JLabel photoDish2;
    private javax.swing.JLabel photoDish3;
    private javax.swing.JLabel priceDish1;
    private javax.swing.JLabel priceDish2;
    private javax.swing.JLabel priceDish3;
    private javax.swing.JLabel priceTimeTxt;
    private javax.swing.JSeparator separator;
    private javax.swing.JSpinner spinnerDish1;
    private javax.swing.JSpinner spinnerDish2;
    private javax.swing.JSpinner spinnerDish3;
    private javax.swing.JLabel titleRestaurant;
    // End of variables declaration//GEN-END:variables
}
