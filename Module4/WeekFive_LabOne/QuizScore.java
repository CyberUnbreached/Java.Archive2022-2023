/*
 *  Author: Ian Rohan
 *  Date: 2/14/2023
 *  Assignment: WeekFive_LabOne
 */
package labOnePackage;

public class QuizScore {
	// Create class variables
	private String studentName;
	private int quizOneGrade;
	private int quizTwoGrade;
	private int quizThreeGrade;
	
	// Create constructor
	public QuizScore(String studentName, int quizOneGrade, int quizTwoGrade, int quizThreeGrade) {
		super();
		setStudentName(studentName);
		setQuizOneGrade(quizOneGrade);
		setQuizTwoGrade(quizTwoGrade);
		setQuizThreeGrade(quizThreeGrade);
	}
	// Create getters and setters
	// if grade < 50, grade = 50 || if grade > 100, grade = 100 
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getQuizOneGrade() {
		return quizOneGrade;
	}

	public void setQuizOneGrade(int quizOneGrade) {
		this.quizOneGrade = quizOneGrade;
		if (quizOneGrade < 50) {
			this.quizOneGrade = 50;
		}
		else if(quizOneGrade > 100) {
			this.quizOneGrade = 100;
		}
		else {
			this.quizOneGrade = quizOneGrade;
		}
	}

	public int getQuizTwoGrade() {
		
		return quizTwoGrade;
	}

	public void setQuizTwoGrade(int quizTwoGrade) {
		this.quizTwoGrade = quizTwoGrade;
		if (quizTwoGrade < 50) {
			this.quizTwoGrade = 50;
		}
		else if(quizTwoGrade > 100) {
			this.quizTwoGrade = 100;
		}
		else {
			this.quizTwoGrade = quizTwoGrade;
		}
	}

	public int getQuizThreeGrade() {
		return quizThreeGrade;
	}

	public void setQuizThreeGrade(int quizThreeGrade) {
		this.quizThreeGrade = quizThreeGrade;
		if (quizThreeGrade < 50) {
			this.quizThreeGrade = 50;
		}
		else if(quizThreeGrade > 100) {
			this.quizThreeGrade = 100;
		}
		else {
			this.quizThreeGrade = quizThreeGrade;
		}
	}
	
	private double getGradeAverage() {
		double gradeAverage;
		gradeAverage = (double)(this.getQuizOneGrade() + this.getQuizTwoGrade() + this.getQuizThreeGrade()) / 3;
		return gradeAverage;
	}

	private char getLetterGrade() {
		char letterGrade;
		if (this.getGradeAverage() < 60) {
			letterGrade = 'F';
		}
		else {
			if (this.getGradeAverage() <= 69) {
				letterGrade = 'D';
			}
			else {
				if (this.getGradeAverage() <= 79) {
					letterGrade = 'C';
				}
				else {
					if(this.getGradeAverage() <= 89) {
						letterGrade = 'B';
					}
					else {
						letterGrade = 'A';
					}
				}
			}
		}
		return letterGrade;
	}

	public void PrintInfo() {
		System.out.println("Student Name: " + this.getStudentName());
		System.out.println("Quiz 1 Grade: " + this.getQuizOneGrade());
		System.out.println("Quiz 2 Grade: " + this.getQuizTwoGrade());
		System.out.println("Quiz 3 Grade: " + this.getQuizThreeGrade());
		System.out.println("Student Grade Average: " + String.format("%.2f",this.getGradeAverage()));
		System.out.println("Letter Grade: " + this.getLetterGrade());
	}
	
}
