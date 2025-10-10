package com.pertemuan4.todoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarTugas = new ArrayList<String>();

        daftarTugas.add("Belajar Java");
        daftarTugas.add("Mengerjakan tugas kampus");
        daftarTugas.add("Membaca buku algoritma");
        daftarTugas.add("Olahraga pagi");
        daftarTugas.add("Merapikan file proyek");

        // System.out.println(daftarTugas);

        boolean condition = true;
        while (condition) {
            System.out.print(
                    "\n1. Tampilkan daftar tugas\n2. Tambah tugas\n3. Ubah tugas\n4. Hapus tugas\n5. Selesai\nMasukan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilDaftarTugas(daftarTugas);
                    break;
                case 2:
                    tambahTugas(
                            daftarTugas,
                            input);
                    break;
                case 3:
                    updateTugas(
                            daftarTugas,
                            input);
                    break;
                case 4:
                    hapusTugas(
                            daftarTugas,
                            input);
                    break;
                case 5:
                    condition = false;
                    selesai();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        }
        input.close();
    }

    // Fungsi untuk menampilkan daftar tugas
    private static void tampilDaftarTugas(ArrayList<String> daftarTugas) {
        System.out.println("\n====================================");
        System.out.println("        DAFTAR TUGAS HARI INI       ");
        System.out.println("====================================");

        if (daftarTugas.isEmpty()) {
            System.out.println("Belum ada tugas dalam daftar.");
        } else {
            for (int i = 0; i < daftarTugas.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTugas.get(i));
            }
        }

        System.out.println("====================================");
        System.out.println("Total tugas: " + daftarTugas.size());
    }

    // Menambahkan tugas
    private static void tambahTugas(
            ArrayList<String> daftarTugas,
            Scanner input) {
        System.out.print("Masukan tugas: ");
        String tugas = input.nextLine();
        daftarTugas.add(tugas);

        System.out.println("Tugas berhasil ditambahkan.");
    }

    private static void updateTugas(ArrayList<String> daftarTugas, Scanner input) {
        tampilDaftarTugas(daftarTugas);

        if (daftarTugas.isEmpty()) {
            System.out.println("Belum ada tugas dalam daftar.");
            return;
        }

        System.out.print("Pilih tugas yang ingin diubah: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan > 0 && pilihan <= daftarTugas.size()) {
            System.out.print("Masukan tugas baru: ");
            String tugasBaru = input.nextLine();
            
            daftarTugas.set(pilihan - 1, tugasBaru);

            System.out.println("Tugas berhasil diubah.");
        }
    }

    // Menghapus tugas
    private static void hapusTugas(ArrayList<String> daftarTugas, Scanner input) {
        tampilDaftarTugas(daftarTugas);

        if (daftarTugas.isEmpty())
            return;

        System.out.print("Masukan nomor tugas yang ingin dihapus: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan > 0 && pilihan <= daftarTugas.size()) {
            String removed = daftarTugas.remove(pilihan - 1);
            System.out.println("Tugas \"" + removed + "\" berhasil dihapus.");
        } else {
            System.out.println("Nomor tugas tidak valid!");
        }
    }

    private static void selesai() {
        System.out.println("Program selesai.");
    }
}
