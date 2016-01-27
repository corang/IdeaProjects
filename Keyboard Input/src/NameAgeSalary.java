/**
 * Created by Jorda on 1/25/2016.
 */
import java.util.Scanner;

public class NameAgeSalary
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double pay;

        System.out.print( "Hi! What's your name?\n" );
        name = keyboard.next();

        System.out.print( "Hey there, " + name + "! How long have you existed for? (In years preferably)\n" );
        age = keyboard.nextInt();

        System.out.print( "I see, you're " + age + ", " + name + ". Might I ask how much money you make an hour?\n" );
        pay = keyboard.nextDouble();

        System.out.println( "Well you could do a lot worse than " + pay + " dollars!" );
    }
}
