/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;

/**
 *
 * @author naufal
 */
public class Tugas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat variable dan scanner 
        String nama;
        String minuman;
        Scanner scan = new Scanner(System.in);
        
        //header
        System.out.println("                 Cafe Ceria                  ");
        System.out.println("                Aneka Minuman                ");
        System.out.println("---------------------------------------------");
        
        //isi
        System.out.println("                Special Menu :               ");
        System.out.println("               1. Soft Drinks                ");
        System.out.println("               2. Mix Juice                  ");
        System.out.println("               3. Nescafe                    ");
        System.out.println("               4. Soda Milk                  ");
        System.out.println("               5. Tea                        ");
        System.out.println("---------------------------------------------");
        
        //mengambil input
        System.out.print("Masukkan Nama Pembeli : ");
        nama = scan.nextLine();
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        minuman = scan.nextLine();
        switch (minuman){
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Minuman Tidak Tersedia");
        }
        
        //footer
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " +nama +" telah berkunjung diCafe Ceria");
    }  
}
