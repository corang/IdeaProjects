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

        int deal;
        int pHand = 0, dHand = 0, draws = 0;
        String pMove, dMove;

        deal = 2 + r.nextInt(11);
        pHand += deal;
        System.out.println("You've drawn a " + deal);

        deal = 1 + r.nextInt(11);
        dHand += deal;
        System.out.println("The dealer has also drawn a card");

        draws ++;

        while (pHand >= 21 || dHand >= 21 || (pMove != "stay" && dMove != "stay") || )
        {
            deal = 1 + r.nextInt(11);

        }
    }
}
