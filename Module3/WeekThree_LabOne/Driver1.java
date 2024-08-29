/*
 *  Author: Ian Rohan
 *  Date: 2/2/2023
 *  Assignment: WeekThree_LabOne
 */
package labOnePackage;
import java.util.*;

public class Driver1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// Create Variables
			String petName,
				   petType,
				   petSound;
 
			// Create scanner
			Scanner myScan = new Scanner(System.in);
			
			// Print default constructor
			Pet petStatusDefault = new Pet(); 
			System.out.println("Default Constructor");
			System.out.println(petStatusDefault.PrintInfo());
			
			// Get pet name
			System.out.println("What is your pet's name?");
			petName = myScan.nextLine();
			
			// Get pet type
			System.out.println("What type of animal is your pet?");
			petType = myScan.nextLine();
			
			// Get pet sound
			System.out.println("What sound does your pet make?");
			petSound = myScan.nextLine();
			
			//Print info
			Pet petStatus = new Pet(petName, petType, petSound);
			System.out.println(petStatus.PrintInfo());
			
			myScan.close();
	}

}
