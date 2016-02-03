/**
 * Created by jormcc16@shasd.org on 2/3/16.
 */
public class EvenNumbers
{
    public static void main(String[] args)
    {
        for ( int x = 1 ; x <=20 ; x = x+1)
        {
            if ((x % 2) == 0)
            {
                System.out.println(x + "|");
            } else {
                System.out.println(x);
            }
        }
    }
}
