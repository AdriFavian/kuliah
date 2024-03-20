import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.print("Masukkan jumlah eleman yang dihitung:");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
            for (int i = 0; i < elemen; i++) {
                System.out.print("Masukkan nilai yang hendak di pangkatkan: ");
                int nilai = sc.nextInt();
                System.out.print("Masukkan nilai pemangkat: ");
                int pangkat = sc.nextInt();
                png[i] = new Pangkat(nilai,pangkat);
            }

            System.out.println("\nPilih metode:");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide Conquer");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("HASIL PANGKAT - BRUTE FORCE");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat "
                                + png[i].pangkat + " adalah "
                                + png[i].PangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 2:
                    System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat "
                                + png[i].pangkat + " adalah "
                                + png[i].PangkatDC(png[i].nilai, png[i].pangkat));
                    }   
                    break;
                default:
                    System.out.println("Cek pilihan anda!");
                    break;
            }
        sc.close();
        }
}