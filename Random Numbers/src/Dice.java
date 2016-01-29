/**
 * Created by jormcc16@shasd.org on 1/29/16.
 */
import java.util.Random;

public class Dice
{
    public static void main(String[] args)
    {
        Random r = new Random();

        int d1 = 1 + r.nextInt(6);
        int d2 = 1 + r.nextInt(6);

        System.out.println("First roll: " + d1);
        System.out.println("Second roll: " + d2);

        System.out.println("Total: " + (d1 + d2));
    }
}
