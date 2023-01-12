package J15_인터페이스;

public class Main {
//뭔가 계산이 이루어질땐 int 보단 double로 계산을 해서 소수점까지 계산을 하자.
	public static void main(String[] args) {
		//==============================================================
		Equipment[] equipments = new Equipment[2];
	
	
		equipments[0] = new GeneralCalculator(); //Equipment / Calculator
		equipments[1] = new SmartPhone(); //Equipment
	
		
//		Calculator calculator = new Computer(); //Calculator 구현
		
		//==============================================================
		System.out.println("모든 장비 전원 켜기");
		
		for(Equipment eq : equipments) {
			eq.powerOn();
		}
		System.out.println();
	
		//==============================================================
		System.out.println("모든 장비에서 10과 20을 더하기");
		
		System.out.println();
		
		for(Equipment eq : equipments) {
			Calculator c = (Calculator) eq; //eq는 GeneralCalculator과  SmartPhone이 들어가있기에 바로 다운캐스팅 가능.
			double result = c.plus(10, 20);
			System.out.println("결과ㄹㄹㄹㄹ: " + result);
	
		}
		
		System.out.println();
		
		//==============================================================
		System.out.println("모든 장비 10과 0을 나누기");

		System.out.println();
		
		for(Equipment eq : equipments) {
			Calculator c = (Calculator) eq; //eq는 GeneralCalculator과  SmartPhone이 들어가있기에 바로 다운캐스팅 가능.
			double result = c.division(10, 0);
			System.out.println("결과: " + result);
		}
		
		System.out.println();
		
		//==============================================================
		System.out.println("모든 장비 전원 끄기");
	
		for(Equipment eq : equipments) {
			eq.powerOff();
		}
		System.out.println();

	
	}

}
