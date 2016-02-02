/**
 * Created by jormcc16@shasd.org on 2/2/16.
 */
import java.util.Scanner;

public class CountingMachine
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();
        for (int c = 1 ; c <= n ; c = c+1)
        {
            System.out.print(c + " ");
        }
    }
}
