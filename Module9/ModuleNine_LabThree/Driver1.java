/*
 *  Author: Ian Rohan
 *  Date: 4/20/2023
 *  Assignment: ModuleNine_LabThree
 */
package labThreePackage;
import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {
		// output to the user Welcome to the Info system
		System.out.println("*************************************");
		System.out.println("*Medical Provider Information System*");
		System.out.println("*************************************\n");
			
		// Create 2 OfficeLocation classes, each nurse and doctor will share an office
		OfficeLocation locationOne = new OfficeLocation("Dr. Weeves's Office", "11137 Acuff Station", 
				"San Antonio", "Texas", "72256", "210-332-5660");
		OfficeLocation locationTwo = new OfficeLocation("Dr. Shouder's Office", "13345 Newburry Drive", 
				"San Antonio", "Texas", "75432", "210-433-7202");
		
		// Create 2 instances of Doctor
		Doctor doctorOne = new Doctor("Smith", "Weeves", "D1234", locationOne, "Doctor", "55606", "A102", 182000.00);
		doctorOne.WriteToFile(locationOne);
		Doctor doctorTwo = new Doctor("Allen", "Shouder", "D2245", locationTwo, "Doctor", "111032", "B234", 195000.00);
		doctorTwo.WriteToFile(locationTwo);
		
		// Create 2 instances of Nurse
		Nurse nurseOne = new Nurse("Alexis", "Burt", "N1234", locationOne, "Nurse", 35.00, 20);
		nurseOne.WriteToFile(locationOne);
		Nurse nurseTwo = new Nurse("Steven", "Yu", "N2232",  locationTwo, "Nurse", 36.00, 24);
		nurseTwo.WriteToFile(locationTwo);
		
		// Create ArrayList to hold information from 4 different medical providers, 2 nurses and 2 doctors
		ArrayList<MedicalProvider> myProvider  = new ArrayList<MedicalProvider>();
		myProvider.add(doctorOne);
		myProvider.add(doctorTwo);
		myProvider.add(nurseOne);
		myProvider.add(nurseTwo);
		
		// Output to the user the Employee data using your PrintEmployeeInformation method.
		for (MedicalProvider Providers : myProvider) {
		Providers.PrintInfo();
		System.out.println("\n-------------------------------------\n");
		}
		
	}

}
