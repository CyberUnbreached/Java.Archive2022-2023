/*
 *  Author: Ian Rohan
 *  Date: 2/16/2023
 *  Assignment: WeekFive_LabTwo
 */
package labTwoPackage;

public class Student {
	// Create class variables
	String studentName = "";
	int studentHours = 0;
	
	// Create constructor
	public Student(String studentName, int studentHours) {
		setStudentName(studentName);
		setStudentHours(studentHours);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentHours() {
		return studentHours;
	}

	public void setStudentHours(int studentHours) {
		this.studentHours = studentHours;
	}
	
	public String getStudentClassification(int studentHours) {
		String studentClassification = "";
		if (studentHours < 29) {
			studentClassification = "(Freshman)";
		}
		else {
			if (studentHours <= 59) {
				studentClassification = "(Sophomore)";
			}
			else {
				if (studentHours <= 89) {
					studentClassification = "(Junior)";
				}
				else {
					studentClassification = "(Senior)";
				}
			}
		}
		return studentClassification;
	}
	
	public void PrintInfo() {
		System.out.println("\nStudent Name: " + this.getStudentName()
				+ " " + this.getStudentClassification(this.getStudentHours()));
	}
	
	
}
