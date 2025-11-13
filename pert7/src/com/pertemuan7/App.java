package com.pertemuan7;

import com.pertemuan7.animal.*;
import com.pertemuan7.transport.*;
import com.pertemuan7.salary.*;
import com.pertemuan7.manusia.*;
import com.pertemuan7.tipemanusia.*;
import com.pertemuan7.pasangan.Pasangan;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = { "Kucing", "Dog", "Mobil", "Pegawai", "Manusia" };
        ArrayList<Object> listItem = new ArrayList<Object>();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan pilihan: ");
        String pilihan = input.nextLine().toLowerCase();

        createObject(names, listItem);
        switch (pilihan) {
            case "animal":
                printOut(pilihan, listItem);
                break;
            case "transport":
                printOut(pilihan, listItem);
                break;
            case "pegawai":
                printOut(pilihan, listItem);
                break;

            // Buat 1 Abstract Class baru dengan tema bebas sesuai ide kalian sendiri.
            case "manusia":
                printOut(pilihan, listItem);
                break;
        }

        input.close();
    }

    public static void createObject(String[] names, ArrayList<Object> listItem) {
        for (String name : names) {
            if (name.equals("Kucing")) {
                listItem.add(new Kucing("Persia"));
            } else if (name.equals("Dog")) {
                listItem.add(new Dog("Golden Retriever"));
            } else if (name.equals("Mobil")) {
                listItem.add(new Mobil("Lamborghini"));
            } else if (name.equals("Pegawai")) {
                listItem.add(new Programmer("Ghifari", 5000000));
            }

            // 1. Buat 1 Abstract Class baru dengan tema bebas sesuai ide kalian sendiri.
            else if (name.equals("Manusia")) {
                listItem.add(new Pria("Ghifari"));
                listItem.add(new Wanita("Ariel Tatum"));
            }
        }
    }

    public static void printOut(String pilihan, ArrayList<Object> listItem) {
        for (Object obj : listItem) {
            if (pilihan.equals("animal")
                    && obj instanceof Hewan h) {
                h.info();
                h.suara();
            } else if (pilihan.equals("transport")
                    && obj instanceof Kendaraan k) {
                k.NyalahkanMesin();
                k.MatikanMesin();
            } else if (pilihan.equals("pegawai")
                    && obj instanceof Pegawai p) {
                p.infoDasar();
            }

            // Buat 1 Abstract Class baru dengan tema bebas sesuai ide kalian sendiri.
            else if (pilihan.equals("manusia")
                    && obj instanceof Manusia m) {
                String nameType = m.getClass().getSimpleName();

                System.out.println("\n=======" + nameType + "=============");
                if (m instanceof Pasangan p) {
                    p.namaPasangan("Ghifari");
                } else if (m instanceof Pria p) {
                    p.namaPasangan("Ariel Tatum");
                }

                m.info();
                m.tidur();

                System.out.println("====================");
            }
        }
    }
}
