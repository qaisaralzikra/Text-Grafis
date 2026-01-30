<img width="968" height="528" alt="image" src="https://github.com/user-attachments/assets/55f83b7e-04ff-46bd-9115-2d3a952e1791" />

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_interaktif extends JFrame {

    public Button_interaktif() {
        // Set judul frame
        setTitle("Tombol Interaktif");

        // Set ukuran frame
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Agar frame muncul di tengah layar

        // Buat JLabel
        JLabel label = new JLabel("Halo, Nama Saya!");
        label.setBounds(50, 50, 250, 30);

        // Buat JButton
        JButton button = new JButton("Klik Tombol Ini");
        button.setBounds(50, 100, 200, 30);

        // Tambahkan ActionListener pada tombol
        button.addActionListener(new ActionListener() {
            // Variabel penanda untuk mengecek status klik
            boolean isChanged = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isChanged) {
                    // Perubahan pertama
                    label.setText("Qaisar Al Zikra!");
                    button.setText("Terima Kasih!");
                    isChanged = true;
                } else {
                    // Kembali ke awal
                    label.setText("Halo, Nama Saya!");
                    button.setText("Klik Tombol Ini");
                    isChanged = false;
                }
            }
        });

        // Tambahkan komponen ke frame
        add(label);
        add(button);

        // Set layout menjadi null agar bisa atur posisi manual
        setLayout(null);
    }

    public static void main(String[] args) {
        // Buat objek ButtonActionGUI dan tampilkan
        Button_interaktif frame = new Button_interaktif();
        frame.setVisible(true);
    }

}
