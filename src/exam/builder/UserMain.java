package exam.builder;

import exam.builder.User.UserBuilder;

public class UserMain {

	public static void main(String[] args) {
		
		User builder = User.builder()
				.username("aaa")
				.password("1234")
				.name("aaag")
				.build();
		
		System.out.println(builder);
	}
}
