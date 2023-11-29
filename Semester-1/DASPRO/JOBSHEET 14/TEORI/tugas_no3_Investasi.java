package TEORI;
import java.util.Scanner;
public class tugas_no3_Investasi {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        // tahun (N)
        System.out.print("Masukkan jumlah tahun investasi: ");
        int tahun = sc18.nextInt();
        System.out.print("Masukkan jumlah awal yang diinvestasikan: ");
        double jumlahAwal = sc18.nextDouble();

        double hasil = hitungInvestasi(jumlahAwal, tahun);

        System.out.println("Setelah " + tahun + " tahun, nilai investasi emas adalah: " + hasil);
    }

    static double hitungInvestasi(double jumlahAwal, int tahun) {
        // keuntungan per tahun (11,7%)
        double persen = 0.117;
        // Menghitung nilai investasi setelah N tahun
        double hasil = jumlahAwal;
    
        for (int i = 1; i <= tahun; i++) {
            hasil *= (1 + persen);
        }
        return hasil;
    }
}
