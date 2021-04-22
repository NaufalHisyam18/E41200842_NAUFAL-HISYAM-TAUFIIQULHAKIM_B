package Minggu6;
/**
 *
 * @author naufal
 */
public class Descending {
    public static void main(String[] args){
        int data[] = {24, 12, 67, 22, 11, 78};
       System.out.println("Data Sebelum Disorting : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
       for (int i=0; i<data.length; i++)
           for (int j=0; j<data.length; j++)
               if (data[i]>data[j])
               {
                   int hasil=data[i];
                   data[i]=data[j];
                   data[j]=hasil;
               }
        System.out.println();
        System.out.print("Data Setelah Disorting (Descending):\n");
        for (int j=0; j<data.length; j++)
            System.out.print(data[j] + " ");
    }
}