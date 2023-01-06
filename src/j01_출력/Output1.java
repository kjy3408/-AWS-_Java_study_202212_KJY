package j01_출력;

public class Output1 {

	public static void main(String[] args) {
		System.out.print("이름 : ");
		System.out.println("김재영");
		System.out.print("나이 : ");
		System.out.println("28"+1); //문자 + 숫자는 문자와 숫자 따로 인식(문자열에 어떠한 값을 더하면 숫자도 문자열로 바뀜) = "28"+"1"
		System.out.println(28+1);	//숫자+숫자는 숫자로 인식
		System.out.println("이름 : " + "김재영");

	}

}
