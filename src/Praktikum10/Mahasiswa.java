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
    private String NIM, Nama, Alamat, MataKuliah; 
    double nilai1, nilai2, nilai3, nilai4, nilai5, nilaiAkhir;
    
    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah) { 
        this.NIM = NIM; 
        this.Nama = Nama; 
        this.Alamat = Alamat; 
        this.MataKuliah = MataKuliah;
    }
    
    public String getAlamat() { 
        return Alamat; 
    }
    
    public String getNIM() { 
        return NIM; 
    }
    
    public String getNama() { 
        return Nama; 
    }
}
