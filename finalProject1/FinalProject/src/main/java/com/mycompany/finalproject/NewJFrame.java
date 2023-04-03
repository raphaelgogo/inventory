/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

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
public class NewJFrame extends javax.swing.JFrame {
   private static final String username = "root";
    private static final String password = "definition";
    private static final String dataConn = "jdbc:mysql://localhost:3306/addgoods"; 
     
     Connection sqlConn = null;
     PreparedStatement pst =null;
     ResultSet rs =null;
     int g, i, id, deleteItem;
    private Object Jtable1;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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
                
                DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
                        RecordTable.setRowCount(0);
                        
                        
                while(rs.next()){
                       Vector columnData = new Vector();
                       
                       for (i = 1; i <= g; i++)
                       {
                           columnData.add(rs.getString("goodsname"));
                           columnData.add(rs.getString("category"));
                           columnData.add(rs.getString("quantity"));
                           columnData.add(rs.getString("buyingprice"));
                           columnData.add(rs.getString("sellingprice"));
                           
                       
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
        header = new javax.swing.JPanel();
        vendor = new javax.swing.JButton();
        addGoods = new javax.swing.JButton();
        viewGoods = new javax.swing.JButton();
        viewBills = new javax.swing.JButton();
        issuedGoods = new javax.swing.JButton();
        viewIssuedGoods = new javax.swing.JButton();
        totalpriceField = new javax.swing.JTextField();
        totalPrice = new javax.swing.JLabel();
        goodsNameField = new javax.swing.JTextField();
        goodsName = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        quantitty = new javax.swing.JLabel();
        sellingpriceField = new javax.swing.JTextField();
        sellingPrice = new javax.swing.JLabel();
        buyingpriceField = new javax.swing.JTextField();
        buyingPrice = new javax.swing.JLabel();
        comboField = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        addGoods2 = new javax.swing.JButton();
        addGoods3 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        goodsName1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vendor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(addGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(viewGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBills, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(issuedGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewIssuedGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addContainerGap(31, Short.MAX_VALUE))
        );

        totalpriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpriceFieldActionPerformed(evt);
            }
        });

        totalPrice.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        totalPrice.setText("TOTAL PRICE");

        goodsNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsNameFieldActionPerformed(evt);
            }
        });

        goodsName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        goodsName.setText("GOODS NAME");

        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        quantitty.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        quantitty.setText("QUANTITY");

        sellingPrice.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sellingPrice.setText("SELLING PRICE");

        buyingpriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyingpriceFieldActionPerformed(evt);
            }
        });

        buyingPrice.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buyingPrice.setText("BUYING PRICE");

        comboField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Beverages", "2.Backery", "3.Canned", "4.Baking Goods", "5.Frozen Food", "6.Meat", "8.Produce", "9.Cleaners", "10.Papper Goods", "11.Personal Care" }));

        add.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        add.setText("ADD ");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        addGoods2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addGoods2.setText("PRINT");
        addGoods2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        addGoods2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGoods2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGoods2ActionPerformed(evt);
            }
        });

        addGoods3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addGoods3.setText("SAVE");
        addGoods3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        addGoods3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGoods3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGoods3ActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cancel.setText("CANCEL");
        cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jTable1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "GoodsName", "Quantity", "Buy price", "Selling Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        goodsName1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        goodsName1.setText("CATEGORY");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("                     ADD   GOODS");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goodsNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsName)
                            .addComponent(addGoods2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bgLayout.createSequentialGroup()
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(bgLayout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(addGoods3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(bgLayout.createSequentialGroup()
                                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(goodsName1))
                                            .addGap(18, 18, 18)
                                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bgLayout.createSequentialGroup()
                                                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buyingpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(bgLayout.createSequentialGroup()
                                                    .addComponent(quantitty)
                                                    .addGap(54, 54, 54)
                                                    .addComponent(buyingPrice)))
                                            .addGap(24, 24, 24)
                                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sellingpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sellingPrice))))
                                    .addGap(30, 30, 30)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(totalPrice)
                                        .addComponent(totalpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goodsName)
                    .addComponent(totalPrice)
                    .addComponent(sellingPrice)
                    .addComponent(buyingPrice)
                    .addComponent(quantitty)
                    .addComponent(goodsName1))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goodsNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyingpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellingpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGoods3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGoods2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
        NewJFrame ag = new NewJFrame();
        viewGoods vg = new viewGoods();
        viewBills vb = new viewBills();
        issuedGoods ig = new issuedGoods();
        viewIssuedGoods vig = new viewIssuedGoods();
        vv.setVisible(true);
        ag.setVisible(false);
        vg.setVisible(false);
        vb.setVisible(false);
        ig.setVisible(false);
        vig.setVisible(false);

    }//GEN-LAST:event_vendorActionPerformed

    private void addGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoodsActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
       NewJFrame ag = new NewJFrame();
        viewGoods vg = new viewGoods();
        viewBills vb = new viewBills();
        issuedGoods ig = new issuedGoods();
        viewIssuedGoods vig = new viewIssuedGoods();
        vv.setVisible(false);
        ag.setVisible(true);
        vg.setVisible(false);
        vb.setVisible(false);
        ig.setVisible(false);
        vig.setVisible(false);

    }//GEN-LAST:event_addGoodsActionPerformed

    private void viewGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGoodsActionPerformed
        // TODO add your handling code here:
        ViewVendor vv = new ViewVendor();
       NewJFrame ag = new NewJFrame();
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
        NewJFrame ag = new NewJFrame();
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
        NewJFrame ag = new NewJFrame();
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
        NewJFrame ag = new NewJFrame();
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

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void buyingpriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyingpriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyingpriceFieldActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into addgoods(goodsname,catgory,quantity,buyingprice,sellingprice)value(?,?,?,?,?)");

            pst.setString(1,goodsNameField.getText());
            pst.setString(2,comboField.getName());
            pst.setString(3,quantityField.getText());
            pst.setString(4,buyingpriceField.getText());
            pst.setString(5,sellingpriceField.getText());

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

    private void addGoods2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoods2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addGoods2ActionPerformed

    private void addGoods3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoods3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addGoods3ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        goodsNameField.setText(" ");
        quantityField.setText(" ");
        buyingpriceField.setText(" ");
        sellingpriceField.setText(" ");
        totalpriceField.setText(" ");
    }//GEN-LAST:event_cancelActionPerformed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void goodsNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goodsNameFieldActionPerformed

    private void totalpriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalpriceFieldActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addGoods;
    private javax.swing.JButton addGoods2;
    private javax.swing.JButton addGoods3;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel buyingPrice;
    private javax.swing.JTextField buyingpriceField;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> comboField;
    private javax.swing.JLabel goodsName;
    private javax.swing.JLabel goodsName1;
    private javax.swing.JTextField goodsNameField;
    private javax.swing.JPanel header;
    private javax.swing.JButton issuedGoods;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel quantitty;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel sellingPrice;
    private javax.swing.JTextField sellingpriceField;
    private javax.swing.JLabel totalPrice;
    private javax.swing.JTextField totalpriceField;
    private javax.swing.JButton vendor;
    private javax.swing.JButton viewBills;
    private javax.swing.JButton viewGoods;
    private javax.swing.JButton viewIssuedGoods;
    // End of variables declaration//GEN-END:variables
}
