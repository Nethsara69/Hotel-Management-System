/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.DBConnection;
import project.Select;

/**
 *
 * @author neths
 */
public class ResInfo extends javax.swing.JFrame {

    /**
     * Creates new form ResInfo
     */
    public ResInfo() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resInfoTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        home = new javax.swing.JButton();
        chechout = new javax.swing.JButton();
        ResId = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        RoomID = new javax.swing.JTextField();
        Availability = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Payment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        roomstatus = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setText("RESERVATION INFO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 15, -1, -1));

        resInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Res ID", "Date", "Time", "NIC", "RoomID", "Payment", "Room Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resInfoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resInfoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resInfoTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 623, 121));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 200, 623, 10));

        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Res ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 213, -1, -1));

        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("CusID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 247, -1, -1));

        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("RoomID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 281, -1, -1));

        update.setBackground(new java.awt.Color(0, 0, 102));
        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 326, 75, -1));

        home.setBackground(new java.awt.Color(0, 0, 102));
        home.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 326, 75, -1));

        chechout.setBackground(new java.awt.Color(0, 0, 102));
        chechout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chechout.setForeground(new java.awt.Color(255, 255, 255));
        chechout.setText("CHECK-OUT");
        chechout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chechoutActionPerformed(evt);
            }
        });
        getContentPane().add(chechout, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 321, 103, 33));

        ResId.setBackground(new java.awt.Color(255, 255, 255));
        ResId.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(ResId, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 210, 133, -1));

        nic.setBackground(new java.awt.Color(255, 255, 255));
        nic.setForeground(new java.awt.Color(0, 0, 0));
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        getContentPane().add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 244, 133, -1));

        RoomID.setBackground(new java.awt.Color(255, 255, 255));
        RoomID.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(RoomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 278, 133, -1));

        Availability.setBackground(new java.awt.Color(255, 255, 255));
        Availability.setForeground(new java.awt.Color(0, 0, 0));
        Availability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailabilityActionPerformed(evt);
            }
        });
        getContentPane().add(Availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 244, 133, -1));

        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Availability");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 247, -1, -1));

        Payment.setBackground(new java.awt.Color(255, 255, 255));
        Payment.setForeground(new java.awt.Color(0, 0, 0));
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        getContentPane().add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 210, 133, -1));

        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Payment");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 213, -1, -1));

        roomstatus.setBackground(new java.awt.Color(0, 0, 102));
        roomstatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        roomstatus.setForeground(new java.awt.Color(255, 255, 255));
        roomstatus.setText("Status");
        roomstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomstatusActionPerformed(evt);
            }
        });
        getContentPane().add(roomstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 326, 75, -1));

        delete.setBackground(new java.awt.Color(0, 0, 102));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 326, 75, -1));

        update2.setBackground(new java.awt.Color(0, 0, 102));
        update2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update2.setForeground(new java.awt.Color(255, 255, 255));
        update2.setText("UPDATE");
        getContentPane().add(update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 326, 75, -1));

        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all pages background.png"))); // NOI18N
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailabilityActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         ResultSet resultSet = Select.getData("SELECT * FROM reservation");
        DefaultTableModel model = (DefaultTableModel) resInfoTable.getModel();
        try {
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8)});
            }
            resultSet.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void resInfoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resInfoTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbleModel = (DefaultTableModel) resInfoTable.getModel();

        String resID = tbleModel.getValueAt(resInfoTable.getSelectedRow(), 0).toString();
        String NIC = tbleModel.getValueAt(resInfoTable.getSelectedRow(), 3).toString();
        String roomid = tbleModel.getValueAt(resInfoTable.getSelectedRow(), 4).toString();
        String availability = tbleModel.getValueAt(resInfoTable.getSelectedRow(), 7).toString();
        String payment = tbleModel.getValueAt(resInfoTable.getSelectedRow(), 5).toString();
        
        ResId.setText(resID);
        nic.setText(NIC);
        RoomID.setText(roomid);
        Availability.setText(availability);
        Payment.setText(payment);
    }//GEN-LAST:event_resInfoTableMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         int id = Integer.parseInt(resInfoTable.getValueAt(resInfoTable.getSelectedRow(), 0).toString());
        try {
            Connection con = DBConnection.getconConnection();
            Statement st = con.createStatement();
            boolean b = st.execute("UPDATE reservation SET nic='" + nic.getText() + "',roomid='" + RoomID.getText() + "',payment='" + Payment.getText() + "' Where resid=" + id);
            if (!b) {
                setVisible(false);
                new ResInfo().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         int id = Integer.parseInt(resInfoTable.getValueAt(resInfoTable.getSelectedRow(), 0).toString());
        try {
            Connection con = DBConnection.getconConnection();
            Statement st = con.createStatement();
            int r = JOptionPane.showConfirmDialog(this, "Are u sure delete selected row?");
            if (r == 0) {
                st.execute("DELETE FROM reservation WHERE resid=" + id);
                setVisible(false);
                new ResInfo().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_deleteActionPerformed

    private void roomstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomstatusActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(resInfoTable.getValueAt(resInfoTable.getSelectedRow(), 4).toString());
        int id2 = Integer.parseInt(resInfoTable.getValueAt(resInfoTable.getSelectedRow(), 0).toString());
        try {
            Connection con = DBConnection.getconConnection();
            Statement st = con.createStatement();
            boolean b = st.execute("UPDATE rooms SET status='" + Availability.getText() + "' Where roomid=" + id);
            boolean c= st.execute("UPDATE reservation SET roomstatus='" + Availability.getText() + "' Where resID=" + id2);
            if (!c) {
                setVisible(false);
                new ResInfo().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
        
    }//GEN-LAST:event_roomstatusActionPerformed

    private void chechoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chechoutActionPerformed
        // TODO add your handling code here
        int id = Integer.parseInt(resInfoTable.getValueAt(resInfoTable.getSelectedRow(), 4).toString());
        int id2 = Integer.parseInt(resInfoTable.getValueAt(resInfoTable.getSelectedRow(), 0).toString());
        try {
            Connection con = DBConnection.getconConnection();
            Statement st = con.createStatement();
            boolean b = st.execute("UPDATE rooms SET status='Available' Where roomid=" + id);
            boolean c= st.execute("UPDATE reservation SET roomstatus='Available' Where resID=" + id2);
            if (!c) {
                setVisible(false);
                new ResInfo().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
           
    }//GEN-LAST:event_chechoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Availability;
    private javax.swing.JTextField Payment;
    private javax.swing.JTextField ResId;
    private javax.swing.JTextField RoomID;
    private javax.swing.JButton chechout;
    private javax.swing.JButton delete;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nic;
    private javax.swing.JTable resInfoTable;
    private javax.swing.JButton roomstatus;
    private javax.swing.JButton update;
    private javax.swing.JButton update2;
    // End of variables declaration//GEN-END:variables
}
