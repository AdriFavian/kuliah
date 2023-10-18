import java.util.Scanner;

public class HitungIP18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        String namaMahasiswa, namaMataKuliah;
        String indeksNilai;
        int sks, totalMataKuliah = 0, totalSKS = 0, jumlahRemidi = 0;
        double ip = 0, totalNilai = 0;

        System.out.println("Program hitung IP");
        System.out.print("Masukkan nama: ");
        namaMahasiswa = input.nextLine();

        boolean isTambahMataKuliah = true;
        while (isTambahMataKuliah) {
            System.out.print("Nama Mata kuliah: ");
            namaMataKuliah = input.nextLine();

            System.out.print("Nilai (A,B+,B,C+,C,D,E): ");
            indeksNilai = input.next();

            System.out.print("Masukkan jumlah SKS: ");
            sks = input.nextInt();

            switch (indeksNilai) { // konversi nilai ke angka
                case "A":
                    totalNilai += 4.0 * sks;
                    break;
                case "B+":
                    totalNilai += 3.5 * sks;
                    break;
                case "B":
                    totalNilai += 3.0 * sks;
                    break;
                case "C+":
                    totalNilai += 2.5 * sks;
                    break;
                case "C":
                    totalNilai += 2.0 * sks;
                    break;
                case "D":
                    totalNilai += 1.0 * sks;
                    jumlahRemidi++;
                    break;
                case "E":
                    jumlahRemidi++;
                    break;
                default:
                    totalNilai += 3.5 * sks;
            }

            totalSKS += sks;
            totalMataKuliah++;

            // menanyakan apakah ingin input lagi atau tidak
            System.out.print("Apakah lanjut input nilai (Y/N)? "); 
            isTambahMataKuliah = input.next().equalsIgnoreCase("Y");

            input.nextLine();
        }

        ip = totalNilai / totalSKS; // menghitung IP nya

        System.out.println("---------------Hasil Perhitungan IP----------------");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Jumlah mata kuliah: " + totalMataKuliah);
        System.out.println("Jumlah SKS: " + totalSKS);
        System.out.println("Jumlah MK yang harus diperbaiki/remidi: " + jumlahRemidi);
        System.out.println("---------------------------------------------------");
    }
}
