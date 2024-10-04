/* 
 Numbers java
 Aline Melo Francisco
 4.10.24
 */

 //create the application - class signature
import java.util.Scanner; //import the Scanner class from java.util
//this class allows to take use input

 public class Numbers {
    
 //run the application
    public static void main(String args[]) {
        //variables  store our data
        int num1 = 0;//to store my first number from the user
        int num2 = 0; //store the second number from the user
        int total = 0; //store the total of the two number

        //objects declare and create
        //declaring the utility package (Scanner) and naming it (keyboard)
        Scanner keyboard;

        //creates a copy of the scanner class and allows for user input
        keyboard = new Scanner(System.in);

        //inputs - what do you have to ask the user
        System.out.println("Please enter your first number");

        //grab the first number and save the number in my variable called num1
        num1=keyboard.nextInt();
        System.out.println("Please enter your second number");
    }
}