package j05_입력;

import java.util.Scanner;


public class Input3 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		//System.in => System : 운영체제
		//
		String s1 = null;
		int num1 = 0;
		String s2 = null;
		String s3 = null;
		
		System.out.print("이름:");
		s1 = scanner.next(); //SpaceBar와 Enter는 무시됨s2 = scanner.nextLine();
		
		System.out.print("나이: ");
		num1 = scanner.nextInt(); //얘네 쓴 경우에 nextLine을 쓸 경우엔 허공에 nextLine을 버려줘야한다
		scanner.nextLine(); //nextInt()다음 nextLine()이 올 경우 nextLine()하나를 날려줘야한다.(버퍼속에 Enter가 남아있어서 비워줘야함)
	
		System.out.print("주소: ");
		s2 = scanner.nextLine();
		
		System.out.print("연락처: ");
		s3 = scanner.next();
		
		 System.out.println("사용자의 이름은 " + s1 + "이고 나이는 " + num1 + "살입니다.");
		 System.out.println("주소는 " + s2 + "에 거주중입니다.");
		 System.out.println("연락처는 " + s3 + "입니다.");
	
		
		
		
	
	
	}
}
