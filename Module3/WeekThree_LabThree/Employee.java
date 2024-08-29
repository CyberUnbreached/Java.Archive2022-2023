/*
 *  Author: Ian Rohan
 *  Date: 2/9/2023
 *  Assignment: WeekThree_LabThree
 */
package labThreePackage;

public class Employee {
	// Create class variables
	private String firstName,
		   		   lastName,	
		   		   department,
		   		   position;
	private int idNumber;
	
	// Create constructors
	public Employee(String firstName, String lastName, int idNumber, String department, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}

	// Create getters and setters
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	// Output information to user
	public void PrintInfo() {
		System.out.println("\nEmployee Information");
		System.out.println("******************************");
		System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("ID Number: " + this.getIdNumber());
		System.out.println("Department: " + this.getDepartment());
		System.out.println("Position: " + this.getPosition());
	}

	
}
