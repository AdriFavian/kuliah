public class daspro_bintang_right {
    public static void main(String[] args) {
            int i = 0;
            while(i <= 10) {
                // spasi kosong sebelum angak dicetak
                int j = 0;
                while (j < 10 - i) {
                    System.out.print(" ");
                    j++;
                }
                
                int k = 0;
                while(k < i) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            } 
    }
}