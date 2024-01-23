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
 * Esta clase controla todas las funciones relacionadas a la pantalla de olvidar contraseña
 * @author Michelle Arias García
 */
public class ForgotPasswordController {

    /**
     * Este método se encarga de generar un de verificación código aleatorio
     * para cambiar la contraseña del usuario que se pasa por parámetro, una vez
     * generado el código de envía por mail ese código.
     * @param email este argumento es un String y sera el email íngresado por el usuario 
     */
    public static void changePassword(String email) {

        // Genera un código de verificación de 6 dígitos
        int verificationCode = new Random().nextInt(900000) + 100000; // Esto garantiza un número de 6 dígitos

        // Obtén la sesión de Hibernate
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();

        // Creamos la variable para la transacción
        Transaction transaction = null;

        try {
            //Asignamos valor a la transacción
            transaction = session.beginTransaction();
            //Ejecutamos el query que busca el usuario para cambiar la contraseña
            Query query = session.createQuery("FROM Users WHERE email = :email");
            query.setParameter("email", email);
            Users user = (Users) query.uniqueResult();
            //Si el usuario existe asignamos el codigo de verificación a ese.
            if (user != null) {
                // Actualiza el código de verificación
                user.setVerificationCode(verificationCode);

                session.update(user);
                transaction.commit();
                System.out.println("Código de verificación actualizado para el usuario con email: " + email);

                // Envía el código por email
                sendEmail(email, Integer.toString(verificationCode));

            } else {
                //Si el usuario no existe no podemos asignarle el codigo.
                System.out.println("Usuario no encontrado con email: " + email);
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            //Cerramos la sesión
            session.close();
        }
    }

    /**
     * Método para enviar el email al usuario con su código de verificación.
     * @param email este parámetro es un tipo String con el email al que hay que enviar el correo.
     * @param verificationCode este parámetro tipo String será el código de verificación a enviar. 
     * @throws Exception retornará en caso de no poder haber enviado el mail.
     */
    public static void sendEmail(String email, String verificationCode) throws Exception {
        final String fromemail = "foodeliveryapps1@gmail.com"; 
        final String password = "msmwwmnglytwbvkp";
        final String toemail = email;

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smpt.ssl.protocols", "TLSv1.2");

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
