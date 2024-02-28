# Week 01 - JOBSHEET 3 - ARRAY OF OBJECT

**Nama :** Mohammad Adri Favian<br>
**NIM :** 2341720185<br>
**Kelas :** TI-1B<br>
**Absen :** 18

### Percobaan 1 : Membuat Array dari Object, Mengisi dan Menampilkan

#### 3.2.1 Langkah-langkah Percobaan
Membuat project baru `ArrayObjects` dan class `PersegiPanjang`

code `PersegiPanjang`:

```java
public class PersegiPanjang {
    public int panjang;
    public int lebar;
}
```

code `ArrayObjects`:

```java
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
```

#### 3.2.2 Verifikasi Hasil Percobaan

![image](./img/img1.png)

#### 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :
```
ppArray[1] = new PersegiPanjang();
```
3. Apa yang dimaksud dengan kode berikut ini:
```
PersegiPanjang [] ppArray = new PersegiPanjang[3]
```
4. Apa yang dimaksud dengan kode berikut ini:
```ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
```
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

#### 3.2.4 jawab


### Percobaan 2 : Menerima Input Isian Array Menggunakan Looping

#### 3.3.1 Langkah-langkah Percobaan



