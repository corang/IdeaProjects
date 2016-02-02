/**
 * Created by Jorda on 2/1/2016.
 */
import java.util.Scanner;

public class Nim
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String player1, player2, pile;
        int a, b, c, turn, input;

        a = 3;
        b = 3;
        c = 3;

        System.out.print("Player one's name: ");
        player1 = keyboard.next();
        System.out.print("Player two's name: ");
        player2 = keyboard.next();


        System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);

        while (a >= 1 || b >= 1 || c >= 1)
        {
            System.out.print("Pile: ");
            pile = keyboard.next();
            System.out.print("How many to remove: ");
            input = keyboard.nextInt();

            switch (pile) {
                case "a": {
                    a = a - input;
                    break;
                }case "b": {
                    b = b - input;
                    break;
                }case "c": {
                    c = c - input;
                    break;
                }
            }
            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
        }
    }
}
