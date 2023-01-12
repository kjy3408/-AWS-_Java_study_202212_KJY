package j17_스태틱.싱글톤;

public class KiaMain {

	public static void main(String[] args) {
		
		KIA kia = KIA.getInstance(); //KIA 클래스 객체화시킴
		
		kia.printCompanyName();//만들어진 KIA클래스의 메소드 호출
	
	}
	
}
