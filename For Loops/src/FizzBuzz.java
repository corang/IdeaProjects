/**
 * Created by jormcc16@shasd.org on 2/3/16.
 */
public class FizzBuzz
{
    public static void main(String[] args)
    {
        for (int x = 1 ; x <= 100 ; x = x+1)
        {
            if ((x % 3) == 0 && (x % 5) == 0)
            {
                System.out.println("FizzBuzz");
            } else if ((x % 5) == 0)
            {
                System.out.println("Buzz");
            } else if ((x % 3) == 0)
            {
                System.out.println("Fizz");
            } else
            {
                System.out.println(x);
            }
        }
    }
}
