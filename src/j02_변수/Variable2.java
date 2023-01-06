package j02_변수;

public class Variable2 {

	public static void main(String[] args) {
		char firstName1 = '준';
		char firstName2 = '일';

		char alphabetA = 'A'; //알파벳 A는 아스키코드로 65이다
		
		System.out.println("김" + firstName1 + firstName2);
		System.out.println("알파벳/A : " + alphabetA);  
		
		System.out.println(alphabetA + 'B');
		System.out.println(alphabetA);
		
		/*문자 자료형(아스키코드)
		 * 
		 * 0~127까지 존재하는 이유 
		 * - 키보드의 모든 문자 경우의 수가 127가지다.
		 * - 영문은 아스키코드를 따라감
		 * - 한글은 유니코드 AC00부터 시작
		 * */
		System.out.println("\uAC00"); //"가"라고 출력됨
		System.out.println(firstName1 + 0); //'준'에 대한 유니코드 값
		
		//실수 자료형
		/*
		 * long, float
		 * float a = 1.2f;
		 * long a = 10l;
		 * 
		 * */
		
		//상수
		/*
		 * 변하지 않는 수
		 * 
		 * */
	} 
}
