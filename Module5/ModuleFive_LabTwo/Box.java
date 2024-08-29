/*
 *  Author: Ian Rohan
 *  Date: 2/21/2023
 *  Assignment: ModuleFive_LabTwo
 */
package labTwoPackage;

public class Box {
	// Create class variables
	int length, 
		width;
	char boxCharacter;
	String shapeType;
	
	// Create constructor
	public Box(int length, int width, char boxCharacter) {
		super();
		setLength(length);
		setWidth(width);
		setBoxCharacter(boxCharacter);
	}
	// Create getters and setters
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public char getBoxCharacter() {
		return boxCharacter;
	}

	public void setBoxCharacter(char boxCharacter) {
		this.boxCharacter = boxCharacter;
	} 
	
	public String getShapeType() {
		if (this.getWidth() == this.getLength()) {
			shapeType = "Square"; 
		}
		else {
			shapeType = "Rectangle";
		}
		return shapeType;
	}
	
	public void PrintInfo() {
		System.out.println("\nBox length: " + this.getLength());
		System.out.println("Box width: " + this.getWidth());
		System.out.println("This is a " + this.getShapeType() + ".");
	}
	
	public String DrawBox() {
		String DrawBox = "\n";
		for (int L = 1; L <= this.getLength(); L++) {
			for (int w = 1; w <= this.getWidth(); w++) {
				DrawBox += (this.getBoxCharacter());
			}
			DrawBox += ("\n");
		}
		return DrawBox;
	}
	
}
