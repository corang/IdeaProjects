/**
 * Created by Jorda on 1/26/2016.
 */
//If the if statement is true that means the code under it is executed, if the if statement is false it skips the underlying code
//The curly braces under the if statement define what code will be executed if true and what code will be skipped if it is false
public class WhatIf
{
    public static void main(  String[] args)
    {
        int people = 20;
        int cats = 20;
        int dogs = 15;

        if (people < cats)
        {
            System.out.println("Too many cats! The world is doomed");
        }

        if (people > cats)
        {
            System.out.println("Not many cats! The world is saved");
        }

        if (people < dogs)
        {
            System.out.println("The world is drooled on!");
        }

        if (people > dogs)
        {
            System.out.println("The world is dry!");
        }

        dogs += 5;

        if (people >= dogs)
        {
            System.out.println("People are greater than or equal to dogs.");
        }

        if (people <=dogs)
        {
            System.out.println("People are less than or equal to dogs.");
        }

        if (people == dogs)
        {
            System.out.println("People are dogs.");
        }
    }
}
