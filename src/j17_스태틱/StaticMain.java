package j17_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		//static으로 선언한 메소드는 객체를 생성하지 않고도 호출할 수 있다.
		//static은 데이터를 공유한다.(static으로 만든 num변수는 객체A,B,C,D 전부 데이터를 공유한다.)=> new생성과는 상관없다.
		System.out.println("출력1: " + TestA.getNum());
		System.out.println();
		
		
		TestA.setNum(100);
		System.out.println("출력2: " + TestA.getNum());
		
		
		
	}
	
}
