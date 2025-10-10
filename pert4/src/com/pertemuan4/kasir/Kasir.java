package com.pertemuan4.kasir;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("=========\n" + "Kasir App\n" + "=========\n");

        // Proses
        System.out.print("Masukan Nama Anda: ");
        String name = input.nextLine();

        System.out.print("Masukan Nama Produk: ");
        String product = input.nextLine();

        System.out.print("Masukan Harga Produk: ");
        int price = input.nextInt();

        System.out.print("Masukan Jumlah Produk: ");
        int quantity = input.nextInt();

        float total = price * quantity;

        // Struk
        System.out.println("\n==========================");
        System.out.println("       STRUK PEMBELIAN     ");
        System.out.println("==========================");
        System.out.println("Halo, " + name + "!");
        System.out.println("--------------------------");
        System.out.println("Produk  : " + product);
        System.out.println("Harga   : " + price);
        System.out.println("Jumlah  : " + quantity);
        System.out.println("--------------------------");
        System.out.println("Total   : " + total);
        System.out.println("--------------------------");
        System.out.println("Terima Kasih Telah Berbelanja!");
        System.out.println("==========================\n");

        input.close();
    }
}
