package Minggu7_Perwarisan_Nilai;

/**
 *
 * @author naufal
 */
public class B extends A { //mendeklarasikan Class B yang
    int z;                 // diturunkan dari Class A
    
    void TampilkanJumlah(){
        //subclass dapat mengakses member dari superclass
        System.out.println("Jumlah :" + (x+y+z));
    }
}
