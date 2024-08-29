/**
 * @author Kevin Roark
 * Person Class 
 *  Class contains: First name, Last name, and age 
 * 
 * Modified by Ian Rohan 2/23/23
 * ModuleFive_LabThree
 */
public class Person {
	//Attributes/fields
	private String firstName;
	private String lastName;
	private int personAge;
	private String phoneNumber;
	private double personGPA;
	/**************************************
	 * Constructors
	 **************************************/
	//Constructors (Default)
	public Person()
	{
		firstName = "None";
		lastName = "None";
		personAge = 0;
		phoneNumber = "Unknown";
		personGPA = 0.0;
	}
	//Constructors (Populates data with arguments)
	public Person(String pFirst, String pLast, int pAge)
	{
		setFirstName(pFirst);
		setLastName(pLast);
		setPersonAge(pAge);	
		setPhoneNumber("Unknown");
		setPersonGPA(0.0);
	}
	
	public Person(String pFirst, String pLast, int pAge, String pNumber, double pGPA) 
	{
		setFirstName(pFirst);
		setLastName(pLast);
		setPersonAge(pAge);	
		setPhoneNumber(pNumber);
		setPersonGPA(pGPA);
	}
	/**************************************
	 * Getters/Setters
	 **************************************/	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public double getPersonGPA() {
		return personGPA;
	}
	
	public void setPersonGPA(double personGPA) {
		this.personGPA = personGPA;
	}
	/**************************************
	 * Methods 
	 **************************************/
	public String PrintData()
	{
		String myReturn = "";
		myReturn += "Name: " + getFirstName() + " " + getLastName();
		myReturn += ", Age: " + getPersonAge();
		myReturn += ", GPA: " + getPersonGPA();
		myReturn += ", Phone: " + getPhoneNumber();
		return myReturn;
	}	

} // END Person Class