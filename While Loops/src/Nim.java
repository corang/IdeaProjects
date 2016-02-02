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

        turn = 1;

        while (a >= 1 || b >= 1 || c >= 1)
        {
            if ((a >= 1 || b >= 1 || c >= 1) && turn == 1)
            {
                System.out.print(player1 + " pile: ");
                pile = keyboard.next();
                System.out.print(player1 + " how many to remove: ");
                input = keyboard.nextInt();

                switch (pile) {
                    case "a": {
                        a = a - input;
                        break;
                    }
                    case "b": {
                        b = b - input;
                        break;
                    }
                    case "c": {
                        c = c - input;
                        break;
                    }
                }
                turn = 2;
            }

            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);

            if ((a >= 1 || b >= 1 || c >= 1) && turn == 2)
            {
                System.out.print(player2 + " pile: ");
                pile = keyboard.next();
                System.out.print(player2 + " how many to remove: ");
                input = keyboard.nextInt();

                switch (pile) {
                    case "a": {
                        a = a - input;
                        break;
                    }
                    case "b": {
                        b = b - input;
                        break;
                    }
                    case "c": {
                        c = c - input;
                        break;
                    }
                }
                turn = 1;
            }

            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
        }
        if (turn == 2){
            System.out.println(player1 + " you lose.");
        } else if (turn == 1){
            System.out.println(player2 + "you lose.");
        }

    }
}
