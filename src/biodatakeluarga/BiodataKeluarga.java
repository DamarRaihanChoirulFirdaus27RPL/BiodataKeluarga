package biodatakeluarga;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BiodataKeluarga {
    public String namaAyah;
    public String namaIbu;
    public String namaSaudara;
    public String namamu;
    public String alamat;
    public String tempatLahir;
    public String tanggalLahir;
    public String hobi;
    public String citaCita;
    public String noTelepon;

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
        System.out.println("Masukkan Nama Ayahmu        : "+namaAyah); 
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
        System.out.println("Masukkan Nama ibumu         : "+namaIbu); 
    }

    public void setNamaSaudara(String namaSaudara) {
        this.namaSaudara = namaSaudara;
        System.out.println("Masukkan Nama Saudaramu     : "+namaSaudara); 
    }

    public void setNamamu(String namamu) {
        this.namamu = namamu;
        System.out.println("Masukkan Nama anda          : "+namamu); 
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        System.out.println("Masukkan Alamat             : "+alamat); 
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
        System.out.println("Masukkan Tempat Lahir       : "+tempatLahir); 
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
        System.out.println("Masukkan Tanggal lahir      : "+tanggalLahir); 
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
        System.out.println("Masukkan Hobi anda          : "+hobi); 
    }

    public void setCitaCita(String citaCita) {
        this.citaCita = citaCita;
        System.out.println("Masukkan Cita-cita anda     : "+citaCita); 
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
        System.out.println("Masukkan Nomor Telepon      : "+noTelepon); 
    }
}
