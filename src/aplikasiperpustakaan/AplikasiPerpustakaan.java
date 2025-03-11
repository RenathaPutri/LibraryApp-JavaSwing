package aplikasiperpustakaan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class AplikasiPerpustakaan {

    public static void main(String[] args) {
        // ============ BAGIAN CONTAINER ============
        JFrame form = new JFrame("Aplikasi Perpustakaan");
        form.setSize(400, 550);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        
        // Mengubah background form
        form.getContentPane().setBackground(new Color(240, 248, 255)); // warna biru muda
        
        // Font untuk label dan tombol
        Font fontJudul = new Font("Arial", Font.BOLD, 18);
        Font fontLabel = new Font("Arial", Font.PLAIN, 14);
        Font fontButton = new Font("Arial", Font.PLAIN, 14);
        
        // ============ BAGIAN COMPONENT ==========
        JLabel labelJudul = new JLabel("Aplikasi Perpustakaan");
        labelJudul.setBounds(100, 20, 250, 30);
        labelJudul.setFont(fontJudul);
        labelJudul.setForeground(new Color(0, 128, 128)); // warna hijau kebiruan
        form.add(labelJudul);
        
        // bagian kode buku
        JLabel labelKodeBuku = new JLabel("Kode Buku");
        labelKodeBuku.setBounds(20, 80, 150, 25);
        labelKodeBuku.setFont(fontLabel);
        form.add(labelKodeBuku);
        JTextField txtKodeBuku = new JTextField();
        txtKodeBuku.setBounds(150, 80, 200, 25);
        txtKodeBuku.setBorder(new LineBorder(new Color(0, 128, 128), 1)); // border warna hijau kebiruan
        form.add(txtKodeBuku);
        
        // bagian nama buku
        JLabel labelNamaBuku = new JLabel("Nama Buku");
        labelNamaBuku.setBounds(20, 110, 150, 25);
        labelNamaBuku.setFont(fontLabel);
        form.add(labelNamaBuku);
        JTextField txtNamaBuku = new JTextField();
        txtNamaBuku.setBounds(150, 110, 200, 25);
        txtNamaBuku.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(txtNamaBuku);
        
        // bagian membership
        JLabel labelMembership = new JLabel("Membership");
        labelMembership.setBounds(20, 140, 150, 25);
        labelMembership.setFont(fontLabel);
        form.add(labelMembership);
        
        JRadioButton radioEksklusif = new JRadioButton("Eksklusif");
        radioEksklusif.setBounds(150, 140, 80, 25);
        radioEksklusif.setBackground(new Color(240, 248, 255)); // warna background yang sama dengan form
        radioEksklusif.setFont(fontLabel);
        form.add(radioEksklusif);
        
        JRadioButton radioUmum = new JRadioButton("Umum");
        radioUmum.setBounds(230, 140, 80, 25);
        radioUmum.setBackground(new Color(240, 248, 255));
        radioUmum.setFont(fontLabel);
        form.add(radioUmum);
        
        ButtonGroup groupMembership = new ButtonGroup();
        groupMembership.add(radioEksklusif);
        groupMembership.add(radioUmum);
        
        // bagian biaya per hari
        JLabel labelBiaya = new JLabel("Biaya per Hari");
        labelBiaya.setBounds(20, 170, 150, 25);
        labelBiaya.setFont(fontLabel);
        form.add(labelBiaya);
        JTextField txtBiaya = new JTextField();
        txtBiaya.setBounds(150, 170, 200, 25);
        txtBiaya.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(txtBiaya);
        
        // bagian tanggal pinjam 
        JLabel labelTanggalPinjam = new JLabel("Tanggal Pinjam");
        labelTanggalPinjam.setBounds(20, 200, 150, 25);
        labelTanggalPinjam.setFont(fontLabel);
        form.add(labelTanggalPinjam);
        
        JComboBox<String> cbHari = new JComboBox<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", 
            "28", "29", "30", "31"});
        cbHari.setBounds(150, 200, 50, 25);
        cbHari.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(cbHari);
        
        JComboBox<String> cbBulan = new JComboBox<>(new String[]{"Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", 
            "Ags", "Sep", "Okt", "Nov", "Des"});
        cbBulan.setBounds(210, 200, 65, 25);
        cbBulan.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(cbBulan);
        
        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(280, 200, 70, 25);
        txtTahun.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(txtTahun);
        
        // bagian lama pinjam 
        JLabel labelLamaPinjam = new JLabel("Lama Pinjam");
        labelLamaPinjam.setBounds(20, 230, 150, 25);
        labelLamaPinjam.setFont(fontLabel);
        form.add(labelLamaPinjam);
        
        JComboBox<String> cblamaPinjam = new JComboBox<>(new String[]{"1", "2", "3", "4", "5", "6", "7"});
        cblamaPinjam.setBounds(150, 230, 70, 25);
        cblamaPinjam.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(cblamaPinjam);
        
        // bagian total biaya
        JLabel labelTotalBiaya = new JLabel("Total Biaya");
        labelTotalBiaya.setBounds(20, 260, 150, 25);     
        labelTotalBiaya.setFont(fontLabel);
        form.add(labelTotalBiaya);
        JTextField txtTotalBiaya = new JTextField();
        txtTotalBiaya.setBounds(150, 260, 200, 25);
        txtTotalBiaya.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(txtTotalBiaya);
        
        // bagian jumlah bayar
        JLabel labelJumlahBayar = new JLabel("Jumlah Bayar");
        labelJumlahBayar.setBounds(20, 290, 150, 25);
        labelJumlahBayar.setFont(fontLabel);
        form.add(labelJumlahBayar);
        JTextField txtJumlahBayar = new JTextField();
        txtJumlahBayar.setBounds(150, 290, 200, 25);
        txtJumlahBayar.setBorder(new LineBorder(new Color(0, 128, 128), 1));
        form.add(txtJumlahBayar);
        
        // bagian kembalian
        JLabel labelKembalian = new JLabel("Kembalian");
        labelKembalian.setBounds(20, 320, 150, 25);
        labelKembalian.setFont(fontLabel);
        form.add(labelKembalian);
        JTextField txtKembalian = new JTextField();
        txtKembalian.setBounds(150, 320, 200, 25);
        txtKembalian.setBorder(new LineBorder(new Color(0, 128, 128), 1)); //memberi warna outline
        form.add(txtKembalian);
        
        // bagian button simpan
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(100, 370, 85, 30);
        btnSimpan.setFont(fontButton);
        btnSimpan.setBackground(new Color(0, 128, 128)); // warna hijau kebiruan
        btnSimpan.setForeground(Color.WHITE); // warna teks putih
        form.add(btnSimpan);
        
        // bagian button reset
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(200, 370, 85, 30);
        btnReset.setFont(fontButton);
        btnReset.setBackground(new Color(255, 69, 0)); // warna oranye
        btnReset.setForeground(Color.WHITE); // warna teks putih
        form.add(btnReset);
        
        // Menambahkan ActionListener ke tombol Simpan
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aksi untuk tombol simpan
                String kodeBuku = txtKodeBuku.getText();
                String namaBuku = txtNamaBuku.getText();
                String membership = radioEksklusif.isSelected() ? "Eksklusif" : "Umum";
                String biayaPerHari = txtBiaya.getText();
                String tanggalPinjam = cbHari.getSelectedItem() + "-" + cbBulan.getSelectedItem() + "-" + txtTahun.getText();
                String lamaPinjam = cblamaPinjam.getSelectedItem().toString();
                String totalBiaya = txtTotalBiaya.getText();
                String jumlahBayar = txtJumlahBayar.getText();
                String kembalian = txtKembalian.getText();
                
                // Menampilkan data input ke dialog
                JOptionPane.showMessageDialog(null, "Data Disimpan:\n" +
                        "Kode Buku: " + kodeBuku + "\n" +
                        "Nama Buku: " + namaBuku + "\n" +
                        "Membership: " + membership + "\n" +
                        "Biaya per Hari: " + biayaPerHari + "\n" +
                        "Tanggal Pinjam: " + tanggalPinjam + "\n" +
                        "Lama Pinjam: " + lamaPinjam + "\n" +
                        "Total Biaya: " + totalBiaya + "\n" +
                        "Jumlah Bayar: " + jumlahBayar + "\n" +
                        "Kembalian: " + kembalian
                );
            }
        });

        // Menambahkan ActionListener ke tombol Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengosongkan semua field input
                txtKodeBuku.setText("");
                txtNamaBuku.setText("");
                groupMembership.clearSelection();
                txtBiaya.setText("");
                cbHari.setSelectedIndex(0);
                cbBulan.setSelectedIndex(0);
                txtTahun.setText("");
                cblamaPinjam.setSelectedIndex(0);
                txtTotalBiaya.setText("");
                txtJumlahBayar.setText("");
                txtKembalian.setText("");
            }
        });

        // menampilkan form
        form.setVisible(true);
    }
}