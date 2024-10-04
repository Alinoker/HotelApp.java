/* calculates the cost of a hotel booking. 
The application should 
ask the user to enter the number of nights  they would like to stay 
and the number of people staying at the hotel 
and then calculate 
and output the total cost based on the number of people and number of nights assuming 
 that each night costs 60 euros per person. */

//create the scanner for USER INPUT
import java.util.Scanner;

 public class HotelApp {
    public static void main(String[] args) {
    //variables to store data
    //number of nights users will stay
    //number of people staying
    //const of the price of the night
    int nights;
    int people;
    final int costNight = 60;

    //creates a copy of the scanner class and allows for user input
    Scanner keyboard = new Scanner(System.in);
    
    //ask user
    System.out.println("user, how many night will you stay at the hotel?");
    nights = keyboard.nextInt();
    
    System.out.println("user, how many people?");
    people = keyboard.nextInt();

    //calculate
    int totalCost = nights * people * costNight;
    
    //output and result to the user
    //Your total cost for X nights, for Y people is X euros

    System.out.println("Your total cost for " + nights + " nights and " + people + " people is: " + totalCost + " euros. cash or card?");

    keyboard.close();
    }
}
