/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum7.nomor_satu.a;

/**
 *
 * @author User
 */
public class BukanPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
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
        if (!bilPrima) {
            System.out.print(i + " ");
            }
        }
    }
}
