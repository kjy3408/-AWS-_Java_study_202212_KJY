package j22_익명클래스;

public class Main {

	public static void main(String[] args) {
		
//		Calculator c1 = new Addition(); //upCasting
		
//		System.out.println(c1.calc(10, 20));

		//다른데서 쓰일 일이 전혀없다(로그인 버튼=> 한번 로그인한 이후론 쓸일 없음) 한번밖에 안쓰일건데 new를 사용하여 굳이 생성할 필요 없음
		//한번만 쓰는 경우!
		Calculator c2 = new Calculator() {//중괄호 닫힐때까지 클래스 구현. (임시구현) 구현되어있으니 객체생성이 가능하다. 구현된 class의 이름이없다. => interface이름 밖에없다.
										  //파일 저장이 안되어있으니 다른곳에서 쓸 수 없다. class파일로 저장되어있으면 다른곳으로 들고가서 사용할 수 있지만 익명객체는 사용할 수 없다.
			@Override
			public int calc(int x, int y) {
				
				return x - y;
			}
		};
		
		
		System.out.println(c2.calc(20, 10)); 
		
		
		
		
		
	}
	
}
