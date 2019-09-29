/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passenger;

import googlemapsapi.Maps.ShowBusStops;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import main.Bus;
import main.JatraBegins;

/**
 *
 * @author USER
 */
public class BusInfo extends javax.swing.JFrame {

    /**
     * Creates new form BusFound
     */
    public BusInfo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public BusInfo(Bus bus) {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        targetStops = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(181, 147, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PreviousPage.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Quicksand Book", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(120, 45, 194));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reviews.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 40));

        jLabel8.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(120, 45, 194));
        jLabel8.setText("Vicinity : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BusFound Bus logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(120, 45, 194));
        jLabel4.setText("Bus Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 140, 40));

        jLabel5.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(120, 45, 194));
        jLabel5.setText("Avg Fare : ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 140, 40));

        jLabel6.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(120, 45, 194));
        jLabel6.setText("Total Seats : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 140, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Component 50 – 1.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        targetStops.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Component 51 – 1.png"))); // NOI18N
        targetStops.setContentAreaFilled(false);
        targetStops.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                targetStopsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                targetStopsMouseExited(evt);
            }
        });
        targetStops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetStopsActionPerformed(evt);
            }
        });
        jPanel2.add(targetStops, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Quicksand Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(120, 45, 194));
        jLabel7.setText("Registered on : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle Bus Found 1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Quicksand Book", 0, 17)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 95, 238));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(192, 157, 245));
        jTextArea1.setSelectionColor(new java.awt.Color(153, 95, 238));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 600, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 670, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void targetStopsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetStopsMouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/Target Stops Button Hover.png"));
        targetStops.setIcon(i);
    }//GEN-LAST:event_targetStopsMouseEntered

    private void targetStopsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetStopsMouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/Target Stops Button Default.png"));
        targetStops.setIcon(i);
    }//GEN-LAST:event_targetStopsMouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/Track Bus Button Hover.png"));
        jButton4.setIcon(i);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/Track Bus Button Default.png"));
        jButton4.setIcon(i);
    }//GEN-LAST:event_jButton4MouseExited

    private void targetStopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetStopsActionPerformed
        // a dummy bus ID. The actual one would come from the cells window, when user clicks on the ith cell, then busID = i;
        int busID = 6;
        try {
            new ShowBusStops(busID);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_targetStopsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        JatraBegins.getPassenger_homepage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton targetStops;
    // End of variables declaration//GEN-END:variables
}
