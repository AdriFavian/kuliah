import java.util.Scanner;

public class individu_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan angka 1-12: ");
        int angka = scanner.nextInt();

        if (angka >= 1 && angka <= 12) {
            System.out.println("Bulan: " + bulan[angka - 1]);
        } else {
            System.out.println("Input tidak valid.");
        }
    }
}