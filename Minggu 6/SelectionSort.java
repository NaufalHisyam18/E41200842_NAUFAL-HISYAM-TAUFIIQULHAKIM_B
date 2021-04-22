package Minggu6;
import java.util.Scanner;
/**
 *
 * @author naufal
 */
public class SelectionSort {
    public static void main(String[] args) {
        //membuat objek scanner
        Scanner scan = new Scanner(System.in);
        
        //input jumlah data
        System.out.print("Masukkan jumlah data : ");
        int jumlah = scan.nextInt();
        
        //input nilai tiap data
        int[] data = new int[jumlah];
        System.out.println();
        for ( int i = 0; i < jumlah; i++){
            System.out.print("Input nilai data ke-" + (i+1) + " : ");
            data[i] = scan.nextInt();
        }
        
        //tampilkan data sebelum disorting
        System.out.println();
        System.out.print("Data sebelum di sorting : ");
        for ( int i = 0; i < jumlah; i++)
            System.out.print(data[i] + " ");
        
        
        //proses selection
        System.out.println("\n\nProses Selection Sort");
        for (int i = 0; i < jumlah-1; i++){
            System.out.println("Iterasi ke-" + (i+1) + " : ");
            for (int j = 0; j < jumlah; j++)
                System.out.print(data[j] + " ");
            System.out.println("    Apakah data " + data[i] + " sudah benar pada urutannya?");
            
            boolean tukar = false;
            int index = 0;
            int min = data[i];
            String pesan = "    Tidak ada pertukaran";
            for(int j = i+1; j < jumlah; j++){
                if (min > data[j]){
                    tukar = true;
                    index = j;
                    min = data[j];
                }
            }
            //pertukaran data
            if (tukar == true){
            pesan = "    Data " + data[i] + " ditukar dengan Data " + data[index];
            int temp = data[i];
                data [i] = data[index];
                data[index] = temp;
            }
            for (int j = 0; j < jumlah; j++)
               System.out.print(data[j] + " ");
            System.out.println(pesan + "\n");
        }
        
        //tampilkan data setelah di sorting
        System.out.print("Data setelah di sorting : ");
        for(int i = 0; i < jumlah; i++)
            System.out.print(data[i] + " ");
    }   
}
