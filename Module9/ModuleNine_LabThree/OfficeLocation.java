/*
 *  Author: Ian Rohan
 *  Date: 4/20/2023
 *  Assignment: ModuleNine_LabThree
 */
package labThreePackage;

public class OfficeLocation {
	// Create class variables
	private String officeName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	
	// Create constructor with parameters
	public OfficeLocation(String officeName, String address, String city, String state, String zip, String phone) {
		super();
		setOfficeName(officeName);
		setAddress(address);
		setCity(city);
		setState(state);
		setZip(zip);
		setPhone(phone);
	}
	
	// Create default constructor 
	public OfficeLocation() {
		super();
		this.officeName = "Unknown Office Name";
		this.address = "Unknown Address";
		this.city = "Unknown City";
		this.state = "Unknown State";
		this.zip = "Unknown Zipcode";
		this.phone = "Unknwon Phonenumber";
	}
	
	// Create copy constructor
	public OfficeLocation(OfficeLocation pOfficeLocation) {
		this.officeName = pOfficeLocation.officeName;
		this.address = pOfficeLocation.address;
		this.city = pOfficeLocation.city;
		this.state = pOfficeLocation.state;
		this.zip = pOfficeLocation.zip;
		this.phone = pOfficeLocation.phone;
	}

	// Create getters and setters
	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	// Create PrintInfo() method
	public void PrintInfo() {
		System.out.println("Office Name: " + getOfficeName());
		System.out.println("Phone Number: " + getPhone());
		System.out.println("Address: "); 
		System.out.println("\t" + getAddress() + "\n\t" + getCity() + ", "
				+ getState() + " " + getZip());
	}
}
