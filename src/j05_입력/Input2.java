package j05_입력;

import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
				
					
				//변수 초기화를 먼저 해놓고 작성하는게 좋음.(지금 형태는 비추)
				//아래 4개 이외의 입력받는값은 거의 없음
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("문자열1 : ");
				String str1 = scanner.nextLine();//띄어쓰기를 쓸 수 있음.
				
				System.out.print("문자열2 : ");
				String str2 = scanner.next(); //띄어쓰기를 쓸 수 없음. 띄어쓰기 한번당 엔터 한번이라고 보면 된다.
			
				System.out.print("정수 : ");
				int number1 = scanner.nextInt();
				
				System.out.println("실수 : ");
				double number2 = scanner.nextDouble();
				
				System.out.println("문자열1 : " + str1);
				System.out.println("문자열2 : " + str2);
				System.out.println("정수 : " + number1);
				System.out.println("실수 : " + number2);
	
	}
}
