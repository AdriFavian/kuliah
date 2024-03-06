package LatihanPraktikum;
import java.lang.Math;

public class Kerucut {

    public int jarijari;
    public int sisimiring;

    public double getTinggi() {
        return Math.pow(sisimiring, 2) - Math.pow(jarijari, 2);
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jarijari * (sisimiring + jarijari);
    }

    public double hitungVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(jarijari, 2) * getTinggi();
    }
    
}