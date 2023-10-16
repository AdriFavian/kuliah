public class MandiriC_Tugas7 {
    public static void main(String[] args) {
        System.out.println("deret bilangan 1 sampai 50, kecuali bilangan kelipatan 3: ");
        for(int i =1; i <= 50; i++) {
            if ( i % 3 != 0){
                System.out.print(i +  ", ");
            }
        }
    }
} 