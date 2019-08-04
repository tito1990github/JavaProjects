package userinputs;
import java.util.Scanner;

/*
This is a simple program to accepts user inputs by using a Scanner class
and prints out the user input.
*/
public class UserInputs {

    public static void main(String[] args) {
        
        //Create a scanner object and declare a string variable
        Scanner scanner = new Scanner(System.in);
        String userText;
        
        //Prompting a user to enter input
        System.out.println("Enter a any text:");
        
        //Capturing user input
        userText = scanner.nextLine();
        
        //Prints out user input
        System.out.println("You entered " + userText);
        
        //close a resource
        scanner.close();
        
    }
    
}
