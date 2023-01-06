package j02_변수;

public class Variable1 {
	public static void main(String[] args) {
		//접은글을 내용으로 / 제목 접은글 빼기
		
		//변수명 제약과 표기법
		/*
		 * 변수 이름은 영문자(대문자, 소문자)나 숫자를 사용할 수 있다.
		 * 특수 문자 중에는 $, _ 를 제외하곤 쓰지못한다
		 * 변수 이름은 숫자로 시작할 수 없다.
		 * 예약어 사용 불가.(int, double, String 등)
		 * 카멜 표기법(절대 대문자 시작X) - 습관화
		 * 스네이크표기법(언더바 사용) => 상수표기할 때 사용
		 * 헝가리안 표기법 -> 접두어 사용(예 : boolean = b/ int = i/ double = d 등) 
		 * DB는 대,소문자 구분이없어 _ 언더바로 표기
		 * 
		 * 비트(bit) 0과 1의 값을 저장하기 위한 최소 단위
		 * 
		 * 바이트(byte) 256가지경우의 수 0~255까지
		 * => 8bit = 1byte
		 *
		 * */
		
		//자료형
		/*
		 * boolean 1bit => 기본값 false / true/false로 리턴
		 * char(캐릭터) 2byte => 기본값 \u0000(유니코드) / 유니코드도 숫자다
		 * 
		 * 
		 * 
		 * */
		
		int num = 10; //변수명 선언과 동시에 초기화
		int num2; // 4byte의 메모리 공간을 할당할 것이고, 그 공간의 이름을 num2라 하겠다고 선언
		num2 = 10; // "num2"변수명을 가진 메모리 공간의 데이터를 비우고 10의 값을 대압하겠다.(초기화)
		
		System.out.println("num"); //num 글자출력
		System.out.println(num + 1); // 변수 출력 + 숫자(연산)
	}
}
