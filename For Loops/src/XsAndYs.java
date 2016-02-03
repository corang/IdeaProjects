/**
 * Created by jormcc16@shasd.org on 2/3/16.
 */
public class XsAndYs
{
    public static void main(String[] args)
    {
        for (double x = -10 ; x <= 10 ; x = x+0.5)
        {
            double y = x * x;
            System.out.println(x + "\t" + y);
        }
    }
}
