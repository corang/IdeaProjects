/**
 * Created by Jorda on 1/31/2016.
 */
import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double input, answer;

        System.out.println("SQUARE ROOT CALCULATOR");

        System.out.print("Number: ");
        input = keyboard.nextDouble();

        while (input < 1)
        {
            System.out.print("You can't square root a negative number, try again: ");
            input = keyboard.nextDouble();
        }

        answer = Math.sqrt(input);

        System.out.println("The square root of " + input + " is " + answer + ".");
    }
}
