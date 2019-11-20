public class CustomerData {
    String nama;
    String alamat;
    String tanggalLahir;
    String pekerjaan;
    double gaji;

    public CustomerData() {
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(tanggalLahir);
        System.out.println(pekerjaan);
        System.out.println(gaji);
    }

    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(tanggalLahir);
        System.out.println(pekerjaan);
        System.out.println(gaji);
    }
}
