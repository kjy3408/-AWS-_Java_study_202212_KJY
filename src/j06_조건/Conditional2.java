package j06_조건;

import java.util.Scanner;

public class Conditional2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		//이렇게도 변수선언 및 대입 할 수 있음(좋은코드 아님.)
		//익숙하지 않은 코드는 사용하지 않는게 좋다
//		int a, b, c;
//		a = b = c = 0;
		
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		int min = 0;
	
		System.out.println("정수 3개 입력 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
	
//틀림		
//		if(a > b && a > c) {
//			max = a;			
//		}else if (b > a && b > c) {
//			max = b;
//		}else {
//			max = c;
//		}
//		
//		if(a < b && a < c) {
//			min = a;
//		}else if (b < a && b < c) {
//			min = b;
//		}else {
//			min = c;
//		}

//		맞음  => 꼭 else if를 사용하지 않아도된다.(그냥 쉽게 생각하자)
		max = a;
		min = a;
		if(b > max) max = b; //이렇게 쓸수도 있지만 중괄호를 쓰는게 원칙임
		if(c > max) max = c;
		if(b < min) min = b;
		if(b < min) min = c;
			
		
		
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	
	
	}
}
