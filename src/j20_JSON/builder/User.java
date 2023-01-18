package j20_JSON.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder //Builder 어노테이션을 사용하면 AllArgsConstructor 어노테이션도 포함됨
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
//	public static UserBuilder builder() {
////		return new User().new UserBuilder(); //UserBuilder class가 static 이 아닐 시 User를 먼저 생성해줘야함. (User를 생성안하고 UserBuilder를 사용하려고 static을 붙여준것임)
//		return new UserBuilder(); //return이 new UserBuilder(); 이라 메소드 호출 하면 UserBuilder생성됨
//	}
//	
//	@Data	//static class 
//	public static class UserBuilder{ //static 없이 쓰면 내부 class라고 한다.
//		private String username;
//		private String password;
//		private String name; 
//		private String email;
//		
//		public UserBuilder username(String username) {
//			this.username = username;
//			return this;
//		}
//		
//		public UserBuilder password(String password) {
//			this.password = password;
//			return this;
//		}
//		
//		public UserBuilder name(String name) {
//			this.name = name;
//			return this;
//		}
//		
//		public UserBuilder email(String email) {
//			this.email = email;
//			return this;
//		}
//			
//		public User build() {
//			return new User(username, password, name, email); //User를 생성해서 return함
//		}
//		
//	}

}
