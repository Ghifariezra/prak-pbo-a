package com.polymorphism;

// Overloading
import com.polymorphism.overloading.MobilSport;

// Overriding
import com.polymorphism.overriding.BangunDatar;
import com.polymorphism.overriding.Lingkaran;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;

        // Overloading
        MobilSport ferari = new MobilSport("Ferari");
        
        System.out.println("================");
        System.out.println("Overloading");
        System.out.println("================");
        for (int i = 1; i <= x; i++) {
            ferari.gigi(i);
        }
        ;

        for (int i = x; i <= 10; i++) {
            ferari.gigi(5, i);
        }
        ;

        System.out.println();

        /*
            * Overriding
                * Parent class: BangunDatar
                * Child class: Lingkaran
        */
        BangunDatar persegi = new BangunDatar();
        BangunDatar lingkaran = new Lingkaran(5);

        System.out.println("================");
        System.out.println("Overriding");
        System.out.println("================");

        persegi.luas();
        persegi.keliling();

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
    }
}
