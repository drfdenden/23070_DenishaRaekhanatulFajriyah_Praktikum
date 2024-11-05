package Praktikum10;
import java.util.ArrayList; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class InputDataMahasiswa { 
    ArrayList<Mahasiswa> listmahasiswa;
    
    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList();
    }
    public void tambahData(String NIM, String Nama, String Alamat, String MataKuliah, String nilai1, String nilai2, String nilai3, String nilai4, String nilai5) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listmahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa>getAll() {
        return listmahasiswa;
    }
    public void hapusData(int index) {
        listmahasiswa.remove(index);
    }
}
