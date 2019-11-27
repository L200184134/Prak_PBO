package Modul_9;


public class Bola extends MethodAbstract {
    int jari = 8 ;
    
    public int volume() {
        return (4/3)*(22/7)*jari*jari*jari ;
    }

    
    public int luasSelimutluasPermukaan() {
        return 4*(22/7)*jari*jari ;
    }
    
}
