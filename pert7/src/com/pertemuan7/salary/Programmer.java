package com.pertemuan7.salary;

public class Programmer extends Pegawai implements Bonus {
    public Programmer(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double hitungBonus() {
        return this.gajiPokok * 0.15;
    }

    @Override
    public void tampilkanInfo() {
        this.infoDasar();
        System.out.println("Jabatan: Programmer");
        System.out.println("Bonus: " + this.hitungBonus());
        System.out.println("Total Gaji: " + (this.gajiPokok + this.hitungBonus()));
    }
}
