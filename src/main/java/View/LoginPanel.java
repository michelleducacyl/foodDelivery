/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.LoginController;
import Controller.PanelManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.Users;

/**
 *
 * @author Michelle Arias
 */
public class LoginPanel extends javax.swing.JPanel {

    public static Users USERLOGIN;
    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {

        initComponents();
        loginBtn.putClientProperty("Button.arc", "arc:40");
        inputEmailLogin.putClientProperty("JComponent.arc", "arc:40");
        inputEmailLogin.putClientProperty("JTextField.placeholderText", "name@example.com");
        inputPasswordLogin.putClientProperty("JTextField.placeholderText", "min. 8 characters");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        titleTxt = new javax.swing.JLabel();
        descriptionTxt = new javax.swing.JLabel();
        inputEmailLogin = new javax.swing.JTextField();
        emailTxt = new javax.swing.JLabel();
        emailTxt1 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        forgotBtn = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JLabel();
        infoTxt = new javax.swing.JLabel();
        errorLogin = new javax.swing.JLabel();
        inputPasswordLogin = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        logo.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/miniLogo.png"))); // NOI18N

        titleTxt.setFont(new java.awt.Font("Nunito", 1, 40)); // NOI18N
        titleTxt.setText("Login");

        descriptionTxt.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        descriptionTxt.setForeground(new java.awt.Color(84, 85, 99));
        descriptionTxt.setText("<html> Sign in with your data that you entered during your<br> registration. </html>");

        emailTxt.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        emailTxt.setText("Email");

        emailTxt1.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        emailTxt1.setText("Password");

        loginBtn.setBackground(new java.awt.Color(78, 96, 255));
        loginBtn.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
        });

        forgotBtn.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        forgotBtn.setForeground(new java.awt.Color(78, 96, 255));
        forgotBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotBtn.setText("Forgot password?");
        forgotBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgotBtnMousePressed(evt);
            }
        });

        signUpBtn.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(78, 96, 255));
        signUpBtn.setText("Sign Up");
        signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpBtnMousePressed(evt);
            }
        });

        infoTxt.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        infoTxt.setText("Don’t have an account? ");

        errorLogin.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(titleTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(inputEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(forgotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(infoTxt)
                        .addGap(0, 0, 0)
                        .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logo)
                .addGap(30, 30, 30)
                .addComponent(titleTxt)
                .addGap(4, 4, 4)
                .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTxt)
                .addGap(12, 12, 12)
                .addComponent(inputEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(emailTxt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(forgotBtn)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoTxt)
                    .addComponent(signUpBtn)))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void forgotBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotBtnMousePressed
        // TODO add your handling code here:
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (mainFrame instanceof MainLogin) {
            ((MainLogin) mainFrame).forgotPanel();
        }

    }//GEN-LAST:event_forgotBtnMousePressed

    private void signUpBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMousePressed
        // TODO add your handling code here:
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (mainFrame instanceof MainLogin) {
            ((MainLogin) mainFrame).signUpPanel();
        }
    }//GEN-LAST:event_signUpBtnMousePressed

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
        // TODO add your handling code here:
        String email = inputEmailLogin.getText();
        String password = String.valueOf(inputPasswordLogin.getPassword());
        try {
            errorLogin.setText("");
            // Obtener la contraseña almacenada del usuario
            // Verificar si la contraseña almacenada coincide con la ingresada por el usuario
            if (email.isEmpty() || password.isEmpty()) {
                errorLogin.setText("User/password empty");
            } else {
                String contrasenaAlmacenada = LoginController.obtenerContrasenaDeUsuario(email);
                if (contrasenaAlmacenada == null) {
                    errorLogin.setText("User not found");
                } else {
                    System.out.println("CONTRASEÑA Email: " + contrasenaAlmacenada);
                    System.out.println("Contraseña text:" + password);
                    errorLogin.setText("");
                    boolean comprueba = LoginController.verificarContrasena(password, contrasenaAlmacenada);
                    if (!comprueba) {

                        errorLogin.setText("User and password not match");
                        
                    } else {
                        //// Si el inicio de sesión es exitoso, guarda el usuario
                        USERLOGIN = new Users();
                        USERLOGIN.setEmail(email);
                        USERLOGIN.setPassword(password);
                        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                        if (mainFrame instanceof MainLogin) {
                            ((MainLogin) mainFrame).login();
                        }
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_loginBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionTxt;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JLabel emailTxt1;
    private javax.swing.JLabel errorLogin;
    private javax.swing.JLabel forgotBtn;
    private javax.swing.JLabel infoTxt;
    private javax.swing.JTextField inputEmailLogin;
    private javax.swing.JPasswordField inputPasswordLogin;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel signUpBtn;
    private javax.swing.JLabel titleTxt;
    // End of variables declaration//GEN-END:variables
}
