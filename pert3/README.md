# 📘 Project Java - Mahasiswa & Pegawai

Proyek ini merupakan contoh sederhana pemrograman berorientasi objek (OOP) menggunakan bahasa **Java**.  
Di dalamnya terdapat dua class utama yaitu **Mahasiswa** dan **Pegawai** yang memiliki atribut serta metode untuk menampilkan data masing-masing.

## 🚀 Fitur
- Representasi data **Mahasiswa** dengan atribut `npm`, `nama`, `jurusan`, dan `ipk`.
- Representasi data **Pegawai/Dosen** dengan atribut `nama`, `npwp`, dan `mataKuliah`.
- Method untuk menampilkan data (`tampilData`) pada masing-masing class.
- Method tambahan:
  - `mengajar()` (private) → hanya bisa diakses dari dalam class `Pegawai`.
  - `istirahat()` (protected) → dapat diakses dalam package atau subclass.

## 📂 Struktur Proyek
``` bash 
    ├───.vscode
    ├───bin
    │   └───com
    │       ├───app
    │       └───data
    ├───lib
    └───src
        └───com
            ├───app
            └───data
```


## 🖥️ Cara Compile & Run

1. Masuk ke direktori project:
   ```bash
    cd pert3
   ```
2. Compile semua file Java:
    ```bash
        javac -d bin src/com/app/App.java src/com/data/Mahasiswa.java src/com/data/Pegawai.java
    ```
3. Jalankan program:
    ```bash
        java -cp bin com.app.App
    ```
## Output
```bash
    NPM: 210001
    Nama: Dwi
    Jurusan: Teknik Informatika
    IPK: 3.7
    Nama: Dwi
    NPWP: 210001
    Mata Kuliah: Teknik Informatika
    Dosen Dwi mengajar mata kuliah Teknik Informatika
```

## 🛠️ Konsep OOP yang Digunakan
- **Encapsulation** → penggunaan `private`, `protected`, dan `public`.
- **Constructor** → inisialisasi objek `Mahasiswa` dan `Pegawai`.
- **Method** → menampilkan data `(tampilData)` dan aksi lain `(mengajar, istirahat)`.