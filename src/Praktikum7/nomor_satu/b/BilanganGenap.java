/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum7.nomor_satu.b;

/**
 *
 * @author User
 */
public class BilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Genap dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            boolean bilGenap = i % 2 == 0;
            if (bilGenap) {
                System.out.print(i + " ");
            }
        }
    }
    
}
