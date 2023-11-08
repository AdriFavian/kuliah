import java.util.Scanner;

public class LatihanSuhu_18{
    public static void main(String[] args) {
        int suhu;
        String hujan;
       
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        suhu = input.nextInt();
        System.out.print("Apakah sedang hujan? (y/n): ");
        hujan = input.next();

        if (suhu > 27) {
            
            System.out.println("Memakai dress.");

            if (hujan.equals("y")) { 
                System.out.println("Membawa payung.");
            } else {
                
                System.out.println("Memakai sunscreen.");
            }
        } else {
            System.out.println("Memakai celana panjang.");
        }
    }
}