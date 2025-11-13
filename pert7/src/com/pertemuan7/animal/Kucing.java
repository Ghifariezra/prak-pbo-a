package com.pertemuan7.animal;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void suara() {
        System.out.println("Meow Meow");
    }
}
