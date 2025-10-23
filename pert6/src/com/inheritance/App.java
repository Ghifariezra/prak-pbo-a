package com.inheritance;

public class App {
    public static void main(String[] args) throws Exception {
        Karyawan karyawan = new Karyawan(
                "210001",
                "Dwi");

        Dosen dosen = new Dosen(
                "210002",
                "Rudi",
                "1234");

        // Karyawan
        System.out.println("================");
        System.out.println("Karyawan");
        System.out.println("================");
        karyawan.absenPagi();
        karyawan.kerja();
        karyawan.absenPulang();

        karyawan.getInfo();

        System.out.println("\n");

        // Dosen
        System.out.println("================");
        System.out.println("Dosen");
        System.out.println("================");
        dosen.absenPagi();
        dosen.mengajar();
        dosen.absenPulang();

        dosen.getInfo();
    }
}
