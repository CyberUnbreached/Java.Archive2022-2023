/*
 *  Author: Ian Rohan
 *  Date: 2/2/2023
 *  Assignment: WeekThree_LabOne
 */
package labOnePackage;

public class Pet {
	// Create class variables
	private String petName;
	private String petType;
	private String petSound;
	
	// Constructors
	public Pet(String petName, String petType, String petSound){
		super();
		this.petName = petName;
		this.petType = petType;
		this.petSound = petSound;
	}
	public Pet() {
		super();
		this.petName = "Unknown Pet Name";
		this.petType = "Unknown Pet Type";
		this.petSound = "Unknown Pet Sound";
	}
	public String getName() {
		return petName;
	}
	
	public String getType() {
		return petType;
	}
	public String getSound() {
		return petSound;
	}
	
	public String PrintInfo()
	{
		String myReturn;
		myReturn = "Name: " + this.getName() + "\n";
		myReturn += "Type: " + this.getType() + "\n";
		myReturn += "Sound: " + this.getSound() + "\n";
		myReturn += "************************************" + "\n";
		return myReturn;
	}	
	
}
