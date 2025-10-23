package com.inheritance;

public class Dosen extends Karyawan{
    private String NIDN;

    public Dosen(String KodeKaryawan, String nama, String NIDN) {
        super(KodeKaryawan, nama);
        this.NIDN = NIDN;
    }

    public String setNidn(String NIDN) {
        return this.NIDN = NIDN;
    }

    public String getNidn() {
        return this.NIDN;
    }

    public void mengajar() {
        System.out.println(this.nama + " sedang mengajar.");
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("NIDN: " + this.NIDN);
    }
}
