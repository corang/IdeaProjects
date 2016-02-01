/**
 * Created by Jorda on 1/30/2016.
 */
import java.util.Random;
import java.util.Scanner;

public class HiLoLimited
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int tries, answer, guess, max;

        max = 7;
        answer = 1 + r.nextInt(100);
        tries = 0;

        System.out.println("I'm thinking of a number between 1 and 100, try to guess it.");
        System.out.print("Guess # 1: ");
        guess = keyboard.nextInt();

        tries ++;

        while (guess != answer && tries < max)
        {
            if (guess < answer)
            {
                System.out.println("Sorry, your guess was too low.");
            }
            else if (guess > answer)
            {
                System.out.println("Sorry, your guess was too high.");
            }

            tries ++;

            System.out.print("Guess # " + tries + ": ");
            guess = keyboard.nextInt();
        }
        if (guess == answer)
        {
            System.out.println("Congratulations, you guessed correctly!");
        }
        else if (guess != answer)
        {
            System.out.println("Too bad, you didn't get it.");
        }

    }
}
