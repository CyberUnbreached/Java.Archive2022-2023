/*
 *  Author: Ian Rohan
 *  Date: 5/12/2023
 *  Assignment: Final_Exam
 */
package finalExamPackage;

public class Motorcycle extends Vehicle {
	// Create class variables
	int engineSize;

	// Create constructor
	public Motorcycle(String manufacturer, String model, String year, String plateNumber,
			int engineSize) {
		super(manufacturer, model, year, plateNumber);
		setEngineSize(engineSize);
	}

	// Create getters and setters
	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	// Override toString method
	@Override
	public String toString() {
		return super.toString() + "Engine Size: " + getEngineSize() + " cc";
	}
	
	
	
	
	
	
}
