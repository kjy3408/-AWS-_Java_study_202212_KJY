package j02_변수;

public class Variable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 20;
		age = 30; //값 변경
		System.out.println(age);
		
		final int AGE = 40;
//		AGE=30; 
		//상수 : 자료형 앞에 final이 붙는다.
		//AGE를 상수로 선언했기에 값 변경 불가
		System.out.println(AGE);
		
		final int NOW_AGE2; //단순 선언
		NOW_AGE2 = 10; //상수일 때 단 한번의 초기화는 허용한다.
		//상수는 무조건 초기화를 해야한다.
		//두 단어가 붙을 땐 스네이크표기법 사용(언더바를 사용한다.)
		System.out.println(NOW_AGE2);
		
	}

}
