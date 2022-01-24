/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaspbo2.uas_pbo2_19710116;

import java.net.UnknownHostException;
import javax.mail.MessagingException;

/**
 *
 * @author mikah
 */
public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public HalamanUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
    MobilView mobilView = new MobilView();
    PembeliView pembeliView = new PembeliView();
    PembelianView pembelianView = new PembelianView();
    public static String title = "Anugrah Bersama Motor";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mKeluar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mMobil = new javax.swing.JMenuItem();
        mPembeli = new javax.swing.JMenuItem();
        mPenjualan = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANUGRAH BERSAMA MOTOR");
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<h1 style=\"text-align:center\">SELAMAT DATANG DI APLIKASI<br/>ANUGRAH BERSAMA MOTOR</h1></html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panelMain.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        mKeluar.setText("Aplikasi");

        jMenuItem1.setText("Keluar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mKeluar.add(jMenuItem1);

        jMenuBar1.add(mKeluar);

        jMenu2.setText("Data");

        mMobil.setText("Mobil");
        mMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMobilActionPerformed(evt);
            }
        });
        jMenu2.add(mMobil);

        mPembeli.setText("Pembeli");
        mPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPembeliActionPerformed(evt);
            }
        });
        jMenu2.add(mPembeli);

        jMenuBar1.add(jMenu2);

        mPenjualan.setText("Entry");

        jMenuItem4.setText("Penjualan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mPenjualan.add(jMenuItem4);

        jMenuBar1.add(mPenjualan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMobilActionPerformed
        panelMain.remove(mobilView);
        panelMain.add(mobilView);
        mobilView.setVisible(true);
    }//GEN-LAST:event_mMobilActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPembeliActionPerformed
        panelMain.remove(pembeliView);
        panelMain.add(pembeliView);
        pembeliView.setVisible(true);
    }//GEN-LAST:event_mPembeliActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        panelMain.remove(pembelianView);
        panelMain.add(pembelianView);
        pembelianView.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     * @throws javax.mail.MessagingException
     * @throws java.net.UnknownHostException
     */
    public static void main(String args[]) throws MessagingException, UnknownHostException {
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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EmailGenerator.sendMail("mikahikaai@gmail.com");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu mKeluar;
    private javax.swing.JMenuItem mMobil;
    private javax.swing.JMenuItem mPembeli;
    private javax.swing.JMenu mPenjualan;
    private javax.swing.JDesktopPane panelMain;
    // End of variables declaration//GEN-END:variables
}
