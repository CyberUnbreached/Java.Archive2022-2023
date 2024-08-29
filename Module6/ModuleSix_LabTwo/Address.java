/*
 *  Author: Ian Rohan
 *  Date: 3/2/2023
 *  Assignment: ModuleSix_LabTwo
 */
package labTwoPackage;

public class Address {
	// Create class variables
	private String street, city, state, zipcode;

	// Create constructor
	public Address(String street, String city, String state, String zipcode) {
		super();
		setStreet(street);
		setCity(city);
		setState(state);
		setZipcode(zipcode);
	}

	// Create getters and setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	// Create function to print address information for the employee
	public void PrintAddressInformation() {
		System.out.println("\t" + getStreet());
		System.out.println("\t" + getState() + ", " + getCity() + ", " + getZipcode());
	}
}
