package latihan2;
public class Buku {
    String namaPengarang ;
    String judulBuku ;
    int tahunTerbit ;
    int cetakanKe ;
    double hargajual ;
    
    public Buku (String namaPengarang){
        this.namaPengarang = namaPengarang ;
        
    }
    public Buku (String namaPengarang, String judulBuku){
        this.namaPengarang = namaPengarang ;
        this.judulBuku = judulBuku;
        
    }
    public Buku (String namaPengarang,String judulBuku, int tahunTerbit){
        this.namaPengarang = namaPengarang ;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit ;
        
    }
    public Buku (String namaPengarang,String judulBuku, int tahunTerbit, int cetakanKe){
        this.namaPengarang = namaPengarang ;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit ;
        this.cetakanKe = cetakanKe;
        
    }
    public Buku (String namaPengarang, String judulBuku, int tahunTerbit,int cetakanKe, double hargajual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku ;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe ;
        this.hargajual = hargajual ;
    }
    
    void info (){
        System.out.println("\nNama Pengarang : "+namaPengarang+"\njudul buku : "+judulBuku+"\ntahun terbit : "+tahunTerbit+"\n cetakan Ke : " +cetakanKe+"\nharga jual : "+hargajual);
    }
    public static void main (String[] args){
        Buku satu = new Buku ("Mahar");
        Buku dua = new Buku ("Mahar","Menyuruh teman");
        Buku tiga = new Buku ("Mahar","Menyuruh teman",2019);
        Buku empat = new Buku ("Mahar","Menyuruh teman",2019,4);
        Buku lima = new Buku ("Mahar","Menyuruh teman",2019,4,2000000);
        satu.info();
        dua.info();
        tiga.info();
        empat.info();
        lima.info();
    }
}
    
