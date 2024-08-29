/*
 *  Author: Ian Rohan
 *  Date: 3/2/2023
 *  Assignment: ModuleSix_LabTwo
 */
package labTwoPackage;

public class Header {
	public static void PrintHeader(String pString) {
		System.out.println("*******************************");
		System.out.println("*Welcome to the Parking Permit*");
		System.out.println("*******************************");
	}
	
	public static void PrintHeader(char pChar) {
		System.out.println("\nPlease Enter the Following Information: \n");
	}
	
	public static void PrintHeader(int pInt) {
		System.out.println("\nParking Permit Information");	
		System.out.println("****************************");	
	}
	
	public static void PrintHeader() {
		System.out.println("Student Address");	
	}
	
	public static void PrintHeader(boolean pBool) {
		System.out.println("\nVehicle Information");	
		
	}
	
	public static void PrintFooter() {
		 System.out.println("\nEnd of Parking Permit");
		 System.out.println("****************************");
	 }
	
}
