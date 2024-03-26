# Week 06 - JOBSHEET 5 - SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

---
## Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort

### Langkah-langkah Percobaan

`Mahasiswa.java`

```java
public class Mahasiswa{
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa (String n, int t, int u, double i){
        nama =n;
        thnMasuk = t;
        umur = u;
        ipk =i;
    }

    void tampil (){
        System.out.printf("%-12s: %s\n", "Nama", nama);
        System.out.printf("%-12s: %d\n", "Tahun Masuk", thnMasuk);
        System.out.printf("%-12s: %d\n", "Umur", umur);
        System.out.printf("%-12s: %.2f\n", "IPK", ipk);
    }
}
```

`DaftarMahasiswaBerprestasi.java`

```java
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs [] =new Mahasiswa [5];
    int idx;

    void tambah(Mahasiswa m){//menambahkan objek ke atribut listMhs
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil (){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }

    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){//j-1 atau i
                    //proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }    
            }
        }
    }
}
```

`mainMahasiswa.java`

```java
public class mainMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa ("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa ("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa ("Dompu", 2018, 19, 3.5); 
        Mahasiswa m4 = new Mahasiswa ("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa ("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah (m3);
        list.tambah (m4);
        list.tambah (m5);
        
        System.out.println("Data mahasiswa sebelum sorting: "); 
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk:");
        System.out.println("(Bubble Sort)");
        list.bubbleSort();
        list.tampil();
    }
}
```


### Verifikasi Hasil Percobaan

Output:

```txt
Data mahasiswa sebelum sorting: 
Nama        : Nusa
Tahun Masuk : 2017
Umur        : 25
IPK         : 3.00
---------------------
Nama        : Rara
Tahun Masuk : 2012
Umur        : 19
IPK         : 4.00
---------------------
Nama        : Dompu
Tahun Masuk : 2018
Umur        : 19
IPK         : 3.50
---------------------
Nama        : Abdul
Tahun Masuk : 2017
Umur        : 23
IPK         : 2.00
---------------------
Nama        : Ummi
Tahun Masuk : 2019
Umur        : 21
IPK         : 3.75
---------------------
Data mahasiswa setelah sorting desc berdasarkan ipk:
(Bubble Sort)
Nama        : Rara
Tahun Masuk : 2012
Umur        : 19
IPK         : 4.00
---------------------
Nama        : Ummi
Tahun Masuk : 2019
Umur        : 21
IPK         : 3.75
---------------------
Nama        : Dompu
Tahun Masuk : 2018
Umur        : 19
IPK         : 3.50
---------------------
Nama        : Nusa
Tahun Masuk : 2017
Umur        : 25
IPK         : 3.00
---------------------
Nama        : Abdul
Tahun Masuk : 2017
Umur        : 23
IPK         : 2.00
---------------------
```

### Pertanyaan
1. Terdapat di method apakah proses bubble sort?</br>

    **Jawab**:</br>

    proses buble sort terdapat pada di method `bubbleSort()` di class DaftarMahasiswaBerprestasi

    `bubbleSort()`:
    ```java
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){//j-1 atau i
                    //proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }    
            }
        }
    }
    ```
    </br>

2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
    ```java
    if(listMhs[j].ipk > listMhs[j-1].ipk){//j-1 atau i
                        //proses swap atau penukaran
                        Mahasiswa tmp = listMhs[j];
                        listMhs[j] = listMhs[j-1];
                        listMhs[j-1] = tmp;
                    }    
                }
    ```
    untuk apakah proses tersebut?</br></br>
    **Jawab**:</br>
    - Proses tersebut merupakan bagian dari algoritma pengurutan secara Bubble Sort.</br>
    - Digunakan untuk mengurutkan array `listMhs` berdasarkan nilai IPK `Mahasiswa` secara descending.</br> 
    - Pada baris kode program kondisi if, program mengecek apakah nilai IPK pada posisi `j` dalam array > dari nilai IPK pada posisi sebelumnya `(j-1)`. Dikarenakan kita melakukan pengurutan descending. Jika benar maka kedua elemen tidak dalam urutan yang benar sehingga perlu ditukar posisi.</br>
    - Proses penukaran posisi dimulai pada nilai posisi `j` disimpan sementara ke var `tmp`. Lalu nilai pada posisi `j-1` dipindahkan ke posisi `j`. Terakhir nilai yang disimpan sementara dalam `tmp` dipindah ke posisi `j-1`.</br></br>

