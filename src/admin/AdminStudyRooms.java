/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author Lihini Nisansala
 */
public class AdminStudyRooms extends javax.swing.JFrame {

    /**
     * Creates new form AdminStudyRooms
     */
    public AdminStudyRooms() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBookingDetails = new javax.swing.JTable();
        btnAvailableall = new javax.swing.JButton();
        btnAvailableall1 = new javax.swing.JButton();
        lblBookingDetails = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnAvailableall2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBookingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBookingDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 520, 170));

        btnAvailableall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAvailableall.setText("Remove Booking");
        btnAvailableall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableallActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvailableall, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 210, 40));

        btnAvailableall1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAvailableall1.setText("Available All ");
        btnAvailableall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableall1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvailableall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 170, 40));

        lblBookingDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBookingDetails.setText("Booking Details");
        getContentPane().add(lblBookingDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 230, 40));

        btnAvailableall2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAvailableall2.setText("Show Bookings");
        btnAvailableall2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableall2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvailableall2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 81, 170, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvailableallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvailableallActionPerformed

    private void btnAvailableall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableall1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvailableall1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnAvailableall2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableall2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvailableall2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableall;
    private javax.swing.JButton btnAvailableall1;
    private javax.swing.JButton btnAvailableall2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBookingDetails;
    private javax.swing.JTable tblBookingDetails;
    // End of variables declaration//GEN-END:variables
}
