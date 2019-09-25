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
    public void beratBadan(){
        int beratBadan ;
        int beratLahir = 8 ;
        
        beratBadan = beratLahir + (usia/2);
        System.out.println("Berat badan : "+beratBadan+" kg");
    }
    public static void main(String[] args) {
        LocalVariable object = new LocalVariable ();
        object.hitungUsia();
        object.beratBadan();
    }
    
}

/* answer
we can get the output of beratBadan, because variable of usia has 2 variable. 
the first is global and the second is local. so value of usia can be called by other method*/