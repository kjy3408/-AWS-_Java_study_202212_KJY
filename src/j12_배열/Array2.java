package j12_배열;

public class Array2 {
	
	public static void printNames(String[] names) {//메소드 매개변수 자료형은 배열 자료형으로 넣을 수 있다.
		for(int i = 0; i < names.length; i++) {
			System.out.println("이름[" + (i + 1) + "]: " + names[i]);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String[] names = new String[3];//공간 먼저 선언 후 값 선언/들어갈 값이 졍해져있지 않을때/ 공간이 확실할때
		names[0] = "김상현";
		names[1] = "임나영";
		names[2] = "김종환";
		
		String[] names2 = new String[] {"이상현", "손지호", "이강용"};//배열 생성과 동시에 값 선언/값을 보고 공간을 만듬
		String[] names3 = {"김두영", "강대협", "이현수", "김재영"};	
		
//	for문을 이용해 배열 일괄 출력
//		for(int i = 0; i < names.length; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names[i]);
//		}
//		
//		System.out.println();
//		
//		
//		for(int i = 0; i < names2.length; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names2[i]);
//		}
//
//		System.out.println();
//		
//		
//		for(int i = 0; i < names3.length; i++) {
//			System.out.println("이름[" + (i + 1) + "]: " + names3[i]);
//		}
		
		
		//메소드를 이용해 배열 출력
		printNames(names);
		printNames(new String[] {"이상현", "손지호", "이강용"}); //배열주소를 
		printNames(names3);
		
		
		
		
		
		
	}//
}//
