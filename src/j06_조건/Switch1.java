package j06_조건;

public class Switch1 {
	public static void main(String[] args) {
		
		String select = "D선택";
		
		switch (select) {
			case "A선택" :
				System.out.println("PC(A)를 연결합니다.");
				break;
			case "B선택" :
				System.out.println("PC(B)를 연결합니다.");
				break;
			case "C선택" :
				System.out.println("PC(C)를 연결합니다.");
				break;
			case "D선택" :
				System.out.println("PC(D)를 연결합니다.");
				break;
			default : //default도 사용할 수 있음 (else와 같은역할) => case로 찾아갈 수 없으면 default로 간다.
				System.out.println("else와 같은 역할");
		}
		
		
		//제일 아래는 break;문을 걸어줄 필요가 없다 어차피 끝나는지점이라.
		
	}//
}//
