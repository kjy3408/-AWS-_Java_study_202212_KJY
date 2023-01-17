package kjy_study;

import java.util.Scanner;

public class UserService {

	private UserRepository userRepository;
	private User user;
	Scanner scanner;
	
	
	public UserService() {
		userRepository = new UserRepository();
		scanner = new Scanner(System.in);
	}
	//메소드 : 반환형, 매개변수
	
	public void inputUsername() {
		System.out.println("Username: ");
		String checkUsername = scanner.nextLine();
		duplicatedUsername(checkUsername);
		System.out.println(duplicatedUsername(checkUsername));
		
	}
	
	//Username 중복체크 메소드
	public boolean duplicatedUsername(String username) {
		return userRepository.findUserInfo(username) != null;
	}
	

	public void dd(String username) {
		if(duplicatedUsername(username)) {
			userRepository.saveUser(user);
		}
	}
}
