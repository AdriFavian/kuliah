public class Hotel {
    String nama, kota;
    int harga;
    Byte bintang;

    Hotel (String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilHotel (){
        System.out.printf("%-12s: %s\n", "Nama Hotel: ", nama);
        System.out.printf("%-12s: %s\n", "Kota: ", kota);
        System.out.printf("%-12s: %d\n", "Harga: ", harga);
        System.out.printf("%-12s: %d\n", "bintang: ", bintang);
    }
}