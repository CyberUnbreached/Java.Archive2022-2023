/*
 *  Author: Ian Rohan
 *  Date: 4/20/2023
 *  Assignment: ModuleNine_LabThree
 */
package labThreePackage;
import java.text.*;

public class Nurse extends MedicalProvider implements WritetoFile {
	// Create class variables
	private String type;
	private double hourlyRate;
	private double hoursWorked;
	
	// Create currency formatter
	NumberFormat fmt1 = NumberFormat.getCurrencyInstance();

	// Create constructor
	public Nurse(String firstName, String lastName,String employeeID, OfficeLocation employeeOfficeLocation, String pType, 
			double pHourlyRate, double pHoursWorked) {
		super(firstName, lastName, employeeID, employeeOfficeLocation);
		setType(pType);
		setHourlyRate(pHourlyRate);
		setHoursWorked(pHoursWorked);
	}
	
	// Create default constructor
	public Nurse() {
		super();
		this.type = "Unknown Type";
		this.hourlyRate = -12;
		this.hoursWorked = -12;
	}
	
	// Create copy constructor
	public Nurse(Nurse pNurse) {
		super(pNurse);
		this.type = pNurse.type;
		this.hourlyRate = pNurse.hourlyRate;
		this.hoursWorked = pNurse.hoursWorked;
	}
	
	// Create Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	// Create method to calculate weekly pay
	public double getWeeklyPaycheck() {
		double weeklyPay;
		weeklyPay = (getHoursWorked() * getHourlyRate());
		return weeklyPay;
	}
	
	// Override MedicalProvider PrintInfo method
	@Override
	public void PrintInfo() {
		// TODO Auto-generated method stub
		super.PrintInfo();
		System.out.println("Type: " + getType());
		System.out.println("Weekly Pay: " + fmt1.format(getWeeklyPaycheck()));
	}
	
	// Use WritetoFile interface to input data into Medical.csv
	public void WriteToFile(OfficeLocation pLocation)
	{
		WriteRecordToFile(getEmployeeID() + "," + getType() + ", " + getFirstName() + " "+ getLastName() +
				", " + pLocation.getAddress() + ", " + pLocation.getCity() + ", " + pLocation.getState() +
				", " + pLocation.getZip() + ", " + getWeeklyPaycheck());
	}
	
	
}
