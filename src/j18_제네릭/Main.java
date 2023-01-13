package j18_제네릭;

public class Main {

	public static void main(String[] args) {//해당 제네릭 타입은 생성될때 결정 됨.
		TestData<String, Integer> td = new TestData<String, Integer>("김준일", 30 );
		TestData<String, Double> td2 = new TestData<String, Double>("junil", 100.05 ); //두개 자료형을 바꾸고싶음 => 자료형을 바꾸고싶음 => 제네릭 사용
		
		TestData<?, ?> td3; //=> 변수 선언 이후 무슨 타입의 데이터가 들어올지 모를때 사용. (되도록 자료형을 기입하는게 좋음(성능상 좋지않다는 이유))
		TestData<?, ?> td4 = new TestData<>("junil", 100.05 ); //두개 자료형을 바꾸고싶음 => 자료형을 바꾸고싶음 => 제네릭 사용
		System.out.println(td);
		System.out.println(td2);
		
//		TestData<? extends String, ?> td3 = new TestData<String, Integer>(30, "김준일");
//		TestData<?, ? super Double> td4 = new TestData<String, Double>(100.05, "junil"); //두개 자료형을 바꾸고싶음 => 자료형을 바꾸고싶음 => 제네릭 사용
		
		CMRespDto<TestData<String, Integer>> cm = new CMRespDto<TestData<String, Integer>>(200, "성공", td); //=> TestData<String, Integer> 이 자체로 자료형이니 해당 변수가 들어간다.*(td)
//		CMRespDto<String> cm = new CMRespDto<String>(200, "성공", "데이터");
		CMRespDto<TestData<?, ?>> cm1 = new CMRespDto<TestData<?, ?>>(200, "성공", td); 
//		CMRespDto<?>cm1 = new CMRespDto<TestData<>(200, "성공", td); 
			
		//<T> => "<>"속에 어떠한 자료형이 들어가면 생성자 매개변수에 해당 자료형이 적용된다 
		
		
		
		System.out.println(cm);
	}
}