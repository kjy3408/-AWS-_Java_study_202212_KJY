package j21_예외;

public class CustomExceptionMain {

	public static void main(String[] args) {
		
//		throw new IndexOutOfBoundsException("인덱스를 초과함");//예외에는 메세지를 줄 수 있다.
//		throw new CustomErrorException("뭔가 문제가 있음"); //예외 생성 (메세지 사용불가. 대신 오버로딩을 해야함.

//		System.out.println("프로그램 종료"); 얘 실행 안됨. 위에서 예외 발생했기 때문.
	
	
		try {
			throw new CustomErrorException("뭔가 문제가 있음");
		} catch (CustomErrorException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	
		System.out.println("프로그램 종료");
	}
}
