/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum8;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TokoSerbaAda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("*******************");
        
        System.out.print("Masukkkan Item Barang      : ");
        int jumlahItem = scanner.nextInt();
        
        String[] kodePembelian = new String[jumlahItem];
        int[] jumlahPembelian = new int[jumlahItem];
        String[] namaPembelian = new String[jumlahItem];
        int[] hargaPembelian = new int[jumlahItem];
        int[] totalHarga = new int[jumlahItem];
        
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode              : ");
            kodePembelian[i] = scanner.next();
            System.out.print("Masukkan Jumlah Beli       : ");
            jumlahPembelian[i] = scanner.nextInt();
            
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kodePembelian[i])) {
                    namaPembelian[i] = namaBarang[j];
                    hargaPembelian[i] = hargaBarang[j];
                    totalHarga[i] = jumlahPembelian[i] * hargaBarang[j];
                    break;
                }
        }
    }
        
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************");
        System.out.printf("%-4s %-12s %-12s %-8s %-12s %-12s\n", 
                          "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        
        System.out.println("===============================================================");
        
        int totalKeseluruhan = 0;
        
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-4d %-12s %-12s %-8d %-12d %-12d\n", 
                              (i + 1), kodePembelian[i], namaPembelian[i], hargaPembelian[i], 
                              jumlahPembelian[i], totalHarga[i]);
            totalKeseluruhan += totalHarga[i];
        }
        System.out.println("===============================================================");
        System.out.println("Total Bayar                                          " + totalKeseluruhan);
        System.out.println("===============================================================");
    }   
}
