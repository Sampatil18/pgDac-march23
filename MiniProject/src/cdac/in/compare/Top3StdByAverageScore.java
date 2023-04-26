package cdac.in.compare;
import java.util.Comparator;

import cdac.in.main.test.Student;

public class Top3StdByAverageScore implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getAverageScore() > s2.getAverageScore()) {
			return -1;
		} else if (s1.getAverageScore() < s2.getAverageScore()) {
			return 1;
		} else {
			return 0;
		}
	}
}