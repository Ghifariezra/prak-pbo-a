# 📱 Project Java - Class iPhone

Proyek ini adalah contoh sederhana pemrograman berorientasi objek (**OOP**) dalam bahasa Java, yang merepresentasikan sebuah objek **iPhone** dengan atribut dan perilaku (method).  
Program membuat dua objek iPhone dengan spesifikasi berbeda, lalu memanggil method untuk menjalankan fungsinya.

## 🚀 Fitur

-   Class `iPhone` dengan atribut:
    -   `color` → warna iPhone
    -   `storage` → kapasitas penyimpanan
-   Method perilaku iPhone:
    -   `nyala()` → menyalakan iPhone
    -   `mati()` → mematikan iPhone
    -   `berdering()` → iPhone berdering
    -   `videoCall()` → melakukan video call
-   Membuat **dua objek iPhone** (`iphone1` dan `iphone2`) dengan warna dan storage berbeda.

## 📂 Struktur Proyek

```bash
    ├───.vscode
    ├───bin
    ├───lib
    └───src
```

## 🖥️ Cara Compile & Run

1. Masuk ke folder proyek:

    ```bash
    cd src
    ```

2. Compile proyek:

    ```bash
    javac App.java
    ```

3. Jalankan proyek:
    ```bash
    java App
    ```

## Output

```bash
iPhone warna Hitam menyala.
iPhone warna Hitam berdering.
iPhone warna Hitam videoCall.
iPhone warna Hitam mati.

iPhone warna Putih menyala.
iPhone warna Putih berdering.
iPhone warna Putih videoCall.
iPhone warna Putih mati.
```

## 🛠️ Konsep OOP yang Digunakan

-   **Class & Object** → `iPhone` sebagai class, `iphone1` & `iphone2` sebagai object.
-   **Attribute (Field)** → `color`, `storage`.
-   **Method (Behavior)** → aksi yang dapat dilakukan iPhone (`nyala`, `mati`, dll).
