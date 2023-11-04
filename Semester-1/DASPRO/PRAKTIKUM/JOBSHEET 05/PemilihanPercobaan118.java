import java.util.Scanner;

public class PemilihanPercobaan118 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input18.nextInt();

        String status = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + status);
    }
}
