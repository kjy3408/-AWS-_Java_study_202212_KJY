package KJY_학점출력시스템;

public class Student {

	private String name;
	private int score;
	
	
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "입력하신 성함 : " + name + ", "+ "입력하신 점수 : " + score + "\n";
	}
	
}
