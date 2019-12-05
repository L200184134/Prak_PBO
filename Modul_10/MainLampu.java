import java.util.Scanner;

public class MainLampu {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(2);
        System.out.println("Status Lampu = " + lampu.statusLampu + "\nKetikkan:");
        System.out.println("2 untuk menyalakan lampu\n0 untuk mematikan lampu\n-1 untuk meredupkan lampu");
        int masukan = sc.nextInt();

        if (lampu.setSaklar(masukan) == -1) {
            lampu.redupkanLampu();
        } else {
            if (lampu.setSaklar(masukan) == 0) {
                lampu.matikanLampu();
            } else {
                if (lampu.setSaklar(masukan) == 2) {
                    lampu.hidupkanLampu();
                }
            }
        }
    }
}
