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
public class kelilingsegitiga {
    public static void main(String[] args) {
         //    deklarasi
        int sisi;
        double keliling;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        
        System.out.println("****program hitung keliling segitiga*****");
        System.out.println("input sisi");
        sisi = hitung.nextInt();

        //    proses
        keliling =(sisi+sisi+sisi);

        System.out.println("keliling segitiga");
        System.out.println(keliling);
    }
}
