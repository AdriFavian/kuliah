import java.util.Scanner;
public class DeretDescendingRekursif_18 {// Fungsi rekursif
    static void fungsiRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            fungsiRekursif(n - 1);
        }
    }
    static void fungsiIteratif(int n) {// Fungsi iteratif
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        int input = sc.nextInt();
        System.out.println("Memakai Fungsi Rekursif:");
        fungsiRekursif(input);
        System.out.println("\nMemakai Fungsi Iteratif:");
        fungsiIteratif(input);
    } 
}
