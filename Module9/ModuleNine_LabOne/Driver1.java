/*
 *  Author: Ian Rohan
 *  Date: 4/11/2023
 *  Assignment: ModuleNine_LabOne
 */
package labOnePackage;
import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		// Create variables
		String shipName1;
		String shipName2;
	    String shipYear1;
	    String shipYear2;
		int passengerAmount;
		int cargoCapacity;
		
		// Create scanner
		Scanner myScan = new Scanner(System.in);
		
		// Ask user to submit information for cruise ship
		System.out.println("Enter data for cruise ship");
		System.out.print("Name? ");
		shipName1 = myScan.nextLine();
		System.out.print("Year of manufacture? ");
		shipYear1 = myScan.nextLine();
		System.out.print("Max occupancy? ");
		passengerAmount = myScan.nextInt();
		myScan.nextLine();
		
		// Ask user to submit information for cargo ship
		System.out.println("\nEnter data for cargo ship");
		System.out.print("Name? ");
		shipName2 = myScan.nextLine();
		System.out.print("Year of manufacture? ");
		shipYear2 = myScan.nextLine();
		System.out.print("Cargo capacity? (in tons) ");
		cargoCapacity = myScan.nextInt();
		myScan.nextLine();
		
		// Create cruise and cargo ship 
		CruiseShip myCruise =  new CruiseShip(shipName1, shipYear1, passengerAmount);
		CargoShip myCargo = new CargoShip(shipName2, shipYear2, cargoCapacity);
		
		// Print ship information
		System.out.println("Ship Information Database");
		System.out.println("******************************");
		System.out.println("Cruise Ship\n" + myCruise.toString() + "\n\nCargo Ship\n" + myCargo.toString());
		
		// Close scanner
		myScan.close();
	}

}
