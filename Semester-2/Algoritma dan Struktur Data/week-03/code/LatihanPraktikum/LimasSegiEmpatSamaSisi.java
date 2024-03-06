package LatihanPraktikum;
public class LimasSegiEmpatSamaSisi {

    public int sisiAlas;
    public int tinggiLimas;

    public double hitungLuasPermukaan() {
        return (sisiAlas * sisiAlas) + (0.5 * (4 * sisiAlas) * tinggiLimas);
    }

    public double hitungVolume() {
        return (1.0 / 3) * (sisiAlas * sisiAlas) * tinggiLimas;
    }
    
}