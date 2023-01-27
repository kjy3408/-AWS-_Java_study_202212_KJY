package exam.builder;

public class User2 {

	private String username;
	private String name;
	
	public User2(String username, String name) {
		this.username = username;
		this.name = name;
		
	}
	
	public static UserBuilder2 builder() {
		return new UserBuilder2();
	}	
		
	public static class UserBuilder2 {
		private String username;
		private String name;
			
		public UserBuilder2 username(String username) {
			this.username = username;
			return this;
		}
			
		public UserBuilder2 name(String name) {
			this.name = name;
			return this;
		}
			
		public User2 build() {
			return new User2(username, name);
		}
	}

	@Override
	public String toString() {
		return "User2 [username=" + username + ", name=" + name + "]";
	}
		
		
		
}

