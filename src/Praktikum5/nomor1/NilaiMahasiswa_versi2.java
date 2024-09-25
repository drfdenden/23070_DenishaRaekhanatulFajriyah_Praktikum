/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum5.nomor1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class NilaiMahasiswa_versi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("NPM                 : ");
            String npm = masukan.nextLine();
        System.out.println("Nama Mahasiswa      : ");
            String nama = masukan.nextLine();
        //menghindari masukan nilai kurang dari 0 dan lebih dari 100    
        double nilaiKehadiran = getNilaiValid(masukan, "Nilai Kehadiran     ");
        double nilaiTugas = getNilaiValid(masukan, "Nilai Tugas         ");
        double nilaiUTS = getNilaiValid(masukan, "Nilai UTS           ");
        double nilaiUAS = getNilaiValid(masukan, "Nilai UAS           ");
        
        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        String grade;
        String keterangan;
        
        if(nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        }else if(nilaiAkhir >=66) {
            grade = "B";
            keterangan = "BAIK";
        }else if(nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        }else if(nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        }else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println();
        System.out.println("NPM Mahasiswa       : "+npm);
        System.out.println("Nama Mahasiswa      : "+nama);
        System.out.println("Nilai Akhir         : "+nilaiAkhir);
        System.out.println("Grade               : "+grade);
        System.out.println("Keterangan          : "+keterangan);
    }
    
    public static double getNilaiValid(Scanner masukan, String label) {
        double nilai;
        do {
            System.out.println(label + ": ");
            nilai = masukan.nextDouble();
            if(nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus 0-100. Silahkan masukan kembali.");
            }
        } while (nilai < 0 || nilai > 100);
        return nilai;
    }
}
