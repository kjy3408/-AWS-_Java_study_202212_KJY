package j07_반복;

public class Loop1 {
	
	public static void main(String[] args) {
		
	//	for(int i = 0, j = 0, k = 0; i < 10 || j < 20 || k < 30; i++, j++, k += 2) 이렇게 여러 변수 넣을 수 있지만 굳이 이렇게 쓰진 않음..
		
	//	int i = 0; => 사용불가 
		
//		for(int i = 0; i < 10; i++) { 
//			System.out.println(i);
//		}
//
//		for(int i = 0; i < 10; i++) { // int i 는 for문 안에서만 쓰는 지역변수이기에 계속적으로 쓸 수 있지만 main()안에다가(전역변수) 선언하는것은 안된다. 
//			System.out.println(i);
//		}
//		
//		for(int i = 1; i < 11; i++) { //가동성이 떨어지는 코드 ( for문의 내용은 건들지말자) 
//			System.out.println(i);
//		}
//						//↓여긴 몇번 반복하는지를 적어놓은거임
//		for(int i = 0; i < 10; i++) { // 이렇게 작성한 코드가 좋은 코드 => 출력에 집중하지말고 몇번 반복하는 반복문인가에 집중 
//			System.out.println(i + 2);
//		}
//
//		
		//연산부
		int total = 0;
		for(int i = 0; i < 100; i++) {
			total += i + 1; // +1을 해줘야 99에서 끝나는게 아닌 100까지 반복됨
		}
		
		//출력부
		System.out.println(total);
		
		
		
		
		
		
		
	//	int i = 0; => 사용가능이지만 쓰는경우 음슴
		
		
	}
	//지역변수 : for문 안에서 지역변수를 만들면 for문 바깥은 전부 전역변수임 => 지역의 기준은 {} 중괄호다.
	//전역변수 :

}
