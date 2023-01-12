package j17_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		//static으로 선언한 메소드는 객체를 생성하지 않고도 호출할 수 있다.
		//static은 데이터를 공유한다.(static으로 만든 num변수는 객체A,B,C,D 전부 데이터를 공유한다.)=> new생성과는 상관없으니 class명으로 호출가능.
		//스테닉은 폰트가 약간 누워있다.
		System.out.println(Student.getAutoIncrement());

		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];
		
		
		
		students[0] = new Student("이현수");
		students[1] = new Student("김재영");
		students[2] = new Student("이상현");
		students[3] = new Student("박성진");
		students[4] = new Student("윤선영");
		
		teachers[0] = new Teacher("김준일1");
		teachers[1] = new Teacher("김준일2");
		teachers[2] = new Teacher("김준일3");
		teachers[3] = new Teacher("김준일4");
		teachers[4] = new Teacher("김준일5");
		
		
		
		//toString은 객체를 호출할때 생략가능!! 하지만  String 타입으로 넣을 땐 . toString()해줘야함
//		Student s = new Student("김준일");
//		
//		String a = s.toString();
//		
//		System.out.println(a);
	
		
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			System.out.println(teachers[i]);
			
		}
				
		System.out.println(Student.getAutoIncrement());

		int j = 0;
		for(Student s1 : students) {//fior ~ each문은 배열이외에 쓸일없다.(index번호를 참조해야할 땐 쓸 수 없다.)
			System.out.println(s1);
			System.out.println(teachers[j]);
			j++;
		}
			

		
		
		
	}
}
