package KJY_학점출력시스템;

import java.util.Arrays;

public class StudentRepository {

	Student[] student;
	
	public StudentRepository(Student[] ss) {
		this.student = ss;
	}
	
	public Student[] getStudent() {
		return student;
	}
	
	//addArray() 호출. //값저장
	public void saveStudent(Student s1) {
		addArray();
		//int[0] = {5}; 얘랑같은형태임
		student[student.length -1] = s1; //index는 0부터 시작하기에 -1 을 안해주면 index 0번이 날아감.
	
	}
	
	//얘랑 addArray랑 같은놈임
	private Student[] extendArray(int length) {
		Student[] newArray = new Student[student.length + length]; 
		transferArray(student, newArray);
		return newArray;
	}
	
	//배열 길이를 하나 늘림. oldArray[1] = {5}  / newArray[oldArray.length + 1] = {"",""}; newArray를 넣게되면 5가 사라짐...
	private void addArray() {
		Student[] newArray = new Student[student.length + 1];//newArray의 배열크기를 oldArray보다 1크게함. 추가적으로 값이 계속 들어가야하기에.
		transferArray(student, newArray);
		student = newArray; // oldArray에 newArray값을 넣음.
	}
	
	//oldArray 에 newArray값을 넣음
	private void transferArray(Student[] oldArray, Student[] newArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}

	
	@Override //Student의 toString을 가져옴
	public String toString() {
		return Arrays.toString(student);
	}
	
	
	
	
	
}
