package J11_접근지정자;

import J11_접근지정자.default1.J11_StudentDefault; //다른패키지의 클래스를 끌어올때 import(수입)해야한다.
//불러오는 class가 public이 아니라면 가져올 수 없다.

public class J11_StudentMain {

	public static void main(String[] args) {
		
		J11_Student s1 = new J11_Student("김준일", 30);
		
		
		s1.printInfo();//메소드는 은행원 
		
		J11_StudentDefault s2 = new J11_StudentDefault();
		
//		s2.name = "김준이"; //외부에서 멤버변수에 직접 값을 넣음(금고에 직접 들어감)
		
//		System.out.println("이름: " + s2.name);//main이라는 고객이 s2(금고)에 있는 name(돈)을 알아서 꺼내쓰고있다.
		System.out.println("이름: " + s2.getName());//getName()(은행원)에게 s2.name(금고에 있는 돈)을 꺼내 줌.
		//내부 정보는 항상 메소드를 통해서만 가지고 와야한다.
		
		s1.setAge(365);

		s1.printInfo();
		System.out.println("===== Getter / Setter 사용하여 멤버변수 값 변경====");
	}

}
