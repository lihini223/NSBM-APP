/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajatha
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblSignup = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(58, 181, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassword.setText("Password");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 270, 40));

        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 270, 40));

        btnLogin.setBackground(new java.awt.Color(26, 86, 158));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 370, 67));

        lblSignup.setText("Dont have an account ? Signup");
        lblSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignupMouseClicked(evt);
            }
        });
        jPanel1.add(lblSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLogin.setText("Login");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nsbmappbackground.jpg"))); // NOI18N
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // login button click event
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String email = txtEmail.getText();
        String password = txtPassword.getText();
   
        // check if user is admin
        if(email.equals("admin") && password.equals("admin")){
            admin.AdminDashboard adminDashboardForm = new admin.AdminDashboard();
            adminDashboardForm.setVisible(true);
            this.dispose();
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(info.DBInfo.DBUrl, info.DBInfo.DBUsername, info.DBInfo.DBPassword); // database information taken from DBInfo class
                String query = "select * from testusers where email=? and password=?";
                pstmt = con.prepareStatement(query);
                pstmt.setString(1, txtEmail.getText());
                pstmt.setString(2, txtPassword.getText());
                rs = pstmt.executeQuery();
                // if login credentials are valid, redirect to home page
                if(rs.next()){
                    Dashboard dashboardForm = new Dashboard();
                    dashboardForm.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid credentials"); //  if login credentials are invalid, show error
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                if(con != null){
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        // ignore exception
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignupMouseClicked
        //Signup signupForm = new Signup();
        //signupForm.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_lblSignupMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
