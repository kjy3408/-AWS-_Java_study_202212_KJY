package j08_메소드;

public class Method3 {

	//오버로딩 : 동일한 이름이라도 들어오는 자료(매개변수)에 따라 식별이 가능하기에 같은 이름으로 사용가능하다. / return값이 다르면 오버로딩이 안된다.( 타입/ 이름은 같으나 매개변수가 달라야한다)
	//오버로딩 : 로딩 : 불러오는것 / 부를때 달라지는것.
	//오버라이딩 : 라이딩 : 쓰는것 / 덮어쓰는것.
		public static void ov1() {
			System.out.println("매개변수 없음");
		}
	
		public static void ov1(int a) {
			System.out.println("int 매개변수 하나");
		}
	
		public static void ov1(int a, String b) {
			System.out.println("int 먼저 그다음 String");
		}
		
		public static void ov1(String b, int a) {
			System.out.println("String 먼저 그다음 int");
		}
		
		public String ov2(String a) {
			return "a";
		}
	public static void main(String[] args) {
		
		ov1();
		ov1(10);
		
		
	}
}
