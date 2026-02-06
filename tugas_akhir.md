<img width="450" height="290" alt="image" src="https://github.com/user-attachments/assets/afb77ae1-579f-4d2a-ac6b-e8b4d1bb7ee4" />
<img width="433" height="269" alt="image" src="https://github.com/user-attachments/assets/51c297ba-d3e9-4303-826d-9be06190bddf" />
<img width="437" height="275" alt="image" src="https://github.com/user-attachments/assets/969eebcc-5ca2-4acc-b902-a3805e038d57" />
<img width="433" height="258" alt="image" src="https://github.com/user-attachments/assets/c3375223-549f-42de-9a08-7be55336577c" />

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
public class Tugas_akhir {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Login Sederhana");
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 30, 100, 25);
        frame.add(lblUser);

        JTextField txtUser = new JTextField();
        txtUser.setBounds(130, 30, 150, 25);
        frame.add(txtUser);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 70, 100, 25);
        frame.add(lblPass);

        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(130, 70, 150, 25);
        frame.add(txtPass);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(130, 110, 80, 30);
        frame.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUser.getText();
                String password = String.valueOf(txtPass.getPassword());

                if (username.equals("admin") && password.equals ("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Berhasil");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login Gagal", "Peringatan", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
