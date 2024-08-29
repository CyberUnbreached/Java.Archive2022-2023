/*
 *  Author: Ian Rohan
 *  Date: 2/28/2023
 *  Assignment: ModuleSix_LabOne
 */
package labOnePackage;

public class Employee {
	// Create class variables
	private String employeeID, firstName, lastName;
	private Benefits employeeBenefit; // from Benefits class
	private Address employeeHomeAddress; // from Address class
	
	// Create constructor 
	// Create new Benefits and Address objects
	public Employee(String pEmployeeID, String pFirstName, String pLastName, Benefits pBenefit,
			Address pHomeAddress) {
		super();
		setEmployeeID(pEmployeeID);
		setFirstName(pFirstName);
		setLastName(pLastName);
		employeeBenefit = pBenefit;
		employeeHomeAddress = pHomeAddress;
	}

	// Create getters and setters 
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Create void function for printing employee information
	public void PrintEmployeeInformation() {
		System.out.println("\nEmployee Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("Employee ID: " + this.getEmployeeID());
		System.out.println("***************************************");
		System.out.println("Employee Home Address");
		employeeHomeAddress.PrintAddressInformation();
		System.out.println("***************************************");
		System.out.println("Employee Benefits");
		employeeBenefit.PrintBenefitInfo();
	}
	
	
}
