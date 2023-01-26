package exam.builder;

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
	
	public static UserBuilder builder() {
		return new UserBuilder();
	}	
	

		public static class UserBuilder {
			private String username;
			private String password;
			private String name;
			private String email;
			
			public UserBuilder username(String username) {
				this.username = username;
				return this;
			}
			
			public UserBuilder password(String password) {
				this.password = password;
				return this;
			}
			
			public UserBuilder name(String name) {
				this.name = name;
				return this;
			}
			
			public UserBuilder email(String email) {
				this.email = email;
				return this;
			}
			
			public User build() {
				return new User(username, password, name, email); 
			}
		}
	
		@Override
		public String toString() {
			return "User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email + "]";
		}
	
	

}