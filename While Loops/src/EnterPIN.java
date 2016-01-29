/**
 * Created by jormcc16@shasd.org on 1/29/16.
 */
import java.util.Scanner;

public class EnterPIN
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF JORDAN");
        System.out.println("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while (entry != pin)
        {
            System.out.println("\nINCORRECT PIN. PLEASE TRY AGAIN");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}
//It running depends on a certain condition that has to be met
//It keeps repeating instead of either skipping or running it skips or runs infinitely
//The variable "entry" was already initialized/declared
//As expected commenting out "entry = keyboard.netInt();" makes it infinitley output incorrect pin please try again since the condition is never met