import java.util.Scanner;
public class Array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] MK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thingking dan Problem Solving", 
                        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                        "Keselematan dan Kesehatan Kerja"}; 
        double[] nilaiAngka = new double[MK.length];
        int[] bobotSKS = new int[MK.length];
        String[] nilaiHuruf = new String[nilaiAngka.length];
        double[] nilaiSetara = new double[nilaiAngka.length];
        
        System.out.println("=============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=============================");
        
        //input SKS MK
        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan bobot SKS untuk MK " + MK[i] + ": ");
            bobotSKS[i] = sc.nextInt();
        }
        
        //totalSKS
        int totalSKS = 0;
        for (int i=0; i < bobotSKS.length; i++) {
            totalSKS += bobotSKS[i];
        }
        System.out.println("========================");
        System.out.print("total SKS adalah " + totalSKS +"\n");
        System.out.println("========================");

        //input nilai MK
        for (int i = 0; i < MK.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + MK[i] + ": ");
            nilaiAngka[i] = sc.nextInt();
        }

        for (int i=0; i<nilaiAngka.length; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }
        //menghitung IP
        float hasilIP = 0;
        for (int i=0; i<nilaiSetara.length; i++) {
            hasilIP += (nilaiSetara[i] * bobotSKS[i]) / totalSKS;
        }

        System.out.println("==============================");
        System.out.println("     Hasil Konversi Nilai");
        System.out.println("==============================");
        // Menampilkan header tabel
        System.out.printf("%-38s %-13s %-13s %-13s %n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("------------------------------------------------------------------------------");
        
        // Menampilkan data dalam bentuk tabel
        for (int j = 0; j < MK.length; j++) {
            System.out.printf("%-38s %-13s %-13s %-13s %n", MK[j], nilaiAngka[j], nilaiHuruf[j], nilaiSetara[j]);
        }

        System.out.println("==============================");
        //format untuk membulatkan hasil
        String hasilFormat = String.format("%.2f",hasilIP);
        System.out.println("IP: "+ hasilFormat);
    sc.close();
    }
}