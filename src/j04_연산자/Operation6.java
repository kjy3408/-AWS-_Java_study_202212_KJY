package j04_연산자;

import java.util.Scanner;

public class Operation6 {

	public static void main(String[] args) {
		
		/*
		 *시험 성적을 학점으로 계산하는 프로그램
		 *
		 * 정수자료형 score변수 선언
		 * 88점으로 초기화
		 * 
		 * 문자자료형 grade변수 선언
		 * 
		 * 조건 
		 * score가 0점보다 작거나 100점보다 크면  X를 출력
		 * score가 90 ~ 100점이면 A학점
		 * score가 80 ~ 89점이면 B학점
		 * score가 70 ~ 79점이면 C학점
		 * score가 60 ~ 69점이면 D학점
		 * score가 0 ~ 59점이면 F학점
		 * 
		 * +5점이상이면 +학점이다
		 * 
		 * */

//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
	
		int score = 86;
		
		char a = '+';
		char b = '\0';
		
		char grade = score < 0 || score > 100 ? 'X' //어디까지 고려해야하는가에 대한 고민을 해야한다. 아마 0미만 100초과일 땐  X라는걸 생각하지 못했을것이다.  
				: score > 89 ? 'A' //90이상
				: score > 79 ? 'B' //80이상
				: score > 69 ? 'C'
				: score > 59 ? 'D'
				: 'F';
		
		char plus = score > 100 || score < 60 ? b
				: score % 10 > 4 || score == 100 ? a 
				: b;
			
				
		
		
				//특수문자는 String
				
				
				
		System.out.println("점수(" + score + ") : " + grade + plus + "학점");
//		System.out.println("점수는 " + score + "점이고, 학점은 " + grade + "학점이다");

	
		
//
//		int score = 90;
//		char a = '+';
//		char grade = score < 0 || score > 100 ? 'X' //어디까지 고려해야하는가에 대한 고민을 해야한다. 아마 0미만 100초과일 땐  X라는걸 생각하지 못했을것이다.
//				: score % 10 > 5 ? : a  
//				: score > 89 ? 'A'
//				: score > 79 ? 'B' 
//				: score > 69 ? 'C'
//				: score > 59 ? 'D'
//				: 'F';
		
		
		

	
	} 
}
