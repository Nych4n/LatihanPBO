/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Biodata {
    public static void main(String[] args) {
        String nama, alamat;
        int umur, tinggibadan, beratbdn;
        
        Scanner Biodata = new Scanner(System.in);
        
        System.out.println(" BIODATA DIRI ");
        System.out.println("Nama Anda");
        nama = Biodata.nextLine();
        System.out.println("Dimana rumahmu");
        alamat = Biodata.nextLine();
        System.out.println("Berapa umurmu");
        umur = Biodata.nextInt();
        System.out.println("Berapa tinggimu");
        tinggibadan = Biodata.nextInt();
        System.out.println("Berapa Beratmu");
        beratbdn = Biodata.nextInt();
        
        System.out.println("--------------------");
        System.out.println("Nama :" + nama);
        System.out.println("Alamat :" + alamat);
        System.out.println("Umur :" + umur);
        System.out.println("Tinggi Badan :" + tinggibadan);
        System.out.println("Berat Badan :" + beratbdn);
    }
}
