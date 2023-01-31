package j24_람다;

import com.mysql.cj.jdbc.SuspendableXAConnection;

@FunctionalInterface //함수형인터페이스 : 람다용 interface이다. 라고 명시하면서 추상메소드를 하나만 만들 수 있게 해줌.
public interface Instrument {
	
	public String play(String instrument);
	
	public default void testPrint() { //default method는 몇개고 상관없다.
		System.out.println("테스트");
	}
		
}
