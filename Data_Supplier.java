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
public class Data_Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Data_Supplier
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
        model.addColumn("Id Supplier");
        model.addColumn("Kode Obat");
        model.addColumn("Nama Supplier");
        model.addColumn("Alamat Supplier");
       
        

        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "SELECT * FROM supplier";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{ no++,res.getString(1), 
                    res.getString(2), res.getString(3), res.getString(4)});
            }
            table_supplier.setModel(model);
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }
    public Data_Supplier() {
        initComponents();
        load_table();
        KosongForm();
        LoginFrame();
    }
    public void KosongForm(){
        id_supplier.setEditable(true);
        nama_supplier.setText(null);
        alamat_supplier.setText(null);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_supplier = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_supplier = new javax.swing.JTextField();
        nama_supplier = new javax.swing.JTextField();
        alamat_supplier = new javax.swing.JTextField();
        kode_obat = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        table_supplier.setBackground(new java.awt.Color(153, 255, 204));
        table_supplier.setForeground(new java.awt.Color(0, 0, 102));
        table_supplier.setModel(new javax.swing.table.DefaultTableModel(
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
        table_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_supplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_supplier);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(679, 69, 840, 520);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Id Supplier");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 200, 78, 20);

        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Kode Obat");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 240, 74, 20);

        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Alamat Supplier");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 320, 113, 20);
        jPanel1.add(id_supplier);
        id_supplier.setBounds(220, 200, 430, 26);
        jPanel1.add(nama_supplier);
        nama_supplier.setBounds(220, 280, 430, 26);

        alamat_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamat_supplierActionPerformed(evt);
            }
        });
        jPanel1.add(alamat_supplier);
        alamat_supplier.setBounds(220, 320, 430, 26);

        kode_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_obatActionPerformed(evt);
            }
        });
        jPanel1.add(kode_obat);
        kode_obat.setBounds(220, 240, 430, 26);

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan);
        btn_simpan.setBounds(205, 370, 90, 29);

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit);
        btn_edit.setBounds(310, 370, 60, 29);

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus);
        btn_hapus.setBounds(380, 370, 80, 29);

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batal);
        btn_batal.setBounds(470, 370, 85, 29);

        btn_keluar.setText("Keluar");
        jPanel1.add(btn_keluar);
        btn_keluar.setBounds(565, 370, 80, 29);

        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Nama Supplier");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 280, 104, 20);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("DATA SUPPLIER");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 100, 325, 41);

        jButton1.setText("Kembali ke Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 560, 153, 29);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/desain_all.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1, 0, 1580, 660);

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 240, 51, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamat_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamat_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamat_supplierActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed

        // TODO add your handling code here:
        try{
            String sql="INSERT INTO supplier VALUES ('"+id_supplier.getText()+"',"
                    +"'"+kode_obat.getText()+"',"
                    +"'"+nama_supplier.getText()+"',"
                    +"'"+alamat_supplier.getText()+"')";
                   
            
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="delete from supplier where id_supplier ='"+id_supplier.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

        // TODO add your handling code here:
        try {
            String sql ="UPDATE supplier SET id_supplier = '"+id_supplier.getText()
                    +"', kode_obat = '"+kode_obat.getText()
                    +"', nama_supplier= '"+nama_supplier.getText()
                    +"',alamat_supplier = '"+alamat_supplier.getText()
                    +"'WHERE id_supplier = '"+id_supplier.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
    }//GEN-LAST:event_btn_editActionPerformed

    private void table_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_supplierMouseClicked
        // TODO add your handling code here:
         int baris = table_supplier.rowAtPoint(evt.getPoint());
        
        String id = table_supplier.getValueAt(baris,1).toString();
        id_supplier.setText(id);
        String id1 = table_supplier.getValueAt(baris,2).toString();
        kode_obat.setText(id1);
        String nama = table_supplier.getValueAt(baris,3).toString();
        nama_supplier.setText(nama);
        String alamat =table_supplier.getValueAt(baris, 4).toString();
        alamat_supplier.setText(alamat);
    }//GEN-LAST:event_table_supplierMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        KosongForm();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kode_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_obatActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_supplier;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextField id_supplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode_obat;
    private javax.swing.JTextField nama_supplier;
    private javax.swing.JTable table_supplier;
    // End of variables declaration//GEN-END:variables
}