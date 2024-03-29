/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import javax.swing.JOptionPane;
import project.InsertUpdateDelete;
import project.InsertUpdateDelete;

/**
 *
 * @author neths
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        Signuplablel = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        SName = new javax.swing.JTextField();
        Semail = new javax.swing.JTextField();
        Spassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Saddress = new javax.swing.JTextArea();
        SignupButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Signuplablel.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        Signuplablel.setForeground(new java.awt.Color(255, 255, 102));
        Signuplablel.setText("Signup");
        getContentPane().add(Signuplablel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        Name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        Name.setForeground(new java.awt.Color(204, 204, 204));
        Name.setText("Name");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        Email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        Email.setForeground(new java.awt.Color(204, 204, 204));
        Email.setText("Email");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        Address.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        Address.setForeground(new java.awt.Color(204, 204, 204));
        Address.setText("Address");
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        Password.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        SName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        SName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SNameActionPerformed(evt);
            }
        });
        getContentPane().add(SName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 520, 30));

        Semail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        getContentPane().add(Semail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 520, 30));

        Spassword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Spassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 310, 30));

        Saddress.setColumns(20);
        Saddress.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Saddress.setRows(5);
        jScrollPane1.setViewportView(Saddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 520, 130));

        SignupButton.setBackground(new java.awt.Color(102, 51, 0));
        SignupButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(255, 255, 255));
        SignupButton.setText("Signup");
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 90, 40));

        ClearButton.setBackground(new java.awt.Color(102, 51, 0));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, 90, 40));

        LoginButton.setBackground(new java.awt.Color(102, 51, 0));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, 90, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Signup.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SNameActionPerformed

    private void SpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpasswordActionPerformed

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        // TODO add your handling code here:
        String name=SName.getText();
        String email= Semail.getText();
        String address= Saddress.getText();
        String password = Spassword.getText();
        if(name.equals("")|| email.equals("")||address.equals("")|| password.equals(""))
            JOptionPane.showMessageDialog(null, "Every Field is Required");
        else{
            String Query;
            Query = "INSERT INTO Users(Name,email,address,password,status) VALUES('"+name+"','"+email+"','"+address+"','"+password+"','false')";
            InsertUpdateDelete.setData(Query, "Registered Successfully");
            setVisible(false);
            new SignUp().setVisible(true);
        }
        
        
    }//GEN-LAST:event_SignupButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        SName.setText(null);
        Semail.setText(null);
        Saddress.setText(null);
        Spassword.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Background;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel Email;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField SName;
    private javax.swing.JTextArea Saddress;
    private javax.swing.JTextField Semail;
    private javax.swing.JButton SignupButton;
    private javax.swing.JLabel Signuplablel;
    private javax.swing.JTextField Spassword;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
