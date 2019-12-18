/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modull12;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DemoTextField {
    public static void main(String[] args) {
        Utama u = new Utama();
        JLabel nama = new JLabel("Nama : ");
        JLabel password = new JLabel("Password : ");
        JTextField inputNama = new JTextField(15);
        JPasswordField inputpsw = new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputpsw);
        u.add(panel);
    }
}
