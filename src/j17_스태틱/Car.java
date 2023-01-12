package j17_스태틱;

import java.time.LocalDateTime;

public class Car {

	private static final int NOW_YEAR = LocalDateTime.now().getYear(); //class명 . now메소드 . getYear() 현재시간 현재날짜에서 year만 가져오겠다.
	private static final String CODE = "KIA-" + NOW_YEAR + "-";
	private static int ai = 1;
	
	private String serialCode;
	private String modelName;

	public Car(String modelName) {
		serialCode = CODE +	String.format("%04d", ai) ; //String.format사용법 : %4d = "0"4개를 만들고 끝에 ai를 넣겠다..
		this.modelName = modelName;
		ai++;
	}
	
	
	
//	private String serialCode; //KIA-2023-00 => 01 02 03
//	private String modelName;
//	private static int code = 1;
//	
//	public Car(String modelName) {
//		this.modelName = modelName;
//		serialCode = "KIA-2023-" + code;
//		code++;
//
//	}

	@Override
	public String toString() {
		return "Car [시리얼넘버: " + serialCode + ", 모델명: " + modelName + "]";
	}
	
	
//	private final int NOW_YEAR = new Date().getYear();
	
	//static써서 sirialNumber가 자동주입되게 만듬
}
