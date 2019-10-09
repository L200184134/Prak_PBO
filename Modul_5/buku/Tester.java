/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author USER
 */
public class Tester {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.info();
        Buku buku2 = new Buku("Kyth", "Arts and Words");
        Buku buku3 = new Buku("Lizabeth", "Sistem Operasi");
        Buku buku4 = new Buku("Permrograman Berorientasi Objek", 2018);
        Buku buku5 = new Buku("Algoritma dan Pemrograman", 2017);
        Buku buku6 = new Buku(2017, 2);
        Buku buku7 = new Buku(2016, 3);
        Buku buku8 = new Buku(1, 75000.00);
        Buku buku9 = new Buku(2, 100000.00);
        Buku buku10 = new Buku("Sistem Operasi", 2016);
    }
}
