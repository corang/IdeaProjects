/**
 * Created by Jorda on 1/25/2016.
 */
public class MoreVariableAndPrinting
{
    public static void main( String[] args)
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;
        double metricHeight, metricWeight, cmConv, kgConv;

        Name = "Jordan M. McClintock";
        Age = 17;     //not a lie
        Height = 71;  //inches
        Weight = 180; //pounds
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";
        cmConv = 2.54;
        kgConv = 0.453592;
        metricHeight = Height * cmConv;
        metricWeight = Weight * kgConv;

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches (or " + metricHeight +" cm) tall." );
        System.out.println( "He's " + Weight + " pounds (or " + metricWeight + " kg) heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair" );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        //This line is tricky try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", " + Weight + " I get " + (Age + Height + Weight) + "." );
    }
}
