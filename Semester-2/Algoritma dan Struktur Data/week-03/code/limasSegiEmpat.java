public class limasSegiEmpat {
    double panjangAlas, tinggi;
    public double getLuasPermukaan() {
        return Math.pow(panjangAlas, 2) + 4 * (panjangAlas * tinggi / 2);
    }

    public double getVolume() {
        return Math.pow(panjangAlas, 2) * tinggi / 3;
    }
}
