/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author naufal
 */
public class Tugas2_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil = 0;
        System.out.println("               Do_While                    ");
        System.out.println("       Bilangan Kelipatan 2 (1 - 100)      ");
        System.out.println("===========================================");
       
       do{
            bil = bil + 2;
            System.out.print(bil + " ");
            if (bil == 100)break;     
        }while(true);
    }
    
}
