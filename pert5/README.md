# 🧩 Program Enkapsulasi Java — Person
Program ini merupakan contoh sederhana penerapan enkapsulasi (encapsulation) dalam pemrograman berorientasi objek (OOP) menggunakan bahasa Java.
Tujuannya adalah untuk memperlihatkan bagaimana data (atribut) dalam suatu kelas dapat dilindungi dan hanya bisa diakses atau diubah melalui **method getter dan setter.**

---

## 📂 Struktur Folder
``` bash
enkapsulasi/
├── App.java
└── Person.java
```

--- 

## 🧠 Konsep yang Digunakan
### 🔒 Enkapsulasi
Enkapsulasi adalah konsep menyembunyikan data (data hiding) dengan cara menjadikan atribut bersifat `private`, kemudian menyediakan akses melalui method `getter` dan `setter`.

Dengan cara ini, data tidak bisa diakses langsung dari luar kelas, melainkan harus melalui fungsi kontrol agar tetap aman dan konsisten.

---

## 💻 Penjelasan Kode
### `Person.java`
```java
package enkapsulasi;

public class Person {
    private String nama;
    private int umur;
    private String alamat;

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter
    public String getNama() {
        return this.nama;
    }
    public int getUmur() {
        return this.umur;
    }
    public String getAlamat() {
        return this.alamat;
    }
}
```
**Penjelasan:**
- Atribut `nama`, `umur`, dan `alamat` bersifat `private`, artinya tidak bisa diakses langsung dari luar kelas.
- Method `setNama`, `setUmur`, `setAlamat` digunakan untuk mengatur nilai atribut.
- Method `getNama`, `getUmur`, `getAlamat` digunakan untuk mengambil nilai atribut.

---

### `App.java`
```java
package enkapsulasi;

public class App {
    public static void main(String[] args) {
        Person person = new Person();

        person.setNama("Mamat Petir");
        person.setUmur(30);
        person.setAlamat("Jl. Mangga No. 101, Bandung");

        System.out.println(
                "Nama: " + person.getNama()
                + "\nUmur: " + person.getUmur()
                + "\nAlamat: " + person.getAlamat());

        person.setNama("Mamat Huajn");
        person.setUmur(20);
        person.setAlamat("Jl. Mangga No. 99, Bandung");

        System.out.println(
                "\nNama: " + person.getNama()
                + "\nUmur: " + person.getUmur()
                + "\nAlamat: " + person.getAlamat());
    }
}
```
**Penjelasan:**

- Membuat objek `Person` baru.
- Mengatur nilai atribut melalui method setter (`setNama`, `setUmur`, `setAlamat`).
- Menampilkan data dengan method getter (`getNama`, `getUmur`, `getAlamat`).
- Data dapat diubah kapan pun tanpa mengakses atribut secara langsung.

---

## ⚙️ Cara Menjalankan Program
1. Pastikan kamu berada di direktori proyek (misalnya di folder `enkapsulasi` berada dalam `src`).
2. Compile kode dengan perintah:
   ```bash
   javac -d bin src/enkapsulasi/*.java;
   ```
3. Jalankan program:
   ```bash
   java -cp bin enkapsulasi.App
   ```

---

## 📤 Output Program

```bash
Nama: Mamat Petir
Umur: 30
Alamat: Jl. Mangga No. 101, Bandung

Nama: Mamat Huajn
Umur: 20
Alamat: Jl. Mangga No. 99, Bandung
```