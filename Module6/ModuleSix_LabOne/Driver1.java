/*
 *  Author: Ian Rohan
 *  Date: 2/28/2023
 *  Assignment: ModuleSix_LabOne
 */
package labOnePackage;
import java.util.Scanner;

public class Driver1 {
	 public static void main(String[] args) {
	// create variables  to hold a userID, first name and last name (all Strings)
	String userID, firstName, lastName;
	
	// output to the user Welcome to the Info system
	System.out.println("*************************************************");
	System.out.println("*Welcome User to the Employee Information System*");
	System.out.println("*************************************************");
	
	// instantiate a Benefit object using the 3 argument constructor (your choice on the data). An Example //Benefit would be:
	Benefits employeeBenefits =
			new Benefits("Health" , 495.00, "United Healthcare");
	
	// instantiate an Address object using the 4 argument constructor (your choice on the data)
	Address employeeAddress =
	new Address("11134 Acuff Station", "San Antonio", "Texas", "78254");
	
	//prompt the user for userID, first name and last name and store in variables created earlier
	Scanner myScan = new Scanner(System.in);
	System.out.println("Enter User ID: ");
	userID = myScan.nextLine();
	System.out.println("Enter first name: ");
	firstName = myScan.nextLine();
	System.out.println("Enter last name: ");
	lastName = myScan.nextLine();
	
	//instantiate an Employee  object using 
	//the 5 argument constructor providing it with the data form the user prompts AND the Benefit object, and 
	//Address object you created earlier. 
	Employee employeeInformation =
			new Employee(userID, firstName, lastName, employeeBenefits, employeeAddress);
	
	//output to the user the Employee data using your PrintEmployeeInformation method.
	employeeInformation.PrintEmployeeInformation();
	
	myScan.close();
	}
}
