package j06_조건;

public class Conditional1 {

	public static void main(String[] args) {
	
		int num = 10;
		int num2 = 10;
	
		
		
		//가장 간단한 방법인데 비용처리가 큼
		if(num > num2) System.out.println("num이 num2보다 큽니다.");
		if(num == num2) System.out.println("num이 num2와 같습니다.");
		if(num < num2) System.out.println("num이 num2보다 작습니다.");
		
		//비용처리를 줄이는 코드 => 조건검사는 최대한 줄여야한다.
		if(num > num2) System.out.println("num이 num2보다 큽니다.");  //if(조건절) 뒤에는 (명령절)들어올 수 있음.
		else	if(num == num2) System.out.println("num이 num2와 같습니다.");
	//			else(num < num2) System.out.println("num이 num2보다 작습니다.");
		
	
		if(num > num2) {//중괄호로 묶어줘야 여러 명령절을 넣을 수 있음.
			System.out.println("num이 num2보다 큽니다."); 
			System.out.println("num이 num2보다 큽니다."); 
		}else {
			if(num == num2) {
				System.out.println("num이 num2와 같습니다.");
		//	}else(num < num2) {
				System.out.println("num이 num2보다 작습니다.");
			}
		}	
		
	
		
		if(num > num2) { //if~ else 문
			System.out.println("num이 num2보다 큽니다."); 
			System.out.println("num이 num2보다 큽니다."); 
		}else if(num == num2) {
				System.out.println("num이 num2와 같습니다.");
	//	}else(num < num2) {
				System.out.println("num이 num2보다 작습니다.");
		}
	

		
		
		
		
		
		
	}//

}//
