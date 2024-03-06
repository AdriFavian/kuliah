package LatihanPraktikum;
import java.util.Scanner;
public class MainMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        Mhs[] mhsArray = new Mhs[sc.nextInt()];

        for(int i=0; i<mhsArray.length; i++) {
            System.out.println("\nMasukkan Data Mahasiswa ke-" + (i+1));
            mhsArray[i] = new Mhs();
            System.out.print("Masukkan Nama: ");
            mhsArray[i].nama = sc.next();
            System.out.print("Masukkan NIM: ");
            mhsArray[i].nim = sc.next();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhsArray[i].kelamin = sc.next().toUpperCase().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhsArray[i].ipk = sc.nextDouble();
        }

        for(int i=0; i<mhsArray.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mhsArray[i].nama);
            System.out.println("NIM: " + mhsArray[i].nim);
            System.out.println("Jenis Kelamin: " + mhsArray[i].kelamin);
            System.out.println("Nilai IPK: " + mhsArray[i].ipk);
        }

        sc.close();
    }
}