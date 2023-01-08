package KJY_학점출력시스템;

public class StudentMain {

	public static void main(String[] args) {

		
		StudentService sv = new StudentService();
		
		sv.run();
		sv.stop();
		
	}
	
}
