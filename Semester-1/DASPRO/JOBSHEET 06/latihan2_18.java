import java.util.Scanner;

public class latihan2_18 {
    public static void main(String[] args){
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan hari:");
        String hari = input18.nextLine().toLowerCase();

        if (hari.equals("rabu")) {

            double TotalHarga = 0.0, TotalDiskon = 0.0, subtotal;

            System.out.println("Masukkan jenis buku: " );
            System.out.println("1. Kamus\n" + "2. Novel\n" + "3. lainnya");
            String jenis = input18.nextLine().toLowerCase(); 

            System.out.println("Masukkan jumlah buku: ");
            int jumlah = input18.nextInt();

            System.out.println("Masukkan harga buku: ");    
            double harga = input18.nextDouble();

            subtotal = harga * jumlah;

            if (jenis.equals("kamus") && jumlah > 2) {
                TotalDiskon = subtotal * (0.10 + 0.02);
            } else if (jenis.equals("kamus")) {
                TotalDiskon = subtotal * 0.10;
            } else if (jenis.equals("novel") && jumlah > 3) {
                TotalDiskon = subtotal * (0.07 + 0.02);
            } else if (jenis.equals("novel") && jumlah <= 3) {
                TotalDiskon = subtotal * (0.07 + 0.01);
            } else if (!jenis.equals("kamus") && !jenis.equals("novel") && jumlah > 3) {
                TotalDiskon = subtotal * 0.05;
            } 

            TotalHarga = subtotal - TotalDiskon;

            System.out.println("------ DETAIL ------");
            System.out.println("Harga awal : " + subtotal);
            System.out.println("Total Diskon : " + TotalDiskon);
            System.out.println("Total harga : " + TotalHarga);

            input18.close();

        } else {
            System.out.println("maaf sistem ini berlaku pada hari rabu saja");
        }       
    }
}