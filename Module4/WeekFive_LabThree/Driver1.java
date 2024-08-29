/*
 *  Author: Ian Rohan
 *  Date: 2/16/2023
 *  Assignment: WeekFive_LabThree
 */
package labThreePackage;
import java.util.*;

public class Driver1 {

	public static void main(String[] args) {
		// Create variables
		String tickerSymbol,
			companyName;
		int shareAmount = 0;
		double sharePrice = 0.00;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in); 

		// Prompt user for information
		System.out.print("Enter ticker symbol: ");
		tickerSymbol = myScan.nextLine();
		System.out.print("Enter company name: ");
		companyName = myScan.nextLine();
		System.out.print("Enter share amount: ");
		shareAmount = myScan.nextInt();
		System.out.print("Enter share price: $");
		sharePrice = myScan.nextDouble();
		
		// Print Information back to user
		Stocks stockInfo = new Stocks(tickerSymbol, companyName, shareAmount, sharePrice);
		stockInfo.PrintInfo();
		
		// Close scanner
		myScan.close();
		
	}

}
