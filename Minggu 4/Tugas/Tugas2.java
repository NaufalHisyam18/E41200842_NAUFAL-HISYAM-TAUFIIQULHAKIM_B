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
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil = 1;
        System.out.println("            Do_While            ");
        System.out.println(" Bilangan Perkalian 2 (1 - 100) ");
        System.out.println("================================");
        do{
            bil = bil * 2;
            System.out.print(bil + " ");
            if (bil == 64)break;     
        }while(true);        
            }
}
