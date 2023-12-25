/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.HibernateUtil;
import model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Michelle Arias
 */
public class ResetPasswordController {

    public static boolean verificarCodigoDeVerificacion(String email, int codigoVerificacion) {
        boolean codigoValido = false;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session sesion = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = sesion.beginTransaction();

            // Crear la consulta HQL
            String hql = "SELECT u FROM Users u WHERE u.email = :email AND u.verificationCode = :codigo";
            Query<Users> query = sesion.createQuery(hql, Users.class);
            query.setParameter("email", email);
            query.setParameter("codigo", codigoVerificacion);

            // Obtener el resultado de la consulta
            Users usuario = query.uniqueResult();

            // Verificar si se encontró un usuario con el email y código de verificación proporcionados
            if (usuario != null) {
                codigoValido = true;
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            sesion.close();
        }

        return codigoValido;
    }
    
    public static void updatePassword(String email, String nuevaContraseña) {
    // Obtén la sesión de Hibernate
    Session session = HibernateUtil.getSessionFactory().openSession();

    // Comienza una transacción
    Transaction transaction = null;

    try {
        // Comienza la transacción
        transaction = session.beginTransaction();

        // Busca el usuario por su correo electrónico
        String hql = "FROM Users WHERE email = :email";
        Query query = session.createQuery(hql);
        query.setParameter("email", email);
        Users user = (Users) query.uniqueResult();

        // Si se encuentra el usuario, actualiza su contraseña
        if (user != null) {
            // Encripta la nueva contraseña antes de almacenarla
            String hashedPassword = BCrypt.hashpw(nuevaContraseña, BCrypt.gensalt());
            user.setPassword(hashedPassword);

            // Actualiza el usuario en la base de datos
            session.update(user);

            // Confirma la transacción
            transaction.commit();
        } else {
            System.out.println("Usuario no encontrado con email: " + email);
        }
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
