package j01_출력;
//주석 : 코드 내부에 메모를 할 때 사용함.
//=> 컴파일 시 무시됨.
//tap : 들여쓰기
/*
  여러줄 주석 (별 하나에 엔터 꼭별이있어하는건아님)
  1
  2
  3
 */

import j17_스태틱.싱글톤.KIA;

/** (별별엔터 파란색 주석)
 *  클래스, 메소드 등의 정보를 설명하기 위한 주석
 * 
 */
public class HelloJava { //class명은 전부 대문자로 시작
	
	// 프로그램의 시작점(main을 찾아감)
	public static void main(String[] args) {
		System.out.println("hello java"); //한줄의 문자열을 출력 후 끝에 줄바꿈을 해라
		System.out.println("이름 : 김재영");
		System.out.println("주소 : 부산 진구 ");
		System.out.println("연락처: 01043609507");
		System.out.println("수업 : AWS기반 공공빅데이터 활용 웹개발자 양성  ");
		
		/*print 와 println의 차이 
		 * 줄 바꿈이 생기지 않는다 "ln"은 줄바꿈의 약자
		 * System.out. => Console창 (cmd 포함)
		 *
		 *
		 */
	
		System.out.println();
		KIA.getInstance().printCompanyName();
	}
}

