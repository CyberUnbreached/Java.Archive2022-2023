/*
 *  Author: Ian Rohan
 *  Date: 5/4/2023
 *  Assignment: ModuleTen_LabTwo
 */
package labTwoPackage;
import java.util.Scanner;
import java.io.*;


public class Driver1 {

	public static void main(String[] args) {
		// Use Exception handling
		// add 10 in binary = 00001010
		// subtract by 10 in binary = -00001010
		
		
		// Create variables
		String text;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Prompt user to enter string to be encrypted
		System.out.print("Enter text to be encrypted: ");
		text = myScan.nextLine();
		
		// Create file
		File textFile = new File("file.txt");
	
		try {
			  //Create an instance of the File Writer and give it the filename
		      FileWriter fw = new FileWriter(textFile);
		      //Write our data to the file 
		      fw.write(text);
		      fw.close();
		      //Message that all was done
		      System.out.println("Successfully wrote text to the file.\n");
		    } 
		catch (IOException e) 
			{
				  //An issue happened - Message user  
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}
		
		// Encrypt the file 
		System.out.print("Encrypted Text: ");
		try {
			FileInputStream fileInput = new FileInputStream("file.txt");
			int r;
			while ((r = fileInput.read()) != -1) {
			   char c = (char) (r + 10);
			   System.out.print(c);
			}
			fileInput.close();
			System.out.println("\n");
			
		}
		catch (IOException e) {
			  //An issue happened - Message user  
		      System.out.println("An error occurred. Unable to encrypt file.");
		      e.printStackTrace();
		}
		
		
		System.out.print("Decrypted Text: ");
		try {
			FileInputStream fileInput = new FileInputStream("file.txt");
			int r;
			while ((r = fileInput.read()) != -1) {
			   char c = (char) r;
			   System.out.print(c);
			}
			fileInput.close();
			
		}
		catch (IOException e) 
		{
			  //An issue happened - Message user  
		      System.out.println("An error occurred. Unable to encrypt file.");
		      e.printStackTrace();
		}
	
		myScan.close();
	}
}