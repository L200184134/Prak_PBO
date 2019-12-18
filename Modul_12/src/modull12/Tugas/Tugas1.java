/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modull12.Tugas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Tugas1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 1");
        JLabel label = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek jelas dengan mudah");
        String[] isi = {"Sangat tidak setuju", "Tidak setuju", "Kurang setuju", "Setuju", "Sangat Setuju"};
        JComboBox combobox = new JComboBox(isi);
        
        label.setBounds(40, 10, 500, 50);
        combobox.setBounds(140, 60, 200, 25);
        
        frame.add(label);
        frame.add(combobox);
        
        frame.setSize(500, 150);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
