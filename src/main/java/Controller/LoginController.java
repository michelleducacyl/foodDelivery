/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.password4j.types.Bcrypt;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Alumno
 */
public class LoginController {
   
    
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

    // Método para verificar si la contraseña coincide (puedes usar BCrypt)
  public static boolean verificarContrasena(String contrasenaInput, String contrasenaAlmacenada) {
     BCrypt.gensalt();
      System.out.println("Hasheada: " + BCrypt.hashpw(contrasenaInput, BCrypt.gensalt()));
    // Implementa aquí la lógica para verificar la contraseña (puedes usar BCrypt)
    return BCrypt.checkpw(contrasenaInput, contrasenaAlmacenada); // Esto es solo un ejemplo, debes utilizar una función de verificación segura
  }
  
}

