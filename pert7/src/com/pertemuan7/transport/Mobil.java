package com.pertemuan7.transport;

public class Mobil implements Kendaraan {
    private String nama;

    public Mobil(String nama) {
        this.nama = nama;
    }

    @Override
    public void NyalahkanMesin() {
        System.out.println("Mobil " + this.nama + " nyala mesin");
    }

    @Override
    public void MatikanMesin() {
        System.out.println("Mobil " + this.nama + " mati mesin");
    }
}
