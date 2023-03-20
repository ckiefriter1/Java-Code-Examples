package arrays;

import java.util.Scanner;

public class GradeBook {
	
	public static void main(String[] args) {
		String fullName = "";
		String lineVariable = "---------------------------------------";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Grade Book Example**");
		
		/* 
		 * User input the name of the course.
		 */
		System.out.println("Name of Course:");
		String courseName = sc.nextLine();
		
		/* 
		 * User input how many students are in the class.
		 */
		System.out.println("How many students are in this class:");
		int numOfStudents = sc.nextInt();
		
		/* 
		 * Declare and instantiate (create) an array of student objects.
		 * 
		 * -> Notice you didn't have to import the Student class into this code because it's in the same package.
		 */
		Student[] studentList = new Student[numOfStudents];
		
		/* 
		 * User input the number of grades for each student.
		 */
		System.out.println("How many grades do you have per student?");
		int numOfGrades = sc.nextInt();
		sc.nextLine();
		
		/* 
		 * Capture information about student and all their grades.
		 */
		for (int i = 0; i < studentList.length; i++) {
			// for each student, create an array to hold all their grades.
			int[] grades = new int[numOfGrades];
			
			// User input full student name.
			System.out.print("\nStudent # " + (i+1) + " -> Enter Student's Full Name: ");
			fullName = sc.nextLine();
			
			// User inputs all grades for this student
			for (int j = 0; j < grades.length; j++) {
				System.out.print("Grade # " + (j+1) + " -> Enter a grade: ");
				grades[j] = sc.nextInt();
			}
			
			/* 
			 * Instantiate (create) Student object from information gathered and add to student array.
			 * Another way to say this is an object is an instance of the Student class.
			 */
			studentList[i] = new Student(fullName, grades);
			
			sc.nextLine();
		}
		
		System.out.println("\n\n"+lineVariable+"\n " + courseName + " Grade Book \n"+lineVariable); 
		for (Student student : studentList) { 
			
			/*
			 * Calling the describe() method of the Student class for this student instance.
			 */
			student.describe(); 
		}
		
		System.out.println(lineVariable+"\n");
		
		sc.close();
	}

}