package j19_컬렉션.복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection1 {

	public static void main(String[] args) {
		
		//배열에 단어를 넣어서 순서대로. (과일종류)
		//중복제거 후 가나다순으로 정리
		//같은 이름의 과일은 한번에 묶도록 한다.
		
		String[] str = new String[] {"사과", "바나나", "수박", "감", "수박", "사과"};
		
		Set<String> set = new HashSet<>();
		
		set.addAll(Arrays.asList(str)); //str을 list로 변환 후 set에 넣음.
		
//		System.out.println(set);
		
		List<String> list = new ArrayList<>();
		
		list.addAll(set);
		Collections.sort(list);
		
		System.out.println(list);
		
		//str배열에 있는 중복을 set에 담아 중복을 제거하고 다시 list에 담아 아스키코드 값으로 순서대로 출력.
		//배열(Array)을 정렬할때는 Arrays.sort / Collection framework 관련은 Collections.sort를 사용한다.
		
		//해쉬태그 : 해쉬태그를 검색했을 때 나오는 값이 key값이다. / Value는 해쉬태그를 "과일"이라는 
		
		Map<String, String> map = new HashMap<>();
		map.put("사과", "과일");
		map.put("바나나", "과일");
		map.put("수박", "과일");
		map.put("참외", "과일");
		map.put("키위", "과");
	
		List<String> list1 = new ArrayList<>();
//		list1.addAll(map.keySet());

		
		for(Entry<String, String> entry : map.entrySet()) {
			if(entry.getValue().equals("과일")) {
//				System.out.println(entry.getKey());
				list1.add(entry.getKey());
				Collections.sort(list1);
				System.out.println(list1);
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
