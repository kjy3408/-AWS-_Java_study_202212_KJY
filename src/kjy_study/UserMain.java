package kjy_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserMain {

	public static void main(String[] args) {
//		User u = new User();
		
		List<User> usersList = new ArrayList<>();
		
		Set<Object> usersSet = new HashSet<>();
		
		Map<String, Object> usersMap = new HashMap<>();
//		usersMap1.put("김똥개", "23");
//		
//		Map<Object, Map<String, Object>> userMap = new HashMap<>();
//		
//		userMap.put(usersList, usersMap1); 
//	
//		usersList.add("더럽다");
//		usersSet.add("A");
//		
//		System.out.println(userMap);
	
		usersList.add(new User("김고양이"));
		usersList.add(new User("김고양이"));
		usersList.add(new User("김고양이"));
		usersList.add(new User("김고양이"));
		usersList.add(new User("김똥개"));
		usersList.add(new User("김고양이"));
		usersList.add(new User("김고양이"));

		
		String searchName = "김똥개";
		
		for(int i = 0; i < usersList.size(); i++) {
			if(usersList.get(i).getUserName().equals(searchName)) {
				System.out.println(usersList.get(i));
				break;
			}
		}
		
		
		
	
		
	}
}
