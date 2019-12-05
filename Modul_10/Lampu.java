import static java.lang.Boolean.TRUE;

public class Lampu implements ActivityLampu {
    public int statusLampu;
    static final int LAMPU_REDUP = -1;

    @Override
    public void matikanLampu() {
        statusLampu = 0;
        System.out.println("Lampu sudah dimatikan\n***");
    }

    @Override
    public void hidupkanLampu() {
        statusLampu = 2;
        System.out.println("Lampu sudah dinyalakan\n***");
    }

    public int setSaklar(int saklar) {
        return statusLampu = saklar;
    }

    public void redupkanLampu() {
        statusLampu = 1;
        System.out.println("Lampu sudah diredupkan\n***");
    }
}
