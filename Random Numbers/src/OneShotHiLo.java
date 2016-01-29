/**
 * Created by jormcc16@shasd.org on 1/29/16.
 */
import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int num = 1 + r.nextInt(100);
        int guess;

        System.out.print("Im thinking of a number between 1 and 100, what do you think it is? ");
        guess = keyboard.nextInt();

        if (guess == num)
        {
            System.out.println("Congrats! You got it right!");
        }
        else if (guess < num)
        {
            System.out.println("Too low, I was thinking of " + num + ".");
        }
        else if (guess > num)
        {
            System.out.println("Too high, I was thinking of " + num + ".");
        }
    }
}
