package LatihanPraktikum;
public class Bola {

    public int jarijari;

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jarijari, 2);
    }

    public double hitungVolume() {
        return (4.0/3) * Math.PI * Math.pow(jarijari, 3);
    }
    
}
