public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setRasioBunga(5);
        System.out.println(b1.getRasioBunga());
        System.out.println();

        BankPribadi b2 = new BankPribadi();
        b2.setRasioBunga(10);
        System.out.println(b2.getRasioBunga());
        System.out.println();

        BankUmum b3 = new BankUmum();
        b3.setRasioBunga(15);
        System.out.println(b3.getRasioBunga());
        System.out.println();

        BankPasar b4 = new BankPasar();
        b4.setRasioBunga(20);
        System.out.println(b4.getRasioBunga());
        System.out.println();

        BankSyariah b5 = new BankSyariah();
        b5.setRasioBunga(25);
        System.out.println(b5.getRasioBunga());
        System.out.println();
    }
}
