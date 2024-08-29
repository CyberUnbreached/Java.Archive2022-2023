/*
 *  Author: Ian Rohan
 *  Date: 4/4/2023
 *  Assignment: ModuleEight_LabOne
 */
package labOnePackage;
import java.io.*;

public class Utility {
	// Create pub static function to count words from file
	public static int countWords(String fileName) throws IOException {
		  int numberofWords = 0;
	      BufferedReader br = new BufferedReader(new FileReader(fileName));
	      String line;
	      while ((line = br.readLine()) != null) {
	    	String[] tokens = line.split(" ");
	  		numberofWords = tokens.length;
	      }
	      br.close();
	      return numberofWords;
	}
	// Create pub static function to count We's from file
	public static int countWe(String fileName) throws IOException{
		int numberofWe = 0;
		BufferedReader br = new BufferedReader(new FileReader(fileName));
	    String line;
	    while ((line = br.readLine()) != null) {
			String[] tokens = line.split("we");
			numberofWe = tokens.length + 1;	    
		}
	    br.close();
		return numberofWe;
	}
	// Create pub static function to replace "people" with "People"
	public static String replacePeople(String fileName) throws IOException {
		String fileOutput = " ";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
	    String line;
	    while ((line = br.readLine()) != null) {
	    	fileOutput = line.replaceAll("people", "People");
	    }
	    br.close();
	    return fileOutput;
	}
}
