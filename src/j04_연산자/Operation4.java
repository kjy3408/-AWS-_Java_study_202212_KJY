package j04_연산자;

public class Operation4 {
	public static void main(String[] args) {
		int num = 100;
		
		num = num + 1;
		
		num += 1; // num = num + 1; 이랑 같다
		//복합대입연산자임
		
		num -= 100;
		num *= 10;
		num %= 3;
		
		System.out.println(num);
	
	}
}
