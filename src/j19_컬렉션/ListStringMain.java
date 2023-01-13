package j19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {

	public static void main(String[] args) {
		String[] strArray = new String[] {"java", "python", "C++"};
		String[] newArray = new String[strArray.length +1];
				
		for(int i = 0; i < strArray.length; i++) {
			newArray[i] = strArray[i];
		}
		
		newArray[strArray.length] = "html";//마지막 index에 html넣음
		
		for(String str : strArray) {
			System.out.println(str);
		}

		System.out.println();
		
		for(String nst : newArray) {
			System.out.println(nst);
		}
		System.out.println();
		
		//=================================================================================
		
		
		
		
		
		ArrayList<String> strList = new ArrayList<>(); //변수 선언 시 String(타입)를 넣었기에 생성자 String(타입)생략가능. 단, 변수선언할때만 생략가능.(뭘 담는 객체인지를 명시해야함)
		strList.add("java");
		strList.add("python");
		strList.add("python");
		strList.add("python");
		strList.add("python");
		strList.add("python"); //얘 삭제됨
		strList.remove("python"); ////index에서 삭제 : size길이가 줄어듬. (index정리까지 해줌. "java"지울시 1번 index의 "python"이 0번 index가 됨)
		strList.add(1, "java");
		strList.remove(1);
		
		
//		ArrayList<?> strList1 = new ArrayList<>(); //와일드 카드 사용시 DownCasting해줘야함.
//		((ArrayList<String>)strList1).add("java");
//		((ArrayList<String>)strList1).add("python");
		
		for(int i = 0; i < strList.size(); i++) { //length를 사용하지않고 "객체"이기에 "size"라는 메소드를 사용
			System.out.print("[" + i + "]: ");
			System.out.println(strList.get(i)); //get => 해당인덱스 데이터 가져와라
		}
		
		for(String str : strList) {
			System.out.println(str);
		}
		
//		new ArrayList<>().add("test"); //위 (34line) 생략블가 예시 (이렇게 쓰면 안됨)
		
		/*
		 * get : 해당 index 자료 가져와라
		 * add : 데이터 추가
		 * size : List길이 확인 (length와 같다)
		 * remove : 해당 데이터 삭제(정확하게 입력해야함)
		 * */
	
//		System.out.println(strList);//toString으로 출력한것
		
		
		
		
	}
		
}
