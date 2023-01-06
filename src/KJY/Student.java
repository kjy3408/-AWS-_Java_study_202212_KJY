package KJY;

public class Student {

	private String name;
	private String age;
	private double score;
	private String grade;
	
	
	public Student(String name, String age, double score, String grade) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.grade = grade;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}




}
