/**
 * Created by jormcc16@shasd.org on 2/3/16.
 */
import java.util.Scanner;
import java.util.Random;

public class BabyBlackjack
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        int p1c1, p1c2, p2c1, p2c2, h1, h2;

        p1c1 = 1 + r.nextInt(10);
        p1c2 = 1 + r.nextInt(10);
        p2c1 = 1 + r.nextInt(10);
        p2c2 = 1 + r.nextInt(10);

        h1 = p1c1 + p1c2;
        h2 = p2c1 + p2c2;

        System.out.println("You drew a " + p1c1 + " and a " + p1c2);
        System.out.println("Your total is " + h1);
        System.out.println("\nThe dealer drew a " + p2c1 + " and a " + p2c2);
        System.out.println("The dealer's total is " + h2);

        if (h1 > h2)
        {
            System.out.println("\nYou win!");
        }else if (h1 < h2)
        {
            System.out.println("\nThe dealer won.");
        } else
        {
            System.out.println("\nYou and the dealer tied.");
        }


    }
}
