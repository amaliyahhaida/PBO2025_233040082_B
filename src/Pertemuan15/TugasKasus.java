package Pertemuan15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Tugas Kasus 2-1
class TugasKasus extends JFrame {
    private JTextField txt1, txt2;
    private JButton btnJumlah;
    
    public TugasKasus() {
        initComponents();
        setupLayout();
        setupEventHandlers();
    }
    
    private void initComponents() {
        setTitle("Kasus 2-1");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        // TextField pertama
        txt1 = new JTextField();
        txt1.setBounds(20, 20, 150, 25);
        txt1.setText("5"); // nilai default seperti di gambar
        
        // TextField kedua  
        txt2 = new JTextField();
        txt2.setBounds(20, 50, 150, 25);
        txt2.setText("7"); // nilai default seperti di gambar
        
        // Button Jumlah
        btnJumlah = new JButton("Jumlah");
        btnJumlah.setBounds(20, 80, 150, 25);
    }
    
    private void setupLayout() {
        add(txt1);
        add(txt2);
        add(btnJumlah);
    }
    
    private void setupEventHandlers() {
        btnJumlah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hitungJumlah();
            }
        });
    }
    
    private void hitungJumlah() {
        try {
            int angka1 = Integer.parseInt(txt1.getText());
            int angka2 = Integer.parseInt(txt2.getText());
            int hasil = angka1 + angka2;
            
            tampilkanHasil(hasil);
        } catch (NumberFormatException ex) {
            tampilkanError("Input harus berupa angka!");
        }
    }
    
    private void tampilkanHasil(int hasil) {
        JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void tampilkanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void tampilkan() {
        setVisible(true);
    }
}

