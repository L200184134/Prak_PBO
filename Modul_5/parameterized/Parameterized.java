/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterized;

/**
 *
 * @author USER
 */
public class Parameterized {
    String nama, nim;
    int semester;

    public Parameterized(String nama, int semester, String nim) {
        this.nama = nama;
        this.semester = semester;
        this.nim = nim;
    }

    public void info() {
        System.out.println("Nama : " + nama + "\nNim : " + nim + "\nSemester : " + semester);
    }
}
