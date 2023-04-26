package cdac.in.main;

import cdac.in.compare.*;
import cdac.in.main.test.*;
import java.util.Comparator;

public class StudentReportCardManagement {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Test test = new Test();
		System.out.println("WELCOME TO NEW HIGHSCHOOL, MUMBAI");
		System.out.println();
		test.password();

		int choice;
		while ((choice = test.menuList()) != 0) {
			switch (choice) {
			case 1:
				test.addStudents();
				break;

			case 2:
				test.removeStudent();
				break;

			case 3:
				test.searchStudentById();
				break;

			case 4:
				test.viewTop3Students();
				break;

			case 5:
				test.viewAllStudents();
				break;

			case 6:
				Comparator<Student> comparator = null;
				while ((choice = test.subMenuList()) != 0) {
					switch (choice) {
					case 1:
						comparator = new IdComparator();
						break;
					case 2:
						comparator = new studentNameComparator();
						break;
					case 3:
						comparator = new mathScoreComparator();
						break;
					case 4:
						comparator = new physicsScoreComparator();
						break;
					case 5:
						comparator = new chemistryScoreComparator();
						break;

					case 6:
						comparator = new averageScoreComparator();
						break;

					default:
						System.out.println("<<---Invalid option selected!--->>");
						break;
					}
					test.printBooks(comparator);
				}
				break;

			default:
				System.out.println("<<---Invalid option selected!--->>");
				break;
			}
		}
	}
}