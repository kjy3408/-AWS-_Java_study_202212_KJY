package j04_연산자;

public class Operation5 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int result = num1 > num2 ? num1 * -1 : num2 * -1;
	//	int result = 조건식 ? 참 : 거짓
		
		System.out.println(result);
	
		int num = 79;
		
		//줄바꿈은 연산자 앞에서 바꾼다
		int result2 = num / 90 == 1 ? 90 
				: num / 80 == 1 ? 80 
				: num / 70 == 1 ? 70 : 0; 
		//줄을 바꿨을때는(명령이 안끝났을때)들여쓰기 두개 들여써야한다.
		System.out.println(result2);
		int a = 10;
		int b = 5;
		int result1 = a > b ? a * -1 : b * -1;
		
		System.out.println(result1);
	}
}
