/*
 *  Author: Ian Rohan
 *  Date: 4/20/2023
 *  Assignment: ModuleNine_LabThree
 */
package labThreePackage;

public class MedicalProvider {
	// Create class variables
	private String firstName;
	private String lastName;
	private String employeeID;
	private OfficeLocation EmployeeOfficeLocation;
	
	// Create constructor with parameters
	public MedicalProvider(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setEmployeeID(employeeID);
		EmployeeOfficeLocation = new OfficeLocation(employeeOfficeLocation);
	}
	
	// Create default constructor
	public MedicalProvider() {
		super();
		this.firstName = "Unknown First Name";
		this.lastName = "Unknown Last Name";
		EmployeeOfficeLocation = new OfficeLocation();
	}

	// Create copy constructor
	public MedicalProvider(MedicalProvider pMedical) {
		super();
		this.firstName = pMedical.firstName;
		this.lastName = pMedical.lastName;
		this.EmployeeOfficeLocation = pMedical.EmployeeOfficeLocation;
	}
	
	// Create Getters and Setters
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

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	// Create PrintInfo() method
	public void PrintInfo() {
		System.out.println("Medical Provider: " + getFirstName() + " " + getLastName());
		System.out.println("Employee ID: " + getEmployeeID());
		EmployeeOfficeLocation.PrintInfo();
	}
}
