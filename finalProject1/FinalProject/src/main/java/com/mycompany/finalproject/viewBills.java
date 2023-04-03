/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author Rafael
 */
public class viewBills extends javax.swing.JFrame {

    /**
     * Creates new form viewBills
     */
    public viewBills() {
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

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        vendor = new javax.swing.JButton();
        addGoods = new javax.swing.JButton();
        viewGoods = new javax.swing.JButton();
        viewBills = new javax.swing.JButton();
        issuedGoods = new javax.swing.JButton();
        viewIssuedGoods = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(0, 153, 102));

        vendor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        vendor.setText("View Vendor");
        vendor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        vendor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorActionPerformed(evt);
            }
        });

        addGoods.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addGoods.setText("Add GooD");
        addGoods.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        addGoods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGoodsActionPerformed(evt);
            }
        });

        viewGoods.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewGoods.setText("View Goods");
        viewGoods.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        viewGoods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGoodsActionPerformed(evt);
            }
        });

        viewBills.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewBills.setText("view Bills");
        viewBills.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        viewBills.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBillsActionPerformed(evt);
            }
        });

        issuedGoods.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        issuedGoods.setText("issued Goods");
        issuedGoods.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        issuedGoods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        issuedGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuedGoodsActionPerformed(evt);
            }
        });

        viewIssuedGoods.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewIssuedGoods.setText("view issued Goods");
        viewIssuedGoods.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        viewIssuedGoods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewIssuedGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIssuedGoodsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(vendor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewBills, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(issuedGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewIssuedGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBills, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuedGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewIssuedGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "COMPANY", "DATE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("SEARCH");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("                    VIEW BILLS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
        AddGoods ag = new AddGoods();
        vv.setVisible(true);
        ag.setVisible(false);
    }//GEN-LAST:event_vendorActionPerformed

    private void addGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoodsActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
        AddGoods ag = new AddGoods();
        ag.setVisible(true);
        vv.setVisible(false);
    }//GEN-LAST:event_addGoodsActionPerformed

    private void viewGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGoodsActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
        AddGoods ag = new AddGoods();
        viewGoods vg = new viewGoods();
        viewBills vb = new viewBills();
        issuedGoods ig = new issuedGoods();
        viewIssuedGoods vig = new viewIssuedGoods();
        vv.setVisible(false);
        ag.setVisible(false);
        vg.setVisible(true);
        vb.setVisible(false);
        ig.setVisible(false);
        vig.setVisible(false);
    }//GEN-LAST:event_viewGoodsActionPerformed

    private void viewBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBillsActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
        AddGoods ag = new AddGoods();
        viewGoods vg = new viewGoods();
        viewBills vb = new viewBills();
        issuedGoods ig = new issuedGoods();
        viewIssuedGoods vig = new viewIssuedGoods();
        vv.setVisible(false);
        ag.setVisible(false);
        vg.setVisible(false);
        vb.setVisible(true);
        ig.setVisible(false);
        vig.setVisible(false);
    }//GEN-LAST:event_viewBillsActionPerformed

    private void issuedGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuedGoodsActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
        AddGoods ag = new AddGoods();
        viewGoods vg = new viewGoods();
        viewBills vb = new viewBills();
        issuedGoods ig = new issuedGoods();
        viewIssuedGoods vig = new viewIssuedGoods();
        vv.setVisible(false);
        ag.setVisible(false);
        vg.setVisible(false);
        vb.setVisible(false);
        ig.setVisible(true);
        vig.setVisible(false);
    }//GEN-LAST:event_issuedGoodsActionPerformed

    private void viewIssuedGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIssuedGoodsActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
        AddGoods ag = new AddGoods();
        viewGoods vg = new viewGoods();
        viewBills vb = new viewBills();
        issuedGoods ig = new issuedGoods();
        viewIssuedGoods vig = new viewIssuedGoods();
        vv.setVisible(false);
        ag.setVisible(false);
        vg.setVisible(false);
        vb.setVisible(false);
        ig.setVisible(false);
        vig.setVisible(true);
    }//GEN-LAST:event_viewIssuedGoodsActionPerformed

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
            java.util.logging.Logger.getLogger(viewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGoods;
    private javax.swing.JPanel header;
    private javax.swing.JButton issuedGoods;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton vendor;
    private javax.swing.JButton viewBills;
    private javax.swing.JButton viewGoods;
    private javax.swing.JButton viewIssuedGoods;
    // End of variables declaration//GEN-END:variables
}