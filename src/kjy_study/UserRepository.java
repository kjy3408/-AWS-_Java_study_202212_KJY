package kjy_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

	public UserRepository() {
		
	}
	
	List<User> userList = new ArrayList<>();
	
	Map<String, Object> umap = new HashMap<>();
	
	public void saveUser(User user) {
		userList.add(user);
	}
	
	public User findUserInfo(String username) {
		User user = null;
		for(User u : userList){
			if(u.getUserName().equals(username)) {
				user = u;
			}
		}
		return user;
	}
	
}
