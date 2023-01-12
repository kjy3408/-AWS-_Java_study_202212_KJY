package j17_스태틱.싱글톤;

public class KIA {
//============================================ 여기서부터 
	private static KIA instance = null;
	
	private KIA() { //생성자가 private이다. (즉, 바깥에서 인스턴스화 불가.)
		
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	
	}
//============================================ 여기까지 변함없음 (모든 싱글톤 공통)
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}
}
 