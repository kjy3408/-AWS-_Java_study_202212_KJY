package j02_형변환;

public class Casting1 {

	public static void main(String[] args) {
		
		char a = 'a';//아스키코드 97
		int num1 = a;//int로 자동(묵시적)형변환 됨(아스키코드 97)
		
		System.out.println(num1);
		
		System.out.println((int)a);//강제(명시적)형변환
//		명시적 형 변환이 정확한 형 변환이다.		
		System.out.println((char)97); //97을 char로 형변환해라! 
		System.out.println((byte) 300);//256까지 경우의 수 (-128~127)
		//300은 byte의 크기를 벗어남 
		//300 - 256 = 44 이기에 44로 표기됨. 
		System.out.println();
		
	}

}
