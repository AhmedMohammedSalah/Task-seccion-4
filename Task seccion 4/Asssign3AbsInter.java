
package asssign3abs.inter;

/**
 *
 * @author Ahmed
 */
public class Asssign3AbsInter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ball ba=new Ball("hokey");
        System.out.println("Brand Name : "+ba.getBrandname());
        Football fot = new Football("football");
        System.out.println(fot.getBrandname());
        Mammal ma=new Mammal();
        ma.eat();
        ma.traval();
        System.out.println(ma.NoOflegs());
        System.out.println(ma.FavFood());
    }
    
}
