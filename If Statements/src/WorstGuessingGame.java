/**
 * Created by Jorda on 1/28/2016.
 */
import java.util.Scanner;

public class WorstGuessingGame
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int answer = 7, guess;

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
