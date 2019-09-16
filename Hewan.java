/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

public class Hewan {
    String nama ;
    int kaki;
    String makanan;
    String type;
    
    public static void main (String[] args){
        Hewan hewan1 = new Hewan();
        hewan1.beriNama("Harimau");
        hewan1.jumlahKaki(4);
        hewan1.jenisMakanan("Daging");
        hewan1.beriType("Karnivora");
        hewan1.infoHewan();
        
        Hewan hewan2 = new Hewan();
        hewan2.beriNama("Kerbau");
        hewan2.jumlahKaki(4);
        hewan2.jenisMakanan("Rumput");
        hewan2.beriType("Karnivora");
        hewan2.infoHewan();
    }
    
    void beriNama (String namaHewan){
        nama = namaHewan;
    }
    void jumlahKaki (int kakiHewan){
        kaki = kakiHewan;
    }
    void jenisMakanan (String makananHewan){
        makanan = makananHewan;
    }
    void beriType(String typeHewan){
        type = typeHewan;
    }
    void infoHewan(){
        System.out.println(
                "Nama Hewan : "+nama+ "\n" +
                "Jumlah Kaki : "+kaki+ "\n"+
                "Jenis Makanan : "+makanan+"\n"+
                "Type Hewan : "+type+"\n"
        );
    }
    
}