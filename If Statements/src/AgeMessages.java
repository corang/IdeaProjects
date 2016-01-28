/**
 * Created by jormcc16@shasd.org on 1/28/16.
 */
import java.util.Scanner;

public class AgeMessages
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int age;

        System.out.print("How old are you: ");
        age = keyboard.nextInt();

        if (age < 16)
        {
            System.out.println("You can't drive.");
        }
        if (age >= 16 && age < 18)
        {
            System.out.println("You can drive but not vote.");
        }
        if (age >=18 && age < 25)
        {
            System.out.println("You can vote but not rent a car.");
        }
        if (age >= 25)
        {
            System.out.println("You can pretty much do anything legal.");
        }
    }
}
