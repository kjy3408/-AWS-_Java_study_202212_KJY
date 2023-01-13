package j19_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	/**
	 * 
	 * CRUD****************************************
	 * : Create Read Update Delete
	 * 	  추가 	읽기 수정	 삭제
	 */
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		
		
		//값 추가 (add) *****
		strList.add("java");
		strList.add("python");
		System.out.println(strList);
		
		//값 원하는 위치에 추가 *****
		strList.add(1, "android"); //1번 index에 추가. 변수명.add(Key, Value);
		System.out.println(strList);
		
		// 해당 index 값을 추출 *****
		System.out.println(strList.get(0));//0번 index 추출. 변수명.get(index);
		String lang = strList.get(1);
		System.out.println(lang);//변수에 넣어서 추출
		
		// 리스트에 해당 값이 있는지 확인(True, false) *****
		System.out.println(strList.contains("c++")); //false
		System.out.println(strList.contains(lang)); //true => lang = "android";(24번 line)
		
		//값 수정 ***
		strList.set(2, "javascript");
		System.out.println(strList);
		
		//값 삭제 *****
		strList.remove("android");
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
		
		// List 크기확인 *****
		System.out.println(strList.size());
		
		//리스트가 비었는지 확인
		System.out.println(strList.isEmpty());//false
		
		//리스트 초기화
		strList.clear();
		System.out.println(strList.isEmpty());//true
		
		/*배열을 리스트로 변환 ***************
		 * Arrays.asList(배열);
		 * */
		String[] langs = {"java","c++","python","javascript"}; //얘가 String타입 배열이라 56번에 자동으로 제네릭 타입이 String으로 잡혔음
		List<String> tempList = Arrays.asList(langs);
		strList.addAll(tempList); //addAll값을 한번에 넣음
		strList.addAll(2, tempList); //2번 index부터 값을 넣겠다
		System.out.println(strList);
		 
		
		// 해당 값의 위치(index) 왼쪽부터 가장 가까운 Value 찾기 **********
		int findIndexLeft = strList.indexOf("java");
		System.out.println(findIndexLeft);// 0출력
		int findIndexLeft1 = strList.indexOf("c++");
		System.out.println(findIndexLeft1);// 1출력
		
		
		
		//======================중간에 있는 "java"를 찾는 방법===========================================
		
		strList.set(1,  "java");
		System.out.println("ddddd" + strList);
		strList.indexOf("java"); //0 출력
		strList.lastIndexOf("java");//3출력
		strList.subList(strList.indexOf("java") + 1, strList.size()).indexOf("java");// indexOf("java") + 1 부터 strList.size까지 잘라라
		
		//=================================================================
		
		
		
		//해당 값의 위치(index) 오른쪽부터 가장 가까운 Value 찾기**********
		int findIndexRight = strList.lastIndexOf("java");
		System.out.println(findIndexRight); //2출력
		int findIndexRight1 = strList.lastIndexOf("c++");
		System.out.println(findIndexRight1); //3출력
		
		//fromIndex(1)부터 해당 toIndex(4)전까지 뽑아내서 출력.
		List<String> subList = strList.subList(1, 4);
		System.out.println(subList);//[c++, java, c++] 출력
		
		System.out.println();
		//=============================<< 반복 4가지>>===============================
		//일반 반복문
		for(int i = 0; i < strList.size(); i++) {
			System.out.println("[" + i + "]: " + strList.get(i));
		}
		
		System.out.println();
		
		//forEach - 많이 씀
		for(String str : strList) {
			System.out.println("[값]: " + str);
		}
		
		System.out.println();
		
		//람다식 forEeach
		strList.forEach(str -> System.out.println("[값2]: " + str));
		
		System.out.println();
		
		//반복자 iterator => 1회성
		Iterator<String> iterator = strList.iterator();
		while(iterator.hasNext()) {
			String lang2 = iterator.next(); //next()로 한번 값을 꺼내고나면 꺼내진 값은 재사용불가.
			System.out.println("[값3]: " + lang2);
		}
		
		iterator = strList.iterator(); //위에서 iterator를 다 비워버렸기에 초기화를 해줘야 재사용가능.
		
	
		
	
	}
	
}
