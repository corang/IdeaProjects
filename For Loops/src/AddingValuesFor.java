/**
 * Created by jormcc16@shasd.org on 2/3/16.
 */
import java.util.Scanner;

public class AddingValuesFor
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = kb.nextInt();

        int s = 0;

        for ( int x = 1 ; x <= n ; x = x + 1)
        {

            s += x;
            System.out.print(x + " ");
        }
        System.out.print("\nThe sum is " + s);
    }
}
