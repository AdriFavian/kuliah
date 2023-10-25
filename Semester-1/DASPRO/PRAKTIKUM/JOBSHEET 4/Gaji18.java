import java.util.Scanner;

public class Gaji18 {
  public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
      int jmlMasuk, JmlTdkMasuk, TotGaji;
      int gajiPokok, potGaji; 
      System.out.println("Masukkan gaji pokok: ");
      gajiPokok = input.nextInt();
      System.out.println("Masukkan potongan gaji: ");
      potGaji = input.nextInt();
      System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda: ");
      jmlMasuk = input.nextInt();
      System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
      JmlTdkMasuk = input.nextInt();

      TotGaji = (jmlMasuk*gajiPokok)-(JmlTdkMasuk*potGaji);

      System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}
