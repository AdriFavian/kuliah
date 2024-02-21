public class Buku18 {
    
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku18() {

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
}