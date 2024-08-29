/*
 *  Author: Ian Rohan
 *  Date: 4/13/2023
 *  Assignment: ModuleNine_LabTwo
 */
package labTwoPackage;
import java.text.*;

public class Salary extends Employee {
	// Create private variables
	private double annualSalary;
	private double monthlyBonus; 
	
	// Create currency formatter
	NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
	
	// Create constructor
	public Salary(String pEmployeeID, String pFirstName, String pLastName, Benefits pBenefit, Address pHomeAddress,
			double pSalary, double pBonus) {
		super(pEmployeeID, pFirstName, pLastName, pBenefit, pHomeAddress);
		this.annualSalary = pSalary;
		this.monthlyBonus = pBonus;
	}

	// Create copy constructor
	public Salary(Salary pSalary) {
		super(pSalary);
		this.annualSalary = pSalary.annualSalary;
		this.monthlyBonus = pSalary.monthlyBonus;
	}
	
	// Create Getters and Setters
	protected double getAnnualSalary() {
		return annualSalary;
	}

	protected void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	protected double getMonthlyBonus() {
		return monthlyBonus;
	}

	protected void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	
	// Create method to calculate pay
	private double calculatePay() {
		double grossPay = getAnnualSalary() + (getMonthlyBonus() * 12);
		return grossPay;
	}

	// Override the PrintEmployeeInformation() of the Employee class to also print the employees gross pay for the period
	@Override
	public void PrintEmployeeInformation() {
		super.PrintEmployeeInformation();
		System.out.println("Employee Type: Salary");
		System.out.println("Employee Gross Pay: " + fmt1.format(calculatePay()));
	}
	
	
	
	
}
