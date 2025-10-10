package com.pertemuan4.belanja;

import java.util.Scanner;
import java.util.ArrayList;

public class Belanja {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarBelanja = new ArrayList<String>();

        System.out.print("=========\n" + "Program Belanja\n" + "=========\n");

        boolean condition = true;
        while (condition) {

            System.out.print("Masukan nama barang: ");

            String barang = input.nextLine();

            if (barang.equalsIgnoreCase("selesai")) {
                condition = false;
            }

            daftarBelanja.add(barang);
        }

        System.out.println("\nDaftar Belanja:");
        for (int i = 0; i < daftarBelanja.size(); i++) {
            System.out.println(
                "Barang ke-" + (i + 1) + ": " + daftarBelanja.get(i)
            );
        }

        input.close();
    }
}
