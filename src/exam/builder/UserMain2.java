package exam.builder;

public class UserMain2 {

	public static void main(String[] args) {
		
		
		User2 u = User2.builder()
				.username("aaa")
				.name("bbb").build();
		
		System.out.println(u);
		
	}
}
