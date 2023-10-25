import java.util.Scanner;

public class individu_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan bilangan bulat ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println("Rata-rata dari seluruh elemen array adalah " + average);
    }
}