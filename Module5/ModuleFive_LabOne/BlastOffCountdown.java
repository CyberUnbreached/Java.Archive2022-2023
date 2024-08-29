/*
 *  Author: Ian Rohan
 *  Date: 2/21/2023
 *  Assignment: ModuleFive_LabOne
 */
package labOnePackage;


public class BlastOffCountdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialize variables
		boolean countDown;
		int countNumber;
		
		// Create Do-While loop for countdown
		countDown = true;
		countNumber = 10;
		System.out.println("*Do-While Loop*");
		do {
			if (countNumber >= 1) {
				System.out.println(countNumber--);
			}
			else {
				System.out.println("BLASTOFF!!!");
				countDown = false;
			}
		} while (countDown);
		
		// Create While loop for countdown
		countNumber = 10;
		System.out.println("\n*While Loop*");
		while (countNumber >= 1) {
			System.out.println(countNumber--);
		}
		System.out.println("BLASTOFF!!!");
	
		// Create For loop for countdown
		System.out.println("\n*For Loop*");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("BLASTOFF!!!");
	}

}
