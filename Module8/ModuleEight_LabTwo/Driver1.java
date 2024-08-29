/*
 *  Author: Ian Rohan
 *  Date: 4/6/2023
 *  Assignment: ModuleEight_LabTwo
 */
package labTwoPackage;
import java.io.*;
import java.text.NumberFormat;

public class Driver1 {

	public static void main(String[] args) throws IOException {
		// Create variables
		int weekIndex = 1; // Index for each week, starting on week 1
		double totalSales = 0.0;
		
		// Create currency format
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		
		// Create SalesReader object
		SalesReader salesReader = new SalesReader("BookstoreSales.csv");
		
		// Process file contents
		 while (salesReader.readNextLine())
	      {
			 // Create variable to weekly
			 double Weekly = salesReader.weeklyTotal();
			 
			 // Calculate and display weekly total, and average daily sales
			 System.out.println("*************************************");
			 System.out.println("Week " + weekIndex);
			 System.out.println("Weekly Total: " +  fmt1.format(Weekly));
			 System.out.println("Average Daily Sales: " + fmt1.format(Weekly / 7)); 
			 
			 // Add weekly totals into an overall sum
			 totalSales += Weekly;
	         
			 // Increment the week  number.
	         weekIndex++;
	      }

		 // Calculate total sales for all weeks
		 System.out.println("*************************************");
		 System.out.println("Total Sales for all Weeks: " + fmt1.format(totalSales));
		 System.out.println("Average Weekly Sales: " + fmt1.format(totalSales / 3));
	}

}
