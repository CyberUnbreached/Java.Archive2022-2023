/*
 *  Author: Ian Rohan
 *  Date: 5/2/2023
 *  Assignment: ModuleTen_LabOne
 */
package labOnePackage;
import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		// Create class variables
		int ARRAY_SIZE = 0;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Prompt user to get array size
		System.out.print("How many grades do you want to enter? ");
		ARRAY_SIZE = myScan.nextInt();
		
		// Create array
		double[] testScore = new double[ARRAY_SIZE];
		
		// Create TestScores object
		TestScores myScores = new TestScores(testScore);
		
		// Create loop to get grades
		for (int i = 0; i < ARRAY_SIZE; i ++) {
			System.out.print("Enter Grade #" + (i+1) + " ");
			testScore[i] = myScores.checkInput();
		}
		
		// Use method from TestScores class to calculate the average
		myScores.calculateAverage();
		
		
		myScan.close();
				

	}

}
