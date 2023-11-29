package TEORI;
import java.util.Scanner;

public class tugas_no1_Rekursif {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc18.nextInt();

        int total = hitungPenjumlahanRekursif(N);

        System.out.println("Total: " + total);
    }

    static int hitungPenjumlahanRekursif(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N + hitungPenjumlahanRekursif(N - 1);
        }
    }
}
