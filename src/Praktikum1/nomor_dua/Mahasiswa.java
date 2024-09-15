/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1.nomor_dua;

/**
 *
 * @author User
 */
public class Mahasiswa {
    String nama;
    
    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    void membaca() {
        System.out.println(nama + " sedang membaca modul PBO");
    }
    void nyontek() {
        System.out.println(nama + " sedang menyontek saat ujian tulis");
    }
    void modifikasi() {
        System.out.println(nama + " sedang memodifikasi program Java");
    }
}
