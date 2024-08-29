/*
 *  Author: Ian Rohan
 *  Date: 3/2/2023
 *  Assignment: ModuleSix_LabTwo
 */
package labTwoPackage;

public class Student {
	
	// Create class variables
	private String firstName, lastName;
	private Address studentAddress;
	private ParkingPermit studentPermit;
	
	// Create constructor
	public Student(String pFirstName, String pLastName, Address pStudentAddress, ParkingPermit pStudentPermit) {
		super();
		setFirstName(pFirstName);
		setLastName(pLastName);
		this.studentAddress = pStudentAddress;
		this.studentPermit = pStudentPermit;
	}

	// Create getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String pFirstName) {
		this.firstName = pFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String pLastName) {
		this.lastName = pLastName;
	}
	
	// Print student info
	public void PrintStudentInfo() {
		Header.PrintHeader(1); // uses int version of overloaded function
			System.out.println("Student Name:" + getFirstName() + " " + getLastName());
		Header.PrintHeader(); // uses blank version of overloaded function
			studentAddress.PrintAddressInformation();
		Header.PrintHeader(true); // uses bool version of overloaded function
			studentPermit.PrintPermitInfo();
	}
	
	
	
}
