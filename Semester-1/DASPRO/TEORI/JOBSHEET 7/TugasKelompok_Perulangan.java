import java.util.Scanner;

public class TugasKelompok_Perulangan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlahBarang = 0; // jumlah barang yang ingin dimasukkan
        String jenisBarang;
        int jumlah, pilihan, kodeBarang;

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = input.nextInt();

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("Data Barang ke-" + i);
            System.out.println("Jenis Barang: ");
            jenisBarang = input.next();
            System.out.println("kode Barang: ");
            kodeBarang = input.nextInt();
            System.out.print("Jumlah Barang: ");
            jumlah = input.nextInt();
            System.out.print("Pilih 1 untuk barang masuk dan 2 untuk barang keluar: ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                // proses simpan data barang masuk
            } else if (pilihan == 2) {
                // proses simpan data barang keluar
            } else {
                System.out.println("Pilihan tidak valid.");
                i--; // mundurkan iterator agar data dimasukkan ulang
            }
        }
    }
}