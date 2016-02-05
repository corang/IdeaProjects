/**
 * Created by jormcc16@shasd.org on 2/4/16.
 */
import java.util.*;


public class Blackjack
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        int deal, pHand, dHand, dShow;
        String pMove, dMove;

        pHand = 0;
        dHand = 0;
        dShow = 0;

        deal = 2 + r.nextInt(11);
        System.out.println("You were dealt a " + deal);
        pHand += deal;

        deal = 2 + r.nextInt(11);
        System.out.println("\nThe dealer was dealt a hidden card.");
        dHand += deal;

        deal = 2 + r.nextInt(11);
        System.out.println("\nYou were dealt a " + deal);
        pHand += deal;

        deal = 2 + r.nextInt(11);
        System.out.println("\nThe dealer was dealt a " + deal);
        dHand += deal;
        dShow += deal;

        dMove = "";


        System.out.println("\n\nYour total is " + pHand);
        System.out.print("Would you like to 'hit' or 'stay'? ");
        pMove = kb.next();

        while (pMove.equalsIgnoreCase("hit")) {
            deal = 2 + r.nextInt(11);
            System.out.println("You were dealt a " + deal);
            pHand += deal;
            System.out.println("\nYour total is " + pHand);
            if (pHand <= 21) {
                System.out.print("Would you like to 'hit' or 'stay'? ");
                pMove = kb.next();
            } else {
                System.out.println("You busted.");
                pMove = "stay";
                pHand = 0;
            }

        }

        System.out.println("It is the dealer's turn");

        while (dHand < 17 && dHand >= 21) {
            deal = 2 +r.nextInt(11);
            dHand += deal;
            dShow += deal;
            System.out.println("\nThe dealer was dealt a " + deal);
            System.out.println("The dealer is showing " + dShow);
        }
        System.out.println("\nYour hand was " + pHand);
        System.out.println("The dealer's hand was " + dHand);
        if (dHand > 21) {
            dHand = 0;
        }

        if (dHand == pHand) {
            System.out.println("\n\nYou and the dealer tied.");
        } else if (dHand > pHand) {
            System.out.println("\n\nThe dealer won.");
        } else if (dHand < pHand) {
            System.out.println("\n\nYou won!");
        }

    }
}
