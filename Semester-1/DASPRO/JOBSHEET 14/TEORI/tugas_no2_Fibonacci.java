package TEORI;
import java.util.Scanner;

public class tugas_no2_Fibonacci {
        public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.print("Masukkan panjang deret Fibonacci: ");
        int M = sc18.nextInt();

        System.out.print("Hasil:");
        for (int i = 0; i < M; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int hasil = fibonacci(n - 1) + fibonacci(n - 2);
            return hasil;
        }
    }
}
