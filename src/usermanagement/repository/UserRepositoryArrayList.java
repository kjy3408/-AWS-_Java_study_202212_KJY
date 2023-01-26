package usermanagement.repository;

import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import usermanagement.entity.User;


public class UserRepositoryArrayList {

	private List<User> userDataList;
	
	private static UserRepositoryArrayList instance;
	
	public static UserRepositoryArrayList getInstance() {
		if(instance == null) {
			instance = new UserRepositoryArrayList();
		}
		return instance;
	}
	//생성자에서 생성
	private UserRepositoryArrayList() {
		userDataList = new ArrayList<>();
		userDataList.add(User.builder()
				.username("aaa")
				.password(BCrypt.hashpw("1234", BCrypt.gensalt()))
				.name("김준일")
				.email("aaa@bbb")
				.build());
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
	
	public User findUserByEmail(String email) {
		User user = null;
		
		for(User u : userDataList) {
			if(u.getEmail().equals(email)) {
				user = u;
				break;
			}
		}
		
		return user;
	}
	
}