/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum7.nomor_satu.d;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class LaguAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah Anak Ayam: ");
        int n = scanner.nextInt();
        
        System.out.println("\nLirik Lagu Anak Ayam Turun " + n + ":");
        
        while (n > 0) {
            if (n == 1) {
                System.out.println("Tekotek kotek kotek, anak ayam turun " + n + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Tekotek kotek kotek, anak ayam turun " + n + ", mati satu tinggal " + (n - 1) + ".");
            }
            n--;
        }
        System.out.println("\nTekotek kotek kotek, anak ayam turun berkotek.");
        System.out.println("Tekotek kotek kotek, anak ayam turun semua.");
        scanner.close();
    }
    
}
