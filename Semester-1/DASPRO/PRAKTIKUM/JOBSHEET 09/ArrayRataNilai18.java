import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        double total = 0;
        double rata2;
        int banyakLulus = 0;
        int banyakTidakLulus = 0;
        double totalTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (nilaiMhs[i] <= 70) {
                banyakTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            } else {
                banyakLulus++;
            }
        }
        for (int i = 0; i < n; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / n;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Banyak mahasiswa yang lulus = " + banyakLulus);
        System.out.println("Banyak mahasiswa yang tidak lulus = " + banyakTidakLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / banyakTidakLulus));
    }
}
