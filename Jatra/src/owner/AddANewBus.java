/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owner;

import googlemapsapi.BusStopSuggestion;
import googlemapsapi.BusStops;
import googlemapsapi.Location;
import googlemapsapi.NearbyBusStopsAPI;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import main.Bus;
import util.AutoCompleteBehaviour;
import util.popUpWindows.BusStopNeeded;
import util.popUpWindows.EmptyFields;
import util.popUpWindows.MoreSettings;

/**
 *
 * @author USER
 */
public class AddANewBus extends javax.swing.JFrame implements ComponentListener {

    private MoreSettings profilePopup;
    private Bus bus;
    private List<String> busStops;
    private int busStopCounter;
    public static List<String> listStops;

    public AddANewBus() {

        initComponents();
        entryPoint();
        busStops = new ArrayList<>();
        busStopCounter = 0;
        this.setLocationRelativeTo(null);
        profilePopup = new MoreSettings();
        addComponentListener(this);
        validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moreButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        busNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalSeatsTextField = new javax.swing.JTextField();
        targetBusStopsTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FarePerStopTextField = new javax.swing.JTextField();
        saveChangesButton = new javax.swing.JButton();
        addBusstopButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        conditionComboBox = new javax.swing.JComboBox<>();
        typeComboBox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreButtonActionPerformed(evt);
            }
        });
        getContentPane().add(moreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 70, 20));

        jPanel3.setBackground(new java.awt.Color(51, 57, 64));

        jPanel4.setBackground(new java.awt.Color(224, 224, 224));

        jSeparator2.setBackground(new java.awt.Color(51, 57, 64));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 26)); // NOI18N
        jLabel2.setText("Add Bus");

        jSeparator3.setBackground(new java.awt.Color(51, 57, 64));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        jLabel3.setText("Bus Name");

        busNameTextField.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        busNameTextField.setToolTipText("");
        busNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        busNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        busNameTextField.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        jLabel4.setText("Total Seats");

        totalSeatsTextField.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        totalSeatsTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalSeatsTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        targetBusStopsTextField.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        targetBusStopsTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        jLabel6.setText("Target Bus Stops");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        jLabel10.setText("Fare per bus stop passed");

        FarePerStopTextField.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        FarePerStopTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FarePerStopTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        saveChangesButton.setBackground(new java.awt.Color(51, 57, 64));
        saveChangesButton.setFont(new java.awt.Font("Leelawadee UI", 0, 20)); // NOI18N
        saveChangesButton.setForeground(new java.awt.Color(255, 255, 255));
        saveChangesButton.setText("Save");
        saveChangesButton.setBorder(null);
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        addBusstopButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBusstopButton.setText("+");
        addBusstopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBusstopButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 15)); // NOI18N
        jLabel7.setText("Type of Bus");

        conditionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non - AC" }));

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seating", "Local" }));

        backButton.setBackground(new java.awt.Color(51, 57, 64));
        backButton.setFont(new java.awt.Font("Leelawadee UI", 0, 20)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(busNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(FarePerStopTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(totalSeatsTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(targetBusStopsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addBusstopButton))
                                .addComponent(jLabel7)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(conditionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(targetBusStopsTextField)
                            .addComponent(addBusstopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FarePerStopTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(conditionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 490));

        jPanel2.setBackground(new java.awt.Color(105, 214, 246));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel1.setText("Jatra");

        jSeparator1.setBackground(new java.awt.Color(51, 57, 64));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreButtonActionPerformed
        profilePopup.setVisible(true);
        profilePopup.setLocation(this.getX() + this.getWidth(), this.getY());
    }//GEN-LAST:event_moreButtonActionPerformed

    /*
    first of all everything the user enters will be saved in local variables. When the saves changes
    button is clicked, everything stored in the variables will be saved to the database on another function call
     */
    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed

        //check if the fields are filled, if they are then save it to the database
        if (checkFields()) {
            String busName = busNameTextField.getText();
            int seats = Integer.parseInt(totalSeatsTextField.getText());
            double fare = Double.parseDouble(FarePerStopTextField.getText());
            String condition = conditionComboBox.getSelectedItem().toString();
            String type = typeComboBox.getSelectedItem().toString();
            LocalDate localDate = LocalDate.now();
            String currentDate = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
            System.out.println(currentDate);

            //currently the rating system is not implemented. Will be implementing it later on, so, it's set to 0
            bus = new Bus(busName, seats, currentDate, 0, fare, type, condition, busStops);
            System.out.println(bus.getName());
            // now save the bus contents to database based on the key of current user

        }

    }//GEN-LAST:event_saveChangesButtonActionPerformed

    /*
    the functions returns true if all the fields are filled up and one or more bus Stops have been added else returns false
     */
    private boolean checkFields() {
        if (busNameTextField.getText().isEmpty() || totalSeatsTextField.getText().isEmpty() || FarePerStopTextField.getText().isEmpty()) {
            new EmptyFields().setVisible(true);
            return false;
        } else if (busStopCounter == 0 && targetBusStopsTextField.getText().isEmpty()) {
            new BusStopNeeded().setVisible(true);
            return false;

        }
        return true;

    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addBusstopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBusstopButtonActionPerformed

        if (checkFields()) {
            if (!targetBusStopsTextField.getText().isEmpty()) {
                busStops.add(targetBusStopsTextField.getText());
                busStopCounter++;
                System.out.println("bus stop added, counter: " + busStopCounter);
                targetBusStopsTextField.setText("");
            } else {
                new BusStopNeeded().setVisible(true);

            }
        }

    }//GEN-LAST:event_addBusstopButtonActionPerformed

    /*
    since each application has only one entry point(ie main method), the main method of this class
    wont get called. So, in place of that, the following function is used to do the job of the main method
    The autocomplete() method needs to run on a thread
     */
    public void entryPoint() {

        findAllBusstops();
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
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new AddANewBus().setVisible(true);
                autocomplete();

            }
        });

        System.out.println("inside external main thread of homepage");
    }

    /*
    this shit took me a freaking whole day!
    called implicitly from the method entryPoint() to find all bus stops around a 45k m radius from the center of DHAKA city
    the list of bus stops is stored in a list of string: listStops
    NOTE: the number of entries varies from time to time depending on the network. the delay is required as a result.
    A higher delay would increase the chance of all the lists to come successfully, but reduces the speed of the program

     */
    private void findAllBusstops() {

        NearbyBusStopsAPI.setCurrCoordinates(new Location(23.765245, 90.409192));
        BusStops busStops;
        String next_token = null;

        listStops = new ArrayList<>();
        while (true) {
            try {
                busStops = new NearbyBusStopsAPI(45000).searchBusStopsNearby(next_token);
                int l = busStops.results.size();
                next_token = busStops.next_page_token;
                System.out.println("l = " + l);

                for (int i = 0; i < l; i++) {
                    listStops.add(busStops.results.get(i).getName());
                }

                if (next_token == null) {
                    break;
                }

                //the sleep is necessary because the http pagetoken causes an invalid request if
                //not delayed. See doc.
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("All bus stops found. Total entries: " + listStops.size());

    }

    public static void main(String args[]) throws InterruptedException, InvocationTargetException {

        System.out.println("inside main thread of homepage");
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
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddANewBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddANewBus().setVisible(true);
                System.out.println("gui thread running");
                // autocomplete();
            }
        });

        System.out.println("inside external main thread of homepage");

    }

    /*
    contains code for the autocompletion on the text field
    the function is called from the main thread
    there will also be a thread that checks repeatedly if any text is written and
    in real time, google maps api will be used to return autocomplete queries.
     */
    public static void autocomplete() {

        //converting the List of String- listStops to an object of BusStopSuggesstion for the autocompletion stuff to work
        List<BusStopSuggestion> choices = new ArrayList<>();
        for (int i = 0; i < listStops.size(); i++) {
            choices.add(BusStopSuggestion.querySearch(listStops.get(i)));
        }

        final AutoCompleteBehaviour<BusStopSuggestion> autoComplete = new AutoCompleteBehaviour<>();

        autoComplete.setCallback(new AutoCompleteBehaviour.DefaultAutoCompleteCallback<BusStopSuggestion>() {
            @Override
            public List<BusStopSuggestion> getProposals(String input) {
                if (input.length() < 2) {
                    return Collections.emptyList();
                }
                final String lower = input.toLowerCase();
                final List<BusStopSuggestion> result = new ArrayList<>();
                for (BusStopSuggestion c : choices) {
                    String temp = c.stopName.toLowerCase();
                    if (temp.contains(lower)) {
                        result.add(c);
                    } else {
                        // System.out.println("not inserting because : " + lower + " " + temp);
                    }
                }
                return result;
            }

            @Override
            public String getStringToInsert(BusStopSuggestion person) {
                return person.stopName;
            }
        });

        final DefaultListCellRenderer renderer = new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                final Component result = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                final BusStopSuggestion p = (BusStopSuggestion) value;
                setText(p.stopName);
                return result;
            }
        };
        autoComplete.setListCellRenderer(renderer);

        // setup initial size
        autoComplete.setInitialPopupSize(new Dimension(100, 300));
        // how many proposals to display before showing a scroll bar
        autoComplete.setVisibleRowCount(10);
        autoComplete.attachTo(targetBusStopsTextField);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FarePerStopTextField;
    private javax.swing.JButton addBusstopButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField busNameTextField;
    private javax.swing.JComboBox<String> conditionComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton moreButton;
    private javax.swing.JButton saveChangesButton;
    private static javax.swing.JTextField targetBusStopsTextField;
    private javax.swing.JTextField totalSeatsTextField;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentResized(ComponentEvent e) {
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        profilePopup.setLocation(this.getX() + this.getWidth(), this.getY());
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }
}
