import java.util.Scanner;

public class LatihanIndividu2_18 {
    public static void main(String[] args) {
        // Data pengguna yang tersimpan di sistem 
        String usernameSistem = "Adri_Favian";
        String passwordSistem = "12345";

        // Minta pengguna memasukkan username dan password
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = sc.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = sc.nextLine();

        // Periksa apakah username dan password sesuai dengan data sistem
        if (usernameInput.equals(usernameSistem) && passwordInput.equals(passwordSistem)) {
            System.out.println("Autentikasi berhasil. Selamat datang " + usernameInput + "!");
        } else {
            System.out.println("Username dan password salah.");
        }
        sc.close();
    }
}


