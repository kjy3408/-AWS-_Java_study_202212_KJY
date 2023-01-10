package J13_상속;

public class KiaCar extends Car{

	public KiaCar() {
		super();
		
		System.out.println("자식");
		
		
	}
	
	@Override //오버라이드라고 하는 어노테이션
	public int discountPrice(int percentage) { //리턴,매개변수,이름 다 똑같음
		
		return super.discountPrice(percentage); //부모의 주소에서 super.discountPrice(매개변수)로 호출함.
	}
	
	

	
	
	//오버라이딩할때 메소드이름, 매개변수의 타입(자료형)이 같아야한다. => 실행문만 다름. (매개변수명은 다를수있음)
}
