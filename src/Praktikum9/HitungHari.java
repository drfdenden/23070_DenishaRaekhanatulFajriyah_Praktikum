/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;

/**
 *
 * @author User
 */
public class HitungHari {
    public int hitung(int tahun, int bulan) {
        if (bulan < 1 || bulan > 12) {
            throw new IllegalArgumentException("Bulan harus antara 1 dan 2");
        }
        if (bulan == 2) {
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                return 29;
            }else {
                return 28;
            }
        }else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            return 30;
        }else {
            return 31;
        }
    }
}
