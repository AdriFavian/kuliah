import java.util.Scanner;

public class latihan2_haikal {

    public static void main(String[] args) {

        double total, totalDiskon = 0, subtotal;
        int harga, jumlahBuku;
        String jenisBuku;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input.nextLine();

        System.out.print("Masukkan jenis harga : ");
        harga = input.nextInt();

        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = input.nextInt();

        subtotal = harga * jumlahBuku;

        if (jenisBuku.equalsIgnoreCase("kamus")) {

            if (jumlahBuku > 2) {
                totalDiskon = subtotal * 0.12; // 10% + 2%
            } else {
                totalDiskon = subtotal * 0.1; // 10%
            }

        } else if (jenisBuku.equalsIgnoreCase("novel")) {

            if (jumlahBuku > 3) {
                totalDiskon = subtotal * 0.09; // 7% + 2%
            } else {
                totalDiskon = subtotal * 0.08; // 7% + 1%
            }

        } else {

            if (jumlahBuku > 3) {
                totalDiskon = subtotal * 0.05; // 7% + 2%
            }
        }

        total = subtotal - totalDiskon;

        System.out.println();
        System.out.println("Detail Pembayaran");
        System.out.println("Harga awal : " + subtotal);
        System.out.println("Total Diskon : " + totalDiskon);
        System.out.println("Total harga : " + total);

        input.close();
    }
}