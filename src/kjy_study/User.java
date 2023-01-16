package kjy_study;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {

	private String userName;
	private String password;
	private String name;
	private String email;
	
	public User(String user) {
		this.userName = user;
	}
}
