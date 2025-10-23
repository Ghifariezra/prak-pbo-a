# 🧩 Materi Inheritance di Java

## 📘 Deskripsi
Program ini merupakan contoh penerapan **inheritance (pewarisan)** dalam pemrograman berorientasi objek (OOP) menggunakan bahasa **Java**.  
Konsep inheritance memungkinkan sebuah kelas (child class) untuk mewarisi atribut dan metode dari kelas lain (parent class).

Dalam contoh ini:
- Kelas **`Karyawan`** berperan sebagai **kelas induk (superclass)**.
- Kelas **`Dosen`** berperan sebagai **kelas anak (subclass)** yang **mewarisi sifat dan perilaku dari `Karyawan`** serta menambahkan atribut dan metode baru.

---

## 🏗️ Struktur Proyek
```bash
SRC
\---com
    +---inheritance
    |       App.java
    |       Dosen.java
    |       Karyawan.java
    |       README.md
    |
```

## 🖥️ Output Program
```bash
================
Karyawan
================
Dwi absen pagi.
Dwi sedang kerja.
Dwi absen pulang.
Nama: Dwi
Kode Karyawan: 210001


================
Dosen
================
Rudi absen pagi.
Rudi sedang mengajar.
Rudi absen pulang.
Nama: Rudi
Kode Karyawan: 210002
NIDN: 1234
```