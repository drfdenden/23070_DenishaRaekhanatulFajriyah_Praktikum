/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3.nomor_dua;

/**
 *
 * @author User
 */
public class KonversiSuhu2 extends KonversiSuhu {
    void fahrenheitToReamur(double fahrenheit) {
        double reamur = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " derajat Fahrenheit = " + reamur + " derajat Reamur");
    }
}
