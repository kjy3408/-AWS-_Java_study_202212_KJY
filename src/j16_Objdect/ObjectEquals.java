package j16_Objdect;
//==, eqlaus, hashcode Student class에 있는 오버라이드 다 주석처리하고 비교해보기
public class ObjectEquals {

	public static void main(String[] args) {
		String name1 = "김준일"; 
		String name2 = "김준일";	
		//String은 String class이다.
		String name3 = new String("김준일"); //String은 원래 이런모습임 
		
		System.out.println(name1); 
		System.out.println(name2);
		
		System.out.println("n1 == n2: " + (name1 == name2));//주소비교 (문자열 비교 아님) true
		System.out.println("n1 == n3: " + (name1 == name3)); //당연히 false (주소가 다르다)
		System.out.println("n1.eqausl(n3): " + (name1.equals(name3)));//문자열 비교(값 비교) true
		System.out.println(name1.equals(name3));
		///////////////////////////////////////////////////////////////////
		System.out.println("=====================================");
		Student s = new Student("박은빈", 24);
		Student s1 = new Student("박은빈", 24);//s1값과 s2값은 (주소는 다르지만 문자열은 같다 하지만 equals로 비교해보면 false가 나온다. 즉, Student class에서 equals를 오버라이딩하여 맞춰줘야한다.)
		Student s2 = new Student("박은빈", 24);
		SubStudent s3 = new SubStudent("박은빈", 24);
		
		System.out.println(s == s1); //false
		System.out.println("s1 equals s2 : " + s1.equals(s2));//false => Object class로 s2가 upCasting되서 들어간것임. // Student class에 equals오버라이딩 해줌 그제서야 true나옴
		
		System.out.println("s1 equals s2 : " + s1.equals(s2)); //같은객체 . 같은 값 . 다른 주소 (문자열비교)
		System.out.println("s1 equals s3 : " + s1.equals(s3)); //다른객체 . 같은 값 . 다른 주소 (문자열비교)  다른객체니까 무조건 다름..?;
		
		
		
//		System.out.println(s1.equals(null)); //NullPointerException (null을 참조함..이라는 에러)
		//그러니 null이 들어갔을 때의 조건도 Student class에 작성해줘야한다
		
		
		
	
	}
}
