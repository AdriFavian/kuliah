package minggu5;
import java.util.ArrayList;

public class mobil18 {
    public String merk;
    public String tipe;
    public int tahun;
    public int topAcceleration, topPower;

    // digunakan di main, menyimpan data ke array 
    public static ArrayList<String[]> semuaDataMobil = new ArrayList<>();

    public mobil18(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;

        semuaDataMobil.add(new String[]{merk, tipe, String.valueOf(tahun), String.valueOf(topAcceleration), String.valueOf(topPower)});
    }

    // method statis untuk operasi Divide n Conquer
    public static int findMaxAccelDC(mobil18[] cars) {
        return maxAccelDC(cars, 0, cars.length - 1);
    }
        private static int maxAccelDC(mobil18[] cars, int l, int r) {
            if (l == r) {
                return cars[l].topAcceleration;
            } else {
                int mid = (l + r) / 2;
                int leftMax = maxAccelDC(cars, l, mid);
                int rightMax = maxAccelDC(cars, mid + 1, r);
                return Math.max(leftMax, rightMax);
            }
        }
        
    // method statis untuk operasi Divide n Conquer
    public static int findMinAccelDC(mobil18[] cars) {
        return minAccelDC(cars, 0, cars.length - 1);
    }
        private static int minAccelDC(mobil18[] cars, int l, int r) {
            if (l == r) {
                return cars[l].topAcceleration;
            } else {
                int mid = (l + r) / 2;
                int leftMin = minAccelDC(cars, l, mid);
                int rightMin = minAccelDC(cars, mid + 1, r);
                return Math.min(leftMin, rightMin);
            }
        }

    public static double rataRataBF(mobil18[] cars) {
        double totalPower = 0;
        for (mobil18 car : cars) {
            totalPower += car.topPower;
        }
        return totalPower / cars.length;
    }
}
