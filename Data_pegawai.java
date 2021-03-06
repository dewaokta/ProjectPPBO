/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Data_pegawai extends javax.swing.JFrame {

    /**
     * Creates new form Data_pegawai
     */
    public void LoginFrame() {
// ... code lainnya
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }
//code-code yang lain
    private void load_table() {
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO");
        model.addColumn("Id Pegawai");
        model.addColumn("Nama Pegawai");
        model.addColumn("Jenis Kelamin");

        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "SELECT * FROM pegawai";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{ no++,res.getString(1), 
                    res.getString(2), res.getString(3)});
            }
            table_pegawai.setModel(model);
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }
    public Data_pegawai() {
        initComponents();
        load_table();
        LoginFrame();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pegawai = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_pegawai = new javax.swing.JTextField();
        nama_pegawai = new javax.swing.JTextField();
        jenis_kelamin = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("DATA PEGAWAI");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 100, 320, 34);

        table_pegawai.setBackground(new java.awt.Color(153, 255, 204));
        table_pegawai.setForeground(new java.awt.Color(0, 0, 102));
        table_pegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_pegawai);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(680, 70, 840, 510);

        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Id Pegawai");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 230, 78, 20);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(718, 151, 0, 0);

        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Nama pegawai");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 280, 104, 20);

        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 330, 96, 20);
        jPanel1.add(id_pegawai);
        id_pegawai.setBounds(210, 230, 450, 26);
        jPanel1.add(nama_pegawai);
        nama_pegawai.setBounds(210, 280, 450, 26);
        jPanel1.add(jenis_kelamin);
        jenis_kelamin.setBounds(210, 330, 450, 26);

        btn_tambah.setText("Tambahkan Pegawai");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah);
        btn_tambah.setBounds(199, 370, 180, 29);

        btn_hapus.setText("Berhentikan Pegawai");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus);
        btn_hapus.setBounds(390, 370, 179, 29);

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(577, 370, 80, 29);

        jButton2.setText("Kembali Ke Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 550, 153, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/desain_all.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1, 0, 1550, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        try{
            String sql="INSERT INTO pegawai VALUES ('"+id_pegawai.getText()+"',"
                    +"'"+nama_pegawai.getText()+"',"
                    +"'"+jenis_kelamin.getText()+"')";
                   
            
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
         try {
            String sql ="delete from pegawai where id_pegawai ='"+id_pegawai.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table_pegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pegawaiMouseClicked
        // TODO add your handling code here:
        int baris = table_pegawai.rowAtPoint(evt.getPoint());
        
        String absensi = table_pegawai.getValueAt(baris,1).toString();
        id_pegawai.setText(absensi);
        String id = table_pegawai.getValueAt(baris,2).toString();
        nama_pegawai.setText(id);
        String nama =table_pegawai.getValueAt(baris, 3).toString();
        jenis_kelamin.setText(nama);
        
        
    }//GEN-LAST:event_table_pegawaiMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_pegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JTextField id_pegawai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis_kelamin;
    private javax.swing.JTextField nama_pegawai;
    private javax.swing.JTable table_pegawai;
    // End of variables declaration//GEN-END:variables
}
