package j12_배열.di;

public class Test_A {

//	Test_B tb = new Test_B(); //Main에 아무것도 적혀있지않다면 Test_A를 쓰지도 않았는데 Test_B가 생성되게 되버림.
//	private Test_B tb;//사용 방법 맞음 final예시 때문에 주석처리함.
	private final Test_B tb; //중간에 setter을 통해서 값이 바뀌면 안되는 경우엔 final을 걸어준다.
	
//	public Test_A(Test_b tb) {		//이렇게 하면 Test_A를 생성하면 Test_B도 동시에 생성되지만 의존관계!! (의존성이 높다 = 결합도가 높다)
//		tb =new Test_B();
//	}
	
	public Test_A(Test_B tb) { //생성자에 매개변수로 주는 방법 (얘가 없으면 NullPointException 에러뜸)
		this.tb = tb; //final키워드라도 생성자는 단 한번만 생성하기때문에 사용가능.
	}//argument => 인자값,매개변수
	//NoArgumen => 기본생성자
	//필수생성자, 기본생성자(NO), 전체생성자(All)
//	public void setTb(Test_B tb) {//Setter 사용. => final 사용시 사용불가.
//		this.tb = tb;
//	}
	
	//B를 A에 줄수 있는 방법 : 생성자 매개변수로 줄 수있는 방법
	//Setter 사용
			
	
	
	
	
	public void testA1() {
		System.out.println("testA1 메소드 호출");
//		Test_B tb = new Test_B();  이렇게되면 쓸데없이 tb가 2개 생성되니 전역으로 빼버림.

		tb.testB1();
	}
	
	public void testA2() {
		System.out.println("testA2 메소드 호출");
//		Test_B tb = new Test_B();
		
		tb.testB1();		
	}
	
}
