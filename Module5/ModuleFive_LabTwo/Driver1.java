/*
 *  Author: Ian Rohan
 *  Date: 2/21/2023
 *  Assignment: ModuleFive_LabTwo
 */
package labTwoPackage;
import java.util.*;

public class Driver1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create variables for length, width, and character of box
		int boxLength, 
			boxWidth;
		char boxCharacter;
		
		// Create scanner for user inputs
		Scanner myScan = new Scanner(System.in);
		
		// Prompt user to enter information for the box
		System.out.print("Enter the box length: ");
		boxLength = myScan.nextInt();
		System.out.print("Enter the box width: ");
		boxWidth = myScan.nextInt();
		System.out.print("Enter the box character: ");
		boxCharacter = myScan.next().charAt(0);
		
		// Print box to user
		Box BoxInfo = new Box(boxLength, boxWidth, boxCharacter);
		BoxInfo.PrintInfo();
		System.out.print(BoxInfo.DrawBox());
		
		myScan.close();
	}

}
