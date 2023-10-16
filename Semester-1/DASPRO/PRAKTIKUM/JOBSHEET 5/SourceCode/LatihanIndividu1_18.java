import java.util.Scanner;

public class LatihanIndividu1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pilihan_menu;

        System.out.println("Apa kondisi yang David Martinez hadapi: \n");
        System.out.println("A) pertarungan berlangsung dalam jarak 5 meter atau kurang dari itu");
        System.out.println("B) Pertarungan pada 5 meter sampai 1000 meter lebih\n");

        System.out.println("Masukkan kondisi: ");

        pilihan_menu = sc.next();

        switch (pilihan_menu) {
            case "A":
                System.out.println("David Martinez menggunakan senjata closed combat");
                break;
            case "B":
                System.out.println("David Martinez menggunakan ranged weapon");
                break;
            default:
                System.out.println("Kondisi anda salah");
                break;
        }       
    }
}

