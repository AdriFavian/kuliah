import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<ppArray.length; i++) {
            System.out.println("Persegei Panjang ke-" + (i) + ", panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}