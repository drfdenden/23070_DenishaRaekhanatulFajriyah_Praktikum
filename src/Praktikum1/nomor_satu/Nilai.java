/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1.nomor_satu;

/**
 *
 * @author User
 */
public class Nilai {
    String nim;
    String nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;
    
    double Nilai() {
        double NilaiAkhir = (NilaiAbsen * 0.1)+(NilaiTugas * 0.2)+(NilaiUTS * 0.3)+(NilaiUAS * 0.4);
        return NilaiAkhir;
    }
    
    void CetakNilai() {
        System.out.println();
        System.out.println("NIM                 : "+nim);
        System.out.println("Nama                : "+nama);
        System.out.println("Nilai Absen [10%]   : "+NilaiAbsen);
        System.out.println("Nilai Tugas [20%]   : "+NilaiTugas);
        System.out.println("Nilai UTS [30%]     : "+NilaiUTS);
        System.out.println("Nilai UAS [40%]     : "+NilaiUAS);
        System.out.println("Nilai Akhir         : "+Nilai());
    }
}
