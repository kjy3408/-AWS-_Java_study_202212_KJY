package j17_스태틱;
	
public class Student {
	
	private static final int CODE = 20230000;
	private static int ai = 1; //auto_increment
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}
	
	public static int getAutoIncrement() {//static method 안에서는 static 변수만 쓸수있다. 하지만 "지역 변수"는 가능하다!
		System.out.println("현재 AI: " + ai);
//		System.out.println("학생이름: " + name); 생성하지 않고도 쓸수있는 static method에 생성후에만 쓸수있는 변수name이 들어있으니 에러가 난다.
		
		return ai;
	}
	
	@Override
	public String toString() {
		return "Student [학번 : " + studentCode + ", 이름 : " + name + "]";
	}
	
	
}	
