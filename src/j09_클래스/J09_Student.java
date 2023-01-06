package j09_클래스;

public class J09_Student {//이름 이런식으로 지으면안됨(import 할때 편할려고 적어놓은거임)
//클래스는 변수와 메소드로 이루어져있다./ 클래스는 자료형이다.
	
	String name; //담을 수 있는 그릇만 만들어 놓은 상태
	int age;
	
	
	//기본생성자
	J09_Student() {
		System.out.println("생성됨!");
	}
	
	void printInfo() { //안에있는 값들을 출력해주는 용도.
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	
	
	}
	
	
}
