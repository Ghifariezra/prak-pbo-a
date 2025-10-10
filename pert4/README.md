# 🧑‍💻 Praktikum Java – Pertemuan 4

## Package: 
- `com.pertemuan4.belanja`, 
- `com.pertemuan4.kasir`, 
- `com.pertemuan4.nilai`, 
- `com.pertemuan4.todoList`

# 📘 Deskripsi
Pada pertemuan ke-4 ini, kita belajar membuat **program interaktif sederhana menggunakan Java** dengan konsep **input dari pengguna, perulangan, array, dan percabangan sederhana.**

----

**Terdapat tiga program utama** yang dibuat dalam tiga package berbeda:
### 🛒 1. Program Belanja (`com.pertemuan4.belanja`)
### 📂 File:  `Belanja.java`
Program ini digunakan untuk mencatat daftar belanja pengguna.
Pengguna dapat memasukkan nama barang satu per satu, dan ketika sudah selesai, cukup ketik "selesai" untuk menghentikan input.

### ⚙️ Alur Program
- Program meminta pengguna untuk memasukkan nama barang.
- Setiap barang yang dimasukkan akan disimpan ke dalam `ArrayList`.
- Jika pengguna mengetik `selesai`, maka input berhenti.
- Program akan menampilkan seluruh daftar barang yang sudah dimasukkan.

```bash
=========
Program Belanja
=========
Masukan nama barang: Gula
Masukan nama barang: Kopi
Masukan nama barang: selesai

Daftar Belanja:
Barang ke-1: Gula
Barang ke-2: Kopi

```

----

### 💰 2. Program Kasir (`com.pertemuan4.kasir`)
### 📂 File: `Kasir.java`
Program ini mensimulasikan sistem kasir sederhana yang menghitung total harga pembelian berdasarkan harga satuan dan jumlah produk yang dibeli.

### ⚙️ Alur Program
- Pengguna memasukkan nama, nama produk, harga produk, dan jumlah produk.
- Program menghitung total harga `(harga * jumlah)`.
- Program menampilkan struk pembelian lengkap.

```bash
=========
Kasir App
=========
Masukan Nama Anda: Ghifari
Masukan Nama Produk: Roti
Masukan Harga Produk: 5000
Masukan Jumlah Produk: 3

==========================
       STRUK PEMBELIAN
==========================
Halo, Ghifari!
--------------------------
Produk  : Roti
Harga   : 5000
Jumlah  : 3
--------------------------
Total   : 15000.0
--------------------------
Terima Kasih Telah Berbelanja!
==========================
```

----

### 🎓 3. Program Nilai (`com.pertemuan4.nilai`)
### 📂 File: `Nilai.java`
Program ini digunakan untuk menghitung rata-rata nilai mahasiswa berdasarkan jumlah mahasiswa yang ditentukan pengguna.

### ⚙️ Alur Program
- Pengguna memasukkan jumlah mahasiswa.
- Program meminta input nilai untuk setiap mahasiswa.
- Nilai-nilai disimpan di dalam array `double[]`.
- Program menghitung total dan rata-rata nilai, lalu menampilkannya.

```bash
=========
Program Nilai
=========
Masukan jumlah mahasiswa: 3
Masukan nilai mahasiswa ke-1: 80
Masukan nilai mahasiswa ke-2: 90
Masukan nilai mahasiswa ke-3: 85

Nilai mahasiswa ke-1: 80
Nilai mahasiswa ke-2: 90
Nilai mahasiswa ke-3: 85
Rata-rata nilai: 85.0
```

----

### ✅ 4. Program Todo List (`com.pertemuan4.todoList`)
### 📂 File: `TodoList.java`
Program ini digunakan untuk membuat dan mengelola daftar tugas harian (to-do list) secara interaktif.

Pengguna dapat menambah, menampilkan, memperbarui, dan menghapus tugas dari daftar menggunakan menu berbasis angka.

### ⚙️ Alur Program
- Program menyediakan daftar tugas awal (dummy data).
- Pengguna memilih menu:
  1.  Tampilkan Daftar Tugas – Menampilkan semua tugas yang ada.
  2.  Tambah Tugas – Menambahkan tugas baru ke daftar.
  3.  Ubah Tugas – Mengedit isi tugas berdasarkan nomor urutnya.
  4.  Hapus Tugas – Menghapus tugas tertentu berdasarkan nomor.
  5.  Selesai – Mengakhiri program.

```bash
1. Tampilkan daftar tugas
2. Tambah tugas
3. Ubah tugas
4. Hapus tugas
5. Selesai
Masukan pilihan: 1

====================================
        DAFTAR TUGAS HARI INI
====================================
1. Belajar Java
2. Mengerjakan tugas kampus
3. Membaca buku algoritma
4. Olahraga pagi
5. Merapikan file proyek
====================================
Total tugas: 5
```