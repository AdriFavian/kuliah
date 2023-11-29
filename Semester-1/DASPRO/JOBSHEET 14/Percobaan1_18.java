public class Percobaan1_18 {
    static int faktorialRekursif(int n) {
        if (n==0) {
            return (1);
        } else {
            return (n* faktorialRekursif(n-1));
        } // return fungsi sendiri
    }
    static int faktorialInteratif (int n) {
        int faktor =1;
        for (int i=n; i>=1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialInteratif(5));
    }
}
