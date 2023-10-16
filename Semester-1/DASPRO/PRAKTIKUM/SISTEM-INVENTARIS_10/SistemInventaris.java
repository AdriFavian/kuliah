import java.util.Scanner;

public class SistemInventaris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama_brg, nama_user, role_user, data_brg, jenis_kerusakan, data_laporan_rusak, jenis_brg;
        int kode_brg, jmlh_brg, pilihan_menu;

        System.out.println("------------SELAMAT DATANG DI SISTEM INVENTARIS----------");
        System.out.println("---------------------------RESTORAN----------------------");

        System.out.println("MASUKKAN DATA ANDA");
        System.out.println("Nama: ");
        nama_user = sc.next();
        System.out.println("Role: ");
        role_user = sc.next();

        System.out.println("-----------------------PILIH MENU-------------------------");
        System.out.println("Note: Masukkan dengan angka sesuai dengan pilihan anda");
        System.out.println("1. Input Barang Masuk dan keluar\n");
        System.out.println("2. Input Barang Rusak\n");
        System.out.println("Masukkan pilihan: ");
        pilihan_menu = sc.nextInt();

        if (pilihan_menu == 1){
            System.out.println("Masukkan nama barang: ");
            nama_brg = sc.next();
            System.out.println("Masukkan kode barang: ");
            kode_brg = sc.nextInt();
            System.out.println("Masukkan jenis barang: ");
            System.out.println("1. Kebutuhan Dapur");
            System.out.println("1. Bukan Kebutuhan Dapur");
            jenis_brg = sc.next().toLowerCase();

            if (jenis_brg.equals("kebutuhan dapur")){
                if(jenis_brg.equals("barang basah")){
                    data_brg = nama_brg + " " + kode_brg + " " + jenis_brg;
                    System.out.println("Data Barang anda: " + data_brg);
                } else if(jenis_brg.equals("barang kering")){
                    data_brg = nama_brg + " " + kode_brg + " " + jenis_brg;
                    System.out.println("Data Barang anda: " + data_brg);
                } else if(!jenis_brg.equals("kebutuhan dapur")) {
                    System.out.println("cek inputan anda");
                }
            }
        } else if (pilihan_menu == 2){
            System.out.println("Masukkan nama barang: ");
            nama_brg = sc.next();
            System.out.println("Jumlah barang rusak: ");
            jmlh_brg = sc.nextInt();
            System.out.println("Jenis Kerusakan: ");
            jenis_kerusakan = sc.next();
            
            data_laporan_rusak = nama_brg + ". Sejumlah: " + jmlh_brg + " , " + jenis_kerusakan;
            System.out.println("Laporan barang rusak: " + data_laporan_rusak);
        } 
        
        else{
            System.out.println("Mohon Cek Pilihan Menu anda !!");
        }  
        sc.close();
    }
}
