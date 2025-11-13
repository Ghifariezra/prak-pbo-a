package com.pertemuan7.animal;

public class Dog extends Hewan {
    public Dog(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Woof Woof");
    }
}
