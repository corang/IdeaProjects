/**
 * Created by Jorda on 1/26/2016.
 */
import java.util.Scanner;

public class DumbCalculator
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3, answer;

        System.out.print("First Number? ");
        num1 = keyboard.nextDouble();

        System.out.print("Second Number? ");
        num2 = keyboard.nextDouble();

        System.out.print("Third Number? ");
        num3 = keyboard.nextDouble();

        answer = ( num1 + num2 + num3 ) / 2;

        System.out.println("\n( " + num1 + " + " + num2 + " + " + num3 + " / 2 = " + answer);
    }
}
