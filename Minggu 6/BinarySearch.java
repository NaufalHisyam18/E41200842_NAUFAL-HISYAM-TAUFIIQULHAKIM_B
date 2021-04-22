package Minggu6;
import java.util.Scanner;
/**
 *
 * @author naufal
 */
public class BinarySearch {
    public static int[] data = null;
    public static int awal, tengah, akhir, temp, count;
    
    public static void main(String[] args) {
    //membuat objek scanner
        Scanner scan = new Scanner(System.in);
        
    //input jumlah data
        System.out.print("Masukkan jumlah data : ");
        int jumlah = scan.nextInt();
    
    //input tiap nilai
        data = new int[jumlah];
        for(int i = 0; i < data.length; i++){
            System.out.print("Masukkan Data ke-" + (i+1) + " : ");
            data[i] = scan.nextInt();
        }
        
        //tampilan data sebelum di sorting
        System.out.print("\nData    : ");
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        
        //proses sorting
        sorting();
        
        //tampilan data setelah di sorting
        System.out.println();
        System.out.print("Sorting : ");
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        
        //input data yang dicari
        System.out.print("\nData yang dicari : ");
        int cari = scan.nextInt();
        
        //proses pencarian
        System.out.println();
        boolean temu = false;
        awal = 0;
        akhir = data.length - 1;
        temp = 0;
        count = 0;
        while (temu != true){
            tengah = (awal + akhir) / 2;
            
            //value == cari
            if (data[tengah] == cari){
                temu = true;
                break;
            }
            
            //value < ca    ri
            else if(data[tengah] < cari){
            awal = tengah + 1;
            }
            
            //value > cari
            else if(data[tengah] > cari){
            awal = tengah - 1;
            }
            
            //cek worst case 
            if(temp != data[tengah])
                temp = data[tengah];
            else 
                count++;
            
            //batasan untuk worst case
            if (count == 3)
                break;
        }
            if(temu == true)
                System.out.println("\nData " + cari + " ditemukan pada index ke-" + tengah);
            else 
                System.out.println("\nData " + cari + " tidak ditemukan");
    }
    
    //sorting ascending
    public static void sorting(){
        int temp = 0;
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++){
                if (i == j)
                    continue;
                else {
                    if (data[i] < data [j]){
                        temp = data[j];
                        data[j] = data[i];
                        data[i] = temp;
                    }
                }
            }
        }
    }
}
