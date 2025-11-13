package com.pertemuan7.salary;

public abstract class Pegawai {
    protected String nama;
    protected double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public abstract void tampilkanInfo();

    public void infoDasar() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Gaji Pokok: " + this.gajiPokok);
    }
}
