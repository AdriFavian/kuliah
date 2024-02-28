import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] KOTA = {
                {'B', 'A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                {'B', 'O', 'G', 'O', 'R'},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                {'M', 'A', 'L', 'A', 'N', 'G'},
                {'T', 'E', 'G', 'A', 'L'}
        };

        boolean found = false;

        while (!found) {
            System.out.print("Masukkan kode plat nomor : ");
            char kodePlat = sc.next().toUpperCase().charAt(0);

            for (int i=0; i < KODE.length; i++) {
                if (KODE[i] == kodePlat) {
                    for (int j=0; j < KOTA[i].length; j++) {
                        System.out.print(KOTA[i][j]);
                    }
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Kode plat nomor tidak ditemukan, silahkan coba lagi !");
            }
        }sc.close();
    }
}