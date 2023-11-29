package TEORI;
import java.util.Scanner;

public class tugas_no1_Iteratif {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc18.nextInt();

        int total = hitungPenjumlahanIteratif(N);

        System.out.println("Total: " + total);
    }

    static int hitungPenjumlahanIteratif(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }
}
