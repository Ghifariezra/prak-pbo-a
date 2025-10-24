# 🌀 Materi Polymorphism di Java

## 📘 Deskripsi

Program ini merupakan contoh penerapan **Polymorphism (Polimorfisme)** dalam **Pemrograman Berorientasi Objek (PBO)** menggunakan **Java**.  
Polymorphism berarti _banyak bentuk_, yaitu kemampuan suatu objek untuk memiliki banyak bentuk perilaku yang berbeda, tergantung pada konteks penggunaannya.

Dalam contoh ini, terdapat dua bentuk polimorfisme yang digunakan:

1. **Compile-time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

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
    \---polymorphism
        |   App.java
        |   README.md
        |
        +---overloading
        |       MobilSport.java
        |
        \---overriding
                BangunDatar.java
                Lingkaran.java
```

---

## 🔹 1. Method Overloading (Compile-time Polymorphism)

**File:** `MobilSport.java`

Overloading terjadi ketika **dua atau lebih metode memiliki nama yang sama**, tetapi berbeda **parameter (jumlah atau tipe data)**.  
Pemanggilan metode akan ditentukan **pada waktu kompilasi (compile-time)**.

### 🧱 Kelas: `MobilSport`

#### Atribut:

-   `private String nama`

#### Konstruktor:

```java
public MobilSport(String nama)
public void gigi(int g)
public void gigi(int g, int t)
```

Metode `gigi()` dibuat dua kali dengan parameter berbeda:

-   `gigi(int g)` → Menampilkan perpindahan gigi biasa.
-   `gigi(int g, int t)` → Menampilkan perpindahan gigi dengan fitur turbo.

## Output Program

```bash
================
Overloading
================
Ferari masuk ke gigi 1
Ferari masuk ke gigi 2
Ferari masuk ke gigi 3
Ferari masuk ke gigi 4
Ferari masuk ke gigi 5
Ferari masuk ke gigi 5 dengan turbo 5
Ferari masuk ke gigi 5 dengan turbo 6
Ferari masuk ke gigi 5 dengan turbo 7
Ferari masuk ke gigi 5 dengan turbo 8
Ferari masuk ke gigi 5 dengan turbo 9
Ferari masuk ke gigi 5 dengan turbo 10
```

## 🔸 2. Method Overriding (Runtime Polymorphism)

**File**: `BangunDatar.java` dan `Lingkaran.java`

Overriding terjadi ketika **kelas turunan (subclass)** memiliki metode dengan **nama dan parameter yang sama** dengan metode di **kelas induk (superclass)**, tetapi **mengubah implementasinya.**

Pemanggilan metode ditentukan **saat program dijalankan (runtime)** — bergantung pada objek yang digunakan.

### 🧱 Kelas: BangunDatar

**Metode:**

```java
public float luas()
public float keliling()
```

---

### 🧱 Kelas: Lingkaran (extends BangunDatar)

**Atribut:**

-   private int r → jari-jari lingkaran.

```java
public Lingkaran(int r)
```

**Overriding Metode:**

```java
@Override
public float luas() {
    return (float) (Math.PI * r * r);
}

@Override
public float keliling() {
    return (float) (2 * Math.PI * r);
}
```

Metode `luas()` dan `keliling()` di-override untuk menghitung nilai sebenarnya dari lingkaran.

## Output Program

```bash
================
Overriding
================
Menghitung luas bangun datar...
Menghitung keliling bangun datar...
Luas Lingkaran: 78.53982
Keliling Lingkaran: 31.415926
```
