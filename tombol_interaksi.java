/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author LENOVO ID
 */
import javax.swing.*;

public class tombol_interaksi extends JFrame {

    public tombol_interaksi() {
        // Set judul frame
        setTitle("Hello NetBeans GUI");

        // Set ukuran frame
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Agar frame muncul di tengah layar

        // Buat JLabel
        JLabel label = new JLabel("Hello NetBeans GUI");
        label.setBounds(50, 50, 200, 30); // (x, y, width, height)

        // Buat JButton
        JButton button = new JButton("Klik Saya");
        button.setBounds(50, 100, 200, 30);

        // Tambahkan komponen ke frame
        add(label);
        add(button);

        // Set layout menjadi null agar bisa atur posisi manual
        setLayout(null);
    }

    public static void main(String[] args) {
        // Buat objek HelloGUI dan tampilkan
        tombol_interaksi frame = new tombol_interaksi();
        frame.setVisible(true);
    }
}
