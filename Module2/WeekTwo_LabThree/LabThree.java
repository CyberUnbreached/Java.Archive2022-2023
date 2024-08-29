/*
 *  Author: Ian Rohan
 *  Date: 1/26/2023
 *  Assignment: WeekTwo_LabThree
 */
package labThreePackage;
import java.util.*;

public class LabThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create variables for currency amount and their worth
		int amountTwenty = 0;
			double worthTwenty = 20.00;
		int amountTen = 0;
			double worthTen = 10.00;
		int amountFive = 0;
			double worthFive = 5.00;
		int amountOne = 0;
			double worthOne = 1.00;
		int amountQuarter = 0;
			double worthQuarter = 0.25;
		int amountDime = 0;
			double worthDime = 0.10;
		int amountNickel = 0;
			double worthNickel = 0.05;
		int amountPenny = 0;
			double worthPenny = 0.01;
		double totalMoney;
			
		// Create scanner
		Scanner myScan = new Scanner(System.in);

		// Prompt user for information
		System.out.println("Cash Register Program \n");
		System.out.print("Enter amount of $20 bills: ");
			amountTwenty = myScan.nextInt();
		System.out.print("Enter amount of $10 bills: ");
			amountTen = myScan.nextInt();
		System.out.print("Enter amount of $5 bills: ");
			amountFive = myScan.nextInt();
		System.out.print("Enter amount of $1 bills: ");
			amountOne = myScan.nextInt();
		System.out.print("Enter amount of quarters: ");
			amountQuarter = myScan.nextInt();
		System.out.print("Enter amount of dimes: ");
			amountDime = myScan.nextInt();
		System.out.print("Enter amount of nickels: ");
			amountNickel = myScan.nextInt();
		System.out.print("Enter amount of pennies: ");
			amountPenny = myScan.nextInt();
		
		// Calculate Total
		totalMoney = (amountTwenty * worthTwenty) + (amountTen * worthTen) + (amountFive * worthFive) + 
			(amountOne * worthOne) + (amountQuarter * worthQuarter) + (amountDime * worthDime) + 
			(amountNickel * worthNickel) + (amountPenny * worthPenny);
		
		// Output information to user
		
		System.out.print("\nAmount of $20 bills: " + amountTwenty);
			System.out.println(" worth $" + String.format("%.2f",(amountTwenty * worthTwenty)) + " overall");
		System.out.print("Amount of $10 bills: " + amountTen);
			System.out.println(" worth $" + String.format("%.2f",(amountTen * worthTen)) + " overall");
		System.out.print("Amount of $5 bills: " + amountFive);
			System.out.println(" worth $" + String.format("%.2f",(amountFive * worthFive)) + " overall");
		System.out.print("Amount of $1 bills: " + amountOne);
			System.out.println(" worth $" + String.format("%.2f",(amountOne * worthOne)) + " overall");
		System.out.print("Amount of Quarters($0.25): " + amountQuarter);
			System.out.println(" worth $" + String.format("%.2f",(amountQuarter * worthQuarter)) + " overall");
		System.out.print("Amount of Dimes($0.10): " + amountDime);
			System.out.println(" worth $" + String.format("%.2f",(amountDime * worthDime)) + " overall");
		System.out.print("Amount of Nickels($0.05): " + amountNickel);
			System.out.println(" worth $" + String.format("%.2f",(amountNickel * worthNickel)) + " overall");
		System.out.print("Amount of Pennies($0.01): " + amountPenny);
			System.out.println(" worth $" + String.format("%.2f",(amountPenny * worthPenny)) + " overall");
		
		System.out.println("\nTOTAL VALUE: $" + String.format("%.2f",totalMoney));	
			
		myScan.close();
	}

}
