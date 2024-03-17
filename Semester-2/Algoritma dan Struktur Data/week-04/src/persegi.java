package src;
public class persegi {
    int keliling;

    int hitungKeliling(int sisi){
        keliling = sisi*4;
        return keliling;
    }

    public static void main(String[] args) {
        persegi[] hai = new persegi[1];
        hai[0].hitungKeliling(7); 
    }
}