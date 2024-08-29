/*
 *  Author: Ian Rohan
 *  Date: 4/13/2023
 *  Assignment: ModuleNine_LabTwo
 */
package labTwoPackage;
import java.util.ArrayList;

public class Driver1 {
	public static void main(String[] args) {
		 
		// output to the user Welcome to the Info system
		System.out.println("*************************************************");
		System.out.println("*Welcome User to the Employee Information System*");
		System.out.println("*************************************************");
	
		// Print work address
		System.out.println("\nWork Address: 12345 Lincoln Road, Texas, 65432");
		
		// Create 4 benefits for employees
		Benefits benefitsOne = new Benefits("Health" , 495.00, "United Healthcare");
		Benefits benefitsTwo = new Benefits("Health" , 563.00, "Healthcare+");
		Benefits benefitsThree = new Benefits("Health" , 500.00, "United Healthcare");
		Benefits benefitsFour = new Benefits("Health" , 422.00, "Healthcare and Co.");
		
		// Create 4 addresses for employees
		Address myAddressOne = new Address("11134 Acuff Station", "San Antonio", "Texas", "78254");
		Address myAddressTwo = new Address("11321 Staton Drive", "San Antonio", "Texas", "79834");
		Address myAddressThree = new Address("11198 Negra Avenue", "San Antonio", "Texas", "87564");
		Address myAddressFour = new Address("12356 Integral Street", "San Antonio", "Texas", "73245");
		
		// Create 2 instances of Salary Employee
		Salary mySalaryOne = new Salary("825", "Benjamin", "DaVinci", benefitsOne, myAddressOne, 75000, 750);
		Salary mySalaryTwo = new Salary("361", "Alexander", "Cook", benefitsTwo, myAddressTwo, 63000, 630);
		
		// Create 2 instance of Hourly Employee
		Hourly myHourlyOne = new Hourly("452", "Steven", "Yu", benefitsThree, myAddressThree, 45, 35);
		Hourly myHourlyTwo = new Hourly("898", "Frederick", "Rodriguez", benefitsFour, myAddressFour, 46, 37);
		
		// Create ArrayList to hold information from 4 different employees
		// 2 hourly, 2 salary
		ArrayList<Employee> myEmployee  = new ArrayList<Employee>();
		myEmployee.add(mySalaryOne);
		myEmployee.add(mySalaryTwo);
		myEmployee.add(myHourlyOne);
		myEmployee.add(myHourlyTwo);
		
		//output to the user the Employee data using your PrintEmployeeInformation method.
		for (Employee myBusiness : myEmployee) {
		myBusiness.PrintEmployeeInformation();
		}
	 
	}
}
