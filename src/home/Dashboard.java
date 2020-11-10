/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author Rajatha
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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
        btnEvents = new javax.swing.JButton();
        btnTimetable = new javax.swing.JButton();
        btnCMS = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(58, 181, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEvents.setText("Events");
        btnEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventsActionPerformed(evt);
            }
        });
        jPanel1.add(btnEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 280, 120));

        btnTimetable.setText("Timetable");
        jPanel1.add(btnTimetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 260, 110));

        btnCMS.setText("File a Complain");
        jPanel1.add(btnCMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 280, 120));

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

    private void btnEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventsActionPerformed
        events.Events eventsForm = new events.Events();
        eventsForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEventsActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCMS;
    private javax.swing.JButton btnEvents;
    private javax.swing.JButton btnTimetable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}