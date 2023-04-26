package cdac.in.compare;
import java.util.Comparator;

import cdac.in.main.test.Student;

public class averageScoreComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	
		return (int) (o2.getAverageScore()-o1.getAverageScore());
	}

}
