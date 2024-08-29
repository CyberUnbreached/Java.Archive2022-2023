/*
 *  Author: Ian Rohan
 *  Date: 3/7/2023
 *  Assignment: Midterm_Exam
 */
package midtermExamPackage;
//import Scanner and NumberFormat packages
import java.util.Scanner;
import java.text.NumberFormat;

public class Driver1 {

	public static void main(String[] args) {
		//declare variables for the program - set interest rate
		//starting balance, annual interest rate (0.12), deposit, withdrawal, months
		double startBalance;
		double annualInterestRate;
		double balanceDeposit, balanceWithdrawal;
		int numberofMonths;
		
		//create a scanner
		Scanner myScan = new Scanner(System.in);
		
		//create a number formatter for currency
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		//Ask user for the original balance
		System.out.print("Enter orignal balance: $");
		startBalance = myScan.nextDouble();
		
		//create an instance of the SavingsAccount Class - give the constructor the balance
		SavingsAccount userAccount = new SavingsAccount(startBalance);
		
		//set the objects interest rate
		annualInterestRate = 0.12;
		
		//ask the user for the number of months to run
		System.out.println("Enter number of months: ");
		numberofMonths = myScan.nextInt();
		
		//loop through the number of months
		//BEGIN loop
		for (int i = 1; i <= numberofMonths; i++) {
			System.out.println("\nMonth #" + i);
			//ask the user how much to deposit -
			System.out.print("Deposit Amount: $");
			balanceDeposit = myScan.nextDouble();
			
			//using the add class method - add to the balance
			userAccount.depositBalance(balanceDeposit);
			
			//ask the user how much to withdraw
			System.out.print("Withdraw Amount: $");
			balanceWithdrawal = myScan.nextDouble();
			
			//using the deduct amount method - deduct from the balance
			userAccount.withdrawBalance(balanceWithdrawal);
			
			//use the Compute Interest rate method
			userAccount.computeMonthlyInterest(annualInterestRate);
			
			//output the account Balance
			System.out.println("\n******************************");
			System.out.println("Month #" + i + " Summary");
			System.out.println("Amount Deposited: " + currency.format(balanceDeposit));
			System.out.println("Amount Withdrawn: " + currency.format(balanceWithdrawal));	
			System.out.println("Account Balance: " + currency.format(userAccount.getUserBalance()));
			System.out.println("******************************");
		} //END loop
		
		//output "Thanks for using the banking program!"
		System.out.println("Thanks for using the banking program!");
		
		// Close scanner
		myScan.close();
	}

}
