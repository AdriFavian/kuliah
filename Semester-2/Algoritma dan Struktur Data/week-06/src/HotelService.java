import java.util.Scanner;

public class HotelService {
    Hotel listHotel [] = new Hotel[5];
    int idx;

    void tambahHotel(Hotel m){
        if (idx<listHotel.length){
            listHotel[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampilHotel (){
        for(Hotel m : listHotel){
            m.tampilHotel();
            System.out.println("---------------------");
        }
    }

    void menuHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sorting berdasarkan: ");
        System.out.println("1. harga: tinggi-rendah");
        System.out.println("2. harga: rendah-tinggi");
        System.out.println("3. bintang: tinggi-rendah");
        System.out.println("4. bintang: rendah-tinggi");
        System.out.print("Pilih menu: ");
        int pilihan = sc.nextInt();
        sc.close();
        switch (pilihan) {
            case 1:
                System.out.println("==========BUBBLE SORT============");
                bubbleSortHotel(pilihan);
                tampilHotel();
                System.out.println("==========SELECTION SORT============");
                selectionSortHotel(pilihan);
                tampilHotel();
                break;
            case 2:
                System.out.println("==========BUBBLE SORT============");
                bubbleSortHotel(pilihan);
                tampilHotel();
                System.out.println("==========SELECTION SORT============");
                selectionSortHotel(pilihan);
                tampilHotel();
                break;
            case 3:
                System.out.println("==========BUBBLE SORT============");
                bubbleSortHotel(pilihan);
                tampilHotel();
                System.out.println("==========SELECTION SORT============");
                selectionSortHotel(pilihan);
                tampilHotel();
                break;
            case 4:
                System.out.println("==========BUBBLE SORT============");
                bubbleSortHotel(pilihan);
                tampilHotel();
                System.out.println("==========SELECTION SORT============");
                selectionSortHotel(pilihan);
                tampilHotel();
                break;
            default: 
                System.out.println("Cek pilihan anda!");
                break;
        }
    }

    void bubbleSortHotel(int pilihan){
        switch (pilihan) {
            case 1://harga: tinggi-rendah
                for(int i=0; i<listHotel.length-1; i++){
                    for(int j=1; j < listHotel.length-i; j++){
                        if(listHotel[j].harga > listHotel[j-1].harga){
                            Hotel tmp = listHotel[j];
                            listHotel[j] = listHotel[j-1];
                            listHotel[j-1] = tmp;
                        }    
                    }
                }       
                break;
            case 2://harga: rendah-tinggi
                for(int i=0; i<listHotel.length-1; i++){
                    for(int j=1; j < listHotel.length-i; j++){
                        if(listHotel[j].harga < listHotel[j-1].harga){
                            Hotel tmp = listHotel[j];
                            listHotel[j] = listHotel[j-1];
                            listHotel[j-1] = tmp;
                        }    
                    }
                } 
                break;
            case 3://bintang: tinggi-rendah 
                for(int i=0; i<listHotel.length-1; i++){
                    for(int j=1; j < listHotel.length-i; j++){
                        if(listHotel[j].bintang > listHotel[j-1].bintang){
                            Hotel tmp = listHotel[j];
                            listHotel[j] = listHotel[j-1];
                            listHotel[j-1] = tmp;
                        }    
                    }
                }
                break;
            case 4://bintang: rendah-tinggi
                for(int i=0; i<listHotel.length-1; i++){
                    for(int j=1; j < listHotel.length-i; j++){
                        if(listHotel[j].bintang < listHotel[j-1].bintang){
                            Hotel tmp = listHotel[j];
                            listHotel[j] = listHotel[j-1];
                            listHotel[j-1] = tmp;
                        }    
                    }
                }
                break;
            default:
                break;
        }
    }

    void selectionSortHotel(int pilihan){
        switch (pilihan) {
            case 1://harga: tinggi-rendah
                for(int i=0; i<listHotel.length-1; i++){
                    int idxMin = i;
                    for(int j=i+1; j < listHotel.length; j++){
                        if (listHotel[j].harga > listHotel[idxMin].harga) {
                            idxMin = j;
                        }
                    }
                    Hotel tmp = listHotel[idxMin];
                    listHotel[idxMin] = listHotel[i];
                    listHotel[i] = tmp;
                }       
                break;
            case 2://harga: rendah-tinggi
                for(int i=0; i<listHotel.length-1; i++){
                    int idxMin = i;
                    for(int j=i+1; j < listHotel.length; j++){
                        if (listHotel[j].harga < listHotel[idxMin].harga) {
                            idxMin = j;
                        }
                    }
                    Hotel tmp = listHotel[idxMin];
                    listHotel[idxMin] = listHotel[i];
                    listHotel[i] = tmp;
                }
                break;
            case 3://bintang: tinggi-rendah
                for(int i=0; i<listHotel.length-1; i++){
                    int idxMin = i;
                    for(int j=i+1; j < listHotel.length; j++){
                        if (listHotel[j].bintang > listHotel[idxMin].bintang) {
                            idxMin = j;
                        }
                    }
                    Hotel tmp = listHotel[idxMin];
                    listHotel[idxMin] = listHotel[i];
                    listHotel[i] = tmp;
                }
                break;
            case 4://bintang: rendah-tinggi
                for(int i=0; i<listHotel.length-1; i++){
                    int idxMin = i;
                    for(int j=i+1; j < listHotel.length; j++){
                        if (listHotel[j].bintang < listHotel[idxMin].bintang) {
                            idxMin = j;
                        }
                    }
                    Hotel tmp = listHotel[idxMin];
                    listHotel[idxMin] = listHotel[i];
                    listHotel[i] = tmp;
                }
                break;
            default:
                break;
        }
    }
}
