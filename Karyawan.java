/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;
public class Karyawan {
	    String nama;
	    String alamat;
	    String jabatan;
	    double gaji;
	
	    public void tampilkanNama(String beriNama){
	        nama = beriNama;
	        System.out.println("Nama : " + nama);
	    }
	    public void tampilkanJabatan(String beriJabatan) {
	        jabatan = beriJabatan;
	        System.out.println("Jabatan : " + jabatan);
	    }
	    public void tampilkanAlamat(String beriAlamat) {
	        alamat = beriAlamat;
	        System.out.println("Alamat : " + alamat);
	    }
	    public void tampilkanGaji(double beriGaji) {
	        gaji = beriGaji;
	        System.out.println("Gaji : Rp. " + gaji);
	    }
	    public static void main(String[] args) {
	        Karyawan karyawan = new Karyawan();
	        karyawan.tampilkanNama("Mahardhika");
	        karyawan.tampilkanJabatan("Sekretaris");
	        karyawan.tampilkanAlamat("Purwakarta");
	        karyawan.tampilkanGaji(10000000);
	    }
	}

