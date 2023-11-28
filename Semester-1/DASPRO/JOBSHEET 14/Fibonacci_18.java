import java.util.Scanner;
public class Fibonacci_18 {
    static int[] hitungMarmut (int bulan) {
        int[] hasil = new int[3];
        if (bulan <= 2) {
            hasil[0] = 1;
            hasil[1] = 0; 
            hasil[2] = 1; 
            return hasil;
        }
        int[] marmutSebelum = hitungMarmut (bulan - 1);
        int totalPasangan = marmutSebelum[0] + marmutSebelum[2]; 
        int jumlahPasanganProduktif = marmutSebelum[2]; 
        hasil[0] = totalPasangan;
        hasil[1] = jumlahPasanganProduktif;
        hasil[2] = totalPasangan - jumlahPasanganProduktif;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke: ");
        int bulan = sc.nextInt();

        int[] jumlahMarmut = hitungMarmut(bulan);

        System.out.println("Jumlah Pasangan produktif pada bulan ke-" + bulan + " adalah " + jumlahMarmut[1]);
        System.out.println("Jumlah Pasangan belum produktif pada bulan ke-" + bulan + " adalah " + jumlahMarmut[2]);
        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah " + jumlahMarmut[0]);
    }
} 
    

