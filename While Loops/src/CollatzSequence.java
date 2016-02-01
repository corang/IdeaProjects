/**
 * Created by Jorda on 1/31/2016.
 */

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double num, tries;

        tries = 0;

        System.out.println("Collatz Sequence");
        System.out.print("Enter Number that is not 1: ");
        num = keyboard.nextDouble();

        while (num != 1)
        {
            if ((num % 2) == 0)
            {
                num = num / 2;
                System.out.println(num);
            }
            else
            {
                num = (num * 3) + 1;
                System.out.println(num);
            }
            tries ++;

        }

        System.out.println("\n" + tries);
    }
}
