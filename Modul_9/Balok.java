package Modul_9;

public class Balok extends MethodAbstract {
    int p = 6 ;
    int l = 9 ;
    int t = 4 ;
    public int volume() {
        return p*l*t ;
    }

    
    public int luasSelimutluasPermukaan() {
        return 2*((p*l)+(l*t)+(p*t));
    }

}
