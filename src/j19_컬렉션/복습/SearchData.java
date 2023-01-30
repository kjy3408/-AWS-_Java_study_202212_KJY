package j19_컬렉션.복습;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SearchData {

	public static void main(String[] args) {
		
		Map<String, String> searchData = new HashMap<>();

		searchData.put("category", "소설");
		searchData.put("searchValue", "불편한 편의점");
		
		System.out.println(searchData);
		
		System.out.println(searchData.get("category"));
		System.out.println(searchData.get("searchValue"));
		
		System.out.println(searchData.keySet()); //key값만 빼옴
		System.out.println(searchData.values()); //value값만 빼옴
		
		System.out.println(searchData.entrySet());//entry(대괄호)와 map(중괄호)은 대괄호를 쓰냐 중괄호를 쓰냐 차이
												  //map(중괄호)는 반복을 돌릴 수 없음. entry(대괄호)는 반복이 가능하다.
		System.out.println(); 					  
		
//		for(int i = 0; i < searchData.size(); i++) { index참조로 가져올 수 없다.
//			System.out.println(searchData.get(i));
//		}
		
		for(String str : searchData.keySet()) { //key값 빼옴
			System.out.println(searchData.get(str));	//String 타입인 Key값을 변수 str에 하나씩 꺼낸 후 해당 key값의 value를 출력 
		}
		
		
		
	}
}
