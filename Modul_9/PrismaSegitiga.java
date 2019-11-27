package Modul_9;


public class PrismaSegitiga extends MethodAbstract {
    int ts = 6;
    int as = 9 ;
    int t = 5 ;
    
    public int volume() {
        return ((as*ts)/2)*t;
    }

    
    public int luasSelimutluasPermukaan() {
        return ts*(as+(3*t));
    }
    
}
