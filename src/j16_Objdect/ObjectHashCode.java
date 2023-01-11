package j16_Objdect;

public class ObjectHashCode {
//해쉬코드의 쓰임새를 기억하고 어떻게 사용하는지도 기억하자. (해쉬코드는 데이터를 수치화하여 비교하기에 데이터만 같으면 true가 나온다.)
	public static void main(String[] args) {
		
		Student s1 = new Student("김똥개", 31);
		Student s2 = new Student("김똥개", 31);
		
		SubStudent s3 = new SubStudent("김똥개", 31);
		
	
		
		System.out.println(s1.hashCode()); //출력 시 주소값 나옴.(HashCode : 10진수)
		System.out.println(s2.hashCode());
	
		
		String a = "안녕하세요";
		System.out.println("a를 hacode로 변환" + a.hashCode());
		
	//equals을 쓸때도있고 hashCode를 쓸데도 있다
		
		
		System.out.println(s1.hashCode() == s2.hashCode()); //hasCode가 같으면 값이 같다.
		System.out.println(s1.hashCode() == s3.hashCode()); //hasCode가 같으면 값이 같다. (객체가 달라도 값만 같아도 true가 나온다)
		
		//hashCode => 어쨋든 값만 같으면 같다!
		
		

	}
}
