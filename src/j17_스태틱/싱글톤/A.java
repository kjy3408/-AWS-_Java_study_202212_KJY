package j17_스태틱.싱글톤;

public class A {
	
	
	//====================싱글톤===============================
	private static A instance = null;

	private Student[] students;
	
	private A() {
		students = new Student[3];
	}
	
	public static A getInstance() {
		if(instance == null) {
			instance = new A();
			
		}
		return instance;
	}
	
	public void aba() {
		System.out.println(getClass().getSimpleName());
	}
	
	//===================================================
	
	public void addStudent(Student student) {
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null){
				students[i] = student;
				return;		//break;를 넣으면 반복문만 멈춰서 아래 출력문이 실행되버림.(return => void 메소드 자체를 멈추게된다.(메소드를 빠져나갈때 사용))
			}
		}
		
		System.out.println("더 이상 학생을 추가할 수 없습니다.");
		System.out.println();
	}
	
	public void showStudents() {
		for(Student student : students) {
			System.out.println(student);
//			System.out.println(student.toString()); 에러발생 => null.toString() 되버림.
		}
		System.out.println();
		
	}
		
}
