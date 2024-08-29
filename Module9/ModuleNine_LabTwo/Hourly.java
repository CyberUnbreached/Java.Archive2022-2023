/*
 *  Author: Ian Rohan
 *  Date: 4/13/2023
 *  Assignment: ModuleNine_LabTwo
 */
package labTwoPackage;
import java.text.*;

public class Hourly extends Employee {
	// Create private variables
	private double hourlyRate;
	private int hoursWorked; // per Week
	
	// Create currency formatter
	NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	
	// Create constructor
	public Hourly(String pEmployeeID, String pFirstName, String pLastName, Benefits pBenefit, Address pHomeAddress, double pRate, int pHours) {
		super(pEmployeeID, pFirstName, pLastName, pBenefit, pHomeAddress);
		this.hourlyRate = pRate;
		this.hoursWorked = pHours;
	}
	
	// Create copy constructor
	public Hourly(Hourly pHourly) {
		super(pHourly);
		this.hourlyRate = pHourly.hourlyRate;
		this.hoursWorked = pHourly.hoursWorked;
	}

	// Create Getters and Setters
	protected double getHourlyRate() {
		return hourlyRate;
	}

	protected void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	protected int getHoursWorked() {
		return hoursWorked;
	}

	protected void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	// Create method to calculate pay 
	private double calculatePay() {
		double grossPay = (getHourlyRate() * getHoursWorked());
		return grossPay;
	}

	// 
	@Override
	public void PrintEmployeeInformation() {
		// TODO Auto-generated method stub
		super.PrintEmployeeInformation();
		System.out.println("Employee Type: Hourly");
		System.out.println("Employee Gross Pay: " + fmt1.format(calculatePay()));
	}
	
	
	
	
}
