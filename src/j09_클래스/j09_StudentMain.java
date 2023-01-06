package j09_클래스;

public class j09_StudentMain { //실행 클래스임 (Ex)
	
	public static void main(String[] args) {
//		int a;
		
//		System.out.println(a); => stack영역에 자동할당 되지 않아서 초기화를 해줘야 메모리 할당됨.
		
		
	
		
		J09_Student student1 = new J09_Student();
		J09_Student student2 = new J09_Student();
		
		new J09_Student(); //생성자 호출
		
//		s1 = new J09_Student(); //생성자는 어떠한 자료형에도 넣지못함 오로지 클래스에만 넣을 수 있음
		J09_Student s1 = new J09_Student();
		J09_Student s2 = new J09_Student();
		
		s1.name = "김준일"; // => J09_Student속에 있는 데이터들을 호출할 수 있음
		s1.age = 30;
		
		s1.printInfo(); //값이 들어가있음
		s2.printInfo(); //값이 없음
		
		
		
		
	//	자료형       변수명  = new 생성자();
	// J09_Student : class를 담을 수 있는 자료형
		//new가 오기전엔 null;값 상태이다(null은 메모리가 0번지 주소이다. 아무런 데이터가 존재하지않음 비워둠)
		//new와 생성자가 오면 동적 메모리 할당됨.(hip)
		
		
		//메모리엔 stack과 heap 두가지 공간이 있다.
		/*
		 * stack{=> 정적 메모리 /주어진대로 정해진대로 써야됨 (절대적인 메모리 영역?)
		 * 프로그램 실행 시 정적 메모리(steak)에 올라감
		 * 컴파일 시점에 메모리 할당됨.(변수, 
		 * 변수 선언까지가 스택영역에 메모리주소 100번지 200번지 할당됨
		 * 변수 선언하면 해당 변수의 크기만큼 스택영역 메모리 할당됨
		 * stack영역은 자동으로 할당이 안됨 그래서 초기화 해줘야됨. (메소드 안에선 초기화 해야함.)
		 * }
		 * 
		 * heap{=> 동적 메모리 / 유동적 원하는대로 씀 다쓰면 돌려줘야됨(가비지 컬렉터가 알아서 돌려줌) [객체]
		 * 동적 메모리 할당 => 메모리를 빌리는 행위(생성)
		 * new 키워드를 사용하면 동적메모리에서 메모리를 빌림
		 * 힙영역의 메모리 주소를 모르기에 스택영역의 메모리주소에 넣어줄것이고 스택영역의 주소를 모르기에 우리가 정한 변수명에 해당 주소를 대입해주는것이다.
		 * student1 . <= " . " 점 찍는 행위를 참조라고 한다.
		 * class의 name, age, printInfo() 만큼의 메모리 똑같이 할당돼있으나 주소는 다름 => 그 해당 각각의 주소를 스택영역의 student1과 student2에 각각 담아줌 
		 * new 키워드 사용하면 힙영역에서 메모리 끌어옴
		 * heap영역은 생성과정에서 할당된게 없다면 자동으로 기본값을 넣어줌.
		 * }
		 */
		
		System.out.println(new J09_Student()); //생성자가 호출이되고 출력 후 메모리 할당 받았으니 주소를 값으로 가지고 있음. / 주소를 외울 수 없으니 어떠한 변수에 넣는다.
		System.out.println(student2);
		
		
		

		
		
	}
}
