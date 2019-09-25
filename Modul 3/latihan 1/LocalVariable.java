/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable;
public class LocalVariable {
    public void hitungUsia (){
        int usia = 0 ; //LocalVariable
        int tahunSekarang = 2019 ;
        int tahunLahir = 1993 ;
        
        usia = tahunSekarang - tahunLahir ;
        System.out.println("Usia saya : "+ usia);
    }
    public void beratBadan(){
        int beratBadan ;
        int beratLahir = 8 ;
        
        beratBadan = beratLahir + (usia/2);
    }
    public static void main(String[] args) {
        LocalVariable object = new LocalVariable ();
        object.hitungUsia();
        object.beratBadan();
    }
    
}

/* answer
we cannot call the usia, because usia is localvariable of hitungUsia*/