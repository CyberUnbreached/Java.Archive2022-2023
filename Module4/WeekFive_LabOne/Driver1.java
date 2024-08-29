/*
 *  Author: Ian Rohan
 *  Date: 2/14/2023
 *  Assignment: WeekFive_LabOne
 */
package labOnePackage;
import java.util.*;

public class Driver1 {

	public static void main(String[] args) {
		// Create variables
		String studentName;
		int quizOneGrade,
			quizTwoGrade,
			quizThreeGrade;

		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Prompt user for input of information
		System.out.print("Enter student name: ");
		studentName = myScan.nextLine();
		System.out.print("Enter Quiz 1 Grade: ");
		quizOneGrade = myScan.nextInt();
		System.out.print("Enter Quiz 2 Grade: ");
		quizTwoGrade = myScan.nextInt();
		System.out.print("Enter Quiz 3 Grade: ");
		quizThreeGrade = myScan.nextInt();
		
		// Print info to user
		QuizScore studentGrade = new QuizScore(studentName, quizOneGrade, quizTwoGrade, quizThreeGrade);
		studentGrade.PrintInfo();
		
		myScan.close();
	}

}
