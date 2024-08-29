/*
 *  Author: Ian Rohan
 *  Date: 5/2/2023
 *  Assignment: ModuleTen_LabOne
 */
package labOnePackage;
import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestScores {
	// Create class variables
	double testScore[];

	// Create constructor
	public TestScores(double testScore[]) {
		super();
		this.testScore = testScore;
	}
	
	// Create percent number format
	DecimalFormat df = new DecimalFormat("#.00");   
	
	// Create Custom exception class to handle out-of-range values
	class OutOfRangeException extends Exception {
	    public OutOfRangeException(String message) {
	        super(message);
	    }
	}
	
	// Create getters and setters
	public double[] getTestScore() {
		return testScore;
	}

	public void setTestScore(double[] testScore) {
		this.testScore = testScore;
	}

	// Create method to check if user inputs are valid, if so then add scores to ARRAY
	public double checkInput() { 
		Scanner scanner = new Scanner(System.in);
        double number = 0;
        boolean isValidInput = false;

        // Keep looping until a valid input is provided
        while (!isValidInput) {
            try {
                number = scanner.nextDouble();

                // Check if the number is within the desired range
                if (number < 0.0 || number > 100) {
                    throw new OutOfRangeException("Error: Number out of range. Please enter a number between 0 and 100.");
                }

                isValidInput = true;
            } catch (InputMismatchException e) {
                // Handle non-double inputs
                System.out.println("Error: Invalid input. ");
                scanner.next(); // Clear the invalid input from the scanner
            } catch (OutOfRangeException e) {
                // Handle out-of-range inputs
                System.out.println(e.getMessage());
            }
        }
        return number;
	}
	
	// Create method to calculate average
	public void calculateAverage() {
		double totalScore = 0.0;
		for (int i = 0; i < this.testScore.length; i++) {
			totalScore = totalScore + this.testScore[i];
		}
		System.out.println("Test Score Average: " 
		+ df.format(totalScore / this.testScore.length));
	}
	
	
	
	
}