package kjy_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserMain {

	public static void main(String[] args) {

		
		
		List<User> list = new ArrayList<>();
		
		list.add(new User("aaa", "1234", "김똥개", "aaa@bbb"));
		list.add(new User("bbb", "12123534", "김똥개", "aaa@bbb"));
		list.add(new User("ccc", "12312534", "김똥개", "aaa@bbb"));
		list.add(new User("ddd", "1231234", "김똥개", "aaa@bbb"));
		list.add(new User("eee", "12344", "김똥개", "aaa@bbb"));
		
		UserService userService = new UserService();
		
		userService.inputUsername();
		
		
	
		
	}
}
