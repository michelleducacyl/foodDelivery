/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.password4j.types.Bcrypt;
import food.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Esta clase controla el inicio de sesión del usuario 
 * con sus métodos correspondientes.
 * @author Michelle Arias García
 */
public class LoginController {
   
    /**
     * Este método busca la contraseña de un email especifico dentro de la base de datos.
     * @param email este argumeto será un String del email del usuario
     * @return devolverá la contraseña del usuario en un String.
     */
    public static String obtenerContrasenaDeUsuario(String email) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session sesion = sessionFactory.openSession();

    try {
      String hql = "SELECT u.password FROM Users u WHERE u.email = :email";
      Query<String> query = sesion.createQuery(hql, String.class);
      query.setParameter("email", email);
      return query.uniqueResult();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    } finally {
      sesion.close();
    }
  }

  /**
   * Método para verificar que una contraseña escrita coincide con la encriptada
   * dentro de la base de datos
   * @param contrasenaInput este argumento de tipo String será la contraseña escrita por el usuario.
   * @param contrasenaAlmacenada este argumento de tipo String será la contraseña recuperada de la base de datos.
   * @return booleano de la comprobación
   */
  public static boolean verificarContrasena(String contrasenaInput, String contrasenaAlmacenada) {
     BCrypt.gensalt();
      System.out.println("Hasheada: " + BCrypt.hashpw(contrasenaInput, BCrypt.gensalt()));
    // Implementa aquí la lógica para verificar la contraseña (puedes usar BCrypt)
    return BCrypt.checkpw(contrasenaInput, contrasenaAlmacenada); // Esto es solo un ejemplo, debes utilizar una función de verificación segura
  }
  
  public static Users getUserByEmail(String email) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    Users user = null;

    try {
        tx = session.beginTransaction();

        // Utiliza HQL para obtener el usuario por su correo electrónico
        Query query = session.createQuery("FROM Users WHERE email = :email");
        query.setParameter("email", email);
        user = (Users) query.uniqueResult();

        tx.commit();
    } catch (Exception ex) {
        if (tx != null) {
            tx.rollback();
        }
        ex.printStackTrace();
    } finally {
        session.close();
    }

    return user;
}
  
}

