/**
 * Created by Jorda on 1/31/2016.
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingAgain
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int tries, guess, answer;

        tries = 0;

        System.out.println("I'm thinking of a number between 1 and ten, can you guess it?");

        answer = 1 + r.nextInt(10);

        do {
            System.out.print("Guess: ");
            guess = keyboard.nextInt();

            tries ++;
        } while (answer != guess);

        System.out.println("That took you " + tries + " tries.");
    }
}
