/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        NestedClass nested = new NestedClass();
        nested.printNama();
        NestedClass.InnerClass inner = nested.new InnerClass();
        System.out.println(inner.getJurusan());
    }
}