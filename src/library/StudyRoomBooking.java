/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lihini Nisansala
 */
public class StudyRoomBooking extends javax.swing.JFrame {

    /**
     * Creates new form StudyRooms
     */
    public StudyRoomBooking() {
        initComponents();
        fetchData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblBookStudyRoom1 = new javax.swing.JLabel();
        pnlBookRoom = new javax.swing.JPanel();
        lblPurpose = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        lblStudentID1 = new javax.swing.JLabel();
        lblMembers = new javax.swing.JLabel();
        lblRoomno = new javax.swing.JLabel();
        lblTimeslot = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtPurpose = new javax.swing.JTextField();
        txtStudentid = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        txtMembers = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbTimeslot = new javax.swing.JComboBox<>();
        cmbRoomno = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        btnBook1 = new javax.swing.JButton();
        lblBookStudyRoom2 = new javax.swing.JLabel();
        pnlShowStudyRooms = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvailableStudyRooms = new javax.swing.JTable();
        lblAvailableStudyRooms = new javax.swing.JLabel();
        btnShowsr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBookStudyRoom1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBookStudyRoom1.setText("Study Rooms");
        pnlBackground.add(lblBookStudyRoom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, 40));

        pnlBookRoom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPurpose.setText("Purpose");
        pnlBookRoom.add(lblPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lblStudentName.setText("Name");
        pnlBookRoom.add(lblStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblStudentID1.setText("Student ID");
        pnlBookRoom.add(lblStudentID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lblMembers.setText("No of Members");
        pnlBookRoom.add(lblMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblRoomno.setText("Room No");
        pnlBookRoom.add(lblRoomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblTimeslot.setText("Time Slot");
        pnlBookRoom.add(lblTimeslot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblEmail.setText("Email");
        pnlBookRoom.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        pnlBookRoom.add(txtPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 200, 20));

        txtStudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentidActionPerformed(evt);
            }
        });
        pnlBookRoom.add(txtStudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, 20));
        pnlBookRoom.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, 20));
        pnlBookRoom.add(txtMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 20));
        pnlBookRoom.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 20));

        cmbTimeslot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));
        pnlBookRoom.add(cmbTimeslot, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        cmbRoomno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FF01", "FF02", "FF03", "GF01", "GF02", "GF03" }));
        cmbRoomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomnoActionPerformed(evt);
            }
        });
        pnlBookRoom.add(cmbRoomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlBookRoom.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 70, 30));

        btnBook1.setText("BOOK");
        btnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBook1ActionPerformed(evt);
            }
        });
        pnlBookRoom.add(btnBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 30));

        lblBookStudyRoom2.setText("Book a Study Room");
        pnlBookRoom.add(lblBookStudyRoom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        pnlBackground.add(pnlBookRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 440, 340));

        pnlShowStudyRooms.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAvailableStudyRooms.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblAvailableStudyRooms);

        pnlShowStudyRooms.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 90));

        lblAvailableStudyRooms.setText("Available Study Rooms");
        pnlShowStudyRooms.add(lblAvailableStudyRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        btnShowsr.setText("Show Available Study Rooms");
        btnShowsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowsrActionPerformed(evt);
            }
        });
        pnlShowStudyRooms.add(btnShowsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, 50));

        pnlBackground.add(pnlShowStudyRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 560, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentidActionPerformed

    private void btnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBook1ActionPerformed
        // TODO add your handling code here:
        String studentID = txtStudentid.getText();
        String name = txtStudentName.getText();
        String members = txtMembers.getText();
        String RoomNo = cmbRoomno.getSelectedItem().toString();
        String timeSlot = cmbTimeslot.getSelectedItem().toString();
        String email = txtEmail.getText();
        String purpose = txtPurpose.getText();

        Connection con = null;
        PreparedStatement pstmt = null;

        if (checkAvailability(RoomNo, timeSlot)) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(info.DBInfo.DBUrl, info.DBInfo.DBUsername, info.DBInfo.DBPassword); // database information taken from DBInfo class
                String query = "insert into booking values(?, ?, ?, ?, ?, ?, ?)";
                pstmt = con.prepareStatement(query);
                pstmt.setString(1, studentID);
                pstmt.setString(2, name);
                pstmt.setString(3, members);
                pstmt.setString(4, RoomNo);
                pstmt.setString(5, timeSlot);
                pstmt.setString(6, email);
                pstmt.setString(7, purpose);

                pstmt.executeUpdate();

                clearComponents();

                bookRoom(RoomNo, timeSlot);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        // ignore exception
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Hall eka obe...");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Hall eka obe...... nevee...");
        }


    }//GEN-LAST:event_btnBook1ActionPerformed

    private void cmbRoomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomnoActionPerformed

    private void clearComponents() {
        txtStudentid.setText("");
        txtStudentName.setText("");
        txtMembers.setText("");
        txtEmail.setText("");
        txtPurpose.setText("");

    }
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clearComponents();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnShowsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowsrActionPerformed
        // TODO add your handling code here:
        fetchData();
    }//GEN-LAST:event_btnShowsrActionPerformed

    private void fetchData() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(info.DBInfo.DBUrl, info.DBInfo.DBUsername, info.DBInfo.DBPassword); // database information taken from DBInfo class

            int rows = 0;
            int rowIndex = 0;

            String qry = "select * from study_rooms";

            stmt = con.createStatement();
            rs = stmt.executeQuery(qry);

            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();
            }

            String[][] data = new String[rows][3];

            while (rs.next()) {
                data[rowIndex][0] = rs.getString(1);
                data[rowIndex][1] = rs.getString(2);
                data[rowIndex][2] = rs.getString(3);

                rowIndex++;
            }

            String[] cols = {"Room ID", "Morning Session", "Evening Session"};

            DefaultTableModel model = new DefaultTableModel(data, cols);

            tblAvailableStudyRooms.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudyRoomBooking.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    // ignore exception
                }
            }
        }
    }

    private boolean checkAvailability(String room_no, String session) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean isAvailable = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(info.DBInfo.DBUrl, info.DBInfo.DBUsername, info.DBInfo.DBPassword); // database information taken from DBInfo class
            stmt = con.createStatement();
            String qry = "select * from study_rooms where room_no = '"+room_no+"'";

            rs = stmt.executeQuery(qry);
            String status;
            if (rs.next()) {

                if (session.equals("Morning")) {
                    status = rs.getString(2);
                } else {
                    status = rs.getString(3);
                }

                if (status.equals("A")) {
                    isAvailable = true;
                }
                System.out.println(status);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudyRoomBooking.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    // ignore exception
                }
            }
        }

        return isAvailable;
    }

    private void bookRoom(String room_no, String session){
        Connection con = null;
        Statement stmt = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(info.DBInfo.DBUrl, info.DBInfo.DBUsername, info.DBInfo.DBPassword); // database information taken from DBInfo class
                String query = "";
                
                if(session.equals("Morning")){
                    query = "update study_rooms set Morning_Session = 'N' where room_no = '"+room_no+"' ";
                }else{
                    query = "update study_rooms set Evening_Session = 'N' where room_no = '"+room_no+"' ";
                }
                
                stmt = con.createStatement(); 

                stmt.executeUpdate(query);

                clearComponents();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        // ignore exception
                    }
                }
            }
        

    }
    
    /**
     * @param args the command line arguments
     */



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnShowsr;
    private javax.swing.JComboBox<String> cmbRoomno;
    private javax.swing.JComboBox<String> cmbTimeslot;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAvailableStudyRooms;
    private javax.swing.JLabel lblBookStudyRoom1;
    private javax.swing.JLabel lblBookStudyRoom2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMembers;
    private javax.swing.JLabel lblPurpose;
    private javax.swing.JLabel lblRoomno;
    private javax.swing.JLabel lblStudentID1;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblTimeslot;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlBookRoom;
    private javax.swing.JPanel pnlShowStudyRooms;
    private javax.swing.JTable tblAvailableStudyRooms;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMembers;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtStudentid;
    // End of variables declaration//GEN-END:variables
}
