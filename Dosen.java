/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosen;
public class Dosen {
	    String nama;
	    int nik;
	    String pendidikan;
	    String tglLahir;
	
	    public void tampilkanNama(String beriNama){
	        nama = beriNama;
	        System.out.println("Nama : " + nama);
	    }
	    public void tampilkanTglLahir(String beriTanggal) {
	        tglLahir = beriTanggal;
	        System.out.println("Tanggal Lahir : " + tglLahir);
	    }
	    public void tampilkanNik(int beriNik) {
	        nik = beriNik;
	        System.out.println("NIK : " + nik);
	    }
	
	    public static void main(String[] args) {
	        Dosen dosen = new Dosen();
	        dosen.tampilkanNama("Mahardhika");
	        dosen.tampilkanTglLahir("12 Agustus 2000");
	        dosen.tampilkanNik(89023);
	    }
	}
