/**
 * Created by jormcc16@shasd.org on 2/2/16.
 */
import java.util.Scanner;

public class CountingMachine2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Count from: ");
        int d = keyboard.nextInt();
        System.out.print("Count to: ");
        int n = keyboard.nextInt();
        System.out.print("Count by: ");
        int b = keyboard.nextInt();
        for (int c = d ; c <= n ; c = c+b)
        {
            System.out.print(c + " ");
        }
    }
}
