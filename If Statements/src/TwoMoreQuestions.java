/**
 * Created by jormcc16@shasd.org on 1/28/16.
 */
import java.util.Scanner;

public class TwoMoreQuestions
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String r1, r2;

        System.out.print("Does it belong inside, outside, or both? ");
        r1 = keyboard.next();
        System.out.print("Is it alive? ");
        r2 = keyboard.next();

        if (r1.equals("inside") && r2.equals("yes"))
        {
            System.out.print("It is a houseplant.");
        }
        if (r1.equals("inside") && r2.equals("no"))
        {
            System.out.print("It is a shower curtain.");
        }
        if (r1.equals("outside") && r2.equals("yes"))
        {
            System.out.print("It is a bison.");
        }
        if (r1.equals("outside") && r2.equals("no"))
        {
            System.out.print("It is a billboard.");
        }
        if (r1.equals("both") && r2.equals("yes"))
        {
            System.out.print("it is a dog.");
        }
        if (r1.equals("both") && r2.equals("no"))
        {
            System.out.print("It is a cell phone.");
        }
    }
}
