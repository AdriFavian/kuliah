import java.util.Scanner;

public class Pemilihan2Percobaan1_18 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner (System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = input01.nextInt();
        
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Merupakan Tahun Kabisat");
            else if ((tahun % 400) == 0)
                System.out.println("Merupakan Tahun Kabisat");
            else
            System.out.println("Bukan Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");
    }
}