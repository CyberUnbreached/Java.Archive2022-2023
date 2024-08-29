/*
 *  Author: Ian Rohan
 *  Date: 5/12/2023
 *  Assignment: Final_Exam
 */
package finalExamPackage;

import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {
		//manufacturer, model, year, plateNumber
		// Create 2 instances of Car
		Car CarOne = new Car("Chevrolet", "Tahoe", "2011", "NBC123", 4);
		Car CarTwo = new Car("Maserati", "Ghilbi", "2019", "UBT456", 4);
		
		// Create 2 instances of Truck
		Truck TruckOne = new Truck("GMC", "Sierra 1500", "2015", "CEX701", 1320);
		Truck TruckTwo = new Truck("Chevrolet", "Silverado 2500", "2015", "CBD643", 3614 );
		
		// Create 2 instances of Motorcycle
		Motorcycle CycleOne = new Motorcycle("Triumph", "Speed Triple 1200 RR", "2022", 
				"XHJ335", 1160);
		Motorcycle CycleTwo = new Motorcycle("Ducati", "Hypermotard 950", "2023", 
				"TTC381", 937);
		
		// Create ArrayList to hold information from 6 different vehicles
		ArrayList<Vehicle> myVehicle = new ArrayList<Vehicle>();
		myVehicle.add(CarOne);
		myVehicle.add(CarTwo);
		myVehicle.add(TruckOne);
		myVehicle.add(TruckTwo);
		myVehicle.add(CycleOne);
		myVehicle.add(CycleTwo);
		
		// Use toString method to call
		System.out.println("*************************");
		System.out.println("*  Vehicle Information  *");
		System.out.println("*************************\n");
		for (Vehicle Vehicles : myVehicle) {
			System.out.println(Vehicles.toString());
			System.out.println("\n-------------------------------------\n");
			}
		
	}

}
