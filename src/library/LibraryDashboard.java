/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Lihini Nisansala
 */
public class LibraryDashboard extends javax.swing.JFrame {

    /**
     * Creates new form LibraryDashboard
     */
    public LibraryDashboard() {
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
        btnBooks = new javax.swing.JButton();
        btnStudyRooms = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBooks.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBooks.setText("Books");
        btnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksActionPerformed(evt);
            }
        });
        jPanel1.add(btnBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 240, 170));

        btnStudyRooms.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnStudyRooms.setText("Study Rooms");
        btnStudyRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudyRoomsActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudyRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 227, 162));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksActionPerformed
        // TODO add your handling code here:
        Books books = new Books();
        books.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBooksActionPerformed

    private void btnStudyRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudyRoomsActionPerformed
        // TODO add your handling code here:
        StudyRoomBooking room = new StudyRoomBooking();
        room.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnStudyRoomsActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnStudyRooms;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
