/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owner;

import javax.swing.ImageIcon;
import main.JatraBegins;
import util.EditProfile;

/**
 *
 * @author USER
 */
public class OwnerDashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public OwnerDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        JatraBegins.setOwner_homepage(this);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dashboard = new javax.swing.JButton();
        editProfile = new javax.swing.JButton();
        support = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        myExistingBusses = new javax.swing.JButton();
        addBus = new javax.swing.JButton();
        showBusStops = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 95, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus-logo-abstract_7315-17.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Jatra.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_appointment_reminders_filled_100px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_male_circle_48px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

        jPanel2.setBackground(new java.awt.Color(192, 157, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DashBoardAi.png"))); // NOI18N
        dashboard.setContentAreaFilled(false);
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        jPanel2.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 70));

        editProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditProfileDefault.png"))); // NOI18N
        editProfile.setContentAreaFilled(false);
        editProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editProfileMouseExited(evt);
            }
        });
        editProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileActionPerformed(evt);
            }
        });
        jPanel2.add(editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 70));

        support.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Support.png"))); // NOI18N
        support.setContentAreaFilled(false);
        jPanel2.add(support, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogOutDefault.png"))); // NOI18N
        logOut.setContentAreaFilled(false);
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        jPanel2.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 240, 70));

        changePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ChangePassDefault.png"))); // NOI18N
        changePassword.setContentAreaFilled(false);
        changePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePasswordMouseExited(evt);
            }
        });
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        jPanel2.add(changePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome back user!.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        myExistingBusses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MyBusses Button.png"))); // NOI18N
        myExistingBusses.setContentAreaFilled(false);
        jPanel3.add(myExistingBusses, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 470, 130));

        addBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddNewBusButton.png"))); // NOI18N
        addBus.setContentAreaFilled(false);
        addBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBusActionPerformed(evt);
            }
        });
        jPanel3.add(addBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 240, 190));

        showBusStops.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bus StopButton.png"))); // NOI18N
        showBusStops.setContentAreaFilled(false);
        showBusStops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBusStopsActionPerformed(evt);
            }
        });
        jPanel3.add(showBusStops, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 240, 190));

        jLabel5.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(144, 98, 213));
        jLabel5.setText("Show Bus Stops");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(144, 98, 213));
        jLabel6.setText("Existing Busses");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Quicksand Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(144, 98, 213));
        jLabel8.setText("Add a Bus");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 680, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/DashboardHover.png"));
        dashboard.setIcon(i);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/DashBoardAi.png"));
        dashboard.setIcon(i);
    }//GEN-LAST:event_dashboardMouseExited

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardActionPerformed

    private void editProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/EditProfileHover.png"));
        editProfile.setIcon(i);
    }//GEN-LAST:event_editProfileMouseEntered

    private void editProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/EditProfileDefault.png"));
        editProfile.setIcon(i);
    }//GEN-LAST:event_editProfileMouseExited

    private void editProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileActionPerformed

        this.setVisible(false);
        new EditProfile().setVisible(true);

    }//GEN-LAST:event_editProfileActionPerformed

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/LogOutHover.png"));
        logOut.setIcon(i);
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/LogOutDefault.png"));
        logOut.setIcon(i);
    }//GEN-LAST:event_logOutMouseExited

    private void changePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordMouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/ChangePassHover.png"));
        changePassword.setIcon(i);
    }//GEN-LAST:event_changePasswordMouseEntered

    private void changePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordMouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/ChangePassDefault.png"));
        changePassword.setIcon(i);
    }//GEN-LAST:event_changePasswordMouseExited

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        this.setVisible(false);
        new util.ChangePassword().setVisible(true);
    }//GEN-LAST:event_changePasswordActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        new util.userPrompts.PromptExit(this).setVisible(true);

    }//GEN-LAST:event_logOutActionPerformed

    private void addBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBusActionPerformed
        this.setVisible(false);
        new AddANewBus().setVisible(true);

    }//GEN-LAST:event_addBusActionPerformed

    private void showBusStopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBusStopsActionPerformed
        this.setVisible(false);
        new util.FindNearbyBusStop().setVisible(true);
    }//GEN-LAST:event_showBusStopsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //for debug purposes
        JatraBegins.setUser("owner");
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
            java.util.logging.Logger.getLogger(OwnerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBus;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton editProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logOut;
    private javax.swing.JButton myExistingBusses;
    private javax.swing.JButton showBusStops;
    private javax.swing.JButton support;
    // End of variables declaration//GEN-END:variables
}
