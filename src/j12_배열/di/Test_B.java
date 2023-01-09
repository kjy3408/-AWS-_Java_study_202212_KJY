package j12_배열.di;

public class Test_B {
//멤버변수는 private
	private Test_C tc;
	
	public Test_B(Test_C tc) {
		this.tc = tc;
	}

	public void testB1() {
		System.out.println("\ttestB1 메소드 호출");
		
		tc.testC1();
	}

	
	
	
	
	
}
