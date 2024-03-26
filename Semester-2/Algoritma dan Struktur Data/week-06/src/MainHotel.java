public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Mulia Senayan", "Jakarta", 1500000, (byte)5); 
        Hotel h2 = new Hotel("Millennium Hotel", "Jakarta", 630000, (byte)4); 
        Hotel h3 = new Hotel("JW Marriott", "Surabaya", 1000000, (byte)5); 
        Hotel h4 = new Hotel("Kontena Hotel", "Batu", 300000, (byte)3); 
        Hotel h5 = new Hotel("Ijen Suites Resort", "Malang", 550000, (byte)4); 
        
        list.tambahHotel(h1);
        list.tambahHotel(h2);
        list.tambahHotel(h3);
        list.tambahHotel(h4);
        list.tambahHotel(h5);

        list.menuHotel();
    }
}
