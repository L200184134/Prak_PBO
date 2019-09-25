package pegawai;
public class Pegawai {
    String name ;
    int nip ;
    double gaji ;
    public String giveNama(String nama){
        return this.name = nama ;
    }
    public int giveNip(int nip){
        return this.nip = nip ;
    }
    public double giveGaji(double gaji){
        return this.gaji = gaji ;
    }
    public static void main(String[] args) {
        Pegawai pw1 = new Pegawai ();
        Pegawai pw2 = new Pegawai ();
        Pegawai pw3 = new Pegawai();
        Pegawai pw4 = new Pegawai ();
        Pegawai pw5 = new Pegawai ();
        
        pw1.giveNama("handoyo");
        pw1.giveNip(8907862);
        pw1.giveGaji(100000);
        System.out.println("Name : "+pw1.name+"\n"+
                           "NIP : "+pw1.nip+"\n"+
                           "Gaji : "+pw1.gaji+"\n");
        
        pw2.giveNama("Hindiyi");
        pw2.giveNip(123678);
        pw2.giveGaji(999999);
        System.out.println("Name : "+pw2.name+"\n"+
                           "NIP : "+pw2.nip+"\n"+
                           "Gaji : "+pw2.gaji+"\n");
        
        pw3.giveNama("Hunduyu");
        pw3.giveNip(87776765);
        pw3.giveGaji(6785645);
        System.out.println("Name : "+pw3.name+"\n"+
                           "NIP : "+pw3.nip+"\n"+
                           "Gaji : "+pw3.gaji+"\n");
        
        pw4.giveNama("Hendeye");
        pw4.giveNip(12637251);
        pw4.giveGaji(7888889);
        System.out.println("Name : " +pw4.name+"\n"+
                           "NIP : "+pw4.nip+"\n"+
                           "Gaji : "+pw4.gaji+"\n");
        
        pw5.giveNama("Handaya");
        pw5.giveNip(7999999);
        pw5.giveGaji(3423442);
        System.out.println("Name : "+pw5.name+"\n"+
                           "NIP : "+pw5.nip+"\n"+
                           "Gaji : "+pw5.gaji);
    }
    
}
