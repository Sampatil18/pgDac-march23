package cdac.in.compare;
import java.util.Comparator;

import cdac.in.main.test.Student;

public class mathScoreComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o2.getMathScore() - o1.getMathScore();
	}

}
