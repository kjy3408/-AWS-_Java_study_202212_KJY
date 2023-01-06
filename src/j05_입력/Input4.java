package j05_입력;

import java.util.Scanner;

public class Input4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		//버퍼 이용하여 정수 입력(15 16 29 => SpaceBar기준으로 버퍼에 데이터를 두어 Enter누를 시 일괄 출력되게 함)
			int a = 0;
			int b = 0;
			int c = 0;
		
			int max = 0;
			int min = 0;
			
		System.out.print("정수 3개 입력: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
	
		max = a;
		max = b > max ? b : max;
		max = c > max ? c : max;
		
		min = a;
		min = b < min ? b : min;
		min = c < min ? c : min;
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

		
		
		//3개 수 입력받음 가장 큰녀석과 가장 작은녀석을 출력
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		

		
	}
}
