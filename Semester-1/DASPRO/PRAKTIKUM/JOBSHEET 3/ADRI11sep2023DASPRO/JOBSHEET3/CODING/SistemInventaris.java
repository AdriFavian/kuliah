import java.util.Scanner;

public class SistemInventaris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_brg, nama_user, role_user, data_brg;
        int kode_brg, jmlh_brg, pilihan_menu;

        System.out.println("----------- SELAMAT DATANG DI SISTEM INVENTARIS -----------");
        System.out.println("------------------------RESTORAN---------------------------\n");
        
        System.out.println("Masukkan data anda: ");
        System.out.print("Nama: ");
        nama_user = sc.next();
        System.out.println("Role: ");
        role_user = sc.next();

        System.out.println("---------------------PILIH MENU----------------------------:");
        System.out.println("Note: Masukkan dengan angka sesuai dengan pilihan anda");
        System.out.println("1. Tambah Barang\n");
        System.out.println("Masukkan pilihan: ");
        pilihan_menu = sc.nextInt();

        if (pilihan_menu == 1){
            System.out.println("Masukkan nama barang: ");
            nama_brg = sc.next();
            System.out.println("Masukkan kode barang: ");
            kode_brg = sc.nextInt();

            data_brg = nama_brg + " " + kode_brg;
            System.out.println("Data Barang anda: " + data_brg);
            
        } else {
            System.out.println("Mohon Cek Pilihan menu anda !!");
        }

    }
}