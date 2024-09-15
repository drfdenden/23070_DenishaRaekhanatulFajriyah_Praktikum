/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum2.nomor_dua;

/**
 *
 * @author User
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceMatematika mtk = new Matematika();
        
        mtk.pertambahan(20, 10);
        mtk.pengurangan(10, 5);
        mtk.perkalian(10, 3);
        mtk.pembagian(21, 2);
    }
    
}
