package j24_람다;

import java.util.function.Consumer;

public class Lambda1 {

	public static void main(String[] args) {

		//class 정의 + 객체생성	 =>  익명구현객체
		Instrument instrument = new Instrument() {				
			
			@Override
			public String play(String instrument) {
				
				return instrument + "를 연주합니다.";
			}
		};
				
		//정의와 생성을 함 (실행X) 호출 해줘야함.(Instrument interface속에 있는 play라는 메소드를 호출해줘야함)
		//람다 : 메소드가 주체. (하나의 interface안에 두개의 메소드가 있으면 사용불가. "추상메소드가 한개인 interface만 사용가능)
		Instrument instrument2 = (String itm) -> { //변수선언 = (매개변수) -> {...};
			return itm + "를연주합니다.";
		};
		
		//=============매개변수===============//
		
		//매개변수의 자료형을 생략할 수 있다, 매개변수의 이름을 바꿀 수 있다.
		Instrument instrument3 = (it) -> { 
			return it + "를연주합니다.";
		};

		//매개변수가 "오직 하나"일때만 괄호를 생략할 수 있다.
		Instrument instrument4 = it -> { 
			return it + "를연주합니다.";
		};
		
		//==============구현부===============//
		
		//return  + 중괄호 생략(중괄호 생략은 return도 생략)
		//구현부의 "명령이 하나일 때 중괄호를 생략"할 수 있다. 이때 return자료형이 정해져있으면 리턴값으로 사용이 된다.
		Instrument instrument5 = it -> it + "를연주합니다.";
		//return 자료형이 void일땐 그냥 sysout할수있음.
		
		//외부의 지역변수를 람다 구현부에서 사용가능.
		int result = 10 + 20;
		Instrument instrument6 = it -> it + "를연주합니다." + result;

		
		
		
		System.out.println(instrument2.play("람다피아노"));
		
		String playTexst = instrument.play("피아노");
		System.out.println(playTexst);
		
		System.out.println(instrument6.play("기타"));
		
		
		
		/*
		 * interface속에 "추상메소드"가 "오직 하나"일때 사용가능.
		 * 
		 * */
	}
}
