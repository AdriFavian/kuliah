public class Individu_Nomor3_18 {
    public static void main(String[] args) {
       // tinggi
        int tinggi = 5;

        //baris dan kolom
        for (int i = 0; i < tinggi; i++) {
            // spasi kosong
            for (int j = 0; j < tinggi - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(i + 1 +" ");
            }
            //newline setelah perulangan
            System.out.println();
        }
    }
}