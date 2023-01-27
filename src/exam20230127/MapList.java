package exam20230127;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapList {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("rating","vip");
		map.put("age", 30);

		Map<String, Object> map1 = new HashMap<>();
		map.put("name", "김기영");
		map.put("rating", "gold");
		map.put("age", 35);
		
		List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
		customers.add(map);
		customers.add(map1);
		for(Map<String, Object> customer : customers) {
			System.out.println(customer);
			
		}

		for(Entry<String, Object> entry : map.entrySet()) {
			System.out.print(entry.getKey()+ "=");
			System.out.println(entry.getValue());
		}

		for(Entry<String, Object> entry : map.entrySet()) {
			System.out.print(entry.getKey()+ "=");
			System.out.println(entry.getValue());
		}
		
	}
}



