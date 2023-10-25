import java.util.Scanner;
public class LinearSearch18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int size = input.nextInt();
        int[] arrayInt = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + " : ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt [i] == key) {
                hasil = i; 
                break;
            }
        }

        if (hasil == -1) {
            System.out.println("Key tidak ditemukan dalam array.");
        } else {
            System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
        }
    }
}
