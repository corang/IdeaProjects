/**
 * Created by Jorda on 1/26/2016.
 */
public class ModulusAnimation
{
    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i<40; i++ )
        {
            if ( i%8 == 0 )
                System.out.print("|·  |\r");
            else if ( i%8 == 1 )
                System.out.print("| · |\r");
            else if ( i%8 == 2 )
                System.out.print("|  ·|\r");
            else if ( i%8 == 3 )
                System.out.print("| · |\r");
            else if ( i%8 == 4 )
                System.out.print("|·  |\r");
            else if ( i%8 == 5 )
                System.out.print("| · |\r");
            else if ( i%8 == 6 )
                System.out.print("|  ·|\r");
            else if ( i%8 == 7 )
                System.out.print("| · |\r");
            Thread.sleep(150);
        }

    }
}
