/*
 *  Author: Ian Rohan
 *  Date: 3/2/2023
 *  Assignment: ModuleSix_LabTwo
 */
package labTwoPackage;
import java.util.*;

public class Driver1 {
	public static void main(String[] args) { 
		// Create variables for first and last name, street, city, state, zip, 
		String firstName, lastName, studentStreet, studentCity, studentState, zipcode;
		// Create variables to hold vehicle information
		String carMake, carModel;
		int carYear, permitID;
		
		// Create random generator
		Random generator = new Random();
		
		// Print welcome header to user
		Header.PrintHeader("Welcome"); // uses String version of overloaded function
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Prompt user for student information
			Header.PrintHeader('A'); // uses char version of overloaded function
		
		// Name
		System.out.print("First name: ");
		firstName = myScan.nextLine();
		System.out.print("Last name: ");
		lastName = myScan.nextLine();
		// Residence
		System.out.print("State of Residence: ");
		studentState = myScan.nextLine();
		System.out.print("City: ");
		studentCity = myScan.nextLine();
		System.out.print("Street: ");
		studentStreet = myScan.nextLine();
		System.out.print("Zipcode: ");
		zipcode = myScan.nextLine();
		// Vehicle
		System.out.print("Car Make: ");
		carMake = myScan.nextLine();
		System.out.print("Model: ");
		carModel = myScan.nextLine();
		System.out.print("Year of Manufacture: ");
		carYear = myScan.nextInt();
		
		// instantiate Address object
		Address studentAddress = new Address(studentStreet, studentCity, studentState, zipcode);
		
		// create random PermitID number and instantiate ParkingPermit object 
		// (max - min) + min;
				permitID = generator.nextInt(9999 - 1000) + 1000;
		ParkingPermit studentPermit = new ParkingPermit(permitID, carMake, carModel, carYear);
		
		// instantiate Student object
		Student studentInformation = new Student(firstName, lastName, studentAddress, studentPermit);
		
		// Print information back to the user
		studentInformation.PrintStudentInfo();
		
		// Close scanner and print footer
		myScan.close();
		Header.PrintFooter();
	}	
}
