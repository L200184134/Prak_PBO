/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modull12.Tugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class TUGAS2 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setBounds(460,200,450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JMenuBar UbahWarna = new JMenuBar();
        JMenu menu = new JMenu("Ubah Warna");
        JMenuItem merah = new JMenuItem("Merah");
        JMenuItem kuning = new JMenuItem("Kuning");
        JMenuItem hijau = new JMenuItem("Hijau");
        

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 500);
        
        merah.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new java.awt.Color(255,0,0));
            }
        });
        
        kuning.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new java.awt.Color(255,255,0));
            }
        });
        
        hijau.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new java.awt.Color(0,255,0));
            }
        });
        
        
        
        
        frame.setLayout(null);
        frame.add(panel);
        frame.setJMenuBar(UbahWarna);
        UbahWarna.add(menu);
        menu.add(merah);
        menu.add(kuning);
        menu.add(hijau);
        
        frame.setVisible(true);
        

        
    }
}
