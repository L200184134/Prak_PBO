/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modull12;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Win10
 */
public class DemRadioButton {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(1000, 100);
        
        JRadioButton[] teams = new JRadioButton[4];
        teams [0] = new JRadioButton("Sangat tidak setuju");
        teams [1] = new JRadioButton("Tidak setuju");
        teams [2] = new JRadioButton("Kurang setuju");
        teams [3] = new JRadioButton("Setuju", true);
        teams [3] = new JRadioButton("Sangat setuju");
        
        JPanel panel = new JPanel();
        JLabel Pernyataan = new JLabel("Modul Praktikum PBO");
        panel.add(Pernyataan);
        
        ButtonGroup group = new ButtonGroup();
        for(int i = 0; i<teams.length; i++){
            group.add(teams[i]);
            panel.add(teams[i]);
        }
        
        u.add(panel);
        u.setVisible(true);
    }
}
