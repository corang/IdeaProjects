/**
 * Created by Jorda on 1/31/2016.
 */
import java.util.Scanner;

public class TriangleChecker
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;
        double aS, bS, cS;

        System.out.println("Three integers please.");

        System.out.print("Side 1: ");
        a = keyboard.nextInt();

        System.out.print("Side 2: ");
        b = keyboard.nextInt();

        while (b < a)
        {
            System.out.println("Side 2 cannot be less than side 1, try again.");

            System.out.print("Side 2: ");
            b = keyboard.nextInt();
        }

        System.out.print("Side 3: ");
        c = keyboard.nextInt();

        while (c < b)
        {
            System.out.println("Side 3 cannot be less than side 2, try again.");

            System.out.print("Side 3: ");
            c = keyboard.nextInt();
        }

        System.out.println("Your sides are " + a + " " + b + " " + c + ".");
        aS = a * a;
        bS = b * b;
        cS = c * c;

        if ( (aS + bS) == cS)
        {
            System.out.println("These sides make a right triangle.");
        }
        else
        {
            System.out.println("These side do NOT make a right triangle.");
        }
    }
}
