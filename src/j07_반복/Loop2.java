package j07_반복;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		//시작숫자에서 끝숫자까지 더한 값을 구하라
		Scanner scanner = new Scanner(System.in);
		int startNumber = 0;
		int endNumber = 0;
		
		System.out.print("시작: ");
		startNumber = scanner.nextInt();
		
		System.out.print("끝: ");
		endNumber = scanner.nextInt();
		
		
		int total = 0;
		
//		for(int i = 0; i < endNumber; i++) {
//			
//			total = startNumber + i;
//		}
//		
//		//출력부
//		System.out.println("합계: " + total);
	
		//풀이					//끝 숫자에서 시작숫자를 뺀 후 +1을 해주면 반복 값이 나온다...
		for(int i = 0; i < endNumber - startNumber + 1 ; i++) {
			total = total + i + startNumber;
		}
		
		System.out.println("합계: " + total);
		
	
	}
}
