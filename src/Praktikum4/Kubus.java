/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author User
 */
public class Kubus extends BangunRuang {
    private double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
