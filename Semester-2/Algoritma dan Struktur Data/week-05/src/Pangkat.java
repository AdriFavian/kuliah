public class Pangkat {
    public int nilai,pangkat;

    Pangkat(int a, int n){
        nilai = a;
        pangkat = n;
    }

    int PangkatBF(int a, int n){
        int hasil = 1;
        for(int i=0; i<n; i++){
            hasil *= a;
        }
        return hasil;
    }

    int PangkatDC(int a, int n){
        if(n==1){
            return a;
        }else {
            if(n%2==1) {//bil ganjil
                return (PangkatDC(a,n/2)*PangkatDC(a,n/2)*a);
            }else{
                return (PangkatDC(a,n/2)*PangkatDC(a,n/2));
            }
        }
    }
}