/**
 * Created by Jorda on 1/31/2016.
 */
import java.util.Scanner;

public class AddLoop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int sum, input;

        System.out.println("I will add numbers input here.");
        System.out.print("Starting number: ");
        input = keyboard.nextInt();

        sum = 0;

        while (input != 0)
        {
            sum += input;

            System.out.println("Current total: " + sum);
            System.out.print("Input: ");
            input = keyboard.nextInt();
        }

        System.out.println("Your final total is " + sum);
    }
}
