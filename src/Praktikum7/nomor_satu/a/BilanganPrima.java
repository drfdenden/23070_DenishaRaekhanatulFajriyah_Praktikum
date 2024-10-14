/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum7.nomor_satu.a;

/**
 *
 * @author User
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 2;
        
        System.out.println("Bilangan Prima dari 0 - 20:");
        while (i <= 20) {
            boolean bilPrima = true;
            if (i <= 1) {
                bilPrima = false;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    bilPrima = false;
                    break;
                }
            }
            if (bilPrima) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    
}
