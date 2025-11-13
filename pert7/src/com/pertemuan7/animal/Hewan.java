package com.pertemuan7.animal;

public abstract class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama: " + this.nama);
    }

    public abstract void suara();
}
