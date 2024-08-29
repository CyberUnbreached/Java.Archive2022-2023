/*
 *  Author: Ian Rohan
 *  Date: 2/9/2023
 *  Assignment: WeekThree_LabThree
 */
package labThreePackage;
import java.util.*;

public class Driver1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create variables
		String firstName,
			   lastName,
			   department,
			   position;
		int idNumber;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Get employee's name
		System.out.println("Enter employee first name: ");
			firstName = myScan.nextLine();
		System.out.println("Enter employee last name: ");
			lastName = myScan.nextLine();
		// Get employee's ID number, will need to clear carriage return using nextLine after nextInt
		System.out.println("Enter employee ID number: ");
			idNumber = myScan.nextInt();
			myScan.nextLine();
		// Get employee's designated deparment
		System.out.println("Enter employee department designation: ");
			department = myScan.nextLine();
		// Get employee's position
		System.out.println("Enter employee position: ");
			position = myScan.nextLine();
		
		// Output information to user
		Employee employeeInfo = new Employee(firstName, lastName, idNumber, department, position);
		employeeInfo.PrintInfo();
		
		myScan.close();
	}
}
