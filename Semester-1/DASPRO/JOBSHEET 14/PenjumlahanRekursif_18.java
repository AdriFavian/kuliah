import java.util.Scanner;
public class PenjumlahanRekursif_18 {
    // Fungsi rekursif untuk menghitung penjumlahan bilangan
    static int penjumlahanRekursif(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        System.out.println("hasil: \n");

        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i);
            if (i < bilangan) {
                System.out.print("+");
            }
        }
        System.out.print("= " + penjumlahanRekursif(bilangan));
    }
}