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
public class NilaiMahasiswa_versi1 {

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
        //sayangnya ketika diinput nilai ribuan nilai akhir, grade dan keterangan tetap muncul
        System.out.println("Nilai Kehadiran     : ");
            double nilaiKehadiran = masukan.nextDouble();
        System.out.println("Nilai Tugas         : ");
            double nilaiTugas = masukan.nextDouble();
            nilaiTugas = Math.min(nilaiTugas, 100);
        System.out.println("Nilai UTS           : ");
            double nilaiUTS = masukan.nextDouble();
        System.out.println("Nilai UAS           : ");
            double nilaiUAS = masukan.nextDouble();

        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        String grade;
        String keterangan;
        
        if(nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        }else if(nilaiAkhir >=66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        }else if(nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        }else if(nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        }else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println("NPM Mahasiswa       : "+npm);
        System.out.println("Nama Mahasiswa      : "+nama);
        System.out.println("Nilai Akhir         : "+nilaiAkhir);
        System.out.println("Grade               : "+grade);
        System.out.println("Keterangan          : "+keterangan);

    }
    
}
