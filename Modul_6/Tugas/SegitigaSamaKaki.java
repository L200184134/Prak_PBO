public class SegitigaSamaKaki extends Segitiga {
    protected double sisiMiring;

    public double getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public void hitungKeliling() {
        alas = 3;
        keliling = alas + (sisiMiring * 2);
        System.out.println("Keliling Segitiga Sama Kaki = " + keliling);
    }
}
