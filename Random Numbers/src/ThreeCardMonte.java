/**
 * Created by jormcc16@shasd.org on 1/29/16.
 */
import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
    public static void main(String[]  args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int card = 1 + r.nextInt(3);
        int guess;

        System.out.println("I have three cards here and one is an ace, which one is it?\n");

        System.out.println("    ###    ###    ###");
        System.out.println("    ###    ###    ###");
        System.out.println("    ###    ###    ###");
        System.out.println("     1      2      3\n");

        guess = keyboard.nextInt();

        if (guess == card)
        {
            System.out.println("Well aren't you a lucky one, here's your winnings.");
        }
        else
        {
            System.out.println("\nOhhh, too bad, i guess I'll be taking that money then.\n");
        }

        if (card == 1)
        {
            System.out.println("    AAA    ###    ###");
            System.out.println("    AAA    ###    ###");
            System.out.println("    AAA    ###    ###");
            System.out.println("     1      2      3");
        }
        else if (card ==2)
        {
            System.out.println("    ###    AAA    ###");
            System.out.println("    ###    AAA    ###");
            System.out.println("    ###    AAA    ###");
            System.out.println("     1      2      3");
        }
        else if (card == 3)
        {
            System.out.println("    ###    ###    AAA");
            System.out.println("    ###    ###    AAA");
            System.out.println("    ###    ###    AAA");
            System.out.println("     1      2      3");
        }

    }
}
