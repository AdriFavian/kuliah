public class Mahasiswa{
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa (String n, int t, int u, double i){
        nama =n;
        thnMasuk = t;
        umur = u;
        ipk =i;
    }

    void tampil (){
        System.out.printf("%-12s: %s\n", "Nama", nama);
        System.out.printf("%-12s: %d\n", "Tahun Masuk", thnMasuk);
        System.out.printf("%-12s: %d\n", "Umur", umur);
        System.out.printf("%-12s: %.2f\n", "IPK", ipk);
    }
}