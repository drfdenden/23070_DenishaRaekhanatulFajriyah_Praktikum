/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3.nomor_satu;

/**
 *
 * @author User
 */
public class Matematika2 extends Matematika {
    void modulus(int a, int b) {
        if(b != 0) {
            System.out.println("Modulus         : " +a+ " % " +b+ " = " +(a % b));
        }else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}
