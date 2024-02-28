import java.util.Scanner;
public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    static double s,t,v;
    
    public static void main(String[] args) {
        menuUtama();
    }

    private static void menuUtama() {
        System.out.println("Menghitung Kecepatan, Jarak, dan Waktu");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilihan: ");
        
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;

            case 2:
                hitungJarak();
                break;

            case 3:
                hitungWaktu();
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void hitungKecepatan() {
        System.out.print("Masukkan Jarak: ");
        s = sc.nextDouble();
        System.out.print("Masukkan Waktu: ");
        t = sc.nextDouble();
        System.out.println("Kecepatan: " + getKecepatan(s, t));
    }

    private static void hitungJarak() {
        System.out.print("Masukkan Kecepatan: ");
        v = sc.nextDouble();
        System.out.print("Masukkan Waktu: ");
        t = sc.nextDouble();
        System.out.println("Jarak: " + getJarak(v, t));
    }

    private static void hitungWaktu() {
        System.out.print("Masukkan Jarak: ");
        s = sc.nextDouble();
        System.out.print("Masukkan Kecepatan: ");
        v = sc.nextDouble();
        System.out.println("Waktu: " + getWaktu(s, v));
    }

    private static double getKecepatan(double s, double t) {
        return s / t;
    }

    private static double getJarak(double v, double t) {
        return v * t;
    }

    private static double getWaktu(double s, double v) {
        return s / v;
    }
}
