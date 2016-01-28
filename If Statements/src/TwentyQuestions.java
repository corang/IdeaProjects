import java.util.Scanner;

public class TwentyQuestions
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String response1, response2;
        
        System.out.println("Think of an object.");
        
        System.out.println("Is it an animal, vegetable, or mineral?");
        response1 = keyboard.next();
        
        if (response1.equals("animal"))
        {
            System.out.println("Is it bigger than a breadbox?");
            response2 = keyboard.next();
            
            if (response2.equals("yes"))
            {
                System.out.println("It's a moose.");
            }
            else if (response2.equals("no"))
            {
                System.out.println("It's a squirrel.");
            }
            else
            {
                System.out.println("That is not a valid answer.");
            }
        }
        
        else if (response1.equals("vegetable"))
        {
            System.out.println("Is it bigger than a breadbox?");
            response2 = keyboard.next();
            
            if (response2.equals("yes"))
            {
                System.out.println("It's a watermelon.");
            }
            else if (response2.equals("no"))
            {
                System.out.println("It's a carrot.");
            }
            else
            {
                System.out.println("That is not a valid answer.");
            }
        }
        
        else if (response1.equals("mineral"))
        {
            System.out.println("Is it bigger than a breadbox?");
            response2 = keyboard.next();
            
            if (response2.equals("yes"))
            {
                System.out.println("It's a camaro.");
            }
            else if (response2.equals("no"))
            {
                System.out.println("It's a paper clip.");
            }
            else
            {
                System.out.println("That is not a valid answer.");
            }
        }
        else
        {
            System.out.println("Not a valid answer.");
        }
    }
}