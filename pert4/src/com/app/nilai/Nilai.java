package com.app.nilai;

import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("=========\n" + "Program Nilai\n" + "=========\n");
        
        System.out.print("Masukan jumlah mahasiswa: ");
        
        int jumlahMahasiswa = input.nextInt();

        double[] nilai = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        double totalNilai = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            totalNilai += nilai[i];
        }

        double rataRata = totalNilai / jumlahMahasiswa;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + (int) nilai[i]);
        }

        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}
