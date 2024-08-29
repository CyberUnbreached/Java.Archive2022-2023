/*
 *  Author: Ian Rohan
 *  Date: 5/12/2023
 *  Assignment: Final_Exam
 */
package finalExamPackage;

public class Truck extends Vehicle {
	// Create class variables
	int loadCapacity;
		
	// Create constructor
	public Truck(String manufacturer, String model, String year, String plateNumber,
			int loadCapacity) {
		super(manufacturer, model, year, plateNumber);
		setLoadCapacity(loadCapacity);
	}
	
	// Create Getters and Setters
	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	// Override toString class
	@Override
	public String toString() {
		return super.toString() + "Load Capacity: " 
		+ getLoadCapacity() + " lbs";
	}
	
	
		
		
}
