/**
 * Created by Jordan on 1/25/2016.
 */
public class VariablesAndNames
{
    public static void main( String[] args)
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        //Declaring cars is equal to 100
        cars = 100;
        //Declaring there is space for 4 people in each car
        space_in_a_car = 4.0;
        //There are 30 drivers
        drivers = 30;
        //There are 90 passengers
        passengers = 90;
        //A driver can only drive one car at a time so we subtract drivers from cars to find how many are left over
        cars_not_driven = cars - drivers;
        //One driver per one car mean cars driven is equal to how many drivers
        cars_driven = drivers;
        //4 people per car times amount of cars being driven gives us the total space for passengers
        carpool_capacity = cars_driven * space_in_a_car;
        //to find out how many passengers to put in each car we divide the total
        //passengers by the amount of driven cars
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today" );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car.");
    }
}
