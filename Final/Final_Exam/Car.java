/*
 *  Author: Ian Rohan
 *  Date: 5/12/2023
 *  Assignment: Final_Exam
 */
package finalExamPackage;

public class Car extends Vehicle {
	// Create class variables
	int numberOfDoors;
	
	// Create constructor
	public Car(String manufacturer, String model, String year, String plateNumber,
			int numberOfDoors) {
		super(manufacturer, model, year, plateNumber);
		setNumberOfDoors(numberOfDoors);
	}

	// Create getters and setters
	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	// Override toString class
	@Override
	public String toString() {
		return super.toString() +
				"Number of Doors: " + getNumberOfDoors();
	}
	
	
	
	
}
