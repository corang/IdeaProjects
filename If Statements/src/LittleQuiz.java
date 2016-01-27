/**
 * Created by Jorda on 1/26/2016.
 */
import java.util.Scanner;

public class LittleQuiz
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int a1, a2, a3;

        float score = 0;

        System.out.println("What is 2+2?");
        System.out.println("1) 3");
        System.out.println("2) 4");
        System.out.println("3) 5");

        System.out.print("\nAnswer: ");
        a1 = keyboard.nextInt();

        if (a1 == 2)
        {
            System.out.println("Correct!");
            score ++;
        }
        else
        {
            System.out.println("Incorrect!");
        }


        System.out.println("What is the most appropriate value for double?");
        System.out.println("1) Mcdouble");
        System.out.println("2) 3.1415");
        System.out.println("3) 22");


        System.out.print("\nAnswer: ");
        a2 = keyboard.nextInt();

        if (a2 == 2)
        {
            System.out.println("Correct!");
            score ++;
        }
        else
        {
            System.out.println("Incorrect!");
        }


        System.out.println("Which of the following games was programmed in the same language as this quiz?");
        System.out.println("1) Call of Duty");
        System.out.println("2) Minecraft");
        System.out.println("3) Need for Speed Most Wanted");

        System.out.print("\nAnswer: ");
        a3 = keyboard.nextInt();

        if (a3 == 2)
        {
            System.out.println("Correct!");
            score ++;
        }
        else
        {
            System.out.println("Incorrect!");
        }

        System.out.println("Your score: " + (score / 3) * 100 + "% (" + score + " out of 3.0)" );
    }
}
