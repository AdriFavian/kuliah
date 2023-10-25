import java.util.Scanner;

public class DoWhileCuti18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)?");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("t")) {
                break; // Keluar dari loop jika konfirmasi adalah "t"
            }

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Jumlah hari yang diminta melebihi jatah cuti yang tersisa.");
                    System.out.print("Apakah Anda ingin mengambil " + jatahCuti + " hari (y/t)? ");
                    konfirmasi = sc.next();

                    if (konfirmasi.equalsIgnoreCase("y")) {
                        jatahCuti = 0;
                    }
                }
            }
        } while (jatahCuti > 0);
    }
}
