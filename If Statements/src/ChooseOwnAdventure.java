import java.util.Scanner;

public class ChooseOwnAdventure
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String r1, r2, r3;
        
        System.out.println("Welcome to Jordan's Miniventure Game!\n");
        
        System.out.println("You find yourself in a pitch black hallway, you feel the walls next to you and emptiness in front and behind you.\nDo you walk forward or backwards?\n");
        r1 = keyboard.next();
        
        if (r1.equals("forwards") || r1.equals("forward"))
        {
            System.out.println("As you stumble through the darkness you come to a door and open it, flooding the hallway with light.\nThere is a red door directly ahead of you and a trapdoor off to the left, \"trapdoor\" or \"red\" door?");
            r2 = keyboard.next();
            
            if (r2.equals("red"))
            {
                System.out.println("As you walk through the doorway, the door slams behind you.\nYou see ahead of you a pedestal with a diamond bigger than anything you ever imagined, and a door marked exit. Do you pick door or diamond?");
                r3 = keyboard.next();
                
                if (r3.equals("door"))
                {
                    System.out.println("As you touch the doorknob you are shocked and thrown backward.\nElectrically burnt to a crisp, you die in a crumpled pile against the wall. Sometimes it pays to be greedy.");
                }
                else if (r3.equals("diamond"))
                {
                    System.out.println("You creep up to the pedestal and examine the stand for the diamond, seeing nothing suspicious you start to lift it off of the pedestal.\nAfter a few moments of forever it is finally free. You confidently walk to the exit door and go to open it, as your fingers get close to the doorknob the last thing you see is a blinding flash of light.\nAll that is left of you is a pile of ash with a diamond as your crown.");
                }
                else
                {
                    System.out.println("You cannot do that and you die of a sudden brain aneurysm.");
                }
            }
            else if (r2.equals("trapdoor"))
            {
                System.out.println("You open the trapdoor and start climbing down the ladder. As soon as your head is below the opening the door swings shut and you are once again drowning in darkness.");
                System.out.println("When you reach the bottom your eyes begin to adjust and you can barely make out two identical tunnel entrances before you. Do you go left or right?");

                r3 = keyboard.next();

                if (r3.equals("right"))
                {
                    System.out.println("You walk for what seems like miles. Finally you can see a rusty ladder that goes up into darkness. \nYou climb the ladder and find a door at the top.");
                    System.out.println("The door is identical to the trapdoor you came down in. As soon as you touch it, it falls onto you knocking you off the ladder. You land with a crunch, face first onto the stone floor many yards below.\nYou stay here until the sun expands and swallows the earth whole, perfectly preserved.");
                }
                else if (r3.equals("left"))
                {
                    System.out.println("Two steps into the tunnel, the floor gives out and you plummet to a fiery death.");
                }
                else
                {
                    System.out.println("You cannot do that and you die of a sudden brain aneurysm.");
                }
            }
            else
            {
                System.out.println("You cannot do that and you die of a sudden brain aneurysm.");
            }
        }
        else if (r1.equals("backwards") || r1.equals("backward"))
        {
            System.out.println("You turn around and walk a few paces before feeling a wall ahead of you. On the wall you can feel a lever that can be moved up or down.\nDo you move the lever up or down?");

            r2 = keyboard.next();

            if (r2.equals("up"))
            {
                System.out.println("As you push the lever up the wall in front of you slowly disappear up into the ceiling revealing a ladder that goes up and down.\nDo you go up or down?");

                r3 = keyboard.next();

                if (r3.equals("up"))
                {
                    System.out.println("As you start to climb the ladder you see a faint light above you, you climb higher and higher. You almost reach the top, but as you grab the 3rd to last rung with your hand it breaks.\n Your arm flails back and you fall off the ladder.\nBeing as small a passage as it was, you keep bouncing off of the ladder and the walls, eventually you hit the back of your neck against a rung which knocks you out. You die soon after you reach the bottom.");
                }
                else if (r3.equals("down"))
                {
                    System.out.println("You climb to the bottom of the ladder with no incident and set foot in a dimly lit room. You can't quite see the walls, there is jst the ladder coming down with a faint light surrounding it.\nYou take a cautious step forward abd hear a click. It seems as though the ladder is sinking into the floor. Then you realize that the ladder isn't sinking, the floor is rising! You try in vain to climb up the laddder again, as the entrance in the ceiling is now solid.\nAs the space gets tighter, you lay down and hope for the best, alas the worst comes and you are slowly and painfully crushed into a meat pancake.");
                }
                else
                {
                    System.out.println("You cannot do that and you die of a sudden brain aneurysm.");
                }
            }
            else if (r2.equals("down"))
            {
                System.out.println("As you push the lever down the wall to your left seems to break apart and reveals a passageway. You walk through this passage and come to a room with 2 doors.\n One is marked exit and the other is unmarked. Do you choose exit or unmarked?");

                r3 = keyboard.next();

                if (r3.equals("exit"))
                {
                    System.out.println("You open the door to the outside and run off to freedom, never to look back.");
                }
                else if (r3.equals("unmarked"))
                {
                    System.out.println("As soon as you turn the knob the door swings back at you with water rushing out from behind it. It slowly fills the room, drowning you.");
                }
                else
                {
                    System.out.println("You cannot do that and you die of a sudden brain aneurysm.");
                }
            }
            else
            {
                System.out.println("You cannot do that and you die of a sudden brain aneurysm.");
            }
        }
        else
        {
            System.out.println("You cannot do that and you die of a sudden brain aneurysm.");
        }
    }
}