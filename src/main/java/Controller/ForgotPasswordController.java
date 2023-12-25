/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Utils.EmailUtil;
import Utils.HibernateUtil;
import View.ResetPasswordPanel;
import java.util.Properties;
import java.util.Random;
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

        // Genera un código de verificación de 6 dígitos
        int verificationCode = new Random().nextInt(900000) + 100000; // Esto garantiza un número de 6 dígitos

        // Obtén la sesión de Hibernate
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();

        // Comienza una transacción
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Query query = session.createQuery("FROM Users WHERE email = :email");
            query.setParameter("email", email);
            Users user = (Users) query.uniqueResult();

            if (user != null) {
                // Actualiza el código de verificación
                user.setVerificationCode(verificationCode);

                session.update(user);
                transaction.commit();
                System.out.println("Código de verificación actualizado para el usuario con email: " + email);

                // Envía el código por email
                sendEmail(email, Integer.toString(verificationCode));

            } else {
                System.out.println("Usuario no encontrado con email: " + email);
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void sendEmail(String email, String verificationCode) throws Exception {
        final String fromemail = "michelle.arigar@educa.jcyl.es";
        final String password = "Ert441gh";
        final String toemail = email;

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

        try {
            EmailUtil.sendEmail(session, toemail, "Reset Password",
                    "Hello! \nForgot your password? \nWe received a request to reset your password. \nThis is your verification code: " + verificationCode);

            System.out.println("Email sent successfully");

            // Mostrar la ventana de ResetPasswordPanel solo después de enviar el correo electrónico
            ResetPasswordPanel reset = new ResetPasswordPanel();
            reset.setUserEmail(email);
            reset.setVisible(true);
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to send email");
            // Aquí puedes manejar el error, como mostrar un mensaje al usuario
        }
    }
    
    
}