3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
    ```java
    for(int i=0; i<listMhs.length-1; i++){
                for(int j=1; j < listMhs.length-i; j++){
    ```

    a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j ?</br>
        **Jawab**:</br>
        Perulangan i:</br>
        - digunakan untuk mengulangi proses sort sebanyak n-1, n adalah jumlah elemen dalam array.</br>
        - variabel `i` menentukan posisi elemen yang akan dibandingkan dengan elemen di sebelahnya.</br></br>
        Perulangan j:</br>
        - digunakan untuk melakukan perbandingan dan penukaran elemen pada setiap iterasi perulangan `i`.</br>
        - Pada setiap iterasi `i`, perulangan `j` membandingkan elemen pada posisi j dengan elemen di posisi `j-1`.</br>

    b. Mengapa syarat dari perulangan i adalah `i<listMhs.length-1` ?</br>
        **Jawab**:</br>
        Karena dalam pengurutan Bubble Sort, ketika telah mencapai tahap pengurutan terakhir, hanya akan tersisa 2 elemen yang perlu dibandingkan dan diurutkan. Oleh karena itu `i<listMhs.length-1` memastikan program tidak perlu menjalankan loop untuk elemen terakhir, karena sudah tidak ada lagi elemen yang tersisa untuk dibandingkan dengannya.</br>

    c. Mengapa syarat dari perulangan j adalah `j<listMhs.length-i` ?</br>
        **Jawab**:</br>
        Digunakan untuk memastikan perulangan `j` berhenti sebelum mencapai elemen yang sudah diurutkan pada tahap-tahap sebelumnya. Elemen terakhir array menjadi urut, karena dengan setiap iterasi `i`. Sehingga program tidak melakukan penukaran yang tidak perlu.</br>

    d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan `i` akan berlangsung? Dan ada berapa tahap bubble sort yang ditempuh?</br>
        **Jawab**:</br>
        - Perulangan `i` berlangsung sebanyak 49 kali, karena `listMhs.length-1`, yaitu 50-1 = 49.</br>
        - Ada 49 tahap bubble sort yang ditempuh, karena setelah 49 tahap, semua elemen akan pada di posisi yang benar, dengan elemen terakhir tidak perlu diproses karena sudah otomatis terurut akibat proses sebelumnya.</br>

---
## Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort

## Langkah-langkah Percobaan

Menambahkan method **selectionSort()** di `DaftarMahasiswaBerprestasi.java`

```java
   void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
```

menambahkan di `mainMahasiswa.java`

```java
System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk:");
System.out.println("(Selection Sort)");
list.selectionSort();
list.tampil();
```

### Verifikasi Hasil Percobaan

Output:

