/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author User
 */
public class DemoBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang balok = new Balok(10, 6, 4);
        System.out.println("Volume Balok            : " +balok.hitungVolume());
        System.out.println("Luas Permukaan Balok    : " +balok.hitungLuasPermukaan());
        System.out.println();
        
        BangunRuang kubus = new Kubus(8);
        System.out.println("Volume Kubus            : " +kubus.hitungVolume());
        System.out.println("Luas Permukaan Balok    : " +kubus.hitungLuasPermukaan());
    }
    
}
