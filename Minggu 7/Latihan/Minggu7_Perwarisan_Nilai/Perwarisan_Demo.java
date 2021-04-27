package Minggu7_Perwarisan_Nilai;

/**
 *
 * @author naufal
 */
public class Perwarisan_Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        System.out.println("Superclass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();

        System.out.println("Subclass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();

        //member tambahan yang hanya ada pada subclass
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
    
}
