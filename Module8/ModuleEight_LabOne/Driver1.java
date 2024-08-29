/*
 *  Author: Ian Rohan
 *  Date: 4/4/2023
 *  Assignment: ModuleEight_LabOne
 */
package labOnePackage;
import java.io.*;

public class Driver1 {
	public static void main(String[] args) throws IOException {
		String fileName = "MyText.txt";
		int wordCount = Utility.countWords(fileName);
		int weCount = Utility.countWe(fileName);
		System.out.println("Word Count: " + wordCount);
		System.out.println("We Count: " + weCount);
		System.out.println("Replaced string: " + Utility.replacePeople(fileName));
				
	}
		

}
