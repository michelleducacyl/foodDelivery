/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.HibernateUtil;
import static View.HomePanel.restaurantId;
import static View.LoginPanel.USERLOGIN;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import model.Dishes;
import model.Orders;
import model.Restaurant;
import model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

            // Obtener el restaurante por su ID usando HQL
            String hql = "FROM Restaurant r WHERE r.id = :restaurantId";
            Query<Restaurant> query = session.createQuery(hql, Restaurant.class);
            query.setParameter("restaurantId", restaurantId);
            Restaurant restaurant = query.getSingleResult();

            Orders order = new Orders();
            order.setUsers(user);
            order.setTotal(total);
            order.setRestaurantId(restaurant.getId());
            order.setOrderDate(new Date()); // Asignar la fecha actual
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

    public static List<Object[]> getOrdersByUser() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List<Object[]> orderInfoList = new ArrayList<>();

        try {
            tx = session.beginTransaction();

            // Consulta para obtener el ID del usuario por su email
            String userIdQuery = "SELECT id FROM Users WHERE email = :email";
            Query<Integer> userIdQueryObj = session.createQuery(userIdQuery, Integer.class);
            userIdQueryObj.setParameter("email", USERLOGIN.getEmail());
            Integer userId = userIdQueryObj.uniqueResult();

            if (userId != null) {
                // Consulta HQL corregida para obtener todas las órdenes del usuario con información adicional
                String hql = "SELECT o.id, o.restaurantId, o.orderDate, o.total FROM Orders o WHERE o.users.id = :user_id";
                Query<Object[]> query = session.createQuery(hql);
                query.setParameter("user_id", userId);
                orderInfoList = query.list();
            }

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

        return orderInfoList;
    }
    
    public static void deleteOrderById(int orderId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;

    try {
        tx = session.beginTransaction();

        // Consulta HQL para eliminar la orden por su ID
        String hql = "DELETE FROM Orders WHERE id = :order_id";
        Query query = session.createQuery(hql);
        query.setParameter("order_id", orderId);

        int rowCount = query.executeUpdate();

        if (rowCount > 0) {
            System.out.println("Orden eliminada correctamente.");
        } else {
            System.out.println("La orden con ID " + orderId + " no existe.");
        }

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
