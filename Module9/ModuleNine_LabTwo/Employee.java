/*
 *  Author: Ian Rohan
 *  Date: 4/13/2023
 *  Assignment: ModuleNine_LabTwo
 */
package labTwoPackage;

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
		employeeBenefit = new Benefits(pBenefit);
		employeeHomeAddress = new Address(pHomeAddress);
	}

	// Create copy constructor
	public Employee(Employee pEmployee) {
		super();
		this.employeeID = pEmployee.employeeID;
		this.firstName = pEmployee.firstName;
		this.lastName = pEmployee.lastName;
		this.employeeBenefit = pEmployee.employeeBenefit;
		this.employeeHomeAddress = pEmployee.employeeHomeAddress;
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
		System.out.println("\n---------------------------------------");
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
