/**
 * Created by Jorda on 1/26/2016.
 */
import java.util.Scanner;

public class SpecificAge
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Name please: ");
        name = keyboard.next();

        System.out.print(name + ", age please: ");
        age = keyboard.nextInt();

        if (age < 16)
        {
            System.out.println("You can't even drive yet.");
        }
        else if (age < 18)
        {
            System.out.println("You can drive but you can't vote.");
        }
        else if (age < 25)
        {
            System.out.println("You can vote and drive, but you can't rent a car. Yet.");
        }
        else
        {
            System.out.println("You can do pretty much whatever you want that is legal");
        }
    }
}
