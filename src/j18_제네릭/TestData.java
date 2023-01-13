package j18_제네릭;

public class TestData<T,E> {//<T> <= 제네릭 (Type을 줄여서 T라고 넣음) Teyp,Element,Key
	
	private T data1;
	private E data2;
	//int : 일반자료형
	//int를 class화 시켜놓은것 Wrapper class(래퍼 클래스) => 제네릭 사용 타입.
	public TestData(T data1, E data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "TestData [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
}
