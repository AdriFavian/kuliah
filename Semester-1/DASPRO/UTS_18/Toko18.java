import java.util.Scanner;

public class Toko18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaPelanggan, produk;

        // Deklarasi variabel
        int kuantitas, totalItem = 0;
        double hargaSatuan, diskonProduk, totalHargaProduk = 0, subTotal = 0, totalDiskon = 0, totalHargaSetelahDiskon = 0;

        System.out.println("Program Toko");
        System.out.print("Masukkan nama Anda: ");
        namaPelanggan = input.nextLine();

        boolean isTambahProduk = true;
        while (isTambahProduk) {
            System.out.print("Masukkan produk yang Anda beli: ");
            produk = input.nextLine();

            System.out.print("Banyaknya: ");
            kuantitas = input.nextInt();

            System.out.print("Harga: ");
            hargaSatuan = input.nextDouble();

            System.out.print("Diskon (%): ");
            diskonProduk = input.nextDouble();

            totalItem += kuantitas; // perhitungan
            totalHargaProduk += kuantitas * hargaSatuan;
            totalDiskon += (diskonProduk / 100) * (kuantitas * hargaSatuan);

            System.out.print("Apakah Anda mau menambahkan produk (Y/N)? ");
            isTambahProduk = input.next().equalsIgnoreCase("Y");

            input.nextLine();
        }

        System.out.print("Apakah anda punya kartu member (Y/N)? ");
        boolean isMember = false;
        isMember = input.next().equalsIgnoreCase("Y");

        if (isMember && totalHargaProduk >= 200000) { // perhitungan jika memiliki member
            totalDiskon += 0.1 * totalHargaProduk;
        } else if (isMember) {
            totalDiskon += 0.05 * totalHargaProduk;
        }

        subTotal = totalHargaProduk - totalDiskon;
        totalHargaSetelahDiskon = subTotal;

        System.out.println("\n-----Total Pembelian------");
        System.out.println("\"-------------Total Pembelian-------------\");");
        System.out.println("Nama pelanggan: " + namaPelanggan);
        System.out.println("Tipe: " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total item barang yang dibeli: " + totalItem);
        System.out.println("SubTotal = " + subTotal);
        System.out.println("Total Diskon = " + totalDiskon);
        System.out.println("Total yang harus dibayar = " + totalHargaSetelahDiskon);
        System.out.println("------------------------------------------");
    }
}
