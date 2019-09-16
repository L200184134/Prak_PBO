/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
public class Mahasiswa {
	    String nama;
	    String nim;
	    String alamat;
	    int semester;
	
	    public void tampilkanNama(String beriNama){
	        nama = beriNama;
	        System.out.println("Nama : " + nama);
	    }
	    public void tampilkanNim(String beriNim) {
	        nim = beriNim;
	        System.out.println("NIM : " + nim);
	    }
	    public void tampilkanAlamat(String beriAlamat) {
	        alamat = beriAlamat;
	        System.out.println("Alamat : " + alamat);
	    }
	    public void tampilkanSemester(int beriSemester) {
	        semester = beriSemester;
	        System.out.println("Semester : " + semester);
	    }
	    public static void main(String[] args) {
	        Mahasiswa mahasiswa = new Mahasiswa();
	        mahasiswa.tampilkanNama("Mahardhika");
	        mahasiswa.tampilkanNim("L200184134");
	        mahasiswa.tampilkanAlamat("Purwakarta");
	        mahasiswa.tampilkanSemester(3);
	    }
	}

