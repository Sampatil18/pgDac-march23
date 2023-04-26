package cdac.in.main.test;

import java.util.Scanner;
import cdac.in.compare.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	private static Scanner scanner = new Scanner(System.in);
	List<Student> studentList = new ArrayList<>();
	
	public static int menuList() {
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("STUDENT REPORT CARD MANAGEMENT SYSTEM");
		System.out.println("--------------------------------------");
		System.out.println("1. Add a Student");
		System.out.println("2. Remove a Student");
		System.out.println("3. Search Student by ID");
		System.out.println("4. View top 3 Students");
		System.out.println("5. View all Students");
		System.out.println("6. Sort Students");
		System.out.println("0. LogOut");
		System.out.println("--------------------------------------");
		System.out.println("Enter choice	:	");
		return scanner.nextInt();
	}

	public static int subMenuList() {
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("1.Compare By Student ID");
		System.out.println("2.Compare By Student Name");
		System.out.println("3.Compare By Math Score");
		System.out.println("4.Compare By Physics Score");
		System.out.println("5.Compare By Chemistry Score");
		System.out.println("6.Compare By Averege Score");
		System.out.println("0.Go back to MenuList");
		System.out.println("--------------------------------------");
		System.out.print("Enter choice	:	");
		return scanner.nextInt();
	}

	public void password() {

		//Set the id
		String userId = "malkeetsingh";

		System.out.println("Enter User ID:");
		String inputId = scanner.nextLine();

		if (inputId == userId) {System.out.println("Access granted!");}
			while (!inputId.equals(userId)) {
			System.out.println("Access denied! Please try again.");
			System.out.println("Enter the User ID again:");
			inputId = scanner.nextLine();}
		
	
		// Set the password
		String password = "malkeet.net";

		System.out.println("Enter the password:");
		String inputPassword = scanner.nextLine();

		// Compare the passwords
		while (!inputPassword.equals(password)) {
			System.out.println("Access denied! Please try again.");
			System.out.println("Enter the password again:");
			inputPassword = scanner.nextLine();
		}

		System.out.println("Access granted!");
	}

	public void addStudents() {
		System.out.println("Enter student ID : ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter student name : ");
		String name = scanner.nextLine();
		System.out.println("Enter Math Score:");
		int mathScore = scanner.nextInt();
		System.out.println("Enter Physics Score:");
		int physicsScore = scanner.nextInt();
		System.out.println("Enter Chemistry Score:");
		int chemistryScore = scanner.nextInt();

		Student student = new Student(id, name, mathScore, physicsScore, chemistryScore);
		studentList.add(new Student(123, "Sammed Patil", 95, 85, 75));
		studentList.add(new Student(234, "Roshan Wagh", 65, 88, 85));
		studentList.add(new Student(356, "Rugved nagare", 75, 80, 72));
		studentList.add(new Student(456, "Sagar Wagh", 70, 81, 79));
		studentList.add(new Student(678, "Sana Desai", 99, 89, 77));
		studentList.add(new Student(899, "Ruchika Gaidhani", 85, 78, 97));
		studentList.add(new Student(888, "Rutuja Khot", 88, 68, 87));
		studentList.add(new Student(899, "Sanjyot Belote", 78, 89, 92));
		studentList.add(new Student(555, "Samruddhi Ghodgavkar", 82, 6, 87));
		studentList.add(new Student(999, "Sampanna Kandale", 80, 69,88));
		
		studentList.add(student);

		System.out.println("Student added successfully!");
	}

	public void removeStudent() {
		System.out.println("Enter student ID:");
		int removeId = scanner.nextInt();
		boolean removed = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == removeId) {
				studentList.remove(i);
				System.out.println("Student removed successfully!");
				viewAllStudents();
				removed = true;
				break;
			}
		}
		if (!removed) {
			System.out.println("Student not found!");
		}
	}

	public void viewAllStudents() {
		System.out.println("All students:");
		System.out.printf("ID   NAME                    MATHS     PHYSICS   CHEM      AVERAGE   ");
		System.out.println();
		for (Student s : studentList) {
			System.out.println(s);
			System.out.println();
		}
	}

	public void viewTop3Students() {
		Collections.sort(studentList, new Top3StdByAverageScore());
		System.out.println("Top 3 students:");
		int count = 0;
		System.out.printf("ID   NAME                    MATHS     PHYSICS   CHEM      AVERAGE   ");
		System.out.println();
		for (Student s : studentList) {
			System.out.println(s);
			count++;
			if (count == 3) {
				break;
			}
		}
	}

	public void searchStudentById() {
		System.out.println("Enter student ID:");
		int searchId = scanner.nextInt();
		boolean found = false;
		System.out.printf("ID   NAME                    MATHS     PHYSICS   CHEM      AVERAGE   ");
		System.out.println();
		for (Student s : studentList) {
			if (s.getId() == searchId) {
				System.out.println(s);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Student not found!");
		}

	}

	public void printBooks(Comparator<Student> comparator) {
		this.studentList.sort(comparator);
		this.studentList.forEach(System.out::println); //java8's foreach method similar to below foreach 
		
		/*for (int i = 0; i < studentList.size(); i++) {
		    System.out.println(studentList.get(i)); 
		}*/
	}

}




