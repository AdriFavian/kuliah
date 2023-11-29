import java.util.Scanner;
public class Percobaan2_18 {
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: " );
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: " );
        int pangkat = sc.nextInt();
        int hasil = (hitungPangkat(bilangan, pangkat));

        System.out.print(bilangan);// Pertanyaan Percobaan 2 nomor 2
            for (int i = 1; i < pangkat; i++) {
            System.out.print("x" + bilangan);
        }
        System.out.print("x1 = " + hasil);
    }
}
