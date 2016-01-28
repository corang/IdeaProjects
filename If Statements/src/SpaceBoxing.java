/**
 * Created by Jorda on 1/26/2016.
 */
import java.util.Scanner;

public class SpaceBoxing
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double weight, Fweight, vConv, mConv, jConv, sConv, uConv, nConv;
        int choice;

        vConv = 0.78;
        mConv = 0.39;
        jConv = 2.65;
        sConv = 1.17;
        uConv = 1.05;
        nConv = 1.23;

        System.out.print("Enter your current earth weight: ");
        weight = keyboard.nextDouble();

        System.out.println("\n Planet Information:");
        System.out.println("1. Venus    2. Mars");
        System.out.println("3. Jupiter  4. Saturn");
        System.out.println("5. Uranus   6. Neptune");

        System.out.print("\nWhich number planet? ");
        choice = keyboard.nextInt();

        if (choice == 1)
        {
            Fweight = weight * vConv;
            System.out.println("\nWeight will be: " + Fweight);
        }
        else if (choice == 2)
        {
            Fweight = weight * mConv;
            System.out.println("\nWeight will be: " + Fweight);
        }
        else if (choice == 3)
        {
            Fweight = weight * jConv;
            System.out.println("\nWeight will be: " + Fweight);
        }
        else if (choice == 4)
        {
            Fweight = weight * sConv;
            System.out.println("\nWeight will be: " + Fweight);
        }
        else if (choice == 5)
        {
            Fweight = weight * uConv;
            System.out.println("\nWeight will be: " + Fweight);
        }
        else if (choice == 6)
        {
            Fweight = weight * nConv;
            System.out.println("\nWeight will be: " + Fweight);
        }
        else
        {
            System.out.println("\nNot a valid planet number.");
        }

    }
}
