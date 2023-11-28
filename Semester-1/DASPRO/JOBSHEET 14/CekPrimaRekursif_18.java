import java.util.Scanner;
public class CekPrimaRekursif_18 {
    static boolean isPrima(int n, int i) { //Fungsi Rekursif
        if (i < n && n % i == 0) {
            return false;
        }
        else if (i == n) {// Basis: jika i mencapai n, maka n adalah bilangan prima
            return true;
        }
        else {// Langkah rekursif: memeriksa pembagian dengan i yang lebih besar
            return isPrima(n, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int inputan = sc.nextInt();

        boolean isPrima = isPrima(inputan, 2);

        if (isPrima) {
            System.out.println(inputan + " adalah bilangan prima.");
        } else {
            System.out.println(inputan + " bukan bilangan prima.");
        }
    }
}
