package LatihanPraktikum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kerucut: ");
        
        Kerucut[] arrayKerucut = new Kerucut[sc.nextInt()];

        for(int i=0; i<arrayKerucut.length; i++) {

            arrayKerucut[i] = new Kerucut();
            System.out.println("\nKerucut ke-" + (i+1));
            System.out.print("Masukkan jari-jari: ");
            arrayKerucut[i].jarijari = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            arrayKerucut[i].sisimiring = sc.nextInt();
        }

        System.out.println("");
        
        System.out.print("\nMasukkan Jumlah Limas Segi Empat: ");
        LimasSegiEmpatSamaSisi[] lseArray = new LimasSegiEmpatSamaSisi[sc.nextInt()];
        
        for(int i=0; i<lseArray.length; i++) {
            
            lseArray[i] = new LimasSegiEmpatSamaSisi();
            System.out.println("\nLimas Segi Empat ke-" + (i+1));
            System.out.print("Masukkan sisi alas: ");
            lseArray[i].sisiAlas = sc.nextInt();        System.out.print("Masukkan tinggi limas: ");
            lseArray[i].tinggiLimas = sc.nextInt();
        }
        
        System.out.println("");
        
        System.out.print("\nMasukkan Jumlah Bola: ");
        Bola[] blArray = new Bola[sc.nextInt()];
        
        for(int i=0; i<blArray.length; i++) {
            
            blArray[i] = new Bola();
            System.out.println("\nBola ke-" + (i+1));
            System.out.print("Masukkan jari-jari: ");
            blArray[i].jarijari = sc.nextInt();
        }
        
        System.out.println("");
        
        for(int i=0; i<arrayKerucut.length; i++) {
            System.out.println("\nKerucut ke-" + (i+1));
            System.out.println("Luas Permukaan: " + String.format("%.2f", arrayKerucut[i].hitungLuasPermukaan()) + ", Volume: " + String.format("%.2f", arrayKerucut[i].hitungVolume()));
        }

        for(int i=0; i<lseArray.length; i++) {
            System.out.println("\nLimas Segi Empat ke-" + (i+1));
            System.out.println("Luas Permukaan: " + String.format("%.2f", lseArray[i].hitungLuasPermukaan()) + ", Volume: " + String.format("%.2f", lseArray[i].hitungVolume()));
        }

        for(int i=0; i<blArray.length; i++) {
            System.out.println("\nBola ke-" + (i+1));
            System.out.println("Luas Permukaan: " + String.format("%.2f", blArray[i].hitungLuasPermukaan()) + ", Volume: " + String.format("%.2f", blArray[i].hitungVolume()));
        }

        sc.close();
    }
}
