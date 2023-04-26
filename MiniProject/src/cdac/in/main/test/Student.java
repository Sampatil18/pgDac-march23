package cdac.in.main.test;
import java.util.Comparator;

public class Student implements Comparator<Student> {
	private int id;
	private String name;
	private int mathScore;
	private int physicsScore;
	private int chemistryScore;
	private double averageScore;

	public Student() {

	}

	public Student(int id, String name, int mathScore, int physicsScore, int chemistryScore) {
		super();
		this.id = id;
		this.name = name;
		this.mathScore = mathScore;
		this.physicsScore = physicsScore;
		this.chemistryScore = chemistryScore;
		this.averageScore = (mathScore + physicsScore + chemistryScore) / 3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getPhysicsScore() {
		return physicsScore;
	}

	public void setPhysicsScore(int physicsScore) {
		this.physicsScore = physicsScore;
	}

	public int getChemistryScore() {
		return chemistryScore;
	}

	public void setChemistryScore(int chemistryScore) {
		this.chemistryScore = chemistryScore;
	}

	public double getAverageScore() {
		return averageScore;
	}

	@Override
	public String toString() {
		return String.format("%-5d%-25s%-10d%-10d%-10d%-8.2f", this.id, this.name, this.mathScore, this.physicsScore,
				this.chemistryScore, this.averageScore);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id-o2.id;
	}
}