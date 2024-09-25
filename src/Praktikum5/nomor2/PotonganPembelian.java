/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum5.nomor2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PotonganPembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Total Pembelian Rp. = ");
            double totalPembelian = masukan.nextDouble();
        
        double potongan;
        double jumlahBayar;
        
        if(totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        }else {
            potongan = totalPembelian * 0.20;
        }
        jumlahBayar = totalPembelian - potongan;
        
        System.out.println("Besarnya potongan Rp. "+potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. "+jumlahBayar);
    }
    
}
