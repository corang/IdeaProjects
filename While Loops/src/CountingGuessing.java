/**
 * Created by Jorda on 1/28/2016.
 */
import java.util.Scanner;
import java.util.Random;

public class CountingGuessing
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        Random r = new Random();

        int answer = 1 + r.nextInt(10), guess;

        System.out.println("I'm thinking of a number between 1 and 10, can you guess it?");
        guess = keyboard.nextInt();

        int tries = 1;

        while (guess != answer)
        {
            System.out.println("Incorrect, try again.\n");
            guess = keyboard.nextInt();

            tries ++;
        }
        System.out.println("Correct! It took you " + tries + " tries.");
    }
}
