package J14_추상;

public class Main {

	public static void main(String[] args) {

		// Transportation t = new Transportation(); => 추상클래스는 생성할 수 없다.
		
		Transportation transportation = new Taxi(); //transportation클래스는 무조건 상속시켜 Casting해야한다.
		
		Airplane airplane = new Airplane();
		
		
		
	}
}
