public class Buku18 {
    
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    public Buku18() {
        //default constructor
    }

    public Buku18 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang); 
        System.out.println("Jumlah halaman: " + halaman); 
        System.out.println("Sisa stok: " + stok); 
        System.out.println("Harga: " + harga); 
        System.out.println("Harga total: " + hitungHargaTotal());
        System.out.println("Diskon: " + hitungDiskon());
        System.out.println("Harga bayar: " + hitungHargaBayar());
    }

    void terjual(int jml, String judul) {
        if (stok > 0) {
        stok-=jml;
        } else {
        System.out.println("Stok buku " + judul + " sudah habis!");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * terjual;
    }
    
    double hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        if (hargaTotal > 150000) {
            return hargaTotal * 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return hargaTotal * 0.05;
        } else {
            return 0;
        }
    }
    
    int hitungHargaBayar() {
        return hitungHargaTotal() - (int)hitungDiskon();
    }
}