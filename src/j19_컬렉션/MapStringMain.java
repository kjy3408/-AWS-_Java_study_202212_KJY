package j19_컬렉션;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapStringMain {

	public static void main(String[] args) {
	
		Map<String, String> strMap = new HashMap<>();
		//map은 add아님 ""put임"" // Map 을 Map에다 넣을 때 putAll
		strMap.put("이종현", "a");
		strMap.put("진채희", "b");
		strMap.put("김재영", "c");
		strMap.put("이상현", "d");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("a"));//key 입력하여 Value값 출력.
		System.out.println(strMap.get("e"));
		System.out.println();
		
		/**Map에서 key값만 빼옴*/
		
		// i 반복으론 반복할 수 없다.
		//keySet을 사용하여 key값만 출력. (key값은 중복이 없다.)
		//key값의 hashCode정렬 순서대로 값이 나옴 
		for(String key : strMap.keySet()){
			System.out.println("key: " + key);//Key값 출력.
			System.out.println("value: " + strMap.get(key));//Key값을 넣어 Value 출력.
		}
		
		System.out.println();
		
		/**Map에서 value값만 빼옴 */
		
		//key값의 hashCode정렬 순서대로 값이 나옴 
		for(String v : strMap.values()) { //value 만 뽑아서 출력.
			System.out.println("value: " + v);
		}
	
		
		//Set<Entry<String, String>> s = null;
		
		
		System.out.println();
		/*Entry는 객체기 때문에 get사용가능.*/
		//key와 value를 한번에 가져옴 (entrySet : key와 value 한쌍을 set으로 취급) (entry : key + value);
		System.out.println("=============forEach==============");
		
		for(Entry<String, String> entry : strMap.entrySet()) {
//			System.out.println(entry); //entry 하나가 key와 value로 이루어져있다.(entry = key + value)
			System.out.println("(Entry객체)key: " + entry.getKey());
			System.out.println("(Entry객체)value: " + entry.getValue());
		}
		
		System.out.println("==============람다================");
		/**람다 사용하여 key, value 각각 뽑아냄*/
		
		//key와 value를 각각 뽑아내는 방법.
		strMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		
		
		Map<String, String> m = new HashMap<>();
		m.put("1", "a");
		
		for(String a : m.values()) {
			System.out.println(a);
		}
	}//

}//
