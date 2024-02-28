public class ArrayObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang(); 
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;
        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        for (int i=0; i<ppArray.length; i++) {
            System.out.println("Persegei Panjang ke-" + (i) + ", panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}