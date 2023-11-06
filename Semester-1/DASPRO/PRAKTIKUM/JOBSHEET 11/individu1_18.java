import java.util.Scanner;

public class individu1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        if (n >= 3) {
            int i = 0;
            while(i <= n) {
                // spasi kosong sebelum angak dicetak
                int j = 0;
                while (j < n - i) {
                    System.out.print(" ");
                    j++;
                }
                
                int k = 0;
                while(k < i) {
                    System.out.print(k+1);
                    k++;
                }
                System.out.println();
                i++;
            } 
        } else {
            System.out.println("Mohon input 3 atau lebih!");
        }
    }
}
