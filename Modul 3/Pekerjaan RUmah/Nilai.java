package nilai;
public class Nilai {
    double nilaiUTS ;
    double nilaiUAS ;
    double nilaiTugas ;
    double nilaiTotal ;
    public double getUTS(double UTS){
        return this.nilaiUTS = UTS ;
    }
    
    public double getUAS (double UAS){
        return this.nilaiUAS = UAS ;
    }
    
    public double getTugas (double Tugas){
        return this.nilaiTugas = Tugas ;
    }
    public void getTotal (){
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas)/3 ; 
        System.err.println("Nilai total : " + nilaiTotal );
    }
    public static void main(String[] args) {
        Nilai total = new Nilai ();
        total.getUTS(9.9);
        total.getUAS(9.8);
        total.getTugas(9.7);
        total.getTotal();
    }
    
}
