/**
 * Created by Jorda on 1/31/2016.
 */
import java.util.Random;

public class ShortDoubleDice
{
    public static void main(String[] args)
    {
        Random r = new Random();

        int r1, r2, sum;

        System.out.println("It's dice time!");

        do {

            r1 = 1 + r.nextInt(6);
            r2 = 1 + r.nextInt(6);
            sum = r1 + r2;

            System.out.println("First roll:  " + r1);
            System.out.println("Second roll: " + r2);
            System.out.println("Total: " + sum);

        } while (r1 != r2);
    }
}
