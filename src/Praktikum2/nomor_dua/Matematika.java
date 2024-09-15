/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2.nomor_dua;

/**
 *
 * @author User
 */
public class Matematika implements InterfaceMatematika {
    @Override
    public void pertambahan(int a, int b) {
        System.out.println("Pertambahan     : " +a+ " + " +b+ " = " +(a + b)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pengurangan(int a, int b) {
        System.out.println("Pengurangan     : " +a+ " - " +b+ " = " +(a - b)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void perkalian(int a, int b) {
        System.out.println("Perkalian       : " +a+ " * " +b+ " = " +(a * b)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pembagian(double a, double b) {
        System.out.println("Pembagian       : " +a+ " / " +b+ " = " +(a / b)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
