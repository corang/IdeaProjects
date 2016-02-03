/**
 * Created by jormcc16@shasd.org on 2/3/16.
 */
import java.util.Scanner;

public class LetterAtATime
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");

        for ( int i=0 ; i<message.length() ; i++ )
        {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int a_count = 0;

        for ( int i=0; i<message.length(); i++ )
        {
            char letter = message.charAt(i);
            if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U')
            {
                a_count++;
            }
        }

        System.out.println("\nYour message has " + a_count + " vowels. Isn't that interesting?");

    }
}
//Adding the = to i<message.length() makes it so that it tries to write a character that isnt there since the pos starts at zero and the counter does not.
//box is 3 characters long, x is at position 2
//If it tried to repeat with <= instead of < it would error out since there the pos starts at zero and the counter starts at one