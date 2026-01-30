/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LENOVO ID
 */
public class fromInput {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Form Input Nama");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat label
        JLabel label = new JLabel("Masukkan Nama:");
        label.setBounds(20, 20, 120, 20);
        frame.add(label);

        // Membuat text field
        JTextField textField = new JTextField();
        textField.setBounds(140, 20, 120, 20);
        frame.add(textField);

        // Membuat button
        JButton button = new JButton("Submit");
        button.setBounds(100, 60, 80, 30);
        frame.add(button);

        // Menambahkan action listener untuk button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                JOptionPane.showMessageDialog(frame, "Halo, " + nama + "!");
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }
}
