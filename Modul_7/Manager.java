public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
    private float gajiManager;

    public float getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(float jamKerja) {
        this.jamKerja = jamKerja;
    }

    public float getGajiManager() {
        return getGaji() * 2;
    }

    public void setGajiManager(float gajiManager) {
        this.gajiManager = gajiManager;
    }
}
