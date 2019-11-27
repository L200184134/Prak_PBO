package Modul_9;


public class Kubus extends MethodAbstract {
    int sisi = 9;
    
    public int volume() {
         return sisi*sisi*sisi;
    }

    
    public int luasSelimutluasPermukaan() {
        return 6*sisi*sisi ;
    }
    
}
