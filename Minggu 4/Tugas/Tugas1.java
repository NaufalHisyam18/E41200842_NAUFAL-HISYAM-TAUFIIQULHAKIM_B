/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author naufal
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Bilangan Genap dari Kecil ke Besar");
        System.out.println ("");
        
        System.out.print("Masukkan Nilai awal : ");
        int awal = scan.nextInt();
        System.out.print("Masukan Nilai Batas Akhir : ");
        int akhir = scan.nextInt();
        
        for (int i = awal; i <= akhir; i++){
            if (i % 2 == 0)
	System.out.print(i + " ");
       }
    } 
}
