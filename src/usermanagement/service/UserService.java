package usermanagement.service;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.entity.User;
import usermanagement.repository.UserRepository;

public class UserService {

	private UserRepository userRepository;
	private Gson gson;
	private static UserService instance;
	
	public static UserService getInstance() {
		if(instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	private UserService() {
		userRepository = UserRepository.getInstance();
		gson = new GsonBuilder().setPrettyPrinting().create();
	}
	
	public Map<String, String> register(String userJson) {
		User user = gson.fromJson(userJson, User.class);
	
		if(duplicatedUsername(user.getUsername())) {//중복됐다! 라는 if문. (null이아님)
			
		}
		return null;
		
	}
	
	private boolean duplicatedUsername(String username) {
		return userRepository.findUserByUsername(username) != null; //null이면 ID사용가능, null 아닐 시 사용불가.
	}
	
}
