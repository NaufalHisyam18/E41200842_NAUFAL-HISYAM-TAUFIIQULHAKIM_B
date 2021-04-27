package Minggu7_Perwarisan_Overriding;

/**
 *
 * @author naufal
 */
public class B extends A{
    public void tampilkanKeLayar(){
	super.tampilkanKeLayar(); //memanggil method milik dari superclassnya.
	System.out.println("Method milik Class B dipanggil");
    }
}
