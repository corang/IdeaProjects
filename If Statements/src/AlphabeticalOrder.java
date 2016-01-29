/**
 * Created by jormcc16@shasd.org on 1/28/16.
 */
import java.util.Scanner;

public class AlphabeticalOrder
{
    public static void main(String[]  args)
    {
        Scanner keyboard = new Scanner(System.in);

        String name;

        System.out.print("Last name: ");
        name = keyboard.next();

        int i = " ".compareToIgnoreCase(name);
        //System.out.println(i);

        if (i >= -67)
        {
            System.out.println("Don't expect to sit more than a few minutes, " + name);
        }
        else if (i >= -75)
        {
            System.out.println("You won't be waiting too long, " + name);
        }
        else if (i >= -80)
        {
            System.out.print("Give it a little, we'll get to you, " + name);
        }
        else if (i >= -85)
        {
            System.out.println("It's gonna be awhile, " + name);
        }
        else if (i >= -90)
        {
            System.out.println("Hope your day is free, " + name);
        }
    }
}
