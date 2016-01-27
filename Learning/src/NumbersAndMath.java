/**
 * Created by Jorda on 1/25/2016.
 */
public class NumbersAndMath
{
    public static void main( String[] args)
    {
        //Prints out phrase
        System.out.println( "I will now count my chickens:" );

        //Prints out phrase and divides 30 by 6 and adds that to 5 appending the answer to the line
        System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
        //Multiplies 20 by 3, gets the remainder of that divided by 4 and subtracts it from 100
        System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );

        //Prints out phrase
        System.out.println( "Now I will count the eggs:" );

        //Gets remainder of 4 divided by 2, divides 1 by 4, adds 3 and 2, adds that answer to 1,
        //Subtracts the answer of 4 % 2 from that, subtracts the answer of 1/4 from that and
        //Finally adds 6 to that
        System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );

        //Prints out phrase
        System.out.println( "Is it true that 3 + 2 < 5 - 7" );

        //Adds 3 and 2 and subtracts 7 from 5, and asks if the answer of 3+2 is less than
        //the answer of 5 - 7
        System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );

        //Prints out phrase and adds 3 and 2 appending it to the line
        System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
        //Prints out phrase and appends answer to line
        System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );

        //Prints out phrase
        System.out.println( "Oh, so that's why it's false." );

        //Prints out phrase
        System.out.println( "How about some more." );

        //Prints out phrase, checks if 5 is greater than -2, appends result
        System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
        //Prints out phrase, checks if 5 is greater than or equal to -2, appends result
        System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ));
        //Prints out phrase, checks if 5 is less than -2, appends result
        System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
    }
}
