import java.util.Scanner;
public class Percobaan1_18_No2 {
    // DERET FIBONACCI
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt(); // nilai n sesuai kebutuhan
        System.out.println("Deret Fibonacci dari " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
