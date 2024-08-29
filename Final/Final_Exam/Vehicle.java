/*
 *  Author: Ian Rohan
 *  Date: 5/12/2023
 *  Assignment: Final_Exam
 */
package finalExamPackage;

public class Vehicle {
	// Create class variables
	String Manufacturer;
	String Model;
	String Year;
	String plateNumber;
	
	// Create constructor
	public Vehicle(String manufacturer, String model, String year, String plateNumber) {
		super();
		setManufacturer(manufacturer);
		setModel(model);
		setYear(year);
		setPlateNumber(plateNumber);
	}

	// Create Getters and Setters
	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	// Override toString method with data inputs
	  @Override
	  public String toString() {
	    return   "Manufacturer: " + getManufacturer() + "\n"
	    		+ "Model: " + getModel() + "\n"
	    		+ "Year: " + getYear() + "\n"
	    		+ "Plate Number: " + getPlateNumber() + "\n";
	  }
	
	
}
