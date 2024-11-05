package Praktikum10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author User
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir;
    
    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, String nilai1, String nilai2, String nilai3, String nilai4, String nilai5) { 
        this.NIM = NIM; 
        this.Nama = Nama; 
        this.Alamat = Alamat; 
        this.MataKuliah = MataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }
    public String hitungNilaiAkhir() {
        double Nilai1 = Double.parseDouble(nilai1);
        double Nilai2 = Double.parseDouble(nilai2);
        double Nilai3 = Double.parseDouble(nilai3);
        double Nilai4 = Double.parseDouble(nilai4);
        double Nilai5 = Double.parseDouble(nilai5);
        double nilaiAkhir = (Nilai1 * 0.1) + (Nilai2 * 0.15) + (Nilai3 * 0.25) + (Nilai4 * 0.15) + (Nilai5 * 0.35);
        
        return String.valueOf(nilaiAkhir);
    }
    public String getNIM() {
        return NIM;
    }
    public String getNama() {
        return Nama;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getMataKuliah() {
        return MataKuliah;
    }
}
