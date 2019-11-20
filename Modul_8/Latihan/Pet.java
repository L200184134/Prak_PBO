public class Pet {
    private String nama;

    public void beriNama(String beriNama) {
        this.nama = beriNama;
    }

    public String panggilNama(){
        return nama;
    }

    public String perilaku() {
        return "Hewan Penurut";
    }

}
