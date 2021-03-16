/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author naufal
 */
public class Latihan4 {
    public static void main(String[] args) {
        
// Buat Scanner
    Scanner sl = new Scanner(System.in);
    
// Ambil nilai dari keyboard
    System.out.print("Masukkan nilai1 = ");
    int nilai1 = sl.nextInt();
    System.out.print("Masukkan nilai2 = ");
    int nilai2 = sl.nextInt();
    
// Hitung dan Print 
    int jumlah = nilai1 + nilai2;
    System.out.println("Jumlah = " +jumlah);
    }
}
