/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUANLICUAHANGXEMAYGUI;

import QUANLICUAHANGXEMAYGUI.report.Report;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author duy
 */
public class BaoCaoThongKe extends javax.swing.JFrame {

    /**
     * Creates new form BaoCaoThongKe
     */
    public BaoCaoThongKe() {
        initComponents();
        lblthang.setVisible(true);
        lblnam.setVisible(true);
        txtthang.setVisible(true);
        txtnam.setVisible(true);
          txtthang.requestFocus();
            txtthang.selectAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        raddoanhthu = new javax.swing.JRadioButton();
        radtonkho = new javax.swing.JRadioButton();
        radxuathang = new javax.swing.JRadioButton();
        txtthang = new javax.swing.JTextField();
        lblthang = new javax.swing.JLabel();
        lblnam = new javax.swing.JLabel();
        txtnam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        radtdnvbh = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Báo cáo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup1.add(raddoanhthu);
        raddoanhthu.setSelected(true);
        raddoanhthu.setText("Doanh thu bán hàng");
        raddoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raddoanhthuActionPerformed(evt);
            }
        });

        buttonGroup1.add(radtonkho);
        radtonkho.setText("Hàng tồn kho");
        radtonkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radtonkhoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radxuathang);
        radxuathang.setText("Báo cáo xuất hàng theo năm");
        radxuathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radxuathangActionPerformed(evt);
            }
        });

        lblthang.setText("Tháng");

        lblnam.setText("Năm");

        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xem");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radtdnvbh);
        radtdnvbh.setText("Theo dõi nhân viên bán hàng");
        radtdnvbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radtdnvbhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(raddoanhthu)
                .addGap(18, 18, 18)
                .addComponent(radtonkho)
                .addGap(18, 18, 18)
                .addComponent(radxuathang)
                .addGap(18, 18, 18)
                .addComponent(radtdnvbh)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblthang)
                        .addGap(30, 30, 30)
                        .addComponent(txtthang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblnam, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raddoanhthu)
                    .addComponent(radtonkho)
                    .addComponent(radxuathang)
                    .addComponent(radtdnvbh))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblthang)
                    .addComponent(lblnam)
                    .addComponent(txtnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radtonkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radtonkhoActionPerformed
        // TODO add your handling code here:
        lblthang.setVisible(false);
        lblnam.setVisible(false);
        txtthang.setVisible(false);
        txtnam.setVisible(false);
    }//GEN-LAST:event_radtonkhoActionPerformed

    private void raddoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raddoanhthuActionPerformed
        // TODO add your handling code here:
        if (raddoanhthu.isSelected() == true) {
            txtthang.setText("");
            txtnam.setText("");
            txtthang.requestFocus();
            txtthang.selectAll();
            lblthang.setVisible(true);
            lblnam.setVisible(true);
            txtthang.setVisible(true);
            txtnam.setVisible(true);
        }
    }//GEN-LAST:event_raddoanhthuActionPerformed

    private void radxuathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radxuathangActionPerformed
        // TODO add your handling code here:
        txtthang.setText("");
        txtnam.setText("");
        txtnam.requestFocus();
        txtnam.selectAll();
        txtthang.setVisible(false);
        lblthang.setVisible(false);
        lblnam.setVisible(true);
        txtnam.setVisible(true);
    }//GEN-LAST:event_radxuathangActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (raddoanhthu.isSelected()) {
            Report.number = 3;
            Report.thang = txtthang.getText();
            Report.nam = txtnam.getText();

            try {
                Report.DoanhThu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (radtonkho.isSelected()) {
            Report.number = 1;
            try {
                Report.HangTonKho();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (radxuathang.isSelected()) {
            Report.number = 2;
            Report.nam = txtnam.getText();
            try {
                Report.XuatHang();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(radtdnvbh.isSelected())
        {
            Report.number=4;
            Report.thang=txtthang.getText();
            Report.nam=txtnam.getText();
            try {
                Report.TheoDoiNV();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(BaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radtdnvbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radtdnvbhActionPerformed
        // TODO add your handling code here:
         if (radtdnvbh.isSelected() == true) {
            txtthang.setText("");
            txtnam.setText("");
            txtthang.requestFocus();
            txtthang.selectAll();
            lblthang.setVisible(true);
            lblnam.setVisible(true);
            txtthang.setVisible(true);
            txtnam.setVisible(true);
        }
    }//GEN-LAST:event_radtdnvbhActionPerformed

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
            java.util.logging.Logger.getLogger(BaoCaoThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoCaoThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoCaoThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoCaoThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoCaoThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblnam;
    private javax.swing.JLabel lblthang;
    private javax.swing.JRadioButton raddoanhthu;
    private javax.swing.JRadioButton radtdnvbh;
    private javax.swing.JRadioButton radtonkho;
    private javax.swing.JRadioButton radxuathang;
    private javax.swing.JTextField txtnam;
    private javax.swing.JTextField txtthang;
    // End of variables declaration//GEN-END:variables
}
