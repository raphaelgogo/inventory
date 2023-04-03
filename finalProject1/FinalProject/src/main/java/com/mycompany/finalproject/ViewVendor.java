/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class ViewVendor extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "definition";
    private static final String dataConn = "jdbc:mysql://localhost:3306/addgoods"; 
     
     Connection sqlConn = null;
     PreparedStatement pst =null;
     ResultSet rs =null;
     int g, i, id, deleteItem;
    private Object Jtable1;
    /**
     * Creates new form ViewVendor
     */
    public ViewVendor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
      public void upDateDB()
    {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn,username,password);
                pst = sqlConn.prepareStatement("select * from addgoods");
                
                rs = pst.executeQuery();
                ResultSetMetaData stData = rs.getMetaData();
                
                g = stData.getColumnCount();
                
                DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
                        RecordTable.setRowCount(0);
                        
                        
                while(rs.next()){
                       Vector columnData = new Vector();
                       
                       for (i = 1; i <= g; i++)
                       {
                           
                           columnData.add(rs.getString("company"));

                           columnData.add(rs.getString("quantity"));
                           columnData.add(rs.getString("price"));
                  
                           
                       
                       }
                       RecordTable.addRow(  columnData);
            }
                        
          
        }
    catch (Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
     
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        vendor = new javax.swing.JButton();
        addGoods = new javax.swing.JButton();
        viewGoods = new javax.swing.JButton();
        viewBills = new javax.swing.JButton();
        issuedGoods = new javax.swing.JButton();
        viewIssuedGoods = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        companyField = new javax.swing.JTextField();
        quantitty = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        sellingPrice = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        priceField1 = new javax.swing.JTextField();
        totalPrice1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new javax.swing.BoxLayout(bg, javax.swing.BoxLayout.LINE_AXIS));

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
                .addContainerGap(45, Short.MAX_VALUE))
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

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "company", "date", "quantity", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        companyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyFieldActionPerformed(evt);
            }
        });

        quantitty.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        quantitty.setText("company");

        sellingPrice.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sellingPrice.setText("quantity");

        date.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        date.setText("date");

        add.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        add.setText("ADD ");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        priceField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceField1ActionPerformed(evt);
            }
        });

        totalPrice1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        totalPrice1.setText("price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companyField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantitty))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellingPrice)
                            .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(totalPrice1)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(priceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitty)
                            .addComponent(sellingPrice)
                            .addComponent(date))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(companyField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(totalPrice1))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        bg.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void companyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyFieldActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into (company,date,quantity,price)value(?,?,?,?,?)");
            pst.setString(1,companyField.getText());
            
            pst.setString(3,quantityField.getText());
            pst.setString(4,priceField.getText());

            pst.executeUpdate( );
            JOptionPane.showMessageDialog(this, "Record Added");
            upDateDB();
        }

        catch (ClassNotFoundException ex) {
            Logger.getLogger(Java_MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Java_MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void priceField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addGoods;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField companyField;
    private javax.swing.JLabel date;
    private javax.swing.JPanel header;
    private javax.swing.JButton issuedGoods;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField priceField1;
    private javax.swing.JLabel quantitty;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel sellingPrice;
    private javax.swing.JLabel totalPrice1;
    private javax.swing.JButton vendor;
    private javax.swing.JButton viewBills;
    private javax.swing.JButton viewGoods;
    private javax.swing.JButton viewIssuedGoods;
    // End of variables declaration//GEN-END:variables
}
