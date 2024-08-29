/*
 *  Author: Ian Rohan
 *  Date: 1/24/2023
 *  Assignment: WeekTwo_LabOne
 */
package labOnePackage;
import java.util.Random;
import java.util.Scanner;


public class LabOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create variables
		Random generator = new Random();
		int randomNumber;
		String userName;
		int firstNumber;
		int secondNumber;
		
		//Set up scanner
		Scanner myScan = new Scanner(System.in);
		
		// Request user input
		System.out.println("Generate a random number between 2 Integers");
		System.out.print("What is your name: ");
			userName = myScan.nextLine();
		System.out.print("Enter lower bound first number in range: ");
			firstNumber = myScan.nextInt();
		System.out.print("Enter upper bound second number in range: ");
			secondNumber = myScan.nextInt();
			
		// Calculate and output results
		System.out.println("\nName: " + userName);
		
		randomNumber = generator.nextInt(secondNumber - firstNumber + 1) + firstNumber;
		System.out.println("Your random number is: " + randomNumber);
		
		myScan.close();
	}

}
