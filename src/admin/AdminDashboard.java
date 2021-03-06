/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author Rajatha
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEvents = new javax.swing.JButton();

        btnLibrary = new javax.swing.JButton();

        btnTimetable = new javax.swing.JButton();

        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(58, 181, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Register Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 290, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Admin Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        btnEvents.setText("Events");
        btnEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventsActionPerformed(evt);
            }
        });
        jPanel1.add(btnEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 230, 120));


        btnLibrary.setText("Library");
        btnLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryActionPerformed(evt);
            }
        });
        jPanel1.add(btnLibrary, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 250, 120));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nsbmappbackground.jpg"))); // NOI18N

        btnTimetable.setText("Timetable");
        btnTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimetableActionPerformed(evt);
            }
        });
        jPanel1.add(btnTimetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 270, 90));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nsbmbackground.jpg"))); // NOI18N

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegisterStudent registerStudentForm = new RegisterStudent();
        registerStudentForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventsActionPerformed
        EventsDashboard eventsDashboardForm = new EventsDashboard();
        eventsDashboardForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEventsActionPerformed


    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        library.LibraryDashboard libraryDash = new library.LibraryDashboard();
        libraryDash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLibraryActionPerformed

    private void btnTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimetableActionPerformed
        timetables.Admin_Time_Table timetableForm = new timetables.Admin_Time_Table();
        timetableForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTimetableActionPerformed


    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvents;

    private javax.swing.JButton btnLibrary;

    private javax.swing.JButton btnTimetable;

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
