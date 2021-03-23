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
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat variable dan scanner 
        int [] harga = new int[5];
        String nama;
        String hadiah;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        
        //header
        System.out.println("            Kharisma Agung Plaza             ");
        System.out.println("           Promo Belanja Berhadiah           ");
        System.out.println("       Khusus Pembelian 5 Barang Pertama     ");
        System.out.println("       Dengan Harga Minimum Rp 10000,00      ");
        System.out.println("---------------------------------------------");
        
        //isi
        System.out.print("Masukkan Nama Pembeli : ");
        nama = scan.nextLine();
        System.out.println("");
        System.out.print("Masukkan harga barang ke-1 : ");
        harga[0] = scan.nextInt();
        System.out.print("Masukkan harga barang ke-2 : ");
        harga[1] = scan.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        harga[2] = scan.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        harga[3] = scan.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        harga[4] = scan.nextInt();
        
        for(int i = 0; i<harga.length; i++){
            total = total+harga[i];
         }
        System.out.println("Total Harga Pembelian atas nama " + nama +" adalah Rp " +total);
        
          if (total >= 100000){
            hadiah = "Selamat.... Anda mendapat hadiah 1 Buah Mug Cantik";
        } else if (total >= 75000){
            hadiah = "Selamat.... Anda mendapat hadiah 1 Buah Piring Cantik";
        } else if (total >= 50000){
            hadiah = "Selamat.... Anda mendapat hadiah 2 Buah Sendok Garpu";
        } else if (total >= 25000){
            hadiah = "Selamat.... Anda mendapat hadiah 1 Buah Sendok Garpu";
        } else if (total >= 10000){
            hadiah = "Selamat.... Anda mendapat hadiah 1 Buah Tas Belanja";
        } else {
            hadiah = "Maaf Anda tidak mendapatkan hadiah";
        } 
          System.out.println("");
          System.out.println(hadiah);
          
        //footer
        System.out.println("---------------------------------------------");
        System.out.println("               Terima Kasih                  ");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza  ");
    }   
}