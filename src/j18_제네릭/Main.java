package j18_제네릭;

public class Main {

	public static void main(String[] args) {//해당 제네릭 타입은 생성될때 결정 됨.
		TestData<Integer, String> td = new TestData<Integer, String>("김준일", 30);
		TestData<Double, String> td2 = new TestData<Double, String>("junil", 100.05); //두개 자료형을 바꾸고싶음 => 자료형을 바꾸고싶음 => 제네릭 사용
		System.out.println(td);
		System.out.println(td2);
		
		TestData<? extends String, ?> td3 = new TestData<String, Integer>(30, "김준일");
		TestData<?, ? super Double> td4 = new TestData<String, Double>(100.05, "junil"); //두개 자료형을 바꾸고싶음 => 자료형을 바꾸고싶음 => 제네릭 사용
	}
}
