/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrienne
 */
public class purchaseTransac extends javax.swing.JFrame {

    public String Code; 
    public int idName;
    public String date;
    public String content;
    public int Quan;
    public String net;
    public int unitP;
    public String amount;
    /**
     * Creates new form purchaseTransac
     */
    public purchaseTransac() {
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

        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        purchaseBuyerBT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        purchaseBuyerTin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        purchaseBuyerDescription = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        purchaseBuyerQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        purchaseBuyerNet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        purchaseBuyerUnit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        purchaseBuyerAmount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        purchaseBuyerDate = new javax.swing.JTextField();
        purchaseBuyerSaveButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        purchaseSupplierSC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        purchaseSupplierOR = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        purchaseSupplierDescription = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        purchaseSupplierQuantity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        purchaseSupplierNet = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        purchaseSupplierUnit = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        purchaseSupplierAmount = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        purchaseSupplierDate = new javax.swing.JTextField();
        purchaseSupplierSaveButton = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setText("buyer");

        jLabel2.setText("BT");

        purchaseBuyerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBuyerBTActionPerformed(evt);
            }
        });

        jLabel3.setText("TIN");

        jLabel4.setText("Description");

        jLabel5.setText("Quantity");

        jLabel6.setText("Net");

        jLabel7.setText("Unit");

        purchaseBuyerUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchaseBuyerUnitKeyReleased(evt);
            }
        });

        jLabel8.setText("Amount");

        jLabel10.setText("Date");

        purchaseBuyerSaveButton.setText("save");
        purchaseBuyerSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBuyerSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseBuyerBT)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseBuyerTin)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseBuyerDescription)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseBuyerQuantity)
                            .addComponent(purchaseBuyerNet)
                            .addComponent(purchaseBuyerUnit)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseBuyerAmount)
                            .addComponent(purchaseBuyerDate, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(purchaseBuyerSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseBuyerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(purchaseBuyerSaveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel11.setText("supplier");

        jLabel12.setText("SC");

        purchaseSupplierSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseSupplierSCActionPerformed(evt);
            }
        });

        jLabel13.setText("OR");

        jLabel14.setText("Description");

        jLabel15.setText("Quantity");

        jLabel16.setText("Net");

        jLabel17.setText("Unit");

        purchaseSupplierUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchaseSupplierUnitKeyReleased(evt);
            }
        });

        jLabel18.setText("Amount");

        jLabel19.setText("Date");

        purchaseSupplierSaveButton.setText("save");
        purchaseSupplierSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseSupplierSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseSupplierSC)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseSupplierOR)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseSupplierDescription)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseSupplierQuantity)
                            .addComponent(purchaseSupplierNet)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseSupplierAmount)
                            .addComponent(purchaseSupplierDate, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(purchaseSupplierUnit)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(purchaseSupplierSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseSupplierDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(purchaseSupplierSaveButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseBuyerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBuyerBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseBuyerBTActionPerformed

    private void purchaseSupplierSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseSupplierSCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseSupplierSCActionPerformed

    private void purchaseSupplierSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseSupplierSaveButtonActionPerformed
        // TODO add your handling code here:
         int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to save this acct?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){
             int quanINT =Integer.parseInt(purchaseSupplierQuantity.getText());
             int unitINT=Integer.parseInt(purchaseSupplierUnit.getText());
             double total=quanINT*unitINT;
             saveSQL save=new   saveSQL();
            Code=purchaseSupplierSC.getText(); 
            idName=Integer.parseInt(purchaseSupplierOR.getText());
            date=purchaseSupplierDate.getText();
            content=purchaseSupplierDescription.getText();
            Quan=quanINT;
            net=purchaseSupplierNet.getText();
            unitP=unitINT;
            amount=Double.toString(total);
             int sqlchoice=0;
                 
             
             try {
                 save.sqlsavedb(sqlchoice,Code,idName,date,content,Quan,net,unitP,amount);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(purchaseTransac.class.getName()).log(Level.SEVERE, null, ex);
             }
             
            
             
        }
        else {
             JOptionPane.showMessageDialog(null, "account already exist", "System Message", JOptionPane.INFORMATION_MESSAGE);
        }        
    
            
    }//GEN-LAST:event_purchaseSupplierSaveButtonActionPerformed

    private void purchaseSupplierUnitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchaseSupplierUnitKeyReleased
        // TODO add your handling code here:
        int quanINT =Integer.parseInt(purchaseSupplierQuantity.getText());
             int unitINT=Integer.parseInt(purchaseSupplierUnit.getText());
             int total=quanINT*unitINT;
             amount=Double.toString(total);
        purchaseSupplierAmount.setText(amount);
    }//GEN-LAST:event_purchaseSupplierUnitKeyReleased

    private void purchaseBuyerSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBuyerSaveButtonActionPerformed
        // TODO add your handling code here:
         int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to save this acct?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){
             int quanINT =Integer.parseInt(purchaseBuyerQuantity.getText());
             int unitINT=Integer.parseInt(purchaseBuyerUnit.getText());
             double total=quanINT*unitINT;
             saveSQL save=new   saveSQL();
            Code=purchaseBuyerBT.getText(); 
            idName=Integer.parseInt(purchaseBuyerTin.getText());
            date=purchaseBuyerDate.getText();
            content=purchaseBuyerDescription.getText();
            Quan=quanINT;
            net=purchaseBuyerNet.getText();
            unitP=unitINT;
            amount=Double.toString(total);
            int sqlchoice=1;
            
                 
             
             try {
                 save.sqlsavedb(sqlchoice,Code,idName,date,content,Quan,net,unitP,amount);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(purchaseTransac.class.getName()).log(Level.SEVERE, null, ex);
             }
             
            
             
        }
        else {
             JOptionPane.showMessageDialog(null, "account already exist", "System Message", JOptionPane.INFORMATION_MESSAGE);
        }        
    
        
        
        
    }//GEN-LAST:event_purchaseBuyerSaveButtonActionPerformed

    private void purchaseBuyerUnitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchaseBuyerUnitKeyReleased
        // TODO add your handling code here:
         int quanINT =Integer.parseInt(purchaseBuyerQuantity.getText());
             int unitINT=Integer.parseInt(purchaseBuyerUnit.getText());
             int total=quanINT*unitINT;
             amount=Double.toString(total);
        purchaseBuyerAmount.setText(amount);
        
        
    }//GEN-LAST:event_purchaseBuyerUnitKeyReleased

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
            java.util.logging.Logger.getLogger(purchaseTransac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchaseTransac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchaseTransac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchaseTransac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchaseTransac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField purchaseBuyerAmount;
    private javax.swing.JTextField purchaseBuyerBT;
    private javax.swing.JTextField purchaseBuyerDate;
    private javax.swing.JTextField purchaseBuyerDescription;
    private javax.swing.JTextField purchaseBuyerNet;
    private javax.swing.JTextField purchaseBuyerQuantity;
    private javax.swing.JButton purchaseBuyerSaveButton;
    private javax.swing.JTextField purchaseBuyerTin;
    private javax.swing.JTextField purchaseBuyerUnit;
    private javax.swing.JTextField purchaseSupplierAmount;
    private javax.swing.JTextField purchaseSupplierDate;
    private javax.swing.JTextField purchaseSupplierDescription;
    private javax.swing.JTextField purchaseSupplierNet;
    private javax.swing.JTextField purchaseSupplierOR;
    private javax.swing.JTextField purchaseSupplierQuantity;
    private javax.swing.JTextField purchaseSupplierSC;
    private javax.swing.JButton purchaseSupplierSaveButton;
    private javax.swing.JTextField purchaseSupplierUnit;
    // End of variables declaration//GEN-END:variables
}
