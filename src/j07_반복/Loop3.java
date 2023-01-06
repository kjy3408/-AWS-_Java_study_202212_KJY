package j07_반복;

import java.util.Scanner;

public class Loop3 {
	public static void main(String[] args) {
		//count라는 변수를 들었고 5를 넣었고 반복하면서 매번 반복때마다 새로운 a와 b를 입력받는다 
		//a와 b를 입력받아 출력하고 또 반복해서 a와 b를...?
		//그 모든 합을 구하라
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int total = 0;
		
		System.out.print("반복횟수: ");
		count = scanner.nextInt();
		System.out.println();
	
		//반복횟수를 정하고 1번 반복 2번반복 3번반복마다 입력을 받고 해당 반복마다 총합을 더하고/ 마지막엔 1~3번 반복의 합을 구해라
//		for(int i = 0; i < count+1; i++) {
//			System.out.println("1번 반복");
//			System.out.print("a: ");
//			a = scanner.nextInt();
//			System.out.print("b: ");
//			b = scanner.nextInt();
//			
//			System.out.println("1번 반복 합계 :" + (total));
//			System.out.println("\n");			
//		}
	
		//풀이
		for(int i = 0; i < count; i++) {
			int a = 0;
			int b = 0;
			
			System.out.println(i + 1 + "번 반복");
			System.out.print("a: ");
			a = scanner.nextInt();
			System.out.print("b: ");
			b = scanner.nextInt();
			
			total = total + a + b;
			System.out.println(i + 1 + "번 합 : " + (a + b));
			System.out.println();
		}

		System.out.println("총합: " + total);
		
		
		
		

		
		
	}
}
