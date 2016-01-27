/**
 * Created by Jordan on 1/25/2016.
 */
import java.util.Scanner;

public class MoreUserInput
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String fName, lName, login;
        int grade, id;
        double gpa;

        System.out.print("First name:       ");
        fName = keyboard.next();
        System.out.print("Last name:        ");
        lName = keyboard.next();
        System.out.print("Grade (1-12):     ");
        grade = keyboard.nextInt();
        System.out.print("Student ID:       ");
        id = keyboard.nextInt();
        System.out.print("Login:            ");
        login = keyboard.next();
        System.out.print("GPA (0.0-4.0):    ");
        gpa = keyboard.nextDouble();

        System.out.println( "\nProvided Information:" );
        System.out.println( "   Login:  " + login );
        System.out.println( "   ID #:   " + id );
        System.out.println( "   Name    " + lName + ", " + fName );
        System.out.println( "   GPA:    " + gpa );
        System.out.println( "   Grade:  " + grade );
    }
}
