/*
 *  Author: Ian Rohan
 *  Date: 3/2/2023
 *  Assignment: ModuleSix_LabTwo
 */
package labTwoPackage;

public class ParkingPermit {
	// Create class variables 
	private int permitID; // will be a random integer 1000-9999, not have a setter
	private String carMake;
	private String carModel;
	private int carYear;
	
	// Create constructor
	public ParkingPermit(int permitID,String carMake, String carModel, int carYear) {
		super();
		this.permitID = permitID;
		setCarMake(carMake);
		setCarModel(carModel);
		setCarYear(carYear);
	}
	
	public int getPermitID() {
		return permitID;
	}
	
	public String getCarMake() {
		return carMake;
	}
	
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public int getCarYear() {
		return carYear;
	}
	
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	
	// Print parking permit information
	public void PrintPermitInfo () {
		System.out.println("\tPermit ID:" + this.permitID);
		System.out.println("\tMake: " + getCarMake());
		System.out.println("\tModel: " + getCarModel());
		System.out.println("\tYear:" + getCarYear());
	}
	
}
