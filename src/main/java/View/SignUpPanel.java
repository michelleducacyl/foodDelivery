/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.SignUpController;
import Controller.EmailValidator;
import static Controller.EmailValidator.checkEmailFormat;
import Controller.PanelManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Clase del panel de registrarse en la aplicación
 * @author Michelle Arias
 */
public class SignUpPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public SignUpPanel() {

        initComponents();
        registerBtn.putClientProperty("Button.arc", "arc:40");
        inputEmailSignUp.putClientProperty("JComponent.arc", "arc:40");
        inputEmailSignUp.putClientProperty("JTextField.placeholderText", "name@example.com");
        inputPasswordSignUp.putClientProperty("JTextField.placeholderText", "min. 8 characters");
        inputRepeatSignUp.putClientProperty("JTextField.placeholderText", "min. 8 characters");
        // Asignar acciones a las teclas "Enter" en los componentes
        asignarAccionEnter(inputRepeatSignUp, registerBtn);
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
        inputEmailSignUp = new javax.swing.JTextField();
        emailTxt1 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JLabel();
        infoTxt = new javax.swing.JLabel();
        emailTxt2 = new javax.swing.JLabel();
        emailTxt3 = new javax.swing.JLabel();
        inputPasswordSignUp = new javax.swing.JPasswordField();
        inputRepeatSignUp = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        logo.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/miniLogo.png"))); // NOI18N

        titleTxt.setFont(new java.awt.Font("Nunito", 1, 40)); // NOI18N
        titleTxt.setText("Sign Up");

        descriptionTxt.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        descriptionTxt.setForeground(new java.awt.Color(84, 85, 99));
        descriptionTxt.setText("Register to create your account.");

        emailTxt1.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        emailTxt1.setText("Email");

        registerBtn.setBackground(new java.awt.Color(78, 96, 255));
        registerBtn.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Sign Up");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        signUpBtn.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(78, 96, 255));
        signUpBtn.setText("Sign In");
        signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpBtnMousePressed(evt);
            }
        });

        infoTxt.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        infoTxt.setText("Already have an account?");

        emailTxt2.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        emailTxt2.setText("Password");

        emailTxt3.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        emailTxt3.setText("Repeat password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputRepeatSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addComponent(emailTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(infoTxt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputPasswordSignUp)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(emailTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logo)
                .addGap(30, 30, 30)
                .addComponent(titleTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt1)
                .addGap(2, 2, 2)
                .addComponent(inputEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRepeatSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoTxt)
                    .addComponent(signUpBtn))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método para asignar la acción a un botón por defecto
     * @param field se pasa el componente que debe verificar
     * @param button el botón que deberá accionar
     */
    private void asignarAccionEnter(JComponent field, final AbstractButton button) {
        field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    registerBtnMousePressed();
                }
            }
        });
    }
    /**
     * Método que se llama para registrar un nuevo usuario en la base de datos
     */
    public void registerBtnMousePressed(){
        // TODO add your handling code here:
        String email = inputEmailSignUp.getText();
        System.out.println("EMAIL: " + email);
        String cont = String.valueOf(inputPasswordSignUp.getPassword());
        String cont2 = String.valueOf(inputRepeatSignUp.getPassword());
        if (email.isEmpty() || cont.isEmpty() || cont2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please complete all fields", "Empty fields.", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                if (cont.equals(cont2) && checkEmailFormat(email) && cont.length() >= 8) {
                    boolean comprueba = SignUpController.verificarCredenciales(email);
                    if (comprueba == true) {
                        JOptionPane.showMessageDialog(null, "The user or email already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                        inputEmailSignUp.setText("");
                        inputPasswordSignUp.setText("");

                    } else {
                        SignUpController.introducirUsuario(email, cont);
                        JOptionPane.showMessageDialog(null, "User created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                        if (mainFrame instanceof MainLogin) {
                            ((MainLogin) mainFrame).loginPanel();
                        }
                    }
                } else {
                    
                    if (!checkEmailFormat(email) || cont.length() < 8) {
                        JOptionPane.showMessageDialog(null, "The email or password does not comply with the correct format", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if (!cont.equals(cont2)) {
                        JOptionPane.showMessageDialog(null, "Passwords don't match", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    

                }

            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Método que te devuelve al login panel
     * @param evt 
     */
    private void signUpBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMousePressed
        // TODO add your handling code here:
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (mainFrame instanceof MainLogin) {
            ((MainLogin) mainFrame).loginPanel();
        }
    }//GEN-LAST:event_signUpBtnMousePressed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        
        registerBtnMousePressed();

    }//GEN-LAST:event_registerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionTxt;
    private javax.swing.JLabel emailTxt1;
    private javax.swing.JLabel emailTxt2;
    private javax.swing.JLabel emailTxt3;
    private javax.swing.JLabel infoTxt;
    private javax.swing.JTextField inputEmailSignUp;
    private javax.swing.JPasswordField inputPasswordSignUp;
    private javax.swing.JPasswordField inputRepeatSignUp;
    private javax.swing.JLabel logo;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel signUpBtn;
    private javax.swing.JLabel titleTxt;
    // End of variables declaration//GEN-END:variables
}
