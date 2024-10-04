/*
ALine Melo Francisco
3.10.24
Create an application called OfficeSupplies. 
The application should store the cost of the following:
Paper - 7.99
pack of pens  -2.99
scissor - 5.99
copy book - 1.99
the application should work out the total cost of all the items and work out the change from 50 euros.
*/
//starts the program
public class OfficeSupplies {
    //engine of the program
    public static void main(String args[]) {
    //variables
    double paper = 7.99;
    double packOfPens = 2.99;
    double scissors = 5.99;
    double copyBook = 1.99;

    double change = 50.0;
        //calculation
        double total = paper+packOfPens+scissors+copyBook;
    change=change-total;
    
    //print data
    System.out.println("Your total is=");
    System.out.println(total);
    System.out.println("Your change is=");
    System.out.println(change);
    }
}
