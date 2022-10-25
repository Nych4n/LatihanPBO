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
public class luaspersegi {
    public static void main(String[] args) {
            //    deklarasi
        int sisi;
        double luas;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        
        System.out.println("****program hitung luas persegi*****");
        System.out.println("input sisi");
        sisi = hitung.nextInt();

        //    proses
        luas = Double.valueOf(sisi*sisi);

        System.out.println("luas persegi");
        System.out.println(luas);
    }
}
