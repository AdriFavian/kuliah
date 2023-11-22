import java.util.Scanner;
public class tugas2_18 {
    static Scanner sc = new Scanner(System.in);
    static String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static int[][] dataNilai = new int[5][7];

    public static void inputNilai() {
        for (int m = 0; m < dataNilai.length; m++) {
            for (int n = 0; n < dataNilai[0].length; n++) {
                System.out.print("Masukkan nilai " + namaMahasiswa[m] + " minggu ke-" + (n + 1) + " : ");
                dataNilai[m][n] = sc.nextInt();
            }
            System.out.println();
        }
    } 
    public static void tampilNilai() {
        for (int m = 0; m < namaMahasiswa.length; m++) {
            System.out.print(namaMahasiswa[m] + " : "); 
            for (int n = 0; n < dataNilai[m].length; n++) {
                System.out.print(dataNilai[m][n]);
                if (n < dataNilai[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    public static void hari() {
        int maxValue = nilaitertinggi(dataNilai);
        for (int m = 0; m < dataNilai.length; m++) {
            for (int n = 0; n < dataNilai[0].length; n++) {
                if (dataNilai[m][n] == maxValue) {
                    System.out.println("Nilai tertinggi ada pada minggu ke-" + (n + 1));
                }
            }
        }
    }   
    public static void mahasiswa() {
        int maxValue = nilaitertinggi(dataNilai);
        for (int m = 0; m < dataNilai.length; m++) {
            for (int n = 0; n < dataNilai[0].length; n++) {
                if (dataNilai[m][n] == maxValue) {
                    System.out.println(
                        "Mahasiswa yang memiliki nilai tertinggi adalah " + namaMahasiswa[n] + "- " + maxValue);
                    }
            }
        }
    }
    public static int nilaitertinggi(int[][] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[i].length; n++) {
                if (array[i][n] > maxValue) {
                    maxValue = array[i][n];
                }
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        inputNilai();
        System.out.println();
        tampilNilai();
        System.out.println();
        hari();
        System.out.println();
        mahasiswa();
    }
}