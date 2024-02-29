public class kerucut {
    public double jariJari,sisiMiring;
    public double getLuasPermukaan() {
        return Math.PI * jariJari * (sisiMiring + jariJari);
    }

    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * sisiMiring;
    }
}
