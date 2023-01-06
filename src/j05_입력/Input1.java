package j05_입력;

import java.util.Scanner;


public class Input1 {
	public static void main(String[] args) {
				//new뒤에는 고정이다.
				//빨간줄(에러)가 뜨면 마우스부터 올려보고 에러 읽어보기
				//SCanner cannot be resolved to a type => 스케너 타입을 찾을수없다
				//quick fixes의 웬만하면 첫번째가 답.
				//JRE System Library 안에 있다.
		Scanner scanner = new Scanner(System.in);
		
		
		int inputNum = 0; //main()안에선 가능하면 초기화 시키는게 좋음.(지역변수)
		int inputNum2 = 0;
		int inputNum3 = 0;
		int inputNum4 = 0;
		int inputNum5 = 0;
		//변수선언은 위에다 몰아주는게 좋음 + 초기화도 항상 해줘야한다.
		
		
		System.out.print("입력값 1 : ");
		inputNum = scanner.nextInt(); // scanner.nextInt(); 입력받는 코드임 한번 나올때마다 한번 입력임
		System.out.print("입력값 2 : ");
		inputNum2 = scanner.nextInt(); 
		System.out.print("입력값 3 : ");
		inputNum3 = scanner.nextInt(); 
		System.out.print("입력값 4 : ");
		inputNum4= scanner.nextInt(); 
		System.out.print("입력값 5 : ");
		inputNum5 = scanner.nextInt(); 
		//Int로 입력받음 => 입력한 값이 됨
		//scanner.nextInt(); 이것 자체가 값임
		//여러개 입력 받는 경우 변수명만 다르게 하면 됨
		
		  System.out.println("더한 값 : " + (inputNum + inputNum2 + inputNum3 + inputNum4 + inputNum5));
		  
		  String q= scanner.next(); //문자열로 받는다.
		
	
		
		/**import 단축기 Ctrl + Shift + O  => 일괄 처리방법!!! (명확하게 작성이 다끝난 상태여야 쓸 수 있다)
		sca 까지 입력 수 Ctrl + Space 띄우고 다시 Ctrl + Space하면 변수명까지 추천해줌*/

		
	}
}
