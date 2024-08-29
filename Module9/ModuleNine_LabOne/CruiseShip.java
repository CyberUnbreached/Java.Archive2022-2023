/*
 *  Author: Ian Rohan
 *  Date: 4/11/2023
 *  Assignment: ModuleNine_LabOne
 */
package labOnePackage;

public class CruiseShip extends Ship {
	// Create private variables
	private int passengerAmount;

	public CruiseShip(String shipName, String shipYear, int passengerAmount) {
		super(shipName, shipYear);
		this.passengerAmount = passengerAmount;
	}

	// Create Getters and Setters
	protected int getPassengerAmount() {
		return passengerAmount;
	}

	protected void setPassengerAmount(int passengerAmount) {
		this.passengerAmount = passengerAmount;
	}

	// Create toString method to display ship name, year and max number of occupants
	@Override
	public String toString() {
		return super.toString() + "\nMax Occupants: " + passengerAmount;
	}
	
}
