package com.pertemuan7.tipemanusia;

import com.pertemuan7.manusia.Manusia;
import com.pertemuan7.pasangan.Pasangan;

public class Pria extends Manusia implements Pasangan {
    public Pria(String nama) {
        super(nama);
    }

    @Override
    public void namaPasangan(String namaPasangan) {
        System.out.println(this.nama + " memiliki pasangan bernama " + namaPasangan);
    }

    public void tidur() {
        System.out.println(this.nama + " sedang tidur.");
    }

    @Override
    public void info() {
        super.info();
        this.tidur();
    }
}
