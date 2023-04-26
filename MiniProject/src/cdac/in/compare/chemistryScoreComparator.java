package cdac.in.compare;
import java.util.Comparator;
import cdac.in.main.test.*;

public class chemistryScoreComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o2.getChemistryScore() - o1.getChemistryScore();
	}

}
