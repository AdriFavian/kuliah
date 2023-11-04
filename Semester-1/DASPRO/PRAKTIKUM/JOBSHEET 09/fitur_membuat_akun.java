import java.util.Scanner;

public class fitur_membuat_akun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = new String[2];
        String[] passwords = new String[2];
        String[] roles = new String[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan nama:");
            usernames[i] = scanner.nextLine();
            System.out.println("Masukkan password:");
            passwords[i] = scanner.nextLine();
            System.out.println("Masukkan role:");
            roles[i] = scanner.nextLine();
        }

        // Prose Login
        System.out.println("Masukkan usernama:");
        String username = scanner.nextLine();
        System.out.println("Masukkan password:");
        String password = scanner.nextLine();

        boolean isUserFound = false;
        for (int i = 0; i < 10; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                System.out.println("Welcome " + roles[i]);
                isUserFound = true;
                break;
            }
        }

        if (!isUserFound) {
            System.out.println("Invalid username or password.");
        }
    }
}
