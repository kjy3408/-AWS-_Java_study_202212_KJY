package j04_연산자;

public class Operation1 {
	public static void main(String[] args) {//"main" + Ctrl + Space
		int add = 1 + 2;
		int sub = 10 - 5;
		int mul = 10 * 2;
		int div = 10 / 4; //정수 / 정수 일땐 몫을 구할 때 사용.
		int remainder = 10 % 5;//나머지가 0 이면 나누는 값의 배수다.(5의 배수)
		//2로 나누어 떨어지면 짝수/홀수로도 볼 수 있다.
		
		System.out.println("add : " + add);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
		System.out.println("remainder : " + remainder);
		
		//(연산) ? true : false : 3항연산자
		System.out.println(remainder == 0 ? "5의 배수이다" : "5의 배수가 아니다"); //3항연산자 사용
	
	
	}
}
