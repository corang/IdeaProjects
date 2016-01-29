/**
 * Created by Jorda on 1/28/2016.
 */
import java.util.Scanner;
import java.util.Random;

public class BetterGuessingGame
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        Random r = new Random();

        int answer = 1 + r.nextInt(10), guess;

        System.out.print("I'm thinking of a number between 1 and 10, can you guess it? ");
        guess = keyboard.nextInt();

        if (guess == answer)
        {
            System.out.println("Good job! You got it!");
        }
        else
        {
            System.out.println("Wrong! At least you tried, the answer was " + answer + ".");
        }
    }
}
