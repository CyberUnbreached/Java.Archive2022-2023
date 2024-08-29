/*
 *  Author: Ian Rohan
 *  Date: 4/11/2023
 *  Assignment: ModuleNine_LabOne
 */
package labOnePackage;

public class CargoShip extends Ship {
	// Create private variables
	int shipCapacity; // in tons

	public CargoShip(String shipName, String shipYear, int cargoCapacity) {
		super(shipName, shipYear);
		this.shipCapacity = cargoCapacity;
	}

	// Create Getters and Setters
	protected int getShipCapacity() {
		return shipCapacity;
	}

	protected void setShipCapacity(int shipCapacity) {
		this.shipCapacity = shipCapacity;
	}

	// Create toString method to display ship name, year and cargo capacity
	@Override
	public String toString() {
		return super.toString() + "\nCargo Capacity: " + getShipCapacity() + " tons";
	}
	
}
