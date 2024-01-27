/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.OrdersController;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Dishes;
import model.Orders;

/**
 *
 * @author Michelle Arias
 */
public class OrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrdersPanel
     */
    public OrdersPanel() {
        initComponents();
        List<Object[]> orderInfoList = OrdersController.getOrdersByUser(); // Obtener la lista de información de órdenes
        //System.out.print("SIZE ORDERS : " + orderInfoList.size());
        DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
        for (Object[] orderInfo : orderInfoList) {
            String orderId = String.valueOf(orderInfo[0]); // Order ID
            String restaurantName = (String) orderInfo[1]; // Restaurant Name
            String orderDate = orderInfo[2].toString(); // Date
            Object total = orderInfo[3]; // Total (puede ser de cualquier tipo)

            model.addRow(new Object[]{orderId, restaurantName, orderDate, total});
        }

// Eliminar las filas vacías al principio del modelo
        while (model.getRowCount() > 0 && model.getValueAt(0, 0) == null) {
            model.removeRow(0);
        }

        tableOrders.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titleTtx = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        tableOrders = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();

        background.setBackground(new java.awt.Color(255, 255, 255));

        titleTtx.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        titleTtx.setText("My Orders");

        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Restaurant", "Date", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(tableOrders);

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(titleTtx, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(515, 515, 515)
                        .addComponent(deleteButton))
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleTtx)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableOrders.getSelectedRow();
        if (selectedRow != -1) { // Verifica si se ha seleccionado una fila
            DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
            String idToRemoveStr = (String) model.getValueAt(selectedRow, 0); // Obtiene el id como cadena
            int idToRemove = 0; // Inicializa el valor como cero por defecto

            try {
                idToRemove = Integer.parseInt(idToRemoveStr); // Intenta convertir la cadena a entero
            } catch (NumberFormatException e) {
                // Maneja la excepción si la cadena no es un número entero válido
                System.err.println("El ID no es un número entero válido: " + idToRemoveStr);
            }

            // Elimina la fila seleccionada del modelo de la tabla
            model.removeRow(selectedRow);

            // Elimina la orden correspondiente por ID usando Hibernate
            try{
                OrdersController.deleteOrderById(idToRemove);
                JOptionPane.showMessageDialog(null, "Order deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tableOrders;
    private javax.swing.JLabel titleTtx;
    // End of variables declaration//GEN-END:variables
}
