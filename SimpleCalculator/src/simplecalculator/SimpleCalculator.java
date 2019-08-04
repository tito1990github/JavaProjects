
package simplecalculator;
//Import scanner class
import java.util.Scanner;

/*
A simple calculator to add two numbers entered by the user
by using a Scanner object.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        //Declare three integer variables and scanner object
        Scanner scanner = new Scanner(System.in);
        int number1, number2, sum = 0;
        
        //Title of the program.
        System.out.println("\t ADDITION CALCULATOR");
        
        //Capture user inputs and changing them to integer
        System.out.printf("Enter the first Integer: ");
        number1 = Integer.parseInt(scanner.nextLine());
        
        System.out.printf("Enter the second Integer: ");
        number2 = Integer.parseInt(scanner.nextLine());
        
        //Adding the two integers and store them in sum
        sum = number1 + number2;
        
        //Print the sum.
        System.out.println(number1 + " + " + number2 + " = " + sum);
        
        //close a scanner
        scanner.close();
    }
    
}









