/**
 * Created by jormcc16@shasd.org on 1/28/16.
 */
import java.util.Scanner;

public class GenderGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String gender, fName, lName, ms;
        int age;

        System.out.print("Are you male or female(m or f)? ");
        gender = keyboard.next();

        System.out.print("First name: ");
        fName = keyboard.next();

        System.out.print("Last name: ");
        lName = keyboard.next();

        System.out.print("Age: ");
        age = keyboard.nextInt();

        if (age >= 20 && gender.equals("f"))
        {
            System.out.print("Are you Married(yes or no)? ");
            ms = keyboard.next();

            if (ms.equals("yes"))
            {
                System.out.println("Then you are Mrs. " + lName);
            }
            else if (ms.equals("no"))
            {
                System.out.println("Then you are Ms. " + lName);
            }
        }
        else if (gender.equals("f") && age < 20)
        {
            System.out.println("Then you are " + fName + " " + lName);
        }
        else if (gender.equals("m") && age >= 20)
        {
            System.out.println("Then you are Mr. " + lName);
        }
        else if (gender.equals("m") && age < 20)
        {
            System.out.println("Then you are " + fName + " " + lName);
        }

    }
}
