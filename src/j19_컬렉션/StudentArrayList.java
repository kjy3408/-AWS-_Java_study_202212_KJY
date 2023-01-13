package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {

	
	public static void updateYear(List<Student> students, String searchName, int newYear) {
		for(Student student : students) {
			if(student.getName().equals(searchName)) {
				student.setYear(newYear);
				return;
			}
		}
		
		System.out.println("검색 실패");
	}
	
	
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(); //student 객체(인스턴스)를 담는 List
		students.add(new Student("김종환", 1));
		students.add(new Student("고병수", 2));
		students.add(new Student("손민재", 3));
		students.add(new Student("황창욱", 4));
		
		System.out.println(students);
		
				
		
		
		

		
//		for(Student student : students) {			
//			if(student.getName().equals(searchName)) {
//				student.setYear(4);		
//				System.out.println(student);
//
//			}else {
//				System.out.println("검색실패");				
//			}
//		}
		
		
			
//
//		for(Student student : students){
//			while(true) {
//				
//				boolean findFlag = true;
//								
//				if(!(student.getName().equals(searchName))) {
//					findFlag = false;
//					System.out.println("검색실패");
//					break;
//				}
//			if(findFlag) {
//				student.setYear(4);
//			}
//			}
//		System.out.println(student);}
		
		
		
		
		//for문돌림 이 리스트 안에서 searchName을 찾아서 year을 4학년으로 바꿔라
		//만약 searchName 동일한 이름이 없으면 "검색실패" 메세지 출력

		
		String searchName = "손민재";
		
		
		
		boolean flag = true;//마지막 if문 조건에 사용
		for(int i = 0; i< students.size(); i++) {
			Student student = students.get(i); //list에서 i번째있는 데이터 하나 꺼냄 (forEach문 사용시 사용안해도됨)
			if(student.getName().equals(searchName)) {//꺼낸학생의 이름과 searchName과 이름 비교
				student.setYear(4);//같으면 4학년으로 바꿔주고
				flag = false;//검색실패 if문 조건 false로 바꿔줌
				break;		//멈춤.
			}
		}
		
		
		for(Student student : students) {
			if(student.getName().equals(searchName)) {//꺼낸학생의 이름과 searchName과 이름 비교
				student.setYear(4);//같으면 4학년으로 바꿔주고
				flag = false;//검색실패 if문 조건 false로 바꿔줌
				System.out.println(students);
				break;		//멈춤.
			}
		}
		
		
		if(flag) {
			System.out.println("검색 실패!!");
		}

		
		
		updateYear(students, searchName, 4);
		
		
	}
	
}
