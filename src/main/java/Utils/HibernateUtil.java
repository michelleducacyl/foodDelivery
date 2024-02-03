/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Clase utilizada para generar sesiones de Hibernate a través de la factoría
 * @author Michelle Arias García
 */
public class HibernateUtil {

  private static final SessionFactory sessionFactory = buildSessionFactory();

  private static SessionFactory buildSessionFactory() {
    try {
      return new Configuration().configure().buildSessionFactory(
        new StandardServiceRegistryBuilder().configure().build()
      );
    } catch (HibernateException ex) {
      System.err.println("Error al inicializar la SessionFactory: " + ex.getMessage());
      throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public static void shutdown() {
    // Cierre seguro de la SessionFactory, se llama al cerrar la aplicación
    getSessionFactory().close();
  }
}
