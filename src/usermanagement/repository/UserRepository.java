package usermanagement.repository;

import java.util.ArrayList;
import java.util.List;
import usermanagement.entity.User;


public class UserRepository {

	private List<User> userDataList;
	
	private static UserRepository instance;
	
	public static UserRepository getInstance() {
		if(instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}
	//생성자에서 생성
	private UserRepository() {
		userDataList = new ArrayList<>();
	}
	//데이터 추가
	public void saveUser(User user) {
		userDataList.add(user);
	}
	//찾기
	public User findUserByUsername(String username) {
		User user = null;
		
		for(User u : userDataList) {
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		
		return user;
	}
	
}