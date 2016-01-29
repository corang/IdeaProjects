/**
 * Created by Jorda on 1/28/2016.
 */
import java.util.Random;

public class FortuneCookie
{
    public static void main(String[] args)
    {
        Random r = new Random();

        int cookie = 1 + r.nextInt(6);

        if (cookie == 1)
        {
            System.out.println("Good times are ahead");
        }
        else if (cookie == 2)
        {
            System.out.println("Do not be afraid to try new things, good fortune waits behind closed doors");
        }
        else if (cookie == 3)
        {
            System.out.println("Stick with your current path");
        }
        else if (cookie == 4)
        {
            System.out.println("Happiness comes with patience");
        }
        else if (cookie == 5)
        {
            System.out.println("Be adventurous, you will be happy");
        }
        else if (cookie == 6)
        {
            System.out.println("Keep on the straight and narrow");
        }

        System.out.println("This week's lotto numbers");
        System.out.println((1 + r.nextInt(52)) + " " + (1 + r.nextInt(52)) + " " + (1 + r.nextInt(52)) + " " + (1 + r.nextInt(52)) + " " + (1 + r.nextInt(52)) + " " + (1 + r.nextInt(52)));
    }
}
