import java.util.Scanner;

public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);
        System.out.println("Status Lampu = " + lampu.statusLampu + "\nKetikkan:");
        System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu");

        if (lampu.setSaklar(sc.nextInt()) == 0) {
            lampu.matikanLampu();
        } else {
            lampu.hidupkanLampu();
        }
    }
}
