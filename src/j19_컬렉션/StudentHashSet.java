package j19_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSet {

	private static Student searchStudent(Set<Student> students, String searchName) {
		Student student = null;
		
		for(Student s : students) {
			if(s.getName().equals(searchName)) {
				student = s;
				break;
			}
		}
		return student;
	}
	
	public static void main(String[] args) {
		
		Set<Student> students = new HashSet<>(); //set도 객체로 들어갈 수 있다. (제네릭 타입이 객체인경우)
		
		students.add(new Student("이현수", 26));
		students.add(new Student("정의현", 24));
		students.add(new Student("김수현", 31));
		students.add(new Student("이종현", 32));
	
		System.out.println(students);
	
		String searchName = "이현수";
		
		Student student = searchStudent(students, searchName);
		
		if(student == null) {
			System.out.println("검색실패");
		}else {
			System.out.println("검색성공: " + student);
		}
	
	}//
	
}//
