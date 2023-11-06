import java.util.Scanner;

public class individu3_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai ukuran kotak = ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); 
            }
            System.out.println();
        }
    }
}
