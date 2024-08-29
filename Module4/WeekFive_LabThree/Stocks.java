/*
 *  Author: Ian Rohan
 *  Date: 2/16/2023
 *  Assignment: WeekFive_LabThree
 */
package labThreePackage;

public class Stocks {
	// Create class variables 
	String tickerSymbol = "",
			companyName = "";
	int shareAmount = 0;
	double sharePrice = 0.00;
	
	//Create constructor
	public Stocks(String tickerSymbol, String companyName, int shareAmount, double sharePrice) {
		setTickerSymbol(tickerSymbol);
		setCompanyName(companyName);
		setShareAmount(shareAmount);
		setSharePrice(sharePrice);
	}

	public String getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getShareAmount() {
		return shareAmount;
	}

	public void setShareAmount(int shareAmount) {
		this.shareAmount = shareAmount;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	private double getPositionValue(int shareAmount, double sharePrice) {
		double positionValue = 0.00;
		positionValue = ((double)shareAmount * sharePrice); 
		return positionValue;
	}
	
	private String getPositionSize(double positionValue) {
		String positionSize = "";
		if (positionValue < 2500.00) {
			positionSize = "Small";
		}
		else if (positionValue <= 5000.00) {
			positionSize = "Medium";
		}
		else {
			positionSize = "Large";
		}
		return positionSize;
	}
	
	public void PrintInfo() {
		System.out.println("\nSymbol: " + this.getTickerSymbol());
		System.out.println("Company Name: " + this.getCompanyName());
		System.out.println("Shares Held: " + this.getShareAmount());
		System.out.println("Share Price: $" + String.format("%.2f",this.getSharePrice()));
		System.out.println("Position Value: $" 
				+ String.format("%.2f",getPositionValue(this.getShareAmount(), this.getSharePrice())));
		System.out.println("Position Size: " 
				+ getPositionSize(getPositionValue(this.getShareAmount(), this.getSharePrice())));
	}
}
