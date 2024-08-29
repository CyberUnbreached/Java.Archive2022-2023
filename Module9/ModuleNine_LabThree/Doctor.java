/*
 *  Author: Ian Rohan
 *  Date: 4/20/2023
 *  Assignment: ModuleNine_LabThree
 */
package labThreePackage;
import java.text.*;

public class Doctor extends MedicalProvider implements WritetoFile{
	// Create class variables
	private String specialty;
	private String licenseNumber;
	private String roomNumber;
	private double yearlySalary;
	
	// Create currency formatter
	NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	
	// Create constructor with parameters
	public Doctor(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation, String pSpecialty, 
			String pLicense, String pRoomNumber, double pSalary) {
		super(firstName, lastName, employeeID, employeeOfficeLocation);
		setSpecialty(pSpecialty);
		setLicenseNumber(pLicense);
		setRoomNumber(pRoomNumber);
		setYearlySalary(pSalary);
	}
	
	// Create default constructor
	public Doctor() {
		super();
		this.specialty = "Unknown Specialty";
		this.licenseNumber = "Unknown License Number";
		this.roomNumber = "Unknown Room Number";
		this.yearlySalary = -12.00;
	}

	// Create copy constructor
	public Doctor (Doctor pDoctor) {
		super(pDoctor);
		this.specialty = pDoctor.specialty;
		this.licenseNumber = pDoctor.licenseNumber;
		this.roomNumber = pDoctor.roomNumber;
		this.yearlySalary = pDoctor.yearlySalary;
	}
	
	// Create Getters and Setters
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	// Create method to calculate weekly pay
	public double getWeeklyPaycheck() {
		double weeklyPay;
		weeklyPay = (getYearlySalary() / 52) ; // 52 weeks in a year
		return weeklyPay;
	}
	
	// Override MedicalProvider PrintInfo method
	@Override
	public void PrintInfo() {
		// TODO Auto-generated method stub
		super.PrintInfo();
		System.out.println("Specialty: " + getSpecialty());
		System.out.println("License Number: #" + getLicenseNumber());
		System.out.println("Room Number: " + getRoomNumber());
		System.out.println("Salary: " + fmt1.format(getYearlySalary()));
		System.out.println("Weekly Pay: " + fmt1.format(getWeeklyPaycheck()));
	}
	
	// Use WritetoFile interface to input data into Medical.csv
	public void WriteToFile(OfficeLocation pLocation)
	{
		WriteRecordToFile(getEmployeeID() + "," + getSpecialty() + ", " + getFirstName() + " "+ getLastName() +
				", " + pLocation.getAddress() + ", " + pLocation.getCity() + ", " + pLocation.getState() +
				", " + pLocation.getZip() + ", " + getWeeklyPaycheck());
	}
	
	
}
