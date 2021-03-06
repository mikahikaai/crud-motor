/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uaspbo2.uas_pbo2_19710116;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author mikah
 */
public class PembeliView extends javax.swing.JInternalFrame {

    /**
     * Creates new form MobilView
     */
    public PembeliView() {
        initComponents();
        ulang();
    }

    PreparedStatement pst;
    ResultSet rs;
    Connection conn = new Koneksi().getKoneksi();
    String id, sql;

    private void ulang() {
        eKtp.setText("");
        eNama.setText("");
        mAlamat.setText("");
        eTelp.setText("");
        eEmail.setText("");
        eCari.setText("");
        tampilData();
        bSimpan.setEnabled(true);
        bUbah.setEnabled(false);
        bHapus.setEnabled(false);
        id = "";
    }

    private void tampilData() {
        try {
            String[] judul = {"ID", "No. KTP", "Nama Lengkap", "Alamat", "No. Telp", "Email"};
            DefaultTableModel dtm = new DefaultTableModel(null, judul);
            tPembeli.setModel(dtm);
            tPembeli.getColumnModel().getColumn(0).setPreferredWidth(5);

            if (eCari.getText().isEmpty()) {
                sql = "select * from pembeli";
                pst = conn.prepareStatement(sql);
            } else {
                sql = "select * from pembeli where nama_lengkap like '%" + eCari.getText() + "%'";
                pst = conn.prepareStatement(sql);
            }
            rs = pst.executeQuery();
            while (rs.next()) {
                String[] data = {rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                dtm.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eKtp = new javax.swing.JTextField();
        eNama = new javax.swing.JTextField();
        eTelp = new javax.swing.JTextField();
        eEmail = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPembeli = new javax.swing.JTable();
        bKeluar = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        eCari = new javax.swing.JTextField();
        bCetak = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mAlamat = new javax.swing.JTextArea();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM PEMBELI");

        jLabel2.setText("No. KTP");

        jLabel3.setText("Nama Lengkap");

        jLabel4.setText("Alamat");

        jLabel5.setText("No. Telp");

        jLabel7.setText("Email");

        eEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eEmailFocusLost(evt);
            }
        });
        eEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eEmailKeyPressed(evt);
            }
        });

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        tPembeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "No. KTP", "Nama Lengkap", "Alamat", "No. Telp", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tPembeli.getTableHeader().setReorderingAllowed(false);
        tPembeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPembeliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tPembeli);
        if (tPembeli.getColumnModel().getColumnCount() > 0) {
            tPembeli.getColumnModel().getColumn(0).setResizable(false);
            tPembeli.getColumnModel().getColumn(0).setPreferredWidth(10);
            tPembeli.getColumnModel().getColumn(1).setResizable(false);
            tPembeli.getColumnModel().getColumn(2).setResizable(false);
            tPembeli.getColumnModel().getColumn(3).setResizable(false);
            tPembeli.getColumnModel().getColumn(4).setResizable(false);
            tPembeli.getColumnModel().getColumn(5).setResizable(false);
        }

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        jLabel9.setText("Cari Pelanggan");

        eCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eCariKeyReleased(evt);
            }
        });

        bCetak.setText("Cetak");
        bCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetakActionPerformed(evt);
            }
        });

        mAlamat.setColumns(20);
        mAlamat.setLineWrap(true);
        mAlamat.setRows(5);
        mAlamat.setWrapStyleWord(true);
        jScrollPane2.setViewportView(mAlamat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bSimpan)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eNama)
                                    .addComponent(eKtp))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(67, 67, 67))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bUbah)
                                        .addGap(18, 18, 18)
                                        .addComponent(bHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(eCari)
                            .addComponent(eTelp))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(bReset)
                        .addGap(18, 18, 18)
                        .addComponent(bCetak)
                        .addGap(18, 18, 18)
                        .addComponent(bKeluar)
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eKtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(eTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(eEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(eCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bKeluar)
                        .addComponent(bCetak)
                        .addComponent(bReset))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bSimpan)
                        .addComponent(bUbah)
                        .addComponent(bHapus)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        if (eKtp.getText().isEmpty() || eNama.getText().isEmpty() || mAlamat.getText().isEmpty()
                || eTelp.getText().isEmpty() || eEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field Belum Terisi Lengkap");
        } else {
            try {
                sql = "insert into pembeli values (?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, null);
                pst.setString(2, eKtp.getText());
                pst.setString(3, eNama.getText());
                pst.setString(4, mAlamat.getText());
                pst.setString(5, eTelp.getText());
                pst.setString(6, eEmail.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                ulang();
            } catch (SQLException ex) {
                Logger.getLogger(PembeliView.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void eCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eCariKeyReleased
        tampilData();
    }//GEN-LAST:event_eCariKeyReleased

    private void tPembeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPembeliMouseClicked
        int baris = tPembeli.getSelectedRow();
        id = tPembeli.getValueAt(baris, 0).toString();
        if (!id.isEmpty()) {
            eKtp.setText(tPembeli.getValueAt(baris, 1).toString());
            eNama.setText(tPembeli.getValueAt(baris, 2).toString());
            mAlamat.setText(tPembeli.getValueAt(baris, 3).toString());
            eTelp.setText(tPembeli.getValueAt(baris, 4).toString());
            eEmail.setText(tPembeli.getValueAt(baris, 5).toString());
            bSimpan.setEnabled(false);
            bUbah.setEnabled(true);
            bHapus.setEnabled(true);
        }
    }//GEN-LAST:event_tPembeliMouseClicked

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        ulang();
    }//GEN-LAST:event_bResetActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        int konf = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?",
                "HAPUS DATA", JOptionPane.YES_NO_OPTION);
        if (konf == 0) {
            try {
                sql = "delete from pembeli where id=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                ulang();
            } catch (SQLException ex) {
                Logger.getLogger(PembeliView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        dispose();
        ulang();
    }//GEN-LAST:event_bKeluarActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        int konf = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?",
                "UBAH DATA", JOptionPane.YES_NO_OPTION);
        if (konf == 0) {
            try {
                sql = "update pembeli set no_ktp=?, nama_lengkap=?, alamat=?, no_telp=?, email=? where id=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, eKtp.getText());
                pst.setString(2, eNama.getText());
                pst.setString(3, mAlamat.getText());
                pst.setString(4, eTelp.getText());
                pst.setString(5, eEmail.getText());
                pst.setString(6, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                ulang();
            } catch (SQLException ex) {
                Logger.getLogger(PembeliView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bUbahActionPerformed

    private void eEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eEmailKeyPressed

    }//GEN-LAST:event_eEmailKeyPressed

    private void eEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eEmailFocusLost
        
    }//GEN-LAST:event_eEmailFocusLost

    private void bCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetakActionPerformed
        try {
            JasperPrint jp=JasperFillManager.fillReport(getClass().getResourceAsStream("/report/rPembeli.jasper"), null, conn);
            JasperViewer.viewReport(jp,false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bUbah;
    private javax.swing.JTextField eCari;
    private javax.swing.JTextField eEmail;
    private javax.swing.JTextField eKtp;
    private javax.swing.JTextField eNama;
    private javax.swing.JTextField eTelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mAlamat;
    private javax.swing.JTable tPembeli;
    // End of variables declaration//GEN-END:variables
}
