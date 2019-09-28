/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owner;

import passenger.*;
import googlemapsapi.GeoCode.GeoCodeAPI;
import googlemapsapi.Others.Location;
import googlemapsapi.Places.NearbyBusStopsAPI;
import googlemapsapi.Address.AddressAPI;
import googlemapsapi.Places.BusStops;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Swapnil
 */
public class PredictionsWindow extends javax.swing.JFrame {

    private String type;
    private static List<BusStops> listAllStops;

    private Homepage homepage;

    public PredictionsWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public PredictionsWindow(ArrayList<String> query, String type) {

        // this.setUndecorated(true);
        listAllStops = new ArrayList<>();
        initComponents();
        addItemsCB(query);
        this.setLocationRelativeTo(null);
        this.type = type;

    }

    public PredictionsWindow(ArrayList<String> query, String type, Homepage homepage) {

        this.homepage = homepage;
        initComponents();
        addItemsCB(query);
        this.setLocationRelativeTo(null);
        this.type = type;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        selectButton = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(100, 211, 251));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setText("Select your address");
        jLabel1.setToolTipText("");

        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        selectButton.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboBoxActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed

        String str;

        str = comboBox.getSelectedItem().toString();

        String place_id = AddressAPI.searchPlaceIDFromSelectedAddress(str);
        Location location = new GeoCodeAPI().findCoordinates(place_id);

        findAllBusstops(location);

        // NearbyBusStopsAPI.setCurrCoordinates(location);
        this.setVisible(false);
    }//GEN-LAST:event_selectButtonActionPerformed

    /*
  
    called implicitly from the method entryPoint() to find all bus stops around a 45k m radius from the center of DHAKA city
    the list of bus stops is stored in a list of string: listStops
    NOTE: the number of entries varies from time to time depending on the network. the delay is required as a result.
    A higher delay would increase the chance of all the lists to come successfully, but reduces the speed of the program

     */
    private void findAllBusstops(Location location) {

        NearbyBusStopsAPI.setCurrCoordinates(location);
        BusStops busStops;
        String next_token = null;

        while (true) {
            try {

                System.out.println("hello");
                busStops = new NearbyBusStopsAPI(600).searchBusStopsNearby(next_token);

                listAllStops.add(busStops);

                next_token = busStops.next_page_token;

                int l = busStops.results.size();
                System.out.println("l = " + l);

                //for each session token, there are 20 max result.
                //iterating through them and saving them in a string listStops for
                //the autocomplete feature
                if (next_token == null) {
                    break;
                }

                //the sleep is necessary because the http pagetoken causes an invalid request if
                //not delayed. See doc.
                Thread.sleep(0);

            } catch (InterruptedException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        List<googlemapsapi.Others.Location> stopList = new ArrayList<>();
        System.out.println("listAllStops size: " + listAllStops.size());

        for (int i = 0; i < listAllStops.size(); i++) {
            for (int j = 0; j < listAllStops.get(i).results.size(); j++) {
                stopList.add(new googlemapsapi.Others.Location(listAllStops.get(i).results.get(j).getName(),
                        listAllStops.get(i).results.get(j).getGeometry().getLocation().getLat(),
                        listAllStops.get(i).results.get(j).getGeometry().getLocation().getLng()));

            }
        }

        try {
            new googlemapsapi.Maps.ShowBusStops(stopList);
        } catch (IOException ex) {
            Logger.getLogger(PredictionsWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
    add the items passed in through the constructor to the combo box
     */
    private void addItemsCB(ArrayList<String> query) {

        System.out.println("length of query: " + query.size());

        for (int i = 0; i < query.size(); i++) {
            comboBox.addItem(query.get(i));
            // System.out.println(query.get(i));

        }

    }

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
            java.util.logging.Logger.getLogger(PredictionsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PredictionsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PredictionsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PredictionsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PredictionsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables
}
