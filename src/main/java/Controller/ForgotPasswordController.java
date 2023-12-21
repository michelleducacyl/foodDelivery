/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HibernateUtil;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import model.Users;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Michelle Arias García
 */
public class ForgotPasswordController {

    public static void changePassword(String email) {
        
        String newPassword = PasswordGenerator.generarContraseña(8);
        // Obtén la sesión de Hibernate
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();

        // Comienza una transacción
        Transaction transaction = null;

        try {
            // Comienza la transacción
            transaction = session.beginTransaction();

            // Encuentra al usuario por su correo electrónico
            Query query = session.createQuery("FROM Users WHERE email = :email");
            query.setParameter("email", email);
            Users user = (Users) query.uniqueResult();

            // Si se encuentra el usuario, actualiza su contraseña
            if (user != null) {
                // Encripta la nueva contraseña antes de almacenarla
                String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
                user.setPassword(hashedPassword);

                // Actualiza el usuario en la base de datos
                session.update(user);

                // Confirma la transacción
                transaction.commit();
                System.out.println("Contraseña actualizada con éxito para el usuario con email: " + email);
                sendEmail(email, newPassword);
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

    public static void sendEmail(String email, String newPassword) throws Exception {
        final String fromemail = "michelle.arigar@educa.jcyl.es";
        final String password = "Ert441gh";
        final String toemail = email;
        System.out.println("SSLEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromemail, password);
            }
        };
        Session session = Session.getDefaultInstance(props, auth);
        System.out.println("Session created");
       
        EmailUtil.sendEmail(session, toemail, "Reset Password",
                "Hello! \n Forgot your password? \n We receive a request to reset your password. \n This is yout new password: " + newPassword);
    }
}
