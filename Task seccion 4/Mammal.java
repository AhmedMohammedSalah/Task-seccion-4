package asssign3abs.inter;

/**
 *
 * @author Ahmed
 */
public class Mammal implements Animal{

    public void eat() {
        System.out.println("Mammal eat");
    }
    public void traval() {
        System.out.println("Mammal travel");
    }
    public int NoOflegs()
    {
        return 0;
    }
    public String FavFood()
    {
        return "leaves";
    }
}
