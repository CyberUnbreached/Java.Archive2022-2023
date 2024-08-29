/*
 *  Author: Ian Rohan
 *  Date: 2/7/2023
 *  Assignment: WeekThree_LabTwo
 */
package labTwoPackage;
import java.util.*;

public class Driver1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create variables
		String teamName;
		int playerAmount,
			seasonWins,
			seasonLosses;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Print default constructor
		Sport teamDefault = new Sport();
		System.out.println("Default Constructor");
		teamDefault.PrintInfo();
	
	
		// Get team name
		System.out.println("Enter team name: ");
		teamName = myScan.nextLine();
		// Get team player amount 
		System.out.println("Enter numbers of players on team: ");
		playerAmount = myScan.nextInt();
		// Get team's wins
		System.out.println("Enter number of wins: ");
		seasonWins = myScan.nextInt();
		// Get team's losses
		System.out.println("Enter number of losses: ");
		seasonLosses = myScan.nextInt();
		
		// Print information
		Sport teamInfo = new Sport(teamName, playerAmount, seasonWins, seasonLosses);
		teamInfo.PrintInfo();

		myScan.close();
	}

}
