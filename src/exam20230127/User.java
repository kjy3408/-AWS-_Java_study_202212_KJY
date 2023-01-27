package exam20230127;

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User(String username, String password, String name, String email) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "username: " + username + "\npassword: " + password + "\nname: " + name + "\nemail: " + email;
	}
}
