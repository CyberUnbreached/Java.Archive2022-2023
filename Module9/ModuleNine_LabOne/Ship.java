/*
 *  Author: Ian Rohan
 *  Date: 4/11/2023
 *  Assignment: ModuleNine_LabOne
 */
package labOnePackage;

public class Ship {
	// Create private variables
	private String shipName;
	private String ShipYear;
	
	// Create constructor
	public Ship(String shipName, String shipYear) {
		super();
		this.shipName = shipName;
		this.ShipYear = shipYear;
	}

	// Create Getters and Setters
	protected String getShipName() {
		return shipName;
	}

	protected void setShipName(String shipName) {
		this.shipName = shipName;
	}

	protected String getShipYear() {
		return ShipYear;
	}

	protected void setShipYear(String shipYear) {
		ShipYear = shipYear;
	}

	// Create toString method that displays ship name and year
	@Override
	public String toString() {
		return "Name: " + this.getShipName() + "\nYear: " + this.getShipYear();
	}
	
}
