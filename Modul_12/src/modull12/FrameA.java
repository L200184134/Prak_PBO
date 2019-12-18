/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modull12;

import java.awt.Container;
import javax.swing.JButton;
public class FrameA extends javax.swing.JFrame{
    public FrameA(){
        super("Frme and Button");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        FrameA fa = new FrameA();
        Container kontainer = fa.getContentPane();
        JButton jbtOK = new JButton("OK");
        kontainer.add(jbtOK);
    }
}
