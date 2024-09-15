/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum1.nomor_satu;

/**
 *
 * @author User
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mahasiswa1        = new Nilai();
        mahasiswa1.nim          = "2310631170070";
        mahasiswa1.nama         = "Denisha Raekha";
        mahasiswa1.NilaiAbsen   = 100;
        mahasiswa1.NilaiTugas   = 90;
        mahasiswa1.NilaiUTS     = 85;
        mahasiswa1.NilaiUAS     = 80;
        mahasiswa1.CetakNilai();
    }
}
    

