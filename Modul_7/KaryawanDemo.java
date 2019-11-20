public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan();
        k1.setNama("Luffy");
        k1.setGaji(2500000);
        k1.setUsia(21);

        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());
        System.out.println();

        Manager m1 = new Manager();
        m1.setNama("Agus");
        m1.setGaji(3000000);
        m1.setUsia(22);
        m1.setJamKerja(6);
        m1.setGajiManager(3000000);

        System.out.println(m1.getNama());
        System.out.println(m1.getGaji());
        System.out.println(m1.getUsia());
        System.out.println(m1.getJamKerja());
        System.out.println(m1.getGajiManager());
        System.out.println();

        Manager m2 = new Manager();
        m2.setNama("Sri");
        m2.setGaji(3500000);
        m2.setUsia(23);
        m2.setJamKerja(7);
        m2.setGajiManager(3500000);

        System.out.println(m2.getNama());
        System.out.println(m2.getGaji());
        System.out.println(m2.getUsia());
        System.out.println(m2.getJamKerja());
        System.out.println(m2.getGajiManager());
        System.out.println();

        Manager m3 = new Manager();
        m3.setNama("Ganang");
        m3.setGaji(4000000);
        m3.setUsia(24);
        m3.setJamKerja(7);
        m3.setGajiManager(4000000);

        System.out.println(m3.getNama());
        System.out.println(m3.getGaji());
        System.out.println(m3.getUsia());
        System.out.println(m3.getJamKerja());
        System.out.println(m3.getGajiManager());
        System.out.println();

        Manager m4 = new Manager();
        m4.setNama("Galan");
        m4.setGaji(4500000);
        m4.setUsia(25);
        m4.setJamKerja(8);
        m4.setGajiManager(4500000);

        System.out.println(m4.getNama());
        System.out.println(m4.getGaji());
        System.out.println(m4.getUsia());
        System.out.println(m4.getJamKerja());
        System.out.println(m4.getGajiManager());
        System.out.println();

        Manager m5 = new Manager();
        m5.setNama("Ganno");
        m5.setGaji(5000000);
        m5.setUsia(26);
        m5.setJamKerja(9);
        m5.setGajiManager(5000000);

        System.out.println(m5.getNama());
        System.out.println(m5.getGaji());
        System.out.println(m5.getUsia());
        System.out.println(m5.getJamKerja());
        System.out.println(m5.getGajiManager());
        System.out.println();
    }
}
