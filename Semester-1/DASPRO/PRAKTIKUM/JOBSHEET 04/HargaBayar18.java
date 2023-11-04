import java.util.Scanner;

public class HargaBayar18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int harga, jumlah, HalamanBuku;
        String merkBarang;
        double diskon, total, bayar, jmlDis;

        System.out.println("Masukkan diskon: ");
        diskon=input.nextDouble();
        System.out.println("Masukkan merk barang yang dibeli: ");
        merkBarang=input.next();
        System.out.println("Masukkan jumlah halaman buku barang yang dibeli: ");
        HalamanBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*diskon;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah: "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: "+bayar);
        System.out.println("merk buku anda: "+merkBarang);
        System.out.println("Total halaman buku anda: "+HalamanBuku);
        
    }
}