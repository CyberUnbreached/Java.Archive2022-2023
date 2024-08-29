/*
 *  Author: Ian Rohan
 *  Date: 4/13/2023
 *  Assignment: ModuleNine_LabTwo
 */
package labTwoPackage;

public class Benefits {
	// Create class variables 
	private String benefitType;
	private double benefitCost;
	private String provider;
	
	// Create constructor
	public Benefits(String benefitType, double benefitCost, String provider) {
		super();
		setBenefitType(benefitType);
		setBenefitCost(benefitCost);
		setProvider(provider);
	}
	
	// Create copy constructor
	public Benefits(Benefits pBenefits) {
		super();
		this.benefitType = pBenefits.benefitType;
		this.benefitCost = pBenefits.benefitCost;
		this.provider = pBenefits.provider;
	}
	
	// Create getters and setters
	public String getBenefitType() {
		return benefitType;
	}

	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public double getBenefitCost() {
		return benefitCost;
	}

	public void setBenefitCost(double benefitCost) {
		this.benefitCost = benefitCost;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	// Create void function to print information
	public void PrintBenefitInfo () {
		System.out.println("\tType: " + getBenefitType());
		System.out.println("\tCost: $" + String.format("%.2f",getBenefitCost()));
		System.out.println("\tProvider: " + getProvider());
	}
	
}