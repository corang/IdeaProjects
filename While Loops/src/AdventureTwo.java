/**
 * Created by jormcc16@shasd.org on 2/1/16.
 */
import java.util.Scanner;

public class AdventureTwo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String choice = "";
        int room = 1;

        while (room != 0) {
            switch (room) {
                case 1: {
                    System.out.println("You find yourself in a room. There's a \"blue\" door and a \"red\" door.\nWhich do you choose?");
                    choice = keyboard.nextLine();

                    if (choice.equalsIgnoreCase("red")) {
                        room = 2;
                    } else if (choice.equalsIgnoreCase("blue")) {
                        room = 3;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Going through the red door reveals the \"family\" room.\nYou can also go \"back\". What is your choice?");
                    choice = keyboard.nextLine();

                    if (choice.equalsIgnoreCase("family")) {
                        room = 4;
                    } else if (choice.equalsIgnoreCase("back")) {
                        room = 1;
                    }
                    break;
                }
                case 3: {
                    System.out.println("You find two new rooms, the \"kitchen\" and the \"bathroom\".\nYou can also go \"back\", What is your choice?");
                    choice = keyboard.nextLine();

                    if (choice.equalsIgnoreCase("kitchen")) {
                        room = 5;
                    } else if (choice.equalsIgnoreCase("bathroom")) {
                        room = 6;
                    } else if (choice.equalsIgnoreCase("back")) {
                        room = 1;
                    }
                    break;
                }
                case 4: {
                    System.out.println("In the family room you see a tv \"remote\" do you pick it up and turn on the tv, or go \"back\"?");
                    choice = keyboard.nextLine();

                    if (choice.equalsIgnoreCase("remote")) {
                        System.out.println("You pick up the remote and turn on the tv. You are immediately engrossed in the tv program.");
                        System.out.println("In fact you are so interested you stay there watching tv until you die of dehydration");

                        room = 0;
                    } else if (choice.equalsIgnoreCase("back")) {
                        room = 2;
                    }
                    break;
                }
                case 5:{
                    System.out.println("In the kitchen you find some \"crackers\", you are pretty hungry and they don't look that old.\nYou can also go \"back\".");
                    choice = keyboard.nextLine();

                    if (choice.equalsIgnoreCase("crackers")) {
                        System.out.println("After eating one cracker, you feel the need to have another one, and another , and another, this goes on until you\nhave eaten so much your stomach bursts and you die.");

                        room = 0;
                    } else if (choice.equalsIgnoreCase("back")) {
                        room = 3;
                    }
                    break;
                }
                case 6: {
                    System.out.println("In the bathroom there is an open \"window\", you can also go \"back\". What is your choice?");
                    choice = keyboard.nextLine();

                    if (choice.equalsIgnoreCase("window")) {
                        System.out.println("You climb out the window and drop to the ground. You are free!");
                        room = 0;
                    } else if (choice.equalsIgnoreCase("back")) {
                        room = 3;
                    }
                    break;
                }
            }
        }
        System.out.print("Game Over.");
    }
}
