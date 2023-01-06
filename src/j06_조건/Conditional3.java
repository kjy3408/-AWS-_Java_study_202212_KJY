package j06_조건;

import java.util.Scanner;

public class Conditional3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		System.out.print("점수 입력 : ");
		score = scanner.nextInt();
		
		//0>score / score>100 => 계산불가라고 출력하고 학점 점수는 출력X
		/*
		 * 90~100 A
		 * 80~89 B
		 * 70~79 C
		 * 60~69 D
		 * 0~59 F
		 * 
		 * +5점마다 +학점
		 * */
		
		//score % 10 > 4
		
		if(score > 100 || score < 0 ) {
			System.out.println("계산 불가");
		}else if(score > 94) {
			grade = "A+";
		}else if(score > 89) {
			grade = "A";
		}else if(score > 84) {
			grade = "B+";
		}else if(score > 79) {
			grade = "B";
		}else if(score > 74) {
			grade = "C+";
		}else if(score > 69) {
			grade = "C";
		}else if(score > 64) {
			grade = "D+";
		}else if(score > 59) {
			grade = "D";
		}else {
			grade = "F";
			System.out.println("점수(" + score + "): " + grade + "학점");
		} 
		
		
//		//코드는 사용별(역할에 맞게)로 뭉쳐줘야한다... 응집도 라고 한다.
//		//풀이 grade에 어떤값을 대입할지에 대한 코드(sysout 넣는건 좋지않음)
//		if(score < 0 || score > 100) {
//			grade = null;
//		}else if (score > 89) {
//			grade = "A";
//		}else if (score > 79) {
//			grade = "B";
//		}else if (score > 69) {
//			grade = "C";
//		}else if (score > 59) {
//			grade = "D";
//		}else {
//			grade = "F";
//		}
//		
//		//or 과 and를 꼬았을땐 서로 괄호로 묶어준다. (+ 학점에 관한 코드) => 많은 if문이 생길건데 if문을 하나로 줄임
//		if((score > 59 && score < 101) && (score % 10 > 4 || score == 100)) {
//			grade += "+";
//		}
//		
//		//score < 0 / score > 100에 관한 코드 
//		if(grade == null) { //출력에 관련된 코드
//			System.out.println("계산 불가");
//		}else {
//		System.out.println("점수(" + score + "): " + grade + "학점");
//		}
//	
	}//
}//
