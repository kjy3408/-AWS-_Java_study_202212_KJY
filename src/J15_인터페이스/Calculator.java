package J15_인터페이스;

public interface Calculator {

//멤버변수 가질 수 없음. 하지만 상수는 가질 수 있음.
//final / static final 생략가능
	
	public /*static final*/ int ERROR = -9999999;
	
	
	
	public /*abstract*/ double plus(double x, double y ); //abstract를 생략하고 메소드를 작성하여도 에러가 안뜬다(생략가능) {} 중괄호 사용 불가
	
	public double minus(double x, double y );

	public default double multiplication(double x, double y) { //구현하지 않고 싶은 메소드가 있을땐 default를 붙여준다.(구현하지 않아도됨/ interface내부에 default메소드는 선언가능)		
		return x * y;
	}
	
	public double division(double x, double y);

}
