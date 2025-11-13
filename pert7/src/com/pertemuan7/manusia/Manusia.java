package com.pertemuan7.manusia;

public abstract class Manusia {
    protected String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public abstract void tidur();

    public void info() {
        System.out.println("Nama: " + this.nama);
    }
}
