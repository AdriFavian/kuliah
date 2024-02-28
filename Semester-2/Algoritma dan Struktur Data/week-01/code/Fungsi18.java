import java.util.Scanner;
public class Fungsi18 {
    static Scanner sc = new Scanner(System.in);
    static int[][] tokoBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static void main(String[] args) {
        pendapatan();
        updateStock(4);
        sc.close();
    }

    static void pendapatan() {
        System.out.println("============================================================");
        System.out.println("Pendapatan Setiap Cabang");
        System.out.println("============================================================");
        System.out.printf("%-14s %-9s %-7s %-9s %-6s %-20s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar", "Pendapatan");
        System.out.println("------------------------------------------------------------");

        for (int i=0; i< tokoBunga.length; i++) {
            int pendapatan = tokoBunga[i][0] * 75000
                           + tokoBunga[i][1] * 50000
                           + tokoBunga[i][2] * 60000
                           + tokoBunga[i][3] * 10000;
        
            System.out.printf("%-14s %-9s %-7s %-9s %-6s %-10s \n", "tokoBunga " + (i + 1),
                tokoBunga[i][0], tokoBunga[i][1], tokoBunga[i][2], tokoBunga[i][3],
                "Rp " + pendapatan);
        }
        
    }

    static void updateStock(int cabang) {
        int index = cabang - 1;

        System.out.println("============================================================");
        System.out.println("Stok bunga pada tokoBunga " + cabang) ;
        System.out.println("============================================================");
        
        for (int i = 0; i < tokoBunga[3].length; i++) {
            System.out.println(namaBunga[i] + ": " + tokoBunga[3][i]);
        }

        System.out.println("--------------------------------------");
        System.out.print("Apakah ada bunga yang mati? (y/n) : ");
        String pilihan = sc.next();

        if (pilihan.equalsIgnoreCase("y")) {
            int[] penguranganBunga = new int[4];

            for (int i=0; i < namaBunga.length; i++) {
                System.out.print("Bunga " + namaBunga[i] + ": ");
                penguranganBunga[i] = sc.nextInt();
            }

            System.out.println("============================================================");
            System.out.println("Stok bunga saat ini: ");
            System.out.println("============================================================");

            for (int i = 0; i < namaBunga.length; i++) {
                int stokSetelahPengurangan = tokoBunga[index][i] - penguranganBunga[i];
                System.out.println(namaBunga[i] + ": " + stokSetelahPengurangan);
            }
        }
    }
}
