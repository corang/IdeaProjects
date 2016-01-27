/**
 * Created by Jorda on 1/25/2016.
 */
import java.util.Scanner;

public class AgeFiveYears
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age, minus, plus;

        System.out.print("Hi! What's your name? ");
        name = keyboard.next();

        System.out.print("\nHi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        minus = age - 5;
        plus = age + 5;

        System.out.print("Five years from now you will be " + plus + " years old!");
        System.out.print("\nFive years ago you were " + minus + " years old!");
    }
}
