/*
 *  Author: Ian Rohan
 *  Date: 4/6/2023
 *  Assignment: ModuleEight_LabTwo
 */
package labTwoPackage;
import java.util.Scanner; // For scanner
import java.io.*; // For file and IOException

public class SalesReader {
	/*
	 *  The SalesReader class reads bookstore sales as
	 *  tokens from a file
	 */
	 
	// Create private variables
	 private Scanner inputFile;
	 private String line;
	 
	 
	 
	 // Create constructor to open and read a file
	 public SalesReader(String filename) throws IOException {
		File file = new File(filename);
		inputFile = new Scanner(file);
		}
	 
	   /*
	    *  Create readNextLine method to read the next line
	    *  from the file.
	    */
	   public boolean readNextLine() throws IOException
	   {
	      boolean lineRead; 
	      lineRead = inputFile.hasNext(); 
	      if (lineRead)
	        line = inputFile.nextLine();
	      return lineRead;
	   }
	   
	   // Create method to calculate the total sales for each week, with each row representing a week
	   public double weeklyTotal() {
		   double weeklyTotal = 0.0;
		   String[] tokens = line.split(",");
		   for (String token : tokens) {
		        weeklyTotal += Double.parseDouble(token.trim());
		   }
		   return weeklyTotal;
	   }
	   
	   
	   // Close scanner
	   public void close() throws IOException
	   {
	      inputFile.close();
	   }
	   
}
