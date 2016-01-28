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

        int i = "".compareTo(name);
        System.out.print(i);
    }
}
