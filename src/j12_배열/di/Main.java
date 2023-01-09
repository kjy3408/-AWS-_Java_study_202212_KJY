package j12_배열.di;

public class Main {
//객체 주입은 항상 외부에서 일어나야한다.
	public static void main(String[] args) {
		Test_C tc = new Test_C();	//학생 : 학생을 관리하고 싶을땐 tc를 넣어주면됨
		Test_C tc2 = new Test_C();	//선생 : 선생을 관리하고 싶을땐 tc2를 넣어주면됨
		
		
		Test_B tb = new Test_B(tc);//의존도가 낮을려면 이렇게 메인에서 자체적으로 존재할 수 있어야한다.
		
		Test_A ta = new Test_A(tb);//의존성을 주입한다. !!!!!(di)중요!!!!
		
		//현재 final로 선언해서 setter사용불가
//		ta.setTb(tb); //set호출해서 객체 tb를 넣음. (부품을 갈아끼우고 싶을때 사용)
		
		ta.testA1();
		ta.testA2();
		
	
		
		//B를 A에 줄수 있는 방법 : 생성자 매개변수로 줄 수있는 방법
		//Setter 사용
		
		
		
	}
	
}
