/**
 * Created by Jorda on 1/26/2016.
 */
import java.util.Scanner;

public class HowOldAreYou
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Hi, what's your name? ");
        name = keyboard.next();

        System.out.print("\nOkay, " + name + ", how old are you? ");
        age = keyboard.nextInt();

        if (age < 16)
        {
            System.out.println("You can't drive yet, " + name);
        }

        if (age < 18)
        {
            System.out.println("You can't vote yet, " + name);
        }

        if (age < 25)
        {
            System.out.println("You can't rent a car yet, " + name);
        }

        if (age >= 25)
        {
            System.out.println("You can do anything legal, " + name);
        }
    }
}
