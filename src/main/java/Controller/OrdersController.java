/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.HibernateUtil;
import static View.LoginPanel.USERLOGIN;
import java.util.List;
import java.util.Set;
import model.Dishes;
import model.Orders;
import model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Michelle Arias García
 */
public class OrdersController {
    
   public static void insertOrder(Double total, List<Dishes> dishes) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;

    try {
        tx = session.beginTransaction();

        // Obtener el usuario por su correo electrónico
        String userEmail = USERLOGIN.getEmail();
        Users user = LoginController.getUserByEmail(userEmail); // Llama al método para obtener el usuario

        Orders order = new Orders();
        order.setUsers(user);
        order.setTotal(total);
        order.getDisheses().addAll(dishes);

        session.save(order);

        tx.commit();
    } catch (Exception ex) {
        if (tx != null) {
            tx.rollback();
        }
        ex.printStackTrace();
        System.out.println(ex);
    } finally {
        session.close();
    }
}

}
