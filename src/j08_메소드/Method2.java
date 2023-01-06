package j08_메소드;

public class Method2 {

	// 매개변수 : X , 반환 : X
		public static void method1() {
			System.out.println("단순 실행");
			System.out.println();
		}
		
	// 매개변수 : int 하나입력 , 반환 : X
		public static void method2(int num) {
			System.out.println("num : " + num ); //int num => 지역변수
			System.out.println();
		}
	
	// 매개변수 : int 두개입력, 반환 : X
		public static void method3(int num, int num2) {
			System.out.println("num: " + num);
			System.out.println("num2: " + num2);
			System.out.println();
		}
		
		public static String method4() {
			return "데이터 반환"; //반환은 하나만 가능. (여러개를 보내고 싶다면 배열이나 list 사용해서 묶어서 보내줘야함)
		}
		
		public static String method5(int age) { //String메소드인데 매개변수를 int로 받음
			return age + "살";
		}	
	
	public static void main(String[] args) {
		String ageStr = "30살";
		

		// 메소드는 함수라고 부른다.
		// void : 반환(return)이 없다. (void는 공허라는 뜻)
		//class는 컴파일 과정에서 먼저 정의된 메소드가 있으면 정의한게 1순위 그다음 main메소드가 2순위
		//호출했다고 해서 메소드 내부의 변수를 사용할 수 없는게 아니다. (method) 정의부와 (main)실행부는 완전히 다른 지역이라 사용가능 하다.
		//Class안에 있는 함수는 무조건 Method다 Class밖에 있는 함수를 함수(function)라고 부른다.
		
		method1(); //=> 함수 호출이라고 한다.
		method2(100); // 메소드명(매개변수);
		method3(200, 300);

		System.out.println(method4()); //return값이 있을 때 sysout해줘야함(출력 호출해서 바로 데이터 반환 받음)
		System.out.println();
		
		String data1 = method4(); // method4 자체가 String 값이다./ method4를 data1로 넣어 data1을 출력
		System.out.println(data1);
		System.out.println();
		
		System.out.println(method5(30)); //30살 출력 (매개변수는 메소드타입의 영향을 받지 않는다)
		System.out.println();
	
		
	
	}
	//호이스팅?? =>????
//	// 매개변수 : X , 반환 : X
//		public static void method1() {
//			System.out.println("단순 실행");
//	}
}
