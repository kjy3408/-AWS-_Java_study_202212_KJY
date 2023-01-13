package j18_제네릭;

// Commit Message Response Data Transfer Object => CMRespDTO
// 클라이언트가 서버에게 요청을 날리면 동일한 형식으로 응답인터페이스(?)
public class CMRespDto<T> {//공통응답객체
	
	private int code;
	private String message;
	private T data; 
																//타입이 T일뿐이다. (T라는 자료형으로 바뀐것뿐.) => 생성할때 자료형을 넣어주면 해당 자료형으로 사용할 수 있다.
																//어떤 자료형을 넣어주냐에 따라 제네릭의 타입이 달라진다
	
	public CMRespDto(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "CMRespDto [code=" + code + ", message=" + message + ", data=" + data + "]";
	}

	
	
	
	
	
	
}
