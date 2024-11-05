package Praktikum10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList; 

/**
 *
 * @author User
 */
public class InputDataMahasiswa { 
    ArrayList<Mahasiswa> listmahasiswa;  
    public InputDataMahasiswa() {  
        listmahasiswa = new ArrayList ();  
    }
    public void insertData(String NIM, String Nama, String Alamat) {  
          Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat);  
          listmahasiswa.add(mhs);  
    }
    public ArrayList<Mahasiswa> getALL() {  
        return listmahasiswa;  
    } 
    public void deleteData(int index) { 
        listmahasiswa.remove(index); 
    }  
}
