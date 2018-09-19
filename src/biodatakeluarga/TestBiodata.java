/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatakeluarga;

import biodatakeluarga.BiodataKeluarga;


/**
 *
 * @author ASUS
 */
public class TestBiodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=================BIODATA KELUARGA=================");
        BiodataKeluarga bio = new BiodataKeluarga();
        bio.setNamaAyah("Syamsul Hidayat");
        bio.setNamaIbu("Tutin Sumarni");
        bio.setNamamu("Damar Raihan Choirul Firdaus");
        bio.setNamaSaudara("Damar Izzatur Rukhil Jannah \n\t\t              Damar Roosyidah Adnani Hidayat "
                + "\n\t\t              Damar Syamsahira Khoulan Jasidah");
        bio.setAlamat("Jalan Serma Abdurrahman Gg. Kusuma Bakti RT02 RW06, Kel. Mangunhargo, Kec. Mayangan, Probolinggo");
        bio.setTempatLahir("Probolinggo");
        bio.setTanggalLahir("25 September 2002");
        bio.setHobi("Bersepeda");
        bio.setCitaCita("Guru dan Programming");
        bio.setNoTelepon("082245333042");
        
    }
    
}
