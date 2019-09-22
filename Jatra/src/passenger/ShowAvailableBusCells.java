package passenger;

public class ShowAvailableBusCells extends javax.swing.JFrame {

    public ShowAvailableBusCells() {
        initComponents();
    }
    int numberOfCells = 2;

    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;

    private void initComponents() {
        if (numberOfCells == 0) {
            jPanel3 = new javax.swing.JPanel();
            jPanel4 = new javax.swing.JPanel();
            jButton1 = new javax.swing.JButton();
            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jButton4 = new javax.swing.JButton();
            jButton5 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel3.setBackground(new java.awt.Color(51, 57, 64));

            jPanel4.setBackground(new java.awt.Color(224, 224, 224));

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 777, Short.MAX_VALUE)
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 545, Short.MAX_VALUE)
            );

            jButton1.setText("Next");

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(32, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64))
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addContainerGap())
            );

            getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 850, 620));

            jPanel2.setBackground(new java.awt.Color(105, 214, 246));

            jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
            jLabel1.setText("Jatra");

            jSeparator1.setBackground(new java.awt.Color(51, 57, 64));

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/PopUpLogo.png"))); // NOI18N
            jButton4.setBorder(null);
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                }
            });

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/DetailsLogo.png"))); // NOI18N
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(21, 21, 21))))
            );
            jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton4))
                                                    .addGap(5, 5, 5)
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(13, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(0, 0, 0))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
            );

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

            pack();

        } else if (numberOfCells == 1) {
            jPanel1 = new javax.swing.JPanel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel1 = new javax.swing.JLabel();
            jButton5 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jPanel4 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel1.setBackground(new java.awt.Color(105, 214, 246));

            jSeparator1.setBackground(new java.awt.Color(51, 57, 64));

            jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
            jLabel1.setText("Jatra");

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/DetailsLogo.png"))); // NOI18N
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                }
            });

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/PopUpLogo.png"))); // NOI18N
            jButton4.setBorder(null);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
            );

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

            jPanel2.setBackground(new java.awt.Color(51, 57, 64));

            jPanel3.setBackground(new java.awt.Color(224, 224, 224));

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/BusLogo.png"))); // NOI18N

            jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Dinner");
            jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jLabel4.setText("Fare : ");

            jLabel5.setText("Bus Stops");

            jLabel6.setText("Estimated Duration :");

            jButton1.setBackground(new java.awt.Color(51, 57, 64));
            jButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("Select");
            jButton1.setBorder(null);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    System.out.println("Dinner");
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel3)
                                                            .addComponent(jLabel6))
                                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel4))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(44, 44, 44))))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel2))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                    .addComponent(jLabel4)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel5))
                                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6)))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap(20, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24))
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(410, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(40, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(40, Short.MAX_VALUE))
            );

            getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 850, 610));

            pack();
        } else if (numberOfCells == 2) {
            jPanel1 = new javax.swing.JPanel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel1 = new javax.swing.JLabel();
            jButton5 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jPanel4 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jPanel5 = new javax.swing.JPanel();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel1.setBackground(new java.awt.Color(105, 214, 246));

            jSeparator1.setBackground(new java.awt.Color(51, 57, 64));

            jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
            jLabel1.setText("Jatra");

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/DetailsLogo.png"))); // NOI18N
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    // jButton5ActionPerformed(evt);
                }
            });

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/PopUpLogo.png"))); // NOI18N
            jButton4.setBorder(null);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addContainerGap())
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton4)
                                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(23, 23, 23))))
            );

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

            jPanel2.setBackground(new java.awt.Color(51, 57, 64));

            jPanel3.setBackground(new java.awt.Color(224, 224, 224));

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/BusLogo.png"))); // NOI18N
            jLabel2.setText("jLabel2");

            jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Winner");
            jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jLabel4.setText("Fare : ");

            jLabel5.setText("Bus Stops");

            jLabel6.setText("Estimated Duration :");

            jButton1.setBackground(new java.awt.Color(51, 57, 64));
            jButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("Select");
            jButton1.setBorder(null);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //first button
                    System.out.println("YOU ARE  A HOEEEEE");
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel3)
                                                            .addComponent(jLabel6))
                                                    .addContainerGap(533, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel4))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(44, 44, 44))))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel2))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                    .addComponent(jLabel4)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel5))
                                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6)))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel5.setBackground(new java.awt.Color(255, 255, 255));

            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/BusLogo.png"))); // NOI18N
            jLabel7.setText("jLabel2");

            jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("Winner");
            jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jLabel12.setText("Fare : ");

            jLabel13.setText("Bus Stops");

            jLabel14.setText("Estimated Duration :");

            jButton2.setBackground(new java.awt.Color(51, 57, 64));
            jButton2.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("Select");
            jButton2.setBorder(null);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //second button
                    System.out.println("SUCKER");
                }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(jLabel14))
                                                    .addContainerGap(533, Short.MAX_VALUE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel13)
                                                            .addComponent(jLabel12))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(41, 41, 41))))
            );
            jPanel5Layout.setVerticalGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel7))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                    .addComponent(jLabel12)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel13))
                                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel14)))
                                    .addContainerGap(13, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap(22, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(24, 24, 24))
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(290, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(28, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(40, Short.MAX_VALUE))
            );

            getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 850, 610));

            pack();
        } else if (numberOfCells == 3) {

            jPanel2 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jPanel4 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel22 = new javax.swing.JLabel();
            jLabel23 = new javax.swing.JLabel();
            jLabel24 = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();
            jPanel5 = new javax.swing.JPanel();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel25 = new javax.swing.JLabel();
            jLabel26 = new javax.swing.JLabel();
            jLabel27 = new javax.swing.JLabel();
            jButton3 = new javax.swing.JButton();
            jPanel6 = new javax.swing.JPanel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel28 = new javax.swing.JLabel();
            jLabel29 = new javax.swing.JLabel();
            jLabel30 = new javax.swing.JLabel();
            jButton6 = new javax.swing.JButton();
            jPanel7 = new javax.swing.JPanel();
            jLabel17 = new javax.swing.JLabel();
            jLabel18 = new javax.swing.JLabel();
            jLabel31 = new javax.swing.JLabel();
            jLabel32 = new javax.swing.JLabel();
            jLabel33 = new javax.swing.JLabel();
            jButton7 = new javax.swing.JButton();
            jPanel1 = new javax.swing.JPanel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel1 = new javax.swing.JLabel();
            jButton5 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel2.setBackground(new java.awt.Color(51, 57, 64));

            jPanel3.setBackground(new java.awt.Color(224, 224, 224));

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/BusLogo.png"))); // NOI18N
            jLabel2.setText("jLabel2");

            jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Winner");
            jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jLabel22.setText("Fare : ");

            jLabel23.setText("Bus Stops");

            jLabel24.setText("Estimated Duration :");

            jButton2.setBackground(new java.awt.Color(51, 57, 64));
            jButton2.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("Select");
            jButton2.setBorder(null);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    // first button
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel3)
                                                            .addComponent(jLabel24))
                                                    .addContainerGap(531, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel23)
                                                            .addComponent(jLabel22))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(44, 44, 44))))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel2)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                    .addComponent(jLabel22)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel23))
                                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel24)))
                                    .addContainerGap())
            );

            jPanel5.setBackground(new java.awt.Color(255, 255, 255));

            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/BusLogo.png"))); // NOI18N
            jLabel7.setText("jLabel2");

            jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("Winner");
            jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jLabel25.setText("Fare : ");

            jLabel26.setText("Bus Stops");

            jLabel27.setText("Estimated Duration :");

            jButton3.setBackground(new java.awt.Color(51, 57, 64));
            jButton3.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
            jButton3.setForeground(new java.awt.Color(255, 255, 255));
            jButton3.setText("Select");
            jButton3.setBorder(null);
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    // second button
                }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(jLabel27))
                                                    .addContainerGap(531, Short.MAX_VALUE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel26)
                                                            .addComponent(jLabel25))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(44, 44, 44))))
            );
            jPanel5Layout.setVerticalGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel7)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                    .addComponent(jLabel25)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel26))
                                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel27)))
                                    .addContainerGap())
            );

            jPanel6.setBackground(new java.awt.Color(255, 255, 255));

            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/BusLogo.png"))); // NOI18N
            jLabel12.setText("jLabel2");

            jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel13.setText("Winner");
            jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jLabel28.setText("Estimated Duration :");

            jLabel29.setText("Bus Stops");

            jLabel30.setText("Fare : ");

            jButton6.setBackground(new java.awt.Color(51, 57, 64));
            jButton6.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
            jButton6.setForeground(new java.awt.Color(255, 255, 255));
            jButton6.setText("Select");
            jButton6.setBorder(null);
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    // third button
                }
            });

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel13)
                                                            .addComponent(jLabel28))
                                                    .addContainerGap(531, Short.MAX_VALUE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel29)
                                                            .addComponent(jLabel30))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(44, 44, 44))))
            );
            jPanel6Layout.setVerticalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel12))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                                    .addComponent(jLabel30)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel29))
                                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel28)))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel7.setBackground(new java.awt.Color(255, 255, 255));

            jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/BusLogo.png"))); // NOI18N
            jLabel17.setText("jLabel2");

            jLabel18.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
            jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel18.setText("Winner");
            jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

            jLabel31.setText("Bus Stops");

            jLabel32.setText("Fare : ");

            jLabel33.setText("Estimated Duration :");

            jButton7.setBackground(new java.awt.Color(51, 57, 64));
            jButton7.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
            jButton7.setForeground(new java.awt.Color(255, 255, 255));
            jButton7.setText("Select");
            jButton7.setBorder(null);
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    // forth button
                }
            });

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel18)
                                                            .addComponent(jLabel33))
                                                    .addContainerGap(531, Short.MAX_VALUE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel31)
                                                            .addComponent(jLabel32))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(44, 44, 44))))
            );
            jPanel7Layout.setVerticalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel17))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                                    .addComponent(jLabel32)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel31))
                                                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel33)))
                                    .addContainerGap(13, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap(30, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(28, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(36, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(44, Short.MAX_VALUE))
            );

            getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 860, 600));

            jPanel1.setBackground(new java.awt.Color(105, 214, 246));
            jPanel1.setMinimumSize(new java.awt.Dimension(790, 96));
            jPanel1.setRequestFocusEnabled(false);

            jSeparator1.setBackground(new java.awt.Color(51, 57, 64));

            jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
            jLabel1.setText("Jatra");

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/DetailsLogo.png"))); // NOI18N
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //  jButton5ActionPerformed(evt);
                }
            });

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner/img/PopUpLogo.png"))); // NOI18N
            jButton4.setBorder(null);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(23, 23, 23))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(27, 27, 27))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton4)
                                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(34, 34, 34))))
            );

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 90));

            pack();

        } else if (numberOfCells == 4) {

        } else if (numberOfCells == 5) {

        } else if (numberOfCells == 6) {

        } else if (numberOfCells == 7) {

        } else if (numberOfCells == 8) {

        }
    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowAvailableBusCells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAvailableBusCells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAvailableBusCells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAvailableBusCells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAvailableBusCells().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel infoPanel1;
    private javax.swing.JPanel infoPanel1SubPanel1;
    private javax.swing.JPanel infoPanel1SubPanel2;
    private javax.swing.JPanel infoPanel2;
    private javax.swing.JPanel infoPanel2SubPanel1;
    private javax.swing.JPanel infoPanel2SubPanel2;
    private javax.swing.JPanel infoPanel3;
    private javax.swing.JPanel infoPanel3SubPanel1;
    private javax.swing.JPanel infoPanel3SubPanel2;
    private javax.swing.JPanel infoPanel4;
    private javax.swing.JPanel infoPanel4SubPanel1;
    private javax.swing.JPanel infoPanel4SubPanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;

}
