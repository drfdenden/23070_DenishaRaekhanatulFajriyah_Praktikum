/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2.nomor_tiga;

/**
 *
 * @author User
 */
public class Bingo {
    String[] hurufBingo = {"B", "I", "N", "G", "O"};
    int hitungClap;
    
    public Bingo(int hitungClap) {
        this.hitungClap = hitungClap;
        cetakLagu();
    }
    void cetakLagu() {
        cetakLirik();
        cetakLirikClap();
    }
    
    void cetakLirik() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
    }
    
    void cetakLirikClap() {
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < hurufBingo.length; j++) {
                if(j < hitungClap) {
                    System.out.print(("(clap)"));
            }else {
                    System.out.print(hurufBingo[j]);
                }
                if (j < hurufBingo.length - 1) {
                    System.out.print("-");
                }
        }
            System.out.println();
    }
        System.out.println("And Bingo was his name-o.\n");
    }
}
