/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CartPanel;
import static View.RestaurantPanel.cart;
import javax.swing.table.DefaultTableModel;
import model.Dishes;

/**
 *
 * @author Michelle Arias García
 */
public class CartController {
    
    
    public static double fillCart(CartPanel cartPanel) {
    DefaultTableModel model = (DefaultTableModel) cartPanel.cart.getModel();

    // Limpia todas las filas existentes en la tabla
    model.setRowCount(0);

    // Verifica si la lista cart contiene elementos
    System.out.println("Número de elementos en cart: " + cart.size());

    // Inicializa la variable para el precio total
    double totalPrice = 0.0;

    // Recorre la lista y agrega cada elemento a la tabla
    for (Dishes dish : cart) {
        String name = dish.getName();
        String description = dish.getDescription();
        double price = dish.getPrice();

        // Agrega una fila al modelo de la tabla con los valores obtenidos
        model.addRow(new Object[]{name, description, price});

        // Suma el precio al precio total
        totalPrice += price;
    }

    // Actualiza la tabla para que muestre los datos
    cartPanel.cart.setModel(model);
    
    // Muestra el precio total (puedes hacer lo que quieras con esta información)
    System.out.println("Precio total: " + totalPrice);
    
    return totalPrice;
}
    
}
