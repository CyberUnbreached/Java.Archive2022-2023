/*
 *  Author: Ian Rohan
 *  Date: 2/7/2023
 *  Assignment: WeekThree_LabTwo
 */
package labTwoPackage;


public class Sport {
	// Create class variables
	private String teamName;
	private int playerAmount;
	private int seasonWins;
	private int seasonLosses;
	
	// Constructors
	public Sport(String teamName, int playerAmount, int seasonWins, int seasonLosses) {
		super();
		this.teamName = teamName;
		this.playerAmount = playerAmount;
		this.seasonWins = seasonWins;
		this.seasonLosses = seasonLosses;
	}
	// Default Constructor
	public Sport() {
		super();
		this.teamName = "Invalid Team Name";
		this.playerAmount = -20;
		this.seasonWins = -20;
		this.seasonLosses = -20;
		
	}
	
	// Getter and Setter Methods
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getPlayerAmount() {
		return playerAmount;
	}
	public void setPlayerAmount(int playerAmount) {
		this.playerAmount = playerAmount;
	}
	public int getSeasonWins() {
		return seasonWins;
	}
	public void setSeasonWins(int seasonWins) {
		this.seasonWins = seasonWins;
	}
	public int getSeasonLosses() {
		return seasonLosses;
	}
	public void setSeasonLosses(int seasonLosses) {
		this.seasonLosses = seasonLosses;
	}
	public double getWinLossPercent() {
		double winPercent;
		winPercent = (double)(this.getSeasonWins()) / (this.getSeasonWins() + this.getSeasonLosses()) * 100;
		return winPercent;
	}
	
	// Print information to user
	
	public void PrintInfo() 
	{
		System.out.println("Team Name: " + this.getTeamName());
		System.out.println("Number of Players: " + this.getPlayerAmount());
		System.out.println("Number of Wins: " + this.getSeasonWins());
		System.out.println("Number of Losses: " + this.getSeasonLosses());
		System.out.println("Win Percentage of Team: %" + String.format("%.2f",this.getWinLossPercent()));
		System.out.println("**********************************************");
	}
}
