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
public class Buku {
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;

    public Buku() {
        namaPengarang = "Mahardhika B.D.Z";
        judulBuku = "Maharuchika";
        tahunTerbit = 2019;
        cetakanKe = 1;
        hargaJual = 999000.00;
    }

    public Buku(String namaPengarang, String judulBuku) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        System.out.println("Nama Pengarang : " + namaPengarang);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println();
    }

    public Buku(String judulBuku, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        System.out.println("Judul Buku = " + judulBuku);
        System.out.println("Tahun Terbit = " + tahunTerbit);
        System.out.println();
    }

    public Buku(int tahunTerbit, int cetakanKe) {
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Cetakan Ke : " + cetakanKe);
        System.out.println();
    }

    public Buku(int cetakanKe, double hargaJual) {
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
        System.out.println("Cetakan Ke : " + cetakanKe);
        System.out.println("Harga Jual : " + hargaJual);
        System.out.println();
    }

    public void info() {
        System.out.println("Nama Pengarang : " + namaPengarang);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Cetakan ke : " + cetakanKe);
        System.out.println("Harga Jual : " + hargaJual);
        System.out.println();
    }
}
