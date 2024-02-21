# Week 02 - JOBSHEET 2 - OBJECT 

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

## Praktikum

### Percobaan 1: Deklarasi Class, Atribut dan Method
membuat class beserta atribut dan method yang dimilikinya.

Code:
 
```
public class Buku18 {
    
    String judul, pengarang;
    int halaman, stok, harga;
    
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang); 
        System.out.println("Jumlah halaman: " + halaman); 
        System.out.println("Sisa stok: " + stok); 
        System.out.println("Harga: " + harga); 
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
```
#### 2.1.2 Verifikasi Hasil Percobaan

![image](./img/img1.png)

#### 2.1.3 Pertanyaan

1). Sebutkan dua karakteristik class atau object!
2). Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Buku? Sebutkan apa saja atributnya!
3). Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4). Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
5). Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?
6). Commit dan push kode program ke Github!

#### 2.1.4 Jawaban

1.) - Encapsulation: menggabungkan data dan method menjadi satu kesatuan
    - Inheritance: memungkinkan untuk reuse code dan mempermudah pemograman yang kompleks
2.)  ada 5:
    - judul: String
    - pengarang: String
    - halaman: int
    - stok: int
    - harga: int
3.) ada 4:
    - tampilInformasi(): void
    - terjual(jml: int): void
    - restock(n: int): void
    - gantiHarga(hrg: int): int
4.) 




