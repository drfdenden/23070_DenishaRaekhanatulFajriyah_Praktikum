/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3.nomor_dua;

/**
 *
 * @author User
 */
public class KonversiSuhu {
    void celciusToFahrenheit(double celcius) {
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(celcius + " derajat Celcius = " + fahrenheit + " derajat Fahrenheit");
    }
    
    void celciusToReamur(double celcius) {
        double reamur = celcius * 4 / 5;
        System.out.println(celcius + " derajat Celcius = " + reamur + " derajat Reamur");
    }
    
}   
