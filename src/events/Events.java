/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rajatha
 */
public class Events extends javax.swing.JFrame {
    JPanel eventsPanel = null;
    JFrame previousPage = null;
    //JLabel lblBackground = null;

    /**
     * Creates new form Events
     */
    public Events(JFrame previousPage) {
        initComponents();
        initializeEvents();
        this.previousPage = previousPage;
        //lblBackground = new JLabel("dfghjkl");
        //lblBackground.setBounds(0, 0, 1200, 400);
        //lblBackground.setIcon(new ImageIcon(getClass().getResource("imgs\\nsbmlogo.PNG")));
        //add(lblBackground);
        //revalidate();
        //repaint();
    }
    
    public void initializeEvents(){
        eventsPanel = new JPanel();
        eventsPanel.setBounds(0, 0, 950, 370);
        eventsPanel.setBackground(Color.blue);
        eventsPanel.setLayout(new BoxLayout(eventsPanel, BoxLayout.Y_AXIS));
        
        EventPanel e1 = new EventPanel("FOSS", "SOC-L101", "Git iganagamuda", "imgs\\nsbmlogo.PNG");
        eventsPanel.add(e1);
        //for(int i = 0;i < 20;i++){
            EventPanel e2 = new EventPanel("IEEE", "SOE-002", "Mehetath enna, apenuth mal ganna", "imgs\\nsbmlogo.PNG");
            eventsPanel.add(e2);
        //}
        sclEvents.setViewportView(eventsPanel);
        revalidate();
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        sclEvents = new javax.swing.JScrollPane();
        btnBack = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(58, 181, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Events");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Events", "FOC", "FOB", "FOE", "Auditorium", "Entertainment" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 230, 40));
        jPanel1.add(sclEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 950, 370));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 120, 40));

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        previousPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JScrollPane sclEvents;
    // End of variables declaration//GEN-END:variables
}
