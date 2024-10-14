/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum7.nomor_satu.b;

/**
 *
 * @author User
 */
public class BilanganGanjil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        
        System.out.println("Bilangan Ganjil dari 0 - 20:");
        do {
            boolean bilGanjil = i % 2 != 0;
            if (bilGanjil) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
    
}
