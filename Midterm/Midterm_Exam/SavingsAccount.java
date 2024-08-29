/*
 *  Author: Ian Rohan
 *  Date: 3/7/2023
 *  Assignment: Midterm_Exam
 */
package midtermExamPackage;


public class SavingsAccount {
	// Create class variables for annual interest rate and balance
	private double annualInterestRate;
	private double userBalance;
	
	// Create getters and setters for previously mentioned variables
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getUserBalance() {
		return userBalance;
	}
	
	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}
	
	// Create methods for depositing, withdrawing, and computing monthly interest rate
	public void depositBalance(double pDeposit) {
		this.userBalance = this.userBalance + pDeposit;		
	}
	
	public void withdrawBalance(double pWithdraw) {
		this.userBalance = this.userBalance - pWithdraw;
	}
	
	public void computeMonthlyInterest(double pAnnualInterestRate) {
		double monthlyInterestRate;
		monthlyInterestRate = (double)(pAnnualInterestRate / 12);		
		this.userBalance = this.userBalance + (this.userBalance * monthlyInterestRate);
	}

	
	// Create constructor that receives the opening balance (One argument)
	public SavingsAccount(double pBalance) {
		super();
		this.userBalance = pBalance;
	}
}
