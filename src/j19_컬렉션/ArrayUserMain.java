package j19_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User{
	private String username;
	private String name;
}


public class ArrayUserMain {

	public static void main(String[] args) {
		
		User[] userArray = {
				new User("aaa", "김종환"),
				new User("bbb", "고병수"),
				new User("ccc", "손민재"),
				new User("ddd", "황창욱")
		};
		
		//이렇게 하지 않으면 전부 add해서 집어넣어줘야됨.
		List<User> userList = Arrays.asList(userArray); //배열을 list로 바꿈.
		
		String searchUsername = "aaa";
		
		User user = searchUser(userList, searchUsername);
		
		if(user == null) {
			System.out.println("검색실패!");
			System.out.println("존재하지 않는 계정입니다.");
		} else {
			System.out.println("검색공!");
			System.out.println(searchUsername + " 계정의 회원 이름은 " + user.getName());
		}
		
	}
	
	
	private static User searchUser(List<User> userList, String username) {
		User user = null;
		
		for(User u : userList) {
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		
		return user;
	}
	
	
	
}
