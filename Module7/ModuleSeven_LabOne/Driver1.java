/*
 *  Author: Ian Rohan
 *  Date: 3/28/2023
 *  Assignment: ModuleSeven_LabOne
 */
package labOnePackage;
import java.util.Scanner;

public class Driver1 {
	public static void main(String[] args) {
		// Create variables
		boolean doLoop = true;
		int userInput;
		String searchString;
		int index;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Create arrays with 5 contacts
		String[] firstName = { "Bill", "Susan", "Steven", "Jean", "Rudolf" };
		String[] lastName = {"Williamson", "Wojickee", "Yu", "Rocker", 
				"Rednose"};
		String[] contactEmail = {"Bill.W@gmail.com", "Susan.W@gmail.com", 
				"Steven.Y@gmail.com", "Jean.R@gmail.com", "Rudolf.R@gmail.com"};
		String[] phoneNumber = {"(210)-990-1124", "(210)-990-1300", "(210)-960-1145",
				"(210)-340-1160", "(719)-338-4716"};
		
		// Create loop for user inputs and exits
		do {
			System.out.println("\nEnter Option for Contact Inforamtion");
			System.out.println("1. Show all Contacts");
			System.out.println("2. Search contacts based on the last name");
			System.out.println("3. Search contacts based on the first name");
			System.out.println("4. Quit program");
			userInput = myScan.nextInt();
			
			// Create switch case for various inputs from user
			switch (userInput) {
				case 1:
					System.out.println("\n**************************");
					System.out.println("Showing All Contacts\n");
					// Create enhanced for loop to display all contacts
					for(int i = 0; i < 5; i++)
					{
					  System.out.println(firstName[i] + " " + lastName[i] + "\t" + 
							  contactEmail[i] + "\t" + phoneNumber[i]);
					}
					System.out.println("**************************");
					break;
				case 2:
					System.out.println("\nEnter contact name based on their last name");
					myScan.nextLine();
					searchString = myScan.nextLine();
					index = findStringIgnoreCase(lastName, searchString);
					if (index >= 0) {
			            System.out.println("\n" + searchString + " found at index: " + index);
			            System.out.println(firstName[index] + " " + lastName[index] + "\t" + 
								  contactEmail[index] + "\t" + phoneNumber[index]);
			        } 
					else {
			            System.out.println("Contact not found.");
			        }
					break;
					
					
				case 3:
					System.out.println("\nEnter contact name based on their first name");
					myScan.nextLine();
					searchString = myScan.nextLine();
					index = findStringIgnoreCase(firstName, searchString);
					if (index >= 0) {
						System.out.println("\n" + searchString + " found at index: " + index);
			            System.out.println(firstName[index] + " " + lastName[index] + "\t" + 
								  contactEmail[index] + "\t" + phoneNumber[index]);
			        } 
					else {
						System.out.println("Contact not found.");
			        }
					break;
					
				case 4:
					System.out.println("Exiting Program...");
					doLoop = false;
					break;
				default:
					System.out.println("Error: Invalid Input");
					break;
			}	
		} while (doLoop);
		
		myScan.close();
		// sequential search, do selection sort
		
	}
	
	// Method to search for a string in the array, ignoring case
    public static int findStringIgnoreCase(String[] pArray, String searchString) {
        // Iterate through the array
        for (int i = 0; i < pArray.length; i++) {
            // Use equalsIgnoreCase to compare strings while ignoring case
            if (pArray[i].equalsIgnoreCase(searchString)) {
                // If a match is found, return the index
                return i;
            }
        }
        // If no match is found, return -1
        return -1;
    }
}


