/**
 * Created by Jorda on 1/25/2016.
 */
import java.util.Scanner;

public class TheForgetfulMachine
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Favorite food?\n" );
        keyboard.next();

        System.out.print( "Favorite color?\n" );
        keyboard.next();

        System.out.print( "How many family members do you have?\n" );
        keyboard.next();

        System.out.print( "How many pets do you have?\n" );
        keyboard.next();

        System.out.println( "\nWell that was pointless." );
    }
}
