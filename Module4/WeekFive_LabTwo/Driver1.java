/*
 *  Author: Ian Rohan
 *  Date: 2/16/2023
 *  Assignment: WeekFive_LabTwo
 */
package labTwoPackage;
import java.util.*;

public class Driver1 {

	public static  void main(String[] args) {
		// Create variables
		String studentName = "";
		int studentHours = 0;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Prompt user for student information
		System.out.print("Enter student name: ");
		studentName = myScan.nextLine();
		System.out.print("Enter amount of student hours: ");
		studentHours = myScan.nextInt();
		
		// Print info
		Student studentInfo = new Student(studentName, studentHours);
		studentInfo.PrintInfo();
		
		myScan.close();
	}

}
