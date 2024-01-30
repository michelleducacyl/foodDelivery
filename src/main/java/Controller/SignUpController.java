/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.HibernateUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import food.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Esta clase controla todos los métodos relacionados al sign up.
 * @author Michelle Arias García
 */
public class SignUpController {

    /**
     * Método para verificar que un email existe dentro de la base de datos
     * @param email argumento tipo String del email a verificar
     * @return booleano de la existencia del usuario dentro de la base de datos
     */
    public static boolean verificarCredenciales(String email) {
        boolean existeUsuario = false;
        //Creamos la sesión
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session sesion = sessionFactory.openSession();
        //Iniciamos la transacción
        Transaction tx = sesion.beginTransaction();

        try {
            // Crear la consulta HQL para buscar el email
            String hql = "SELECT u FROM Users u WHERE email = :email";
            Query<Users> query = sesion.createQuery(hql, Users.class);
            query.setParameter("email", email);

            // Obtener el resultado de la consulta
            Users usuario = query.uniqueResult();

            // Verificar si se encontró un usuario con el email proporcionado
            if (usuario != null) {
                existeUsuario = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tx.commit();
            sesion.close();
        }

        return existeUsuario;
    }

    /**
     * Metodo para dar de alta un usuario dentro de la base de datos
     * @param email argumento de tipo String del email del usuario
     * @param password argumento de tipo String de la contraseña del usuario.
     */
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
