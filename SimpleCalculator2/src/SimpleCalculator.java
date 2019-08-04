/*
 * A simple Calculator to add two numbers entered by the user.
 * Uses BufferedReader object to capture user input. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculator {

	public static void main(String [] args) throws IOException
	{
		//Declare three integer variables
		int number1,number2,sum = 0;
		
		//Create streamReader object.
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		//Title of the program.
		System.out.println("\t ADDITION CALCULATOR");
		
		//Capture user inputs.
		System.out.println("Enter first integer: ");
		number1 = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter second integer: ");
		number2 = Integer.parseInt(bufferedReader.readLine()); 
		
		//Add two integers and prints the output
		sum = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + sum);
		
	}

}
