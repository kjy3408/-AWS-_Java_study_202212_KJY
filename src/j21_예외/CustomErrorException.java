package j21_예외;

public class CustomErrorException extends RuntimeException {//CustomException하는 방법: RuntimeException 상속

	
	public CustomErrorException() {
		System.out.println("내가 만든 예외 생성");
	}
	
	public CustomErrorException(String message) {
		super(message); //메세지 작성하고 싶을때 super를 작성.(RuntimException이 부모임)
		
	}
}
