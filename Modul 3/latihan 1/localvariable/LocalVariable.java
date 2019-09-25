/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable;
public class LocalVariable {
    int usia ;
    public void hitungUsia (){
        int usia = 0 ; //LocalVariable
        int tahunSekarang = 2019 ;
        int tahunLahir = 1993 ;
        
        usia = tahunSekarang - tahunLahir ;
        System.out.println("Usia saya : "+ usia);
    }
}