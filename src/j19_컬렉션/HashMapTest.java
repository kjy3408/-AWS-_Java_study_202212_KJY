package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Object> dataMap = new HashMap<>();
		
		dataMap.put("username", "aaa"); //값이 들어갈떄 Object로 UpCasting됨.
		dataMap.put("password", "1234");
		dataMap.put("name", "김준일");
		dataMap.put("email", "aaa@gmail.com");
		
		//List(hobby)를 Object에 넣음.
		List<String> hobby = new ArrayList<>();
		hobby.add("골프");
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("음악감상");
		
		dataMap.put("hobbys", hobby);//값이 들어갈떄 Object로 UpCasting됨.
		
		System.out.println(dataMap);
		
		 
//		List<String> list = dataMap.get("hobby"); //이렇게 사용불가.
		List<String> list = (List<String>) dataMap.get("hobbys"); //DownCasting해줘야 사용가능.
		System.out.println(list.get(0));


		
	}
	
}
