import java.util.Scanner;

public class Multi_Pengguna {
    public static void main(String[] args) {
        String nama_user1 = "agus";
        String role_user1 = "staff"; // Inisialisasi nama_user di awal

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama_user: ");
        String input_nama_user = sc.nextLine();

        System.out.print("Masukkan nama_role: ");
        String nama_role = sc.nextLine();

        if (input_nama_user.equals(nama_user1)) { // Memeriksa apakah nama_user sama dengan yang diinisialisasi di awal
            if (nama_role.equals(role_user1)) { // Memeriksa apakah nama_role adalah "staff"
                System.out.println("Tampilan sesuai dengan role masing-masing");
            //bagian ini sistem menampilkan menu dan fitur sesuai dengan rolenya
            } else {
                System.out.println("Role tidak valid");
            }
        } else {
            System.out.println("Nama user tidak valid");
        }

        sc.close();
    }
}
