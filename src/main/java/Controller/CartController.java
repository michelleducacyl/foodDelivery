/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CartPanel;
import View.MainApp;
import static View.RestaurantPanel.cart;
import javax.swing.table.DefaultTableModel;
import model.Dishes;

/**
 *
 * @author Michelle Arias García
 */
public class CartController {

    public static double fillCart(CartPanel cartPanel) {
        DefaultTableModel model = (DefaultTableModel) cartPanel.cartTable.getModel();
        model.setRowCount(0);  // Limpia todas las filas existentes en la tabla

        // Verifica si la lista cart contiene elementos
        System.out.println("Número de elementos en cart: " + cart.size());

        double totalPrice = 0;  // Inicializa la variable para el precio total

        for (Dishes dish : cart) {
            if (dish != null) {
                String name = dish.getName();
                String description = dish.getDescription();
                double price = dish.getPrice();

                // Agrega una fila al modelo de la tabla con los valores obtenidos
                model.addRow(new Object[]{name, description, price});

                totalPrice += price;  // Suma el precio al precio total
            } else {
                System.out.println("Elemento nulo detectado en la lista cart");
            }
        }

        cartPanel.cartTable.setModel(model);  // Actualiza la tabla para que muestre los datos
        System.out.println("Precio total: " + totalPrice);  // Muestra el precio total

        return totalPrice;
    }

    public static void removeFromCart(int index) {
        if (index >= 0 && index < cart.size()) {
            cart.remove(index); // Elimina el plato en el índice especificado de la lista cart
        } else {
            System.out.println("Índice fuera de rango: " + index);
        }

        MainApp mainApp = new MainApp();
        mainApp.updatePointVisibility();
        CartPanel cart = new CartPanel();
        cart.updateTotal();

    }

}
