import java.util.Scanner;

public class individu2_18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        if (n>=5) {
            if (n < 5) {
                System.out.println("Nilai N harus minimal 5.");
            } else {
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("Mohon input 5 atau lebih!");
        }
    }
}