```txt
Data mahasiswa setelah sorting asc berdasarkan ipk:
(Selection Sort)
Nama        : Abdul
Tahun Masuk : 2017
Umur        : 23
IPK         : 2.00
---------------------
Nama        : Nusa
Tahun Masuk : 2017
Umur        : 25
IPK         : 3.00
---------------------
Nama        : Dompu
Tahun Masuk : 2018
Umur        : 19
IPK         : 3.50
---------------------
Nama        : Ummi
Tahun Masuk : 2019
Umur        : 21
IPK         : 3.75
---------------------
Nama        : Rara
Tahun Masuk : 2012
Umur        : 19
IPK         : 4.00
---------------------
```
### Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```java
int idxMin = i;
for(int j=i+1; j < listMhs.length; j++){
    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
        idxMin = j;
    }
}
```
Untuk apakah proses tersebut, jelaskan!</br>
    **Jawab**:</br>
    - Proses tersebut merupakan bagian dari algoritma pengurutan Selection Sort.</br>
    - Mengurutkan `Mahasiswa` berdasarkan nilai IPK, dengan urutan ascending.</br>
    - Proses pengurutan dimulai dari inisialisasi `idxMin` (index minimum) ke `i`, `i` adalah posisi awal dari array yang belum terurut.</br>
    
---
## Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

### Langkah-langkah Percobaan

Menambahkan method **insertionnSort()** di `DaftarMahasiswaBerprestasi.java`

```java
    void insertionSort() {
        for (int i=1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
```

menambahkan di `mainMahasiswa.java`

```java
System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk:");
System.out.println("(Insertion Sort)");
list.insertionSort();
list.tampil();
```

### Verifikasi Hasil Percobaan

Output:

```txt
Data mahasiswa setelah sorting asc berdasarkan ipk:
(Insertion Sort)
Nama        : Abdul
Tahun Masuk : 2017
Umur        : 23
IPK         : 2.00
---------------------
Nama        : Nusa
Tahun Masuk : 2017
Umur        : 25
IPK         : 3.00
---------------------
Nama        : Dompu
Tahun Masuk : 2018
Umur        : 19
IPK         : 3.50
---------------------
Nama        : Ummi
Tahun Masuk : 2019
Umur        : 21
IPK         : 3.75
---------------------
Nama        : Rara
Tahun Masuk : 2012
Umur        : 19
IPK         : 4.00
---------------------
```

### Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.</br>
    **Jawab**:</br>
    modifikasi `InsertionSort()` dengan mengubah tanda lebih besar `>` menjadi lebih kecil `<`, untuk memeriksa apakah IPK mahasiswa di indeks `j-1` lebih kecil dari IPK mahasiswa `temp`. Jika benar maka elemen dipindah ke posisi `j`.

```java
    void insertionSortDesc() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {//modifikasi disini
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
```

Output `InsertionSortDesc()` sorting descending:
```txt
Data mahasiswa setelah sorting desc berdasarkan ipk:
(Insertion Sort)
Nama        : Rara
Tahun Masuk : 2012
Umur        : 19
IPK         : 4.00
---------------------
Nama        : Ummi
Tahun Masuk : 2019
Umur        : 21
IPK         : 3.75
---------------------
Nama        : Dompu
Tahun Masuk : 2018
Umur        : 19
IPK         : 3.50
---------------------
Nama        : Nusa
Tahun Masuk : 2017
Umur        : 25
IPK         : 3.00
---------------------
Nama        : Abdul
Tahun Masuk : 2017
Umur        : 23
IPK         : 2.00
---------------------
```

---
## Latihan Praktikum
Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang
mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah
satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter
yang diinginkan user. Daftar penginapan ini harus dapat disorting berdasarkan: </br>

1. Harga dimulai dari harga termurah ke harga tertinggi.
2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1) 

Buatlah proses sorting data untuk kedua filter tersebut dengan menggunakan algoritma **bubble sort** dan **selection sort**
</br></br></br></br>

Dari 3 class diagram yang ada, saya membuat code sebagai berikut:

`Hotel.java`:
```java
public class Hotel {
    String nama, kota;
    int harga;
    Byte bintang;

    Hotel (String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilHotel (){
        System.out.printf("%-12s: %s\n", "Nama Hotel: ", nama);
        System.out.printf("%-12s: %s\n", "Kota: ", kota);
        System.out.printf("%-12s: %d\n", "Harga: ", harga);
        System.out.printf("%-12s: %d\n", "bintang: ", bintang);
    }
}
```
</br></br>
Pada file `HotelService.java`, saya memodifikasi agar pengguna dapat memilih menu diawal untuk mensortir data Hotel sesuai yang diinginkan di method `menuHotel()`. Lalu inputan menu akan digunakan untuk memproses sorting di method `bubbleSortHotel()` dan `selectionSortHotel()`. </br></br>
Dalam kasus yang diminta pada soal, 
- Harga dimulai dari harga termurah ke harga tinggi diproses di switch case pilihan menu `2`.</br>
 - Rating bintang dari bintang tertinggi (5) ke terendah (1) diproses di switch case pilihan menu `3`.
</br></br>

`HotelService.java`:
```java
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
```
</br>

`MainHotel.java`:

```java
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
```
</br>

Berikut output yang sesuai diminta pada soal, </br>
sorting harga termurah ke harga tertinggi

```txt
Sorting berdasarkan: 
1. harga: tinggi-rendah
2. harga: rendah-tinggi
3. bintang: tinggi-rendah
4. bintang: rendah-tinggi
Pilih menu: 2
==========BUBBLE SORT============
Nama Hotel: : Kontena Hotel
Kota:       : Batu
Harga:      : 300000
bintang:    : 3
---------------------
Nama Hotel: : Ijen Suites Resort
Kota:       : Malang
Harga:      : 550000
bintang:    : 4
---------------------
Nama Hotel: : Millennium Hotel
Kota:       : Jakarta
Harga:      : 630000
bintang:    : 4
---------------------
Nama Hotel: : JW Marriott
Kota:       : Surabaya
Harga:      : 1000000
bintang:    : 5
---------------------
Nama Hotel: : Mulia Senayan
Kota:       : Jakarta
Harga:      : 1500000
bintang:    : 5
---------------------
==========SELECTION SORT============
Nama Hotel: : Kontena Hotel
Kota:       : Batu
Harga:      : 300000
bintang:    : 3
---------------------
Nama Hotel: : Ijen Suites Resort
Kota:       : Malang
Harga:      : 550000
bintang:    : 4
---------------------
Nama Hotel: : Millennium Hotel
Kota:       : Jakarta
Harga:      : 630000
bintang:    : 4
---------------------
Nama Hotel: : JW Marriott
Kota:       : Surabaya
Harga:      : 1000000
bintang:    : 5
---------------------
Nama Hotel: : Mulia Senayan
Kota:       : Jakarta
Harga:      : 1500000
bintang:    : 5
---------------------
```
</br>
Sorting rating bintang tertinggi (5) ke terendah (1)

```txt
Sorting berdasarkan: 
1. harga: tinggi-rendah
2. harga: rendah-tinggi
3. bintang: tinggi-rendah
4. bintang: rendah-tinggi
Pilih menu: 3
==========BUBBLE SORT============
Nama Hotel: : Mulia Senayan
Kota:       : Jakarta
Harga:      : 1500000
bintang:    : 5
---------------------
Nama Hotel: : JW Marriott
Kota:       : Surabaya
Harga:      : 1000000
bintang:    : 5
---------------------
Nama Hotel: : Millennium Hotel
Kota:       : Jakarta
Harga:      : 630000
bintang:    : 4
---------------------
Nama Hotel: : Ijen Suites Resort
Kota:       : Malang
Harga:      : 550000
bintang:    : 4
---------------------
Nama Hotel: : Kontena Hotel
Kota:       : Batu
Harga:      : 300000
bintang:    : 3
---------------------
==========SELECTION SORT============
Nama Hotel: : Mulia Senayan
Kota:       : Jakarta
Harga:      : 1500000
bintang:    : 5
---------------------
Nama Hotel: : JW Marriott
Kota:       : Surabaya
Harga:      : 1000000
bintang:    : 5
---------------------
Nama Hotel: : Millennium Hotel
Kota:       : Jakarta
Harga:      : 630000
bintang:    : 4
---------------------
Nama Hotel: : Ijen Suites Resort
Kota:       : Malang
Harga:      : 550000
bintang:    : 4
---------------------
Nama Hotel: : Kontena Hotel
Kota:       : Batu
Harga:      : 300000
bintang:    : 3
---------------------
```







