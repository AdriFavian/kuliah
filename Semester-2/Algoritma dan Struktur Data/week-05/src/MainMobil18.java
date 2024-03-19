package minggu5;
public class MainMobil18 {
    public static void main(String[] args) {
        mobil18[] mobil = {
                new mobil18("BMW", "M2 Coupe", 2016, 6816, 728),
                new mobil18("Ford", "Fiesta ST", 2014, 3921, 575),
                new mobil18("Nissan", "370Z", 2009, 4360, 657),
                new mobil18("Subaru", "BRZ", 2014, 4058, 609),
                new mobil18("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new mobil18("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new mobil18("Toyota", "86/GT86", 2014, 4180, 609),
                new mobil18("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int maxAccel = mobil18.findMaxAccelDC(mobil);
        int minAccel = mobil18.findMinAccelDC(mobil);
        double rataRata = mobil18.rataRataBF(mobil);

        // print tabel
        System.out.printf("%-15s %-20s %-10s %-20s %-10s%n", "Merk", "Tipe", "Tahun", "Top Acceleration", "Top Power");
        System.out.printf("%-15s %-20s %-10s %-20s %-10s%n", "---------------", "--------------------", "----------", "--------------------", "----------");
        for (String[] dataMobil : mobil18.semuaDataMobil) {
            System.out.printf("%-15s %-20s %-10s %-20s %-10s%n", dataMobil[0], dataMobil[1], dataMobil[2], dataMobil[3], dataMobil[4]);
        }

        System.out.printf("\n%-28s: %d%n", "Top acceleration tertinggi", maxAccel);
        System.out.printf("%-28s: %d%n", "Top acceleration terendah", minAccel);
        System.out.printf("%-28s: %.2f%n", "Rata-rata power", rataRata);
    }
}
