package j02_형변환;

public class Casting2 {

	public static void main(String[] args) {
		char char_a = 'a';
		int num =(int) char_a; //char_a를 int로 강제(명시적)형변환(자동으로됨)
		//int가 더 상위에 있기에 UpCasting이라고 하고, 자동으로 형 변환된다.
		
//		char char_b = num + 1; //형변환이안되고있음 char<int이기에 자동으로안됨
		char char_b = (char)num;
		//하위 자료형으로 DownCasting하고 싶을땐 반드시 무슨형으로 바꿀것인지 명시 해야한다.
		char char_b1 = (char)(num+1); //"연산보다 형변환이 우선순위기 때문"에 더하고 난 후 형 변환을 해줘야 에러가 나지않는다
		
		
		/*
		 * 자동(묵시적)형 변환
		 * 강제(명시적)형 변환
		 * 금액(원)은 long type로 사용한다.
		 * 
		 * */
		
		
	}

}
