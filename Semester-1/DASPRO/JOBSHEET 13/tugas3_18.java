import java.util.Scanner;

public class tugas3_18 {
    static Scanner sc = new Scanner(System.in);
    static int[][] nilai;
    static String[] nama;

    public static void inputNamaMahasiswa() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = sc.next();
        }
    }

    public static void inputNilaiMhs() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai untuk " + nama[i]);
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("pada minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanNilaiMhs() {
        System.out.println("Nilai mahasiswa");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + " : "); 
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]);
                if (j < nilai[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void hariTertinggi() {
        int nilaiTertinggi = nilaiTertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == nilaiTertinggi) {
                    System.out.println("Nilai tertinggi ada pada minggu ke-" + (j + 1));
                }
            }
        }   
    }

    public static void nilaiMhsTertinggi() {
        int nilaiTertinggi = nilaiTertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == nilaiTertinggi) {
                    System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[i] +
                            " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + (j + 1));
                }
            }
        }
    }
    
    static int nilaiTertinggi(int[][] array) {
        int nilaiTertinggi = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = array[i][j];
                }
            }
        }
        return nilaiTertinggi;
    }

    static int nilaiTerkecil(int[][] array) {
        int nilaiTerkecil = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < nilaiTerkecil) {
                    nilaiTerkecil = array[i][j];
                }
            }
        }
        return nilaiTerkecil;
    }

    public static void nilaiMhsTerkecil() {
        int nilaiTerkecil = nilaiTerkecil(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == nilaiTerkecil) {
                    System.out.println("Mahasiswa dengan nilai terendah adalah " + nama[i] +
                            " dengan nilai " + nilaiTerkecil + " pada minggu ke-" + (j + 1));
                }
            }
        }
    }

    
    public static void hariTerkecil() {
        int nilaiTerkecil = nilaiTerkecil(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == nilaiTerkecil) {
                    System.out.println("Nilai terendah ada pada minggu ke-" + (j + 1));
                }
            }
        }   
    }

    public static void totalNilaiMhs() {
        System.out.println("Total nilai per mahasiswa");
        for (int i = 0; i < nama.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }
            System.out.println(nama[i] + " : " + totalNilai);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah minggu/tugas: ");
        int jumlahMinggu = sc.nextInt();

        nilai = new int[jumlahMahasiswa][jumlahMinggu];
        nama = new String[jumlahMahasiswa];

        inputNamaMahasiswa();
        inputNilaiMhs();  
        System.out.println();
        tampilkanNilaiMhs();
        System.out.println(); 
        totalNilaiMhs();
        System.out.println();
        hariTertinggi();
        nilaiMhsTertinggi();
        hariTerkecil();
        nilaiMhsTerkecil();
    }
}