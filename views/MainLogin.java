/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.views;

import com.controll.MainloginControll;
import java.awt.Color;


/**
 *
 * @author Eddy
 */
public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public MainLogin() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        this.setLocationRelativeTo(this);
        Inicio();
    }

    public void Inicio() {
        MainloginControll r = new MainloginControll(this);
        acceder.addActionListener(r);
        Newuser.addActionListener(r);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new com.control.Swing.TextField();
        txtPassword = new com.control.Swing.PasswordField();
        acceder = new com.control.Swing.Button();
        Newuser = new com.control.Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        button1 = new com.control.Swing.Button();
        iconoapp = new javax.swing.JLabel();
        iconapp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtUser.setLabelText("Usuario");
        txtUser.setLineColor(new java.awt.Color(0, 102, 0));
        txtUser.setSelectionColor(new java.awt.Color(0, 102, 0));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtPassword.setLabelText("Contrasena");
        txtPassword.setLineColor(new java.awt.Color(0, 102, 0));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        acceder.setBackground(new java.awt.Color(255, 255, 255));
        acceder.setText("Acceder");
        acceder.setActionCommand("Acceso");
        acceder.setColor1(new java.awt.Color(68, 112, 68));
        acceder.setColor2(new java.awt.Color(43, 121, 13));
        acceder.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        acceder.setMaximumSize(new java.awt.Dimension(183, 45));
        acceder.setMinimumSize(new java.awt.Dimension(183, 45));
        acceder.setPreferredSize(new java.awt.Dimension(183, 45));

        Newuser.setBackground(new java.awt.Color(255, 255, 255));
        Newuser.setText("Nuevo Usuario");
        Newuser.setColor1(new java.awt.Color(68, 112, 68));
        Newuser.setColor2(new java.awt.Color(43, 121, 13));
        Newuser.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Newuser.setPreferredSize(new java.awt.Dimension(183, 45));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Inicio de Sesion");

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button1.setText("X");
        button1.setColor1(new java.awt.Color(68, 112, 68));
        button1.setColor2(new java.awt.Color(43, 121, 13));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        iconapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/laboratorio.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/user (1).png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/llave.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconoapp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Newuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(iconapp)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(iconoapp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(iconapp)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Newuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button1ActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        String Nombre = txtUser.getText();
        if (!(Nombre.length() < 17)) {
            txtUser.setText(Nombre.substring(0, 16));
            txtUser.setHelperText("El Nombre No puede tener mas de 16 Digitos");
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        String Password = txtPassword.getText();
        if (!(Password.length() < 17)) {
            txtPassword.setText(Password.substring(0, 16));
            txtPassword.setHelperText("La Contrasena No puede tener mas de 16 Digitos");
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.control.Swing.Button Newuser;
    public com.control.Swing.Button acceder;
    private com.control.Swing.Button button1;
    private javax.swing.JLabel iconapp;
    private javax.swing.JLabel iconoapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public com.control.Swing.PasswordField txtPassword;
    public com.control.Swing.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
