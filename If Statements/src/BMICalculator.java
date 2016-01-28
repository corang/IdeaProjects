/**
 * Created by Jorda on 1/26/2016.
 */
import java.util.Scanner;

public class BMICalculator
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double weight, height, hSquare, BMI, heightI, weightI, hConv, wConv, heightIF, heightII;

        hConv = 0.0254 ;
        wConv = 0.453592 ;

        System.out.print("What is your height in Feet?      ");
        heightIF = keyboard.nextDouble();

        System.out.print("What is your height in inches?    ");
        heightII = keyboard.nextDouble();

        System.out.print("What is your weight in pounds?    ");
        weightI = keyboard.nextDouble();

        heightI = ( heightIF * 12) + heightII;


        height = heightI * hConv;
        weight = weightI * wConv;

        hSquare = height * height;

        BMI = weight / hSquare;

        System.out.println("\nYour BMI is " + BMI );

        if (BMI <= 18.5)
        {
            System.out.println("You are underweight.");
        }
        else if (BMI <= 24.9)
        {
            System.out.println("You are of normal weight.");
        }
        else if (BMI <= 29.9)
        {
            System.out.println("You are overweight");
        }
        else
        {
            System.out.println("You are obese.");
        }
    }
}
