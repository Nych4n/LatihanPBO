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
public class luassegitiga {
    public static void main(String[] args) {
        //    deklarasi
        int alas, tinggi;
        double luas;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        
        System.out.println("****program hitung luas segitiga*****");
        System.out.println("input alas:");
        alas = hitung.nextInt();
        System.out.println("input tinggi");
        tinggi = hitung.nextInt();

        //    proses
        luas = Double.valueOf((alas * tinggi)/2);

        System.out.println("luas segitiga");
        System.out.println(luas);
    }
}