/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.HibernateUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Michelle Arias García
 */
public class SignUpController {

    public static boolean verificarCredenciales(String email, String password) {
        boolean credencialesValidas = false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session sesion = sessionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        try {
            // Crear la consulta HQL
            String hql = "SELECT u FROM Users u WHERE email = :email AND password = :password";
            Query<Users> query = sesion.createQuery(hql, Users.class);
            query.setParameter("email", email);
            query.setParameter("password", password);

            // Obtener el resultado de la consulta
            Users usuario = query.uniqueResult();

            // Verificar si se encontró un usuario con las credenciales proporcionadas
            if (usuario != null) {
                credencialesValidas = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            sesion.close();
        }

        return credencialesValidas;
    }

    public static void introducirUsuario(String email, String password) {
        
        // Obtén la sesión de Hibernate
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Comienza una transacción
        Transaction transaction = null;

        try {
            // Comienza la transacción
            transaction = session.beginTransaction();

            // Crea un nuevo usuario y establece sus propiedades
            Users user = new Users();

            // Encripta la contraseña antes de almacenarla
            String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

            user.setPassword(hashedPassword);

            user.setEmail(email);

            // Guarda el usuario en la base de datos
            session.save(user);

            // Confirma la transacción
            transaction.commit();
        } catch (Exception e) {
            // Si hay algún error, realiza un rollback de la transacción
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace(); // Trata el error según tus necesidades
        } finally {
            // Cierra la sesión de Hibernate
            session.close();
        }
    }
}
