/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.PanelManager;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Michelle Arias
 */
public class SignUpPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form LoginPanel
     */
    public SignUpPanel() {
        
        initComponents();
        registerBtn.putClientProperty( "Button.arc","arc:40" );
        inputEmailSignUp.putClientProperty( "JComponent.arc","arc:40" );
        inputEmailSignUp.putClientProperty("JTextField.placeholderText", "name@example.com");
        inputPasswordSignUp.putClientProperty("JTextField.placeholderText", "min. 8 characters");
        inputRepeatSignUp.putClientProperty("JTextField.placeholderText", "min. 8 characters");
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
        inputPasswordSignUp = new javax.swing.JTextField();
        emailTxt3 = new javax.swing.JLabel();
        inputRepeatSignUp = new javax.swing.JTextField();

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

        signUpBtn.setFont(new java.awt.Font("Nunito SemiBold", 0, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(78, 96, 255));
        signUpBtn.setText("Sign Up");
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
                        .addComponent(emailTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(inputEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(emailTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(inputPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(infoTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputRepeatSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(emailTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(2, 2, 2)
                .addComponent(inputPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt3)
                .addGap(2, 2, 2)
                .addComponent(inputRepeatSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoTxt)
                    .addComponent(signUpBtn))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMousePressed
        // TODO add your handling code here:
         JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    if (mainFrame instanceof MainLogin) {
        ((MainLogin) mainFrame).loginPanel();
    }
    }//GEN-LAST:event_signUpBtnMousePressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionTxt;
    private javax.swing.JLabel emailTxt1;
    private javax.swing.JLabel emailTxt2;
    private javax.swing.JLabel emailTxt3;
    private javax.swing.JLabel infoTxt;
    private javax.swing.JTextField inputEmailSignUp;
    private javax.swing.JTextField inputPasswordSignUp;
    private javax.swing.JTextField inputRepeatSignUp;
    private javax.swing.JLabel logo;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel signUpBtn;
    private javax.swing.JLabel titleTxt;
    // End of variables declaration//GEN-END:variables
}
