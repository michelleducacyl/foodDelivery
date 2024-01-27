/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.HibernateUtil;
import java.util.List;
import model.Dishes;
import model.Restaurant;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * Esta clase controla la pantalla donde se enseñan los restaurantes
 * @author Michelle Arias García
 */
public class RestaurantsController {
    
    /**
     * Método que obtiene todos los platos de un restaurante específico
     * @param restaurantId argumento de tipo String que corresponde al identificador del restaurante dentro de la base de datos.
     * @return una lista de platos que pertenecen a ese restaurante.
     */
    public static List<Dishes> getDishesByRestaurantId(String restaurantId) {
        //Declaramos la lista de platos a rellenar
        List<Dishes> dishesList = null;
        //Declaramos la transaccion
        Transaction transaction = null;
        //Iniciamos la transacción
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            // Buscamos los platos de un restaurante especifico
            Query<Dishes> query = session.createQuery("FROM Dishes WHERE restaurant.id = :restaurantId", Dishes.class);
            query.setParameter("restaurantId", restaurantId);
            //Rellenamos la lista de restaurantes a devolver
            dishesList = query.list();
            //Aseguramos la transacción
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return dishesList;
    }
    
     public static Restaurant getRestaurantById(String restaurantId) {
        Transaction transaction = null;
        Restaurant restaurant = null;
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            // Consulta para obtener un restaurante por su ID
            Query<Restaurant> query = session.createQuery("FROM Restaurant WHERE id = :restaurantId", Restaurant.class);
            query.setParameter("restaurantId", restaurantId);
            
            restaurant = query.uniqueResult(); // Obtener el restaurante único
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
        return restaurant;
    }
}
    

