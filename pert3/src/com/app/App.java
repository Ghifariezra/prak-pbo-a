package com.app;

import com.data.Mahasiswa;
import com.data.Pegawai;

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa = new Mahasiswa(
            "Dwi", 
            "Teknik Informatika", 
            "210001", 
            3.7
        );

        Pegawai pegawai = new Pegawai(
            "Dwi", 
            "210001", 
            "Teknik Informatika"
        );
        
        mahasiswa.tampilData();
        pegawai.tampilData();
    }
}
