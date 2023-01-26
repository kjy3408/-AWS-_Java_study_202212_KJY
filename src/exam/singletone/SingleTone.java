package exam.singletone;

public class SingleTone {

	private static SingleTone instance;
	
	public static SingleTone getInstnace() {
		if(instance == null) {
			instance = new SingleTone();
		}
		return instance;
	}
	
	private SingleTone() {
		
	}
	
	public int method() {
		int result = 1 + 2;
		return result;
	}
}
