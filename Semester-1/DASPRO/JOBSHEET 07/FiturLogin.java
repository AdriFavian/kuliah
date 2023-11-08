import java.util.Scanner;

public class FiturLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username1 = "user1";
        String password1 = "password1";
        String username2 = "user2";
        String password2 = "password2";
        String username3 = "user3";
        String password3 = "password3";

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = false;
        int i = 1;
        while (i <= 3 && !isAuthenticated) {
            if (i == 1 && username.equals(username1) && password.equals(password1)) {
                isAuthenticated = true;
            } else if (i == 2 && username.equals(username2) && password.equals(password2)) {
                isAuthenticated = true;
            } else if (i == 3 && username.equals(username3) && password.equals(password3)) {
                isAuthenticated = true;
            }
            i++;
        }

        if (isAuthenticated) {
            System.out.println("Anda berhasil Login!");
            // code jika pengguna berhasil login
        } else {
            System.out.println("Invalid username or password. Mohon coba lagi.");
        }
    }
}