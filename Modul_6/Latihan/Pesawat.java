public class Pesawat extends Kendaraan {
    String bergerak = "di udara";
    String bahanBakar = "menggunakan bahan bakar";

    public void MessageA() {
        System.out.println("Pesawat " + roda + " dan bergerak " + bergerak);
    }

    public void MessageB() {
        System.out.println("Pesawat " + penumpang + " dan " + bahanBakar);
    }
}
