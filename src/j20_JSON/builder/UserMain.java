package j20_JSON.builder;

public class UserMain {

	public static void main(String[] args) {
		
//		User user = new User();
		
		//User class 내부의 UserBuilder이 있으니 참조하여 생성해준다.
//		User.UserBuilder userBuilder = new User().new UserBuilder(); UserBuilder class가 static이 아닐때.
//		User.UserBuilder userBuilder1 = user.new UserBuilder();
		
		User.UserBuilder userBuilder = new User.UserBuilder();

		
		User user2 = User.builder().build(); // User속에있는 static builder를 호출하면 new UserBuilder가 호출되니 userBuilder가 생성되고, build를 호출하면 new User가 리턴되니 User가 만들어짐.
		//User.builder() => UserBuilder class객체가 됨.
		
		User user3 = User.builder() //원하는 값만 넣고 생성가능.
				.username("aaa")
				.password("1234")
				.build();//User 생성

		System.out.println(user3);
	}
	
}
