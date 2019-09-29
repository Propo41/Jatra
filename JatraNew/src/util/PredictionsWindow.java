/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import googlemapsapi.Address.AddressAPI;
import googlemapsapi.GeoCodeAPI;
import googlemapsapi.Others.Location;
import googlemapsapi.Places.BusStops;
import googlemapsapi.Places.NearbyBusStopsAPI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.exceptions.*;
import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class PredictionsWindow extends javax.swing.JFrame {

    private String type;
    private static List<BusStops> listAllStops;
    private passenger.SearchBus homepage;

    //   private Homepage homepage;
    public PredictionsWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public PredictionsWindow(ArrayList<String> query, String type) {

        // this.setUndecorated(true);
        listAllStops = new ArrayList<>();
        initComponents();
        addItemsCB(query);
        label.setText(query.size() + " possible matches found. Choose one.");
        this.setLocationRelativeTo(null);
        this.type = type;

    }

    public PredictionsWindow(ArrayList<String> query, String type, passenger.SearchBus homepage) {

        this.homepage = homepage;
        initComponents();
        addItemsCB(query);
        label.setText(query.size() + " possible matches found. Choose one.");
        this.setLocationRelativeTo(null);
        this.type = type;
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
        select = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(178, 144, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Component 52 – 1.png"))); // NOI18N
        select.setContentAreaFilled(false);
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectMouseExited(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, 50));

        label.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("10 possible matches found. Choose one.");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 340, 30));

        comboBox.setFont(new java.awt.Font("Quicksand", 0, 11)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selec one from below" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseEntered
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/Ok button hover.png"));
        select.setIcon(i);
    }//GEN-LAST:event_selectMouseEntered

    private void selectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseExited
        ImageIcon i = new ImageIcon(getClass().getResource("/Images/Ok Button default.png"));
        select.setIcon(i);
    }//GEN-LAST:event_selectMouseExited

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed

        // only when the findNearbyBusStop window is accessed, this will be called
        if (type.equals("nearby")) {
            searchNearbyBusStops();

        } else {

            searchStopsForPassenger();
        }

        // NearbyBusStopsAPI.setCurrCoordinates(location);
        this.setVisible(false);
    }//GEN-LAST:event_selectActionPerformed

    private void searchStopsForPassenger() {
        String str;
        if (type.equals("current")) {
            str = comboBox.getSelectedItem().toString();
            homepage.setLocationField(str);

            String place_id = AddressAPI.searchPlaceIDFromSelectedAddress(str);
            Location location = new GeoCodeAPI().findCoordinates(place_id);
            NearbyBusStopsAPI.setCurrCoordinates(location);
            System.out.println("LOCATION: " + location.getLat() + " " + location.getLng());

        } else {
            str = comboBox.getSelectedItem().toString();
            homepage.setDestinationField(str);

            String place_id = AddressAPI.searchPlaceIDFromSelectedAddress(str);
            Location location = new GeoCodeAPI().findCoordinates(place_id);
            NearbyBusStopsAPI.setDestCoordinates(location);
        }
    }

    private void searchNearbyBusStops() {
        String str;
        str = comboBox.getSelectedItem().toString();
        String place_id = AddressAPI.searchPlaceIDFromSelectedAddress(str);
        Location location = new GeoCodeAPI().findCoordinates(place_id);
        findAllBusstops(location);
    }

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

    /*

    calling this function here would search all nearby bus Stops within 600m of the given location.
    a new window will appear showing a map

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
                // Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PredictionsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}