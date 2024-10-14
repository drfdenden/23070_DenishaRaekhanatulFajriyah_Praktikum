/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum7.nomor_dua;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nilai n (maks. 10): ");
        int n = scanner.nextInt();
        
        if (n <= 10) {
            System.out.println("\nTabel Perkalian " + n + " x " + n + ":");
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }else {
            System.out.println("Nilai n harus kurang dari atau sama dengan 10");
        }
        
        scanner.close();
    }
    
}